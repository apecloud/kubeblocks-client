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
import io.kubeblocks.apps.models.V1alpha1ComponentSpecServicesInnerSpecPortsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * OpsService represents the parameters to dynamically create or remove a ClusterService in the &#x60;cluster.spec.services&#x60; array.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecExposeInnerServicesInner {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_IP_FAMILIES = "ipFamilies";
  @SerializedName(SERIALIZED_NAME_IP_FAMILIES)
  private List<String> ipFamilies;

  public static final String SERIALIZED_NAME_IP_FAMILY_POLICY = "ipFamilyPolicy";
  @SerializedName(SERIALIZED_NAME_IP_FAMILY_POLICY)
  private String ipFamilyPolicy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POD_SELECTOR = "podSelector";
  @SerializedName(SERIALIZED_NAME_POD_SELECTOR)
  private Map<String, String> podSelector = new HashMap<>();

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1alpha1ComponentSpecServicesInnerSpecPortsInner> ports;

  public static final String SERIALIZED_NAME_ROLE_SELECTOR = "roleSelector";
  @SerializedName(SERIALIZED_NAME_ROLE_SELECTOR)
  private String roleSelector;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public V1alpha1OpsRequestSpecExposeInnerServicesInner() {
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Contains cloud provider related parameters if ServiceType is LoadBalancer.   More info: https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer.
   * @return annotations
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner ipFamilies(List<String> ipFamilies) {
    
    this.ipFamilies = ipFamilies;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner addIpFamiliesItem(String ipFamiliesItem) {
    if (this.ipFamilies == null) {
      this.ipFamilies = new ArrayList<>();
    }
    this.ipFamilies.add(ipFamiliesItem);
    return this;
  }

   /**
   * A list of IP families (e.g., IPv4, IPv6) assigned to this Service.   Usually assigned automatically based on the cluster configuration and the &#x60;ipFamilyPolicy&#x60; field. If specified manually, the requested IP family must be available in the cluster and allowed by the &#x60;ipFamilyPolicy&#x60;. If the requested IP family is not available or not allowed, the Service creation will fail.   Valid values:   - \&quot;IPv4\&quot; - \&quot;IPv6\&quot;   This field may hold a maximum of two entries (dual-stack families, in either order).   Common combinations of &#x60;ipFamilies&#x60; and &#x60;ipFamilyPolicy&#x60; are:   - ipFamilies&#x3D;[] + ipFamilyPolicy&#x3D;\&quot;PreferDualStack\&quot; : The Service prefers dual-stack but can fall back to single-stack if the cluster does not support dual-stack. The IP family is automatically assigned based on the cluster configuration. - ipFamilies&#x3D;[\&quot;IPV4\&quot;,\&quot;IPV6\&quot;] + ipFamilyPolicy&#x3D;\&quot;RequiredDualStack\&quot; : The Service requires dual-stack and will only be created if the cluster supports both IPv4 and IPv6. The primary IP family is IPV4. - ipFamilies&#x3D;[\&quot;IPV6\&quot;,\&quot;IPV4\&quot;] + ipFamilyPolicy&#x3D;\&quot;RequiredDualStack\&quot; : The Service requires dual-stack and will only be created if the cluster supports both IPv4 and IPv6. The primary IP family is IPV6. - ipFamilies&#x3D;[\&quot;IPV4\&quot;] + ipFamilyPolicy&#x3D;\&quot;SingleStack\&quot; : The Service uses a single-stack with IPv4 only. - ipFamilies&#x3D;[\&quot;IPV6\&quot;] + ipFamilyPolicy&#x3D;\&quot;SingleStack\&quot; : The Service uses a single-stack with IPv6 only.
   * @return ipFamilies
  **/
  @jakarta.annotation.Nullable
  public List<String> getIpFamilies() {
    return ipFamilies;
  }


  public void setIpFamilies(List<String> ipFamilies) {
    this.ipFamilies = ipFamilies;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner ipFamilyPolicy(String ipFamilyPolicy) {
    
    this.ipFamilyPolicy = ipFamilyPolicy;
    return this;
  }

   /**
   * Specifies whether the Service should use a single IP family (SingleStack) or two IP families (DualStack).   Possible values:   - &#39;SingleStack&#39; (default) : The Service uses a single IP family. If no value is provided, IPFamilyPolicy defaults to SingleStack. - &#39;PreferDualStack&#39; : The Service prefers to use two IP families on dual-stack configured clusters or a single IP family on single-stack clusters. - &#39;RequiredDualStack&#39; : The Service requires two IP families on dual-stack configured clusters. If the cluster is not configured for dual-stack, the Service creation fails.
   * @return ipFamilyPolicy
  **/
  @jakarta.annotation.Nullable
  public String getIpFamilyPolicy() {
    return ipFamilyPolicy;
  }


  public void setIpFamilyPolicy(String ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the Service. This name is used to set &#x60;clusterService.name&#x60;.   Note: This field cannot be updated.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner podSelector(Map<String, String> podSelector) {
    
    this.podSelector = podSelector;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner putPodSelectorItem(String key, String podSelectorItem) {
    if (this.podSelector == null) {
      this.podSelector = new HashMap<>();
    }
    this.podSelector.put(key, podSelectorItem);
    return this;
  }

   /**
   * Routes service traffic to pods with matching label keys and values. If specified, the service will only be exposed to pods matching the selector.   Note: If the component has roles, at least one of &#39;roleSelector&#39; or &#39;podSelector&#39; must be specified. If both are specified, a pod must match both conditions to be selected.
   * @return podSelector
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getPodSelector() {
    return podSelector;
  }


  public void setPodSelector(Map<String, String> podSelector) {
    this.podSelector = podSelector;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner ports(List<V1alpha1ComponentSpecServicesInnerSpecPortsInner> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInnerServicesInner addPortsItem(V1alpha1ComponentSpecServicesInnerSpecPortsInner portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Specifies Port definitions that are to be exposed by a ClusterService.   If not specified, the Port definitions from non-NodePort and non-LoadBalancer type ComponentService defined in the ComponentDefinition (&#x60;componentDefinition.spec.services&#x60;) will be used. If no matching ComponentService is found, the expose operation will fail.   More info: https://kubernetes.io/docs/concepts/services-networking/service/#field-spec-ports
   * @return ports
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentSpecServicesInnerSpecPortsInner> getPorts() {
    return ports;
  }


  public void setPorts(List<V1alpha1ComponentSpecServicesInnerSpecPortsInner> ports) {
    this.ports = ports;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner roleSelector(String roleSelector) {
    
    this.roleSelector = roleSelector;
    return this;
  }

   /**
   * Specifies a role to target with the service. If specified, the service will only be exposed to pods with the matching role.   Note: If the component has roles, at least one of &#39;roleSelector&#39; or &#39;podSelector&#39; must be specified. If both are specified, a pod must match both conditions to be selected.
   * @return roleSelector
  **/
  @jakarta.annotation.Nullable
  public String getRoleSelector() {
    return roleSelector;
  }


  public void setRoleSelector(String roleSelector) {
    this.roleSelector = roleSelector;
  }


  public V1alpha1OpsRequestSpecExposeInnerServicesInner serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Determines how the Service is exposed. Defaults to &#39;ClusterIP&#39;. Valid options are &#x60;ClusterIP&#x60;, &#x60;NodePort&#x60;, and &#x60;LoadBalancer&#x60;.   - &#x60;ClusterIP&#x60;: allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, they are determined by manual construction of an Endpoints object or EndpointSlice objects. - &#x60;NodePort&#x60;: builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. - &#x60;LoadBalancer&#x60;: builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP.   Note: although K8s Service type allows the &#39;ExternalName&#39; type, it is not a valid option for the expose operation.   For more info, see: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types.
   * @return serviceType
  **/
  @jakarta.annotation.Nullable
  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecExposeInnerServicesInner v1alpha1OpsRequestSpecExposeInnerServicesInner = (V1alpha1OpsRequestSpecExposeInnerServicesInner) o;
    return Objects.equals(this.annotations, v1alpha1OpsRequestSpecExposeInnerServicesInner.annotations) &&
        Objects.equals(this.ipFamilies, v1alpha1OpsRequestSpecExposeInnerServicesInner.ipFamilies) &&
        Objects.equals(this.ipFamilyPolicy, v1alpha1OpsRequestSpecExposeInnerServicesInner.ipFamilyPolicy) &&
        Objects.equals(this.name, v1alpha1OpsRequestSpecExposeInnerServicesInner.name) &&
        Objects.equals(this.podSelector, v1alpha1OpsRequestSpecExposeInnerServicesInner.podSelector) &&
        Objects.equals(this.ports, v1alpha1OpsRequestSpecExposeInnerServicesInner.ports) &&
        Objects.equals(this.roleSelector, v1alpha1OpsRequestSpecExposeInnerServicesInner.roleSelector) &&
        Objects.equals(this.serviceType, v1alpha1OpsRequestSpecExposeInnerServicesInner.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, ipFamilies, ipFamilyPolicy, name, podSelector, ports, roleSelector, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecExposeInnerServicesInner {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    ipFamilies: ").append(toIndentedString(ipFamilies)).append("\n");
    sb.append("    ipFamilyPolicy: ").append(toIndentedString(ipFamilyPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    roleSelector: ").append(toIndentedString(roleSelector)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
    openapiFields.add("ipFamilies");
    openapiFields.add("ipFamilyPolicy");
    openapiFields.add("name");
    openapiFields.add("podSelector");
    openapiFields.add("ports");
    openapiFields.add("roleSelector");
    openapiFields.add("serviceType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecExposeInnerServicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecExposeInnerServicesInner is not found in the empty JSON string", V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecExposeInnerServicesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecExposeInnerServicesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipFamilies") != null && !jsonObj.get("ipFamilies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipFamilies` to be an array in the JSON string but got `%s`", jsonObj.get("ipFamilies").toString()));
      }
      if ((jsonObj.get("ipFamilyPolicy") != null && !jsonObj.get("ipFamilyPolicy").isJsonNull()) && !jsonObj.get("ipFamilyPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipFamilyPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipFamilyPolicy").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            V1alpha1ComponentSpecServicesInnerSpecPortsInner.validateJsonObject(jsonArrayports.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("roleSelector") != null && !jsonObj.get("roleSelector").isJsonNull()) && !jsonObj.get("roleSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleSelector").toString()));
      }
      if ((jsonObj.get("serviceType") != null && !jsonObj.get("serviceType").isJsonNull()) && !jsonObj.get("serviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecExposeInnerServicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecExposeInnerServicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecExposeInnerServicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecExposeInnerServicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecExposeInnerServicesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecExposeInnerServicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecExposeInnerServicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecExposeInnerServicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecExposeInnerServicesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecExposeInnerServicesInner
  */
  public static V1alpha1OpsRequestSpecExposeInnerServicesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecExposeInnerServicesInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecExposeInnerServicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

