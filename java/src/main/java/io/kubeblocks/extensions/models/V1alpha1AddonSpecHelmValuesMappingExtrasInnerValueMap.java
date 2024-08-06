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


package io.kubeblocks.extensions.models;

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
 * Defines the \&quot;key\&quot; mapping values. Valid keys include &#x60;replicaCount&#x60;, &#x60;persistentVolumeEnabled&#x60;, and &#x60;storageClass&#x60;. Enum values explained:   - &#x60;replicaCount&#x60; sets the replicaCount value mapping key. - &#x60;persistentVolumeEnabled&#x60; sets the persistent volume enabled mapping key. - &#x60;storageClass&#x60; sets the storageClass mapping key.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:02:35.998799Z[Etc/UTC]")
public class V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap {
  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_ENABLED = "persistentVolumeEnabled";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_ENABLED)
  private String persistentVolumeEnabled;

  public static final String SERIALIZED_NAME_REPLICA_COUNT = "replicaCount";
  @SerializedName(SERIALIZED_NAME_REPLICA_COUNT)
  private String replicaCount;

  public static final String SERIALIZED_NAME_STORAGE_CLASS = "storageClass";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS)
  private String storageClass;

  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap() {
  }

  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap persistentVolumeEnabled(String persistentVolumeEnabled) {
    
    this.persistentVolumeEnabled = persistentVolumeEnabled;
    return this;
  }

   /**
   * Indicates whether the persistent volume is enabled in the Helm values map.
   * @return persistentVolumeEnabled
  **/
  @jakarta.annotation.Nullable
  public String getPersistentVolumeEnabled() {
    return persistentVolumeEnabled;
  }


  public void setPersistentVolumeEnabled(String persistentVolumeEnabled) {
    this.persistentVolumeEnabled = persistentVolumeEnabled;
  }


  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap replicaCount(String replicaCount) {
    
    this.replicaCount = replicaCount;
    return this;
  }

   /**
   * Defines the key for setting the replica count in the Helm values map.
   * @return replicaCount
  **/
  @jakarta.annotation.Nullable
  public String getReplicaCount() {
    return replicaCount;
  }


  public void setReplicaCount(String replicaCount) {
    this.replicaCount = replicaCount;
  }


  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap storageClass(String storageClass) {
    
    this.storageClass = storageClass;
    return this;
  }

   /**
   * Specifies the key for setting the storage class in the Helm values map.
   * @return storageClass
  **/
  @jakarta.annotation.Nullable
  public String getStorageClass() {
    return storageClass;
  }


  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap v1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap = (V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap) o;
    return Objects.equals(this.persistentVolumeEnabled, v1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.persistentVolumeEnabled) &&
        Objects.equals(this.replicaCount, v1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.replicaCount) &&
        Objects.equals(this.storageClass, v1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.storageClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentVolumeEnabled, replicaCount, storageClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap {\n");
    sb.append("    persistentVolumeEnabled: ").append(toIndentedString(persistentVolumeEnabled)).append("\n");
    sb.append("    replicaCount: ").append(toIndentedString(replicaCount)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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
    openapiFields.add("persistentVolumeEnabled");
    openapiFields.add("replicaCount");
    openapiFields.add("storageClass");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap is not found in the empty JSON string", V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("persistentVolumeEnabled") != null && !jsonObj.get("persistentVolumeEnabled").isJsonNull()) && !jsonObj.get("persistentVolumeEnabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `persistentVolumeEnabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("persistentVolumeEnabled").toString()));
      }
      if ((jsonObj.get("replicaCount") != null && !jsonObj.get("replicaCount").isJsonNull()) && !jsonObj.get("replicaCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replicaCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replicaCount").toString()));
      }
      if ((jsonObj.get("storageClass") != null && !jsonObj.get("storageClass").isJsonNull()) && !jsonObj.get("storageClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageClass").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap>() {
           @Override
           public void write(JsonWriter out, V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap
  * @throws IOException if the JSON string is invalid with respect to V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap
  */
  public static V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.class);
  }

 /**
  * Convert an instance of V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

