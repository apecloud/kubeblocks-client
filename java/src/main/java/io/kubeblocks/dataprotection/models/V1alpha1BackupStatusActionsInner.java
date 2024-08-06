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
import io.kubeblocks.dataprotection.models.V1alpha1BackupStatusActionsInnerObjectRef;
import io.kubeblocks.dataprotection.models.V1alpha1BackupStatusActionsInnerTimeRange;
import io.kubeblocks.dataprotection.models.V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * V1alpha1BackupStatusActionsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:30.430950Z[Etc/UTC]")
public class V1alpha1BackupStatusActionsInner {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "actionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COMPLETION_TIMESTAMP = "completionTimestamp";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TIMESTAMP)
  private OffsetDateTime completionTimestamp;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECT_REF = "objectRef";
  @SerializedName(SERIALIZED_NAME_OBJECT_REF)
  private V1alpha1BackupStatusActionsInnerObjectRef objectRef;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_START_TIMESTAMP = "startTimestamp";
  @SerializedName(SERIALIZED_NAME_START_TIMESTAMP)
  private OffsetDateTime startTimestamp;

  public static final String SERIALIZED_NAME_TARGET_POD_NAME = "targetPodName";
  @SerializedName(SERIALIZED_NAME_TARGET_POD_NAME)
  private String targetPodName;

  public static final String SERIALIZED_NAME_TIME_RANGE = "timeRange";
  @SerializedName(SERIALIZED_NAME_TIME_RANGE)
  private V1alpha1BackupStatusActionsInnerTimeRange timeRange;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public static final String SERIALIZED_NAME_VOLUME_SNAPSHOTS = "volumeSnapshots";
  @SerializedName(SERIALIZED_NAME_VOLUME_SNAPSHOTS)
  private List<V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner> volumeSnapshots;

  public V1alpha1BackupStatusActionsInner() {
  }

  public V1alpha1BackupStatusActionsInner actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * The type of the action.
   * @return actionType
  **/
  @jakarta.annotation.Nullable
  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public V1alpha1BackupStatusActionsInner availableReplicas(Integer availableReplicas) {
    
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Available replicas for statefulSet action.
   * @return availableReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }


  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1alpha1BackupStatusActionsInner completionTimestamp(OffsetDateTime completionTimestamp) {
    
    this.completionTimestamp = completionTimestamp;
    return this;
  }

   /**
   * Records the time an action was completed.
   * @return completionTimestamp
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCompletionTimestamp() {
    return completionTimestamp;
  }


  public void setCompletionTimestamp(OffsetDateTime completionTimestamp) {
    this.completionTimestamp = completionTimestamp;
  }


  public V1alpha1BackupStatusActionsInner failureReason(String failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * An error that caused the action to fail.
   * @return failureReason
  **/
  @jakarta.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public V1alpha1BackupStatusActionsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the action.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1BackupStatusActionsInner objectRef(V1alpha1BackupStatusActionsInnerObjectRef objectRef) {
    
    this.objectRef = objectRef;
    return this;
  }

   /**
   * Get objectRef
   * @return objectRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1BackupStatusActionsInnerObjectRef getObjectRef() {
    return objectRef;
  }


  public void setObjectRef(V1alpha1BackupStatusActionsInnerObjectRef objectRef) {
    this.objectRef = objectRef;
  }


  public V1alpha1BackupStatusActionsInner phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * The current phase of the action.
   * @return phase
  **/
  @jakarta.annotation.Nullable
  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1alpha1BackupStatusActionsInner startTimestamp(OffsetDateTime startTimestamp) {
    
    this.startTimestamp = startTimestamp;
    return this;
  }

   /**
   * Records the time an action was started.
   * @return startTimestamp
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStartTimestamp() {
    return startTimestamp;
  }


  public void setStartTimestamp(OffsetDateTime startTimestamp) {
    this.startTimestamp = startTimestamp;
  }


  public V1alpha1BackupStatusActionsInner targetPodName(String targetPodName) {
    
    this.targetPodName = targetPodName;
    return this;
  }

   /**
   * Records the target pod name which has been backed up.
   * @return targetPodName
  **/
  @jakarta.annotation.Nullable
  public String getTargetPodName() {
    return targetPodName;
  }


  public void setTargetPodName(String targetPodName) {
    this.targetPodName = targetPodName;
  }


  public V1alpha1BackupStatusActionsInner timeRange(V1alpha1BackupStatusActionsInnerTimeRange timeRange) {
    
    this.timeRange = timeRange;
    return this;
  }

   /**
   * Get timeRange
   * @return timeRange
  **/
  @jakarta.annotation.Nullable
  public V1alpha1BackupStatusActionsInnerTimeRange getTimeRange() {
    return timeRange;
  }


  public void setTimeRange(V1alpha1BackupStatusActionsInnerTimeRange timeRange) {
    this.timeRange = timeRange;
  }


  public V1alpha1BackupStatusActionsInner totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * The total size of backed up data size. A string with capacity units in the format of \&quot;1Gi\&quot;, \&quot;1Mi\&quot;, \&quot;1Ki\&quot;. If no capacity unit is specified, it is assumed to be in bytes.
   * @return totalSize
  **/
  @jakarta.annotation.Nullable
  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }


  public V1alpha1BackupStatusActionsInner volumeSnapshots(List<V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner> volumeSnapshots) {
    
    this.volumeSnapshots = volumeSnapshots;
    return this;
  }

  public V1alpha1BackupStatusActionsInner addVolumeSnapshotsItem(V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner volumeSnapshotsItem) {
    if (this.volumeSnapshots == null) {
      this.volumeSnapshots = new ArrayList<>();
    }
    this.volumeSnapshots.add(volumeSnapshotsItem);
    return this;
  }

   /**
   * Records the volume snapshot status for the action.
   * @return volumeSnapshots
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner> getVolumeSnapshots() {
    return volumeSnapshots;
  }


  public void setVolumeSnapshots(List<V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner> volumeSnapshots) {
    this.volumeSnapshots = volumeSnapshots;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupStatusActionsInner v1alpha1BackupStatusActionsInner = (V1alpha1BackupStatusActionsInner) o;
    return Objects.equals(this.actionType, v1alpha1BackupStatusActionsInner.actionType) &&
        Objects.equals(this.availableReplicas, v1alpha1BackupStatusActionsInner.availableReplicas) &&
        Objects.equals(this.completionTimestamp, v1alpha1BackupStatusActionsInner.completionTimestamp) &&
        Objects.equals(this.failureReason, v1alpha1BackupStatusActionsInner.failureReason) &&
        Objects.equals(this.name, v1alpha1BackupStatusActionsInner.name) &&
        Objects.equals(this.objectRef, v1alpha1BackupStatusActionsInner.objectRef) &&
        Objects.equals(this.phase, v1alpha1BackupStatusActionsInner.phase) &&
        Objects.equals(this.startTimestamp, v1alpha1BackupStatusActionsInner.startTimestamp) &&
        Objects.equals(this.targetPodName, v1alpha1BackupStatusActionsInner.targetPodName) &&
        Objects.equals(this.timeRange, v1alpha1BackupStatusActionsInner.timeRange) &&
        Objects.equals(this.totalSize, v1alpha1BackupStatusActionsInner.totalSize) &&
        Objects.equals(this.volumeSnapshots, v1alpha1BackupStatusActionsInner.volumeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, availableReplicas, completionTimestamp, failureReason, name, objectRef, phase, startTimestamp, targetPodName, timeRange, totalSize, volumeSnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupStatusActionsInner {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    completionTimestamp: ").append(toIndentedString(completionTimestamp)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    targetPodName: ").append(toIndentedString(targetPodName)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    volumeSnapshots: ").append(toIndentedString(volumeSnapshots)).append("\n");
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
    openapiFields.add("actionType");
    openapiFields.add("availableReplicas");
    openapiFields.add("completionTimestamp");
    openapiFields.add("failureReason");
    openapiFields.add("name");
    openapiFields.add("objectRef");
    openapiFields.add("phase");
    openapiFields.add("startTimestamp");
    openapiFields.add("targetPodName");
    openapiFields.add("timeRange");
    openapiFields.add("totalSize");
    openapiFields.add("volumeSnapshots");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupStatusActionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupStatusActionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupStatusActionsInner is not found in the empty JSON string", V1alpha1BackupStatusActionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupStatusActionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupStatusActionsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("actionType") != null && !jsonObj.get("actionType").isJsonNull()) && !jsonObj.get("actionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionType").toString()));
      }
      if ((jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) && !jsonObj.get("failureReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failureReason").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `objectRef`
      if (jsonObj.get("objectRef") != null && !jsonObj.get("objectRef").isJsonNull()) {
        V1alpha1BackupStatusActionsInnerObjectRef.validateJsonObject(jsonObj.getAsJsonObject("objectRef"));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if ((jsonObj.get("targetPodName") != null && !jsonObj.get("targetPodName").isJsonNull()) && !jsonObj.get("targetPodName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPodName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetPodName").toString()));
      }
      // validate the optional field `timeRange`
      if (jsonObj.get("timeRange") != null && !jsonObj.get("timeRange").isJsonNull()) {
        V1alpha1BackupStatusActionsInnerTimeRange.validateJsonObject(jsonObj.getAsJsonObject("timeRange"));
      }
      if ((jsonObj.get("totalSize") != null && !jsonObj.get("totalSize").isJsonNull()) && !jsonObj.get("totalSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalSize").toString()));
      }
      if (jsonObj.get("volumeSnapshots") != null && !jsonObj.get("volumeSnapshots").isJsonNull()) {
        JsonArray jsonArrayvolumeSnapshots = jsonObj.getAsJsonArray("volumeSnapshots");
        if (jsonArrayvolumeSnapshots != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeSnapshots").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeSnapshots` to be an array in the JSON string but got `%s`", jsonObj.get("volumeSnapshots").toString()));
          }

          // validate the optional field `volumeSnapshots` (array)
          for (int i = 0; i < jsonArrayvolumeSnapshots.size(); i++) {
            V1alpha1BackupStatusActionsInnerVolumeSnapshotsInner.validateJsonObject(jsonArrayvolumeSnapshots.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupStatusActionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupStatusActionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupStatusActionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupStatusActionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupStatusActionsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupStatusActionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupStatusActionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupStatusActionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupStatusActionsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupStatusActionsInner
  */
  public static V1alpha1BackupStatusActionsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupStatusActionsInner.class);
  }

 /**
  * Convert an instance of V1alpha1BackupStatusActionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

