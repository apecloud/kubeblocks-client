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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecRestoreFromBackupInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecRestoreFromPointInTime;
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
 * cluster RestoreFrom backup or point in time
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecRestoreFrom {
  public static final String SERIALIZED_NAME_BACKUP = "backup";
  @SerializedName(SERIALIZED_NAME_BACKUP)
  private List<V1alpha1OpsRequestSpecRestoreFromBackupInner> backup;

  public static final String SERIALIZED_NAME_POINT_IN_TIME = "pointInTime";
  @SerializedName(SERIALIZED_NAME_POINT_IN_TIME)
  private V1alpha1OpsRequestSpecRestoreFromPointInTime pointInTime;

  public V1alpha1OpsRequestSpecRestoreFrom() {
  }

  public V1alpha1OpsRequestSpecRestoreFrom backup(List<V1alpha1OpsRequestSpecRestoreFromBackupInner> backup) {
    
    this.backup = backup;
    return this;
  }

  public V1alpha1OpsRequestSpecRestoreFrom addBackupItem(V1alpha1OpsRequestSpecRestoreFromBackupInner backupItem) {
    if (this.backup == null) {
      this.backup = new ArrayList<>();
    }
    this.backup.add(backupItem);
    return this;
  }

   /**
   * use the backup name and component name for restore, support for multiple components&#39; recovery.
   * @return backup
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecRestoreFromBackupInner> getBackup() {
    return backup;
  }


  public void setBackup(List<V1alpha1OpsRequestSpecRestoreFromBackupInner> backup) {
    this.backup = backup;
  }


  public V1alpha1OpsRequestSpecRestoreFrom pointInTime(V1alpha1OpsRequestSpecRestoreFromPointInTime pointInTime) {
    
    this.pointInTime = pointInTime;
    return this;
  }

   /**
   * Get pointInTime
   * @return pointInTime
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecRestoreFromPointInTime getPointInTime() {
    return pointInTime;
  }


  public void setPointInTime(V1alpha1OpsRequestSpecRestoreFromPointInTime pointInTime) {
    this.pointInTime = pointInTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecRestoreFrom v1alpha1OpsRequestSpecRestoreFrom = (V1alpha1OpsRequestSpecRestoreFrom) o;
    return Objects.equals(this.backup, v1alpha1OpsRequestSpecRestoreFrom.backup) &&
        Objects.equals(this.pointInTime, v1alpha1OpsRequestSpecRestoreFrom.pointInTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backup, pointInTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecRestoreFrom {\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    pointInTime: ").append(toIndentedString(pointInTime)).append("\n");
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
    openapiFields.add("backup");
    openapiFields.add("pointInTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecRestoreFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecRestoreFrom.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecRestoreFrom is not found in the empty JSON string", V1alpha1OpsRequestSpecRestoreFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecRestoreFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecRestoreFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("backup") != null && !jsonObj.get("backup").isJsonNull()) {
        JsonArray jsonArraybackup = jsonObj.getAsJsonArray("backup");
        if (jsonArraybackup != null) {
          // ensure the json data is an array
          if (!jsonObj.get("backup").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `backup` to be an array in the JSON string but got `%s`", jsonObj.get("backup").toString()));
          }

          // validate the optional field `backup` (array)
          for (int i = 0; i < jsonArraybackup.size(); i++) {
            V1alpha1OpsRequestSpecRestoreFromBackupInner.validateJsonObject(jsonArraybackup.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `pointInTime`
      if (jsonObj.get("pointInTime") != null && !jsonObj.get("pointInTime").isJsonNull()) {
        V1alpha1OpsRequestSpecRestoreFromPointInTime.validateJsonObject(jsonObj.getAsJsonObject("pointInTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecRestoreFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecRestoreFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecRestoreFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecRestoreFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecRestoreFrom>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecRestoreFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecRestoreFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecRestoreFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecRestoreFrom
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecRestoreFrom
  */
  public static V1alpha1OpsRequestSpecRestoreFrom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsRequestSpecRestoreFrom.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecRestoreFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

