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
import io.kubeblocks.apps.models.V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner;
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
 * A label query over a set of resources, in this case pods.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:58:42.635097Z[Etc/UTC]")
public class V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner> matchExpressions;

  public static final String SERIALIZED_NAME_MATCH_LABELS = "matchLabels";
  @SerializedName(SERIALIZED_NAME_MATCH_LABELS)
  private Map<String, String> matchLabels = new HashMap<>();

  public V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector() {
  }

  public V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector matchExpressions(List<V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner> matchExpressions) {
    
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector addMatchExpressionsItem(V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector matchLabels(Map<String, String> matchLabels) {
    
    this.matchLabels = matchLabels;
    return this;
  }

  public V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

   /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   * @return matchLabels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }


  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector v1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector = (V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector) o;
    return Objects.equals(this.matchExpressions, v1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.matchExpressions) &&
        Objects.equals(this.matchLabels, v1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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
    openapiFields.add("matchExpressions");
    openapiFields.add("matchLabels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector is not found in the empty JSON string", V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("matchExpressions") != null && !jsonObj.get("matchExpressions").isJsonNull()) {
        JsonArray jsonArraymatchExpressions = jsonObj.getAsJsonArray("matchExpressions");
        if (jsonArraymatchExpressions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchExpressions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchExpressions` to be an array in the JSON string but got `%s`", jsonObj.get("matchExpressions").toString()));
          }

          // validate the optional field `matchExpressions` (array)
          for (int i = 0; i < jsonArraymatchExpressions.size(); i++) {
            V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelectorMatchExpressionsInner.validateJsonObject(jsonArraymatchExpressions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector
  */
  public static V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentSpecInstancesInnerSchedulingPolicyAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionInnerPodAffinityTermLabelSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

