package io.kubeblocks.client;

import com.github.luben.zstd.Zstd;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.apps.models.V1alpha1Cluster;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInner;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomObjectsApi extends io.kubernetes.client.openapi.apis.CustomObjectsApi {
    private static final String templateRefAnnotationKey = "kubeblocks.io/template-ref";
    private static final String templateRefDataKey = "instances";

    private static final int defaultMaxTemplateInSpec = 1024;

    private int maxTemplateInSpec = defaultMaxTemplateInSpec;

    public CustomObjectsApi() {
        super();
    }

    public CustomObjectsApi(ApiClient apiClient) {
        super(apiClient);
    }

    public CustomObjectsApi(int maxTemplateInSpec) {
        super();
        this.maxTemplateInSpec = maxTemplateInSpec;
    }

    public CustomObjectsApi(ApiClient apiClient, int maxTemplateInSpec) {
        super(apiClient);
        this.maxTemplateInSpec = maxTemplateInSpec;
    }

    /**
     * Creates a namespace scoped Custom object
     *
     * @param group        The custom resource&#39;s group name (required)
     * @param version      The custom resource&#39;s version (required)
     * @param namespace    The custom resource&#39;s namespace (required)
     * @param plural       The custom resource&#39;s plural name. For TPRs this would be lowercase plural
     *                     kind. (required)
     * @param body         The JSON schema of the Resource to create. (required)
     * @param pretty       If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param dryRun       When present, indicates that modifications should not be persisted. An invalid or
     *                     unrecognized dryRun directive will result in an error response and no further processing of
     *                     the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making
     *                     these changes. The value must be less than or 128 characters long, and only contain
     *                     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *                      response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     * </table>
     */
    public Object createNamespacedCustomObject(
            String group,
            String version,
            String namespace,
            String plural,
            Object body,
            String pretty,
            String dryRun,
            String fieldManager)
            throws ApiException {
        if (!isClusterObject(group, plural)) {
            return super.createNamespacedCustomObject(group, version, namespace, plural, body, pretty, dryRun, fieldManager);
        }

        Map<String, V1ConfigMap> instanceTemplatesMap = new HashMap<>();
        V1alpha1Cluster cluster = (V1alpha1Cluster) body;
        for (V1alpha1ClusterSpecComponentSpecsInner compSpec :
                cluster.getSpec().getComponentSpecs()) {
            List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances = compSpec.getInstances();
            if (instances != null && instances.size() > this.maxTemplateInSpec) {
                V1ConfigMap instanceTemplates = buildInstanceTemplatesObject(instances, namespace, cluster.getMetadata().getName(), compSpec.getName());
                instanceTemplatesMap.put(compSpec.getName(), instanceTemplates);
                compSpec.setInstances(null);
            }
        }
        if (!instanceTemplatesMap.isEmpty()) {
            CoreV1Api api = new CoreV1Api();

            Map<String, String> templateRefMap = new HashMap<>();
            for (Map.Entry<String, V1ConfigMap> template :
                    instanceTemplatesMap.entrySet()) {
                templateRefMap.put(template.getKey(), template.getValue().getMetadata().getName());
                api.createNamespacedConfigMap(namespace, template.getValue(), pretty, dryRun, fieldManager, null);
            }
            String templateRef = this.getGson().toJson(templateRefMap);
            Map<String, String> annotations = cluster.getMetadata().getAnnotations();
            if (annotations == null) {
                annotations = new HashMap<>();
            }
            annotations.put(templateRefAnnotationKey, templateRef);
            cluster.getMetadata().setAnnotations(annotations);
        }

        return super.createNamespacedCustomObject(group, version, namespace, plural, body, pretty, dryRun, fieldManager);
    }

    /**
     * Returns a namespace scoped custom object
     *
     * @param group     the custom resource&#39;s group (required)
     * @param version   the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural    the custom resource&#39;s plural name. For TPRs this would be lowercase plural
     *                  kind. (required)
     * @param name      the custom object&#39;s name (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *                      response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     * </table>
     */
    public Object getNamespacedCustomObject(
            String group, String version, String namespace, String plural, String name)
            throws ApiException {
        if (!isClusterObject(group, plural)) {
            return super.getNamespacedCustomObject(group, version, namespace, plural, name);
        }
        Object object = super.getNamespacedCustomObject(group, version, namespace, plural, name);
        Gson gson = this.getGson();
        String objectStr = gson.toJson(object);
        V1alpha1Cluster cluster = gson.fromJson(objectStr, V1alpha1Cluster.class);
        Map<String, String> annotations = cluster.getMetadata().getAnnotations();
        if (annotations == null || annotations.get(templateRefAnnotationKey).isEmpty()) {
            return null;
        }

        CoreV1Api api = new CoreV1Api();

        Map<String, List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner>> instanceTemplatesMap = new HashMap<>();
        String templateRef = annotations.get(templateRefAnnotationKey);
        Map<String, String> templateRefMap = gson.fromJson(templateRef, Map.class);
        for (String key : templateRefMap.keySet()) {
            V1ConfigMap instanceTemplatesObject = api.readNamespacedConfigMap(templateRefMap.get(key), namespace, null);
            List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances = buildInstanceTemplates(instanceTemplatesObject);
            instanceTemplatesMap.put(key, instances);
        }
        for (V1alpha1ClusterSpecComponentSpecsInner compSpec :
                cluster.getSpec().getComponentSpecs()) {
            List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances = instanceTemplatesMap.get(compSpec.getName());
            if (instances != null) {
                compSpec.setInstances(instances);
            }
        }
        annotations.remove(templateRefAnnotationKey);
        return cluster;
    }

    private boolean isClusterObject(String group, String plural) {
        return "apps.kubeblocks.io".equals(group) && "clusters".equals(plural);
    }

    private V1ConfigMap buildInstanceTemplatesObject(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances, String namespace, String clusterName, String componentName) {
        String name = String.format("template-ref-%s-%s", clusterName, componentName);
        V1ConfigMap template = new V1ConfigMap();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName(name);
        metadata.setNamespace(namespace);
        template.setMetadata(metadata);
        Gson gson = this.getGson();
        String templateStr = gson.toJson(instances);
        byte[] templateByte = templateStr.getBytes();
        byte[] templateData = Zstd.compress(templateByte);
        Map<String, byte[]> data = new HashMap<>();
        data.put(templateRefDataKey, templateData);
        template.setBinaryData(data);
        return template;
    }

    private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> buildInstanceTemplates(V1ConfigMap instanceTemplatesObject) {
        Map<String, byte[]> data = instanceTemplatesObject.getBinaryData();
        if (data == null || data.get(templateRefDataKey) == null) {
            return null;
        }
        byte[] templateData = data.get(templateRefDataKey);
        byte[] templateByte = Zstd.decompress(templateData, templateData.length);
        String templateStr = new String(templateByte);
        return this.getGson().fromJson(templateStr, new TypeToken<List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner>>() {
        }.getType());
    }

    private Gson getGson() {
        return new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeAdapter())
                .create();
    }
}

class OffsetDateTimeAdapter extends TypeAdapter<OffsetDateTime> {
    @Override
    public void write(JsonWriter out, OffsetDateTime value) throws IOException {
        out.value(value.toString());
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
        return OffsetDateTime.parse(in.nextString());
    }
}
