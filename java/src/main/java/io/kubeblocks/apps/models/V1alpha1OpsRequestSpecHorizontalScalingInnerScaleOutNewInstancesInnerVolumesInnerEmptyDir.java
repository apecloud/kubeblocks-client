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
 * emptyDir represents a temporary directory that shares a pod&#39;s lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:47.298634Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir {
  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private String medium;

  public static final String SERIALIZED_NAME_SIZE_LIMIT = "sizeLimit";
  @SerializedName(SERIALIZED_NAME_SIZE_LIMIT)
  private Object sizeLimit;

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir() {
  }

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir medium(String medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * medium represents what type of storage medium should back this directory. The default is \&quot;\&quot; which means to use the node&#39;s default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   * @return medium
  **/
  @jakarta.annotation.Nullable
  public String getMedium() {
    return medium;
  }


  public void setMedium(String medium) {
    this.medium = medium;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir sizeLimit(Object sizeLimit) {
    
    this.sizeLimit = sizeLimit;
    return this;
  }

   /**
   * sizeLimit is the total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   * @return sizeLimit
  **/
  @jakarta.annotation.Nullable
  public Object getSizeLimit() {
    return sizeLimit;
  }


  public void setSizeLimit(Object sizeLimit) {
    this.sizeLimit = sizeLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir = (V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir) o;
    return Objects.equals(this.medium, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.medium) &&
        Objects.equals(this.sizeLimit, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.sizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(medium, sizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir {\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    sizeLimit: ").append(toIndentedString(sizeLimit)).append("\n");
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
    openapiFields.add("medium");
    openapiFields.add("sizeLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir is not found in the empty JSON string", V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("medium") != null && !jsonObj.get("medium").isJsonNull()) && !jsonObj.get("medium").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `medium` to be a primitive type in the JSON string but got `%s`", jsonObj.get("medium").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir
  */
  public static V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerEmptyDir to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

