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
import io.kubeblocks.apps.models.V1alpha1ComponentSpecServicesInnerSpec;
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
 * ComponentService defines a service that would be exposed as an inter-component service within a Cluster. A Service defined in the ComponentService is expected to be accessed by other Components within the same Cluster.   When a Component needs to use a ComponentService provided by another Component within the same Cluster, it can declare a variable in the &#x60;componentDefinition.spec.vars&#x60; section and bind it to the specific exposed address of the ComponentService using the &#x60;serviceVarRef&#x60; field.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentSpecServicesInner {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_DISABLE_AUTO_PROVISION = "disableAutoProvision";
  @SerializedName(SERIALIZED_NAME_DISABLE_AUTO_PROVISION)
  private Boolean disableAutoProvision;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POD_SERVICE = "podService";
  @SerializedName(SERIALIZED_NAME_POD_SERVICE)
  private Boolean podService;

  public static final String SERIALIZED_NAME_ROLE_SELECTOR = "roleSelector";
  @SerializedName(SERIALIZED_NAME_ROLE_SELECTOR)
  private String roleSelector;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha1ComponentSpecServicesInnerSpec spec;

  public V1alpha1ComponentSpecServicesInner() {
  }

  public V1alpha1ComponentSpecServicesInner annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1ComponentSpecServicesInner putAnnotationsItem(String key, String annotationsItem) {
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


  public V1alpha1ComponentSpecServicesInner disableAutoProvision(Boolean disableAutoProvision) {
    
    this.disableAutoProvision = disableAutoProvision;
    return this;
  }

   /**
   * Indicates whether the automatic provisioning of the service should be disabled.   If set to true, the service will not be automatically created at the component provisioning. Instead, you can enable the creation of this service by specifying it explicitly in the cluster API.
   * @return disableAutoProvision
  **/
  @jakarta.annotation.Nullable
  public Boolean getDisableAutoProvision() {
    return disableAutoProvision;
  }


  public void setDisableAutoProvision(Boolean disableAutoProvision) {
    this.disableAutoProvision = disableAutoProvision;
  }


  public V1alpha1ComponentSpecServicesInner name(String name) {
    
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


  public V1alpha1ComponentSpecServicesInner podService(Boolean podService) {
    
    this.podService = podService;
    return this;
  }

   /**
   * Indicates whether to create a corresponding Service for each Pod of the selected Component. When set to true, a set of Services will be automatically generated for each Pod, and the &#x60;roleSelector&#x60; field will be ignored.   The names of the generated Services will follow the same suffix naming pattern: &#x60;$(serviceName)-$(podOrdinal)&#x60;. The total number of generated Services will be equal to the number of replicas specified for the Component.   Example usage:   &#x60;&#x60;&#x60;yaml name: my-service serviceName: my-service podService: true disableAutoProvision: true spec: type: NodePort ports: - name: http port: 80 targetPort: 8080 &#x60;&#x60;&#x60;   In this example, if the Component has 3 replicas, three Services will be generated: - my-service-0: Points to the first Pod (podOrdinal: 0) - my-service-1: Points to the second Pod (podOrdinal: 1) - my-service-2: Points to the third Pod (podOrdinal: 2)   Each generated Service will have the specified spec configuration and will target its respective Pod.   This feature is useful when you need to expose each Pod of a Component individually, allowing external access to specific instances of the Component.
   * @return podService
  **/
  @jakarta.annotation.Nullable
  public Boolean getPodService() {
    return podService;
  }


  public void setPodService(Boolean podService) {
    this.podService = podService;
  }


  public V1alpha1ComponentSpecServicesInner roleSelector(String roleSelector) {
    
    this.roleSelector = roleSelector;
    return this;
  }

   /**
   * Extends the above &#x60;serviceSpec.selector&#x60; by allowing you to specify defined role as selector for the service. When &#x60;roleSelector&#x60; is set, it adds a label selector \&quot;kubeblocks.io/role: {roleSelector}\&quot; to the &#x60;serviceSpec.selector&#x60;. Example usage:   roleSelector: \&quot;leader\&quot;   In this example, setting &#x60;roleSelector&#x60; to \&quot;leader\&quot; will add a label selector \&quot;kubeblocks.io/role: leader\&quot; to the &#x60;serviceSpec.selector&#x60;. This means that the service will select and route traffic to Pods with the label \&quot;kubeblocks.io/role\&quot; set to \&quot;leader\&quot;.   Note that if &#x60;podService&#x60; sets to true, RoleSelector will be ignored. The &#x60;podService&#x60; flag takes precedence over &#x60;roleSelector&#x60; and generates a service for each Pod.
   * @return roleSelector
  **/
  @jakarta.annotation.Nullable
  public String getRoleSelector() {
    return roleSelector;
  }


  public void setRoleSelector(String roleSelector) {
    this.roleSelector = roleSelector;
  }


  public V1alpha1ComponentSpecServicesInner serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * ServiceName defines the name of the underlying service object. If not specified, the default service name with different patterns will be used:   - CLUSTER_NAME: for cluster-level services - CLUSTER_NAME-COMPONENT_NAME: for component-level services   Only one default service name is allowed. Cannot be updated.
   * @return serviceName
  **/
  @jakarta.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public V1alpha1ComponentSpecServicesInner spec(V1alpha1ComponentSpecServicesInnerSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentSpecServicesInnerSpec getSpec() {
    return spec;
  }


  public void setSpec(V1alpha1ComponentSpecServicesInnerSpec spec) {
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
    V1alpha1ComponentSpecServicesInner v1alpha1ComponentSpecServicesInner = (V1alpha1ComponentSpecServicesInner) o;
    return Objects.equals(this.annotations, v1alpha1ComponentSpecServicesInner.annotations) &&
        Objects.equals(this.disableAutoProvision, v1alpha1ComponentSpecServicesInner.disableAutoProvision) &&
        Objects.equals(this.name, v1alpha1ComponentSpecServicesInner.name) &&
        Objects.equals(this.podService, v1alpha1ComponentSpecServicesInner.podService) &&
        Objects.equals(this.roleSelector, v1alpha1ComponentSpecServicesInner.roleSelector) &&
        Objects.equals(this.serviceName, v1alpha1ComponentSpecServicesInner.serviceName) &&
        Objects.equals(this.spec, v1alpha1ComponentSpecServicesInner.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, disableAutoProvision, name, podService, roleSelector, serviceName, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentSpecServicesInner {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    disableAutoProvision: ").append(toIndentedString(disableAutoProvision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podService: ").append(toIndentedString(podService)).append("\n");
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
    openapiFields.add("disableAutoProvision");
    openapiFields.add("name");
    openapiFields.add("podService");
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
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentSpecServicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentSpecServicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentSpecServicesInner is not found in the empty JSON string", V1alpha1ComponentSpecServicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentSpecServicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentSpecServicesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentSpecServicesInner.openapiRequiredFields) {
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
        V1alpha1ComponentSpecServicesInnerSpec.validateJsonObject(jsonObj.getAsJsonObject("spec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentSpecServicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentSpecServicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentSpecServicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentSpecServicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentSpecServicesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentSpecServicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentSpecServicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentSpecServicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentSpecServicesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentSpecServicesInner
  */
  public static V1alpha1ComponentSpecServicesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentSpecServicesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentSpecServicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

