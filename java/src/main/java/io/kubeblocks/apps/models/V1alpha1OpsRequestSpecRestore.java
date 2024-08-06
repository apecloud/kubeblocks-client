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
 * Specifies the parameters to restore a Cluster. Note that this restore operation will roll back cluster services.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:47.298634Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecRestore {
  public static final String SERIALIZED_NAME_BACKUP_NAME = "backupName";
  @SerializedName(SERIALIZED_NAME_BACKUP_NAME)
  private String backupName;

  public static final String SERIALIZED_NAME_DEFER_POST_READY_UNTIL_CLUSTER_RUNNING = "deferPostReadyUntilClusterRunning";
  @SerializedName(SERIALIZED_NAME_DEFER_POST_READY_UNTIL_CLUSTER_RUNNING)
  private Boolean deferPostReadyUntilClusterRunning;

  public static final String SERIALIZED_NAME_RESTORE_POINT_IN_TIME = "restorePointInTime";
  @SerializedName(SERIALIZED_NAME_RESTORE_POINT_IN_TIME)
  private String restorePointInTime;

  /**
   * Specifies the policy for restoring volume claims of a Component&#39;s Pods. It determines whether the volume claims should be restored sequentially (one by one) or in parallel (all at once). Support values:   - \&quot;Serial\&quot; - \&quot;Parallel\&quot;
   */
  @JsonAdapter(VolumeRestorePolicyEnum.Adapter.class)
  public enum VolumeRestorePolicyEnum {
    SERIAL("Serial"),
    
    PARALLEL("Parallel");

    private String value;

    VolumeRestorePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VolumeRestorePolicyEnum fromValue(String value) {
      for (VolumeRestorePolicyEnum b : VolumeRestorePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VolumeRestorePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VolumeRestorePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VolumeRestorePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VolumeRestorePolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VOLUME_RESTORE_POLICY = "volumeRestorePolicy";
  @SerializedName(SERIALIZED_NAME_VOLUME_RESTORE_POLICY)
  private VolumeRestorePolicyEnum volumeRestorePolicy;

  public V1alpha1OpsRequestSpecRestore() {
  }

  public V1alpha1OpsRequestSpecRestore backupName(String backupName) {
    
    this.backupName = backupName;
    return this;
  }

   /**
   * Specifies the name of the Backup custom resource.
   * @return backupName
  **/
  @jakarta.annotation.Nonnull
  public String getBackupName() {
    return backupName;
  }


  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }


  public V1alpha1OpsRequestSpecRestore deferPostReadyUntilClusterRunning(Boolean deferPostReadyUntilClusterRunning) {
    
    this.deferPostReadyUntilClusterRunning = deferPostReadyUntilClusterRunning;
    return this;
  }

   /**
   * Controls the timing of PostReady actions during the recovery process.   If false (default), PostReady actions execute when the Component reaches the \&quot;Running\&quot; state. If true, PostReady actions are delayed until the entire Cluster is \&quot;Running,\&quot; ensuring the cluster&#39;s overall stability before proceeding.   This setting is useful for coordinating PostReady operations across the Cluster for optimal cluster conditions.
   * @return deferPostReadyUntilClusterRunning
  **/
  @jakarta.annotation.Nullable
  public Boolean getDeferPostReadyUntilClusterRunning() {
    return deferPostReadyUntilClusterRunning;
  }


  public void setDeferPostReadyUntilClusterRunning(Boolean deferPostReadyUntilClusterRunning) {
    this.deferPostReadyUntilClusterRunning = deferPostReadyUntilClusterRunning;
  }


  public V1alpha1OpsRequestSpecRestore restorePointInTime(String restorePointInTime) {
    
    this.restorePointInTime = restorePointInTime;
    return this;
  }

   /**
   * Specifies the point in time to which the restore should be performed. Supported time formats:   - RFC3339 format, e.g. \&quot;2023-11-25T18:52:53Z\&quot; - A human-readable date-time format, e.g. \&quot;Jul 25,2023 18:52:53 UTC+0800\&quot;
   * @return restorePointInTime
  **/
  @jakarta.annotation.Nullable
  public String getRestorePointInTime() {
    return restorePointInTime;
  }


  public void setRestorePointInTime(String restorePointInTime) {
    this.restorePointInTime = restorePointInTime;
  }


  public V1alpha1OpsRequestSpecRestore volumeRestorePolicy(VolumeRestorePolicyEnum volumeRestorePolicy) {
    
    this.volumeRestorePolicy = volumeRestorePolicy;
    return this;
  }

   /**
   * Specifies the policy for restoring volume claims of a Component&#39;s Pods. It determines whether the volume claims should be restored sequentially (one by one) or in parallel (all at once). Support values:   - \&quot;Serial\&quot; - \&quot;Parallel\&quot;
   * @return volumeRestorePolicy
  **/
  @jakarta.annotation.Nullable
  public VolumeRestorePolicyEnum getVolumeRestorePolicy() {
    return volumeRestorePolicy;
  }


  public void setVolumeRestorePolicy(VolumeRestorePolicyEnum volumeRestorePolicy) {
    this.volumeRestorePolicy = volumeRestorePolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecRestore v1alpha1OpsRequestSpecRestore = (V1alpha1OpsRequestSpecRestore) o;
    return Objects.equals(this.backupName, v1alpha1OpsRequestSpecRestore.backupName) &&
        Objects.equals(this.deferPostReadyUntilClusterRunning, v1alpha1OpsRequestSpecRestore.deferPostReadyUntilClusterRunning) &&
        Objects.equals(this.restorePointInTime, v1alpha1OpsRequestSpecRestore.restorePointInTime) &&
        Objects.equals(this.volumeRestorePolicy, v1alpha1OpsRequestSpecRestore.volumeRestorePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, deferPostReadyUntilClusterRunning, restorePointInTime, volumeRestorePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecRestore {\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    deferPostReadyUntilClusterRunning: ").append(toIndentedString(deferPostReadyUntilClusterRunning)).append("\n");
    sb.append("    restorePointInTime: ").append(toIndentedString(restorePointInTime)).append("\n");
    sb.append("    volumeRestorePolicy: ").append(toIndentedString(volumeRestorePolicy)).append("\n");
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
    openapiFields.add("backupName");
    openapiFields.add("deferPostReadyUntilClusterRunning");
    openapiFields.add("restorePointInTime");
    openapiFields.add("volumeRestorePolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("backupName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecRestore
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecRestore.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecRestore is not found in the empty JSON string", V1alpha1OpsRequestSpecRestore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecRestore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecRestore` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecRestore.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("backupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupName").toString()));
      }
      if ((jsonObj.get("restorePointInTime") != null && !jsonObj.get("restorePointInTime").isJsonNull()) && !jsonObj.get("restorePointInTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restorePointInTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restorePointInTime").toString()));
      }
      if ((jsonObj.get("volumeRestorePolicy") != null && !jsonObj.get("volumeRestorePolicy").isJsonNull()) && !jsonObj.get("volumeRestorePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeRestorePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeRestorePolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecRestore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecRestore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecRestore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecRestore.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecRestore>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecRestore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecRestore read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecRestore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecRestore
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecRestore
  */
  public static V1alpha1OpsRequestSpecRestore fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecRestore.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecRestore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

