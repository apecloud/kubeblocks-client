/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.28.3
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
 * Defines the desired characteristics of a volume requested by a pod author.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private Object accessModes;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Object resources;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec accessModes(Object accessModes) {
    
    this.accessModes = accessModes;
    return this;
  }

   /**
   * Contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1.
   * @return accessModes
  **/
  @jakarta.annotation.Nullable
  public Object getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(Object accessModes) {
    this.accessModes = accessModes;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec resources(Object resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Represents the minimum resources the volume should have. If the RecoverVolumeExpansionFailure feature is enabled, users are allowed to specify resource requirements that are lower than the previous value but must still be higher than the capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources.
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public Object getResources() {
    return resources;
  }


  public void setResources(Object resources) {
    this.resources = resources;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec storageClassName(String storageClassName) {
    
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * The name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1.
   * @return storageClassName
  **/
  @jakarta.annotation.Nullable
  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec volumeMode(String volumeMode) {
    
    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * Defines what type of volume is required by the claim.
   * @return volumeMode
  **/
  @jakarta.annotation.Nullable
  public String getVolumeMode() {
    return volumeMode;
  }


  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec v1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec = (V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec) o;
    return Objects.equals(this.accessModes, v1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.accessModes) &&
        Objects.equals(this.resources, v1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.resources) &&
        Objects.equals(this.storageClassName, v1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.storageClassName) &&
        Objects.equals(this.volumeMode, v1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.volumeMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, resources, storageClassName, volumeMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
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
    openapiFields.add("accessModes");
    openapiFields.add("resources");
    openapiFields.add("storageClassName");
    openapiFields.add("volumeMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("storageClassName") != null && !jsonObj.get("storageClassName").isJsonNull()) && !jsonObj.get("storageClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageClassName").toString()));
      }
      if ((jsonObj.get("volumeMode") != null && !jsonObj.get("volumeMode").isJsonNull()) && !jsonObj.get("volumeMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInnerSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

