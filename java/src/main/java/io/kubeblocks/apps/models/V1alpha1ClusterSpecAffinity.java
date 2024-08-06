/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.25.3
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
 * Defines a set of node affinity scheduling rules for the Cluster&#39;s Pods. This field helps control the placement of Pods on nodes within the Cluster.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:25.516926Z[Etc/UTC]")
public class V1alpha1ClusterSpecAffinity {
  public static final String SERIALIZED_NAME_NODE_LABELS = "nodeLabels";
  @SerializedName(SERIALIZED_NAME_NODE_LABELS)
  private Map<String, String> nodeLabels = new HashMap<>();

  /**
   * Specifies the anti-affinity level of Pods within a Component. It determines how pods should be spread across nodes to improve availability and performance. It can have the following values: &#x60;Preferred&#x60; and &#x60;Required&#x60;. The default value is &#x60;Preferred&#x60;.
   */
  @JsonAdapter(PodAntiAffinityEnum.Adapter.class)
  public enum PodAntiAffinityEnum {
    PREFERRED("Preferred"),
    
    REQUIRED("Required");

    private String value;

    PodAntiAffinityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PodAntiAffinityEnum fromValue(String value) {
      for (PodAntiAffinityEnum b : PodAntiAffinityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PodAntiAffinityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PodAntiAffinityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PodAntiAffinityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PodAntiAffinityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POD_ANTI_AFFINITY = "podAntiAffinity";
  @SerializedName(SERIALIZED_NAME_POD_ANTI_AFFINITY)
  private PodAntiAffinityEnum podAntiAffinity;

  /**
   * Determines the level of resource isolation between Pods. It can have the following values: &#x60;SharedNode&#x60; and &#x60;DedicatedNode&#x60;.   - SharedNode: Allow that multiple Pods may share the same node, which is the default behavior of K8s. - DedicatedNode: Each Pod runs on a dedicated node, ensuring that no two Pods share the same node.   In other words, if a Pod is already running on a node, no other Pods will be scheduled on that node.   Which provides a higher level of isolation and resource guarantee for Pods.    The default value is &#x60;SharedNode&#x60;.
   */
  @JsonAdapter(TenancyEnum.Adapter.class)
  public enum TenancyEnum {
    SHAREDNODE("SharedNode"),
    
    DEDICATEDNODE("DedicatedNode");

    private String value;

    TenancyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TenancyEnum fromValue(String value) {
      for (TenancyEnum b : TenancyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TenancyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TenancyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TenancyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TenancyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TENANCY = "tenancy";
  @SerializedName(SERIALIZED_NAME_TENANCY)
  private TenancyEnum tenancy;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEYS = "topologyKeys";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEYS)
  private List<String> topologyKeys;

  public V1alpha1ClusterSpecAffinity() {
  }

  public V1alpha1ClusterSpecAffinity nodeLabels(Map<String, String> nodeLabels) {
    
    this.nodeLabels = nodeLabels;
    return this;
  }

  public V1alpha1ClusterSpecAffinity putNodeLabelsItem(String key, String nodeLabelsItem) {
    if (this.nodeLabels == null) {
      this.nodeLabels = new HashMap<>();
    }
    this.nodeLabels.put(key, nodeLabelsItem);
    return this;
  }

   /**
   * Indicates the node labels that must be present on nodes for pods to be scheduled on them. It is a map where the keys are the label keys and the values are the corresponding label values. Pods will only be scheduled on nodes that have all the specified labels with the corresponding values.   For example, if NodeLabels is set to {\&quot;nodeType\&quot;: \&quot;ssd\&quot;, \&quot;environment\&quot;: \&quot;production\&quot;}, pods will only be scheduled on nodes that have both the \&quot;nodeType\&quot; label with value \&quot;ssd\&quot; and the \&quot;environment\&quot; label with value \&quot;production\&quot;.   This field allows users to control Pod placement based on specific node labels. It can be used to ensure that Pods are scheduled on nodes with certain characteristics, such as specific hardware (e.g., SSD), environment (e.g., production, staging), or any other custom labels assigned to nodes.
   * @return nodeLabels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getNodeLabels() {
    return nodeLabels;
  }


  public void setNodeLabels(Map<String, String> nodeLabels) {
    this.nodeLabels = nodeLabels;
  }


  public V1alpha1ClusterSpecAffinity podAntiAffinity(PodAntiAffinityEnum podAntiAffinity) {
    
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

   /**
   * Specifies the anti-affinity level of Pods within a Component. It determines how pods should be spread across nodes to improve availability and performance. It can have the following values: &#x60;Preferred&#x60; and &#x60;Required&#x60;. The default value is &#x60;Preferred&#x60;.
   * @return podAntiAffinity
  **/
  @jakarta.annotation.Nullable
  public PodAntiAffinityEnum getPodAntiAffinity() {
    return podAntiAffinity;
  }


  public void setPodAntiAffinity(PodAntiAffinityEnum podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }


  public V1alpha1ClusterSpecAffinity tenancy(TenancyEnum tenancy) {
    
    this.tenancy = tenancy;
    return this;
  }

   /**
   * Determines the level of resource isolation between Pods. It can have the following values: &#x60;SharedNode&#x60; and &#x60;DedicatedNode&#x60;.   - SharedNode: Allow that multiple Pods may share the same node, which is the default behavior of K8s. - DedicatedNode: Each Pod runs on a dedicated node, ensuring that no two Pods share the same node.   In other words, if a Pod is already running on a node, no other Pods will be scheduled on that node.   Which provides a higher level of isolation and resource guarantee for Pods.    The default value is &#x60;SharedNode&#x60;.
   * @return tenancy
  **/
  @jakarta.annotation.Nullable
  public TenancyEnum getTenancy() {
    return tenancy;
  }


  public void setTenancy(TenancyEnum tenancy) {
    this.tenancy = tenancy;
  }


  public V1alpha1ClusterSpecAffinity topologyKeys(List<String> topologyKeys) {
    
    this.topologyKeys = topologyKeys;
    return this;
  }

  public V1alpha1ClusterSpecAffinity addTopologyKeysItem(String topologyKeysItem) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList<>();
    }
    this.topologyKeys.add(topologyKeysItem);
    return this;
  }

   /**
   * Represents the key of node labels used to define the topology domain for Pod anti-affinity and Pod spread constraints.   In K8s, a topology domain is a set of nodes that have the same value for a specific label key. Nodes with labels containing any of the specified TopologyKeys and identical values are considered to be in the same topology domain.   Note: The concept of topology in the context of K8s TopologyKeys is different from the concept of topology in the ClusterDefinition.   When a Pod has anti-affinity or spread constraints specified, Kubernetes will attempt to schedule the Pod on nodes with different values for the specified TopologyKeys. This ensures that Pods are spread across different topology domains, promoting high availability and reducing the impact of node failures.   Some well-known label keys, such as &#x60;kubernetes.io/hostname&#x60; and &#x60;topology.kubernetes.io/zone&#x60;, are often used as TopologyKey. These keys represent the hostname and zone of a node, respectively. By including these keys in the TopologyKeys list, Pods will be spread across nodes with different hostnames or zones.   In addition to the well-known keys, users can also specify custom label keys as TopologyKeys. This allows for more flexible and custom topology definitions based on the specific needs of the application or environment.   The TopologyKeys field is a slice of strings, where each string represents a label key. The order of the keys in the slice does not matter.
   * @return topologyKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getTopologyKeys() {
    return topologyKeys;
  }


  public void setTopologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecAffinity v1alpha1ClusterSpecAffinity = (V1alpha1ClusterSpecAffinity) o;
    return Objects.equals(this.nodeLabels, v1alpha1ClusterSpecAffinity.nodeLabels) &&
        Objects.equals(this.podAntiAffinity, v1alpha1ClusterSpecAffinity.podAntiAffinity) &&
        Objects.equals(this.tenancy, v1alpha1ClusterSpecAffinity.tenancy) &&
        Objects.equals(this.topologyKeys, v1alpha1ClusterSpecAffinity.topologyKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeLabels, podAntiAffinity, tenancy, topologyKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecAffinity {\n");
    sb.append("    nodeLabels: ").append(toIndentedString(nodeLabels)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
    sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
    sb.append("    topologyKeys: ").append(toIndentedString(topologyKeys)).append("\n");
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
    openapiFields.add("nodeLabels");
    openapiFields.add("podAntiAffinity");
    openapiFields.add("tenancy");
    openapiFields.add("topologyKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecAffinity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecAffinity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecAffinity is not found in the empty JSON string", V1alpha1ClusterSpecAffinity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecAffinity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecAffinity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("podAntiAffinity") != null && !jsonObj.get("podAntiAffinity").isJsonNull()) && !jsonObj.get("podAntiAffinity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podAntiAffinity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podAntiAffinity").toString()));
      }
      if ((jsonObj.get("tenancy") != null && !jsonObj.get("tenancy").isJsonNull()) && !jsonObj.get("tenancy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenancy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenancy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("topologyKeys") != null && !jsonObj.get("topologyKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologyKeys` to be an array in the JSON string but got `%s`", jsonObj.get("topologyKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecAffinity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecAffinity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecAffinity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecAffinity.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecAffinity>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecAffinity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecAffinity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecAffinity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecAffinity
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecAffinity
  */
  public static V1alpha1ClusterSpecAffinity fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecAffinity.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecAffinity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

