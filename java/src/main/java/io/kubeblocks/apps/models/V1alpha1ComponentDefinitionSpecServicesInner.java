/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.27.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecServicesInnerSpec;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * V1alpha1ComponentDefinitionSpecServicesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecServicesInner {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_GENERATE_POD_ORDINAL_SERVICE = "generatePodOrdinalService";
  @SerializedName(SERIALIZED_NAME_GENERATE_POD_ORDINAL_SERVICE)
  private Boolean generatePodOrdinalService;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLE_SELECTOR = "roleSelector";
  @SerializedName(SERIALIZED_NAME_ROLE_SELECTOR)
  private String roleSelector;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha1ComponentDefinitionSpecServicesInnerSpec spec;

  public V1alpha1ComponentDefinitionSpecServicesInner() {
  }

  public V1alpha1ComponentDefinitionSpecServicesInner annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1ComponentDefinitionSpecServicesInner putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * If ServiceType is LoadBalancer, cloud provider related parameters can be put here More info: https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer.
   * @return annotations
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1ComponentDefinitionSpecServicesInner generatePodOrdinalService(Boolean generatePodOrdinalService) {
    
    this.generatePodOrdinalService = generatePodOrdinalService;
    return this;
  }

   /**
   * GeneratePodOrdinalService indicates whether to create a corresponding Service for each Pod of the selected Component. If sets to true, a set of Service will be automatically generated for each Pod. And Service.RoleSelector will be ignored. They can be referred to by adding the PodOrdinal to the defined ServiceName with named pattern &lt;Service.ServiceName&gt;-&lt;PodOrdinal&gt;. And the Service.Name will also be generated with named pattern &lt;Service.Name&gt;-&lt;PodOrdinal&gt;. The PodOrdinal is zero-based, and the number of generated Services is equal to the number of replicas of the Component. For example, a Service might be defined as follows: - name: my-service serviceName: my-service generatePodOrdinalService: true spec: type: NodePort ports: - name: http port: 80 targetPort: 8080 Assuming that the Component has 3 replicas, then three services would be generated: my-service-0, my-service-1, and my-service-2, each pointing to its respective Pod.
   * @return generatePodOrdinalService
  **/
  @jakarta.annotation.Nullable
  public Boolean getGeneratePodOrdinalService() {
    return generatePodOrdinalService;
  }


  public void setGeneratePodOrdinalService(Boolean generatePodOrdinalService) {
    this.generatePodOrdinalService = generatePodOrdinalService;
  }


  public V1alpha1ComponentDefinitionSpecServicesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name defines the name of the service. otherwise, it indicates the name of the service. Others can refer to this service by its name. (e.g., connection credential) Cannot be updated.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ComponentDefinitionSpecServicesInner roleSelector(String roleSelector) {
    
    this.roleSelector = roleSelector;
    return this;
  }

   /**
   * RoleSelector extends the ServiceSpec.Selector by allowing you to specify defined role as selector for the service. if GeneratePodOrdinalService sets to true, RoleSelector will be ignored.
   * @return roleSelector
  **/
  @jakarta.annotation.Nullable
  public String getRoleSelector() {
    return roleSelector;
  }


  public void setRoleSelector(String roleSelector) {
    this.roleSelector = roleSelector;
  }


  public V1alpha1ComponentDefinitionSpecServicesInner serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * ServiceName defines the name of the underlying service object. If not specified, the default service name with different patterns will be used: - &lt;CLUSTER_NAME&gt;: for cluster-level services - &lt;CLUSTER_NAME&gt;-&lt;COMPONENT_NAME&gt;: for component-level services Only one default service name is allowed. Cannot be updated.
   * @return serviceName
  **/
  @jakarta.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public V1alpha1ComponentDefinitionSpecServicesInner spec(V1alpha1ComponentDefinitionSpecServicesInnerSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecServicesInnerSpec getSpec() {
    return spec;
  }


  public void setSpec(V1alpha1ComponentDefinitionSpecServicesInnerSpec spec) {
    this.spec = spec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecServicesInner v1alpha1ComponentDefinitionSpecServicesInner = (V1alpha1ComponentDefinitionSpecServicesInner) o;
    return Objects.equals(this.annotations, v1alpha1ComponentDefinitionSpecServicesInner.annotations) &&
        Objects.equals(this.generatePodOrdinalService, v1alpha1ComponentDefinitionSpecServicesInner.generatePodOrdinalService) &&
        Objects.equals(this.name, v1alpha1ComponentDefinitionSpecServicesInner.name) &&
        Objects.equals(this.roleSelector, v1alpha1ComponentDefinitionSpecServicesInner.roleSelector) &&
        Objects.equals(this.serviceName, v1alpha1ComponentDefinitionSpecServicesInner.serviceName) &&
        Objects.equals(this.spec, v1alpha1ComponentDefinitionSpecServicesInner.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, generatePodOrdinalService, name, roleSelector, serviceName, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecServicesInner {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    generatePodOrdinalService: ").append(toIndentedString(generatePodOrdinalService)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleSelector: ").append(toIndentedString(roleSelector)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("annotations");
    openapiFields.add("generatePodOrdinalService");
    openapiFields.add("name");
    openapiFields.add("roleSelector");
    openapiFields.add("serviceName");
    openapiFields.add("spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecServicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecServicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecServicesInner is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecServicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecServicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecServicesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentDefinitionSpecServicesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("roleSelector") != null && !jsonObj.get("roleSelector").isJsonNull()) && !jsonObj.get("roleSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleSelector").toString()));
      }
      if ((jsonObj.get("serviceName") != null && !jsonObj.get("serviceName").isJsonNull()) && !jsonObj.get("serviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceName").toString()));
      }
      // validate the optional field `spec`
      if (jsonObj.get("spec") != null && !jsonObj.get("spec").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecServicesInnerSpec.validateJsonObject(jsonObj.getAsJsonObject("spec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecServicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecServicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecServicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecServicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecServicesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecServicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecServicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecServicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecServicesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecServicesInner
  */
  public static V1alpha1ComponentDefinitionSpecServicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecServicesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecServicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
