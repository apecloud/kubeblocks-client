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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:25.516926Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "preferredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> preferredDuringSchedulingIgnoredDuringExecution;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "requiredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner> requiredDuringSchedulingIgnoredDuringExecution;

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity preferredDuringSchedulingIgnoredDuringExecution(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> preferredDuringSchedulingIgnoredDuringExecution) {
    
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
   * @return preferredDuringSchedulingIgnoredDuringExecution
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }


  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity requiredDuringSchedulingIgnoredDuringExecution(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner> requiredDuringSchedulingIgnoredDuringExecution) {
    
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity addRequiredDuringSchedulingIgnoredDuringExecutionItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner requiredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
    }
    this.requiredDuringSchedulingIgnoredDuringExecution.add(requiredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
   * @return requiredDuringSchedulingIgnoredDuringExecution
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }


  public void setRequiredDuringSchedulingIgnoredDuringExecution(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner> requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity = (V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity) o;
    return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.preferredDuringSchedulingIgnoredDuringExecution) &&
        Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity {\n");
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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
    openapiFields.add("preferredDuringSchedulingIgnoredDuringExecution");
    openapiFields.add("requiredDuringSchedulingIgnoredDuringExecution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution") != null && !jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").isJsonNull()) {
        JsonArray jsonArraypreferredDuringSchedulingIgnoredDuringExecution = jsonObj.getAsJsonArray("preferredDuringSchedulingIgnoredDuringExecution");
        if (jsonArraypreferredDuringSchedulingIgnoredDuringExecution != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preferredDuringSchedulingIgnoredDuringExecution` to be an array in the JSON string but got `%s`", jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").toString()));
          }

          // validate the optional field `preferredDuringSchedulingIgnoredDuringExecution` (array)
          for (int i = 0; i < jsonArraypreferredDuringSchedulingIgnoredDuringExecution.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInner.validateJsonObject(jsonArraypreferredDuringSchedulingIgnoredDuringExecution.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution") != null && !jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").isJsonNull()) {
        JsonArray jsonArrayrequiredDuringSchedulingIgnoredDuringExecution = jsonObj.getAsJsonArray("requiredDuringSchedulingIgnoredDuringExecution");
        if (jsonArrayrequiredDuringSchedulingIgnoredDuringExecution != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requiredDuringSchedulingIgnoredDuringExecution` to be an array in the JSON string but got `%s`", jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").toString()));
          }

          // validate the optional field `requiredDuringSchedulingIgnoredDuringExecution` (array)
          for (int i = 0; i < jsonArrayrequiredDuringSchedulingIgnoredDuringExecution.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionInner.validateJsonObject(jsonArrayrequiredDuringSchedulingIgnoredDuringExecution.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerSchedulingPolicyAffinityPodAffinity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

