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


package io.kubeblocks.dataprotection.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.dataprotection.models.V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner;
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
 * Specifies which volumes from the target should be mounted in the backup workload.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:30.430950Z[Etc/UTC]")
public class V1alpha1BackupStatusBackupMethodTargetVolumes {
  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner> volumeMounts;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<String> volumes;

  public V1alpha1BackupStatusBackupMethodTargetVolumes() {
  }

  public V1alpha1BackupStatusBackupMethodTargetVolumes volumeMounts(List<V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha1BackupStatusBackupMethodTargetVolumes addVolumeMountsItem(V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Specifies the mount for the volumes specified in &#x60;volumes&#x60; section.
   * @return volumeMounts
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1alpha1BackupStatusBackupMethodTargetVolumes volumes(List<String> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public V1alpha1BackupStatusBackupMethodTargetVolumes addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Specifies the list of volumes of targeted application that should be mounted on the backup workload.
   * @return volumes
  **/
  @jakarta.annotation.Nullable
  public List<String> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupStatusBackupMethodTargetVolumes v1alpha1BackupStatusBackupMethodTargetVolumes = (V1alpha1BackupStatusBackupMethodTargetVolumes) o;
    return Objects.equals(this.volumeMounts, v1alpha1BackupStatusBackupMethodTargetVolumes.volumeMounts) &&
        Objects.equals(this.volumes, v1alpha1BackupStatusBackupMethodTargetVolumes.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeMounts, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupStatusBackupMethodTargetVolumes {\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("volumeMounts");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupStatusBackupMethodTargetVolumes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupStatusBackupMethodTargetVolumes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupStatusBackupMethodTargetVolumes is not found in the empty JSON string", V1alpha1BackupStatusBackupMethodTargetVolumes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupStatusBackupMethodTargetVolumes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupStatusBackupMethodTargetVolumes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("volumeMounts") != null && !jsonObj.get("volumeMounts").isJsonNull()) {
        JsonArray jsonArrayvolumeMounts = jsonObj.getAsJsonArray("volumeMounts");
        if (jsonArrayvolumeMounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeMounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeMounts` to be an array in the JSON string but got `%s`", jsonObj.get("volumeMounts").toString()));
          }

          // validate the optional field `volumeMounts` (array)
          for (int i = 0; i < jsonArrayvolumeMounts.size(); i++) {
            V1alpha1BackupStatusBackupMethodTargetVolumesVolumeMountsInner.validateJsonObject(jsonArrayvolumeMounts.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupStatusBackupMethodTargetVolumes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupStatusBackupMethodTargetVolumes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupStatusBackupMethodTargetVolumes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupStatusBackupMethodTargetVolumes.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupStatusBackupMethodTargetVolumes>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupStatusBackupMethodTargetVolumes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupStatusBackupMethodTargetVolumes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupStatusBackupMethodTargetVolumes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupStatusBackupMethodTargetVolumes
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupStatusBackupMethodTargetVolumes
  */
  public static V1alpha1BackupStatusBackupMethodTargetVolumes fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupStatusBackupMethodTargetVolumes.class);
  }

 /**
  * Convert an instance of V1alpha1BackupStatusBackupMethodTargetVolumes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

