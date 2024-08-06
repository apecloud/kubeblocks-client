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
 * Rolling update config params. Present only if DeploymentStrategyType &#x3D; RollingUpdate. --- TODO: Update this to follow our convention for oneOf, whatever we decide it to be.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:56:57.290761Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate {
  public static final String SERIALIZED_NAME_MAX_SURGE = "maxSurge";
  @SerializedName(SERIALIZED_NAME_MAX_SURGE)
  private Object maxSurge;

  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";
  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  private Object maxUnavailable;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate maxSurge(Object maxSurge) {
    
    this.maxSurge = maxSurge;
    return this;
  }

   /**
   * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
   * @return maxSurge
  **/
  @jakarta.annotation.Nullable
  public Object getMaxSurge() {
    return maxSurge;
  }


  public void setMaxSurge(Object maxSurge) {
    this.maxSurge = maxSurge;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate maxUnavailable(Object maxUnavailable) {
    
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
   * @return maxUnavailable
  **/
  @jakarta.annotation.Nullable
  public Object getMaxUnavailable() {
    return maxUnavailable;
  }


  public void setMaxUnavailable(Object maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate v1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate = (V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate) o;
    return Objects.equals(this.maxSurge, v1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.maxSurge) &&
        Objects.equals(this.maxUnavailable, v1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.maxUnavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSurge, maxUnavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate {\n");
    sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
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
    openapiFields.add("maxSurge");
    openapiFields.add("maxUnavailable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerStatelessSpecUpdateStrategyRollingUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

