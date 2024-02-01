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
import io.kubeblocks.apps.models.V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner;
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
 * V1alpha1OpsRequestStatusComponentsValue
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestStatusComponentsValue {
  public static final String SERIALIZED_NAME_LAST_FAILED_TIME = "lastFailedTime";
  @SerializedName(SERIALIZED_NAME_LAST_FAILED_TIME)
  private OffsetDateTime lastFailedTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  /**
   * phase describes the component phase, reference Cluster.status.component.phase.
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    CREATING("Creating"),
    
    RUNNING("Running"),
    
    UPDATING("Updating"),
    
    STOPPING("Stopping"),
    
    STOPPED("Stopped"),
    
    DELETING("Deleting"),
    
    FAILED("Failed"),
    
    ABNORMAL("Abnormal");

    private String value;

    PhaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhaseEnum fromValue(String value) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhaseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhaseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private PhaseEnum phase;

  public static final String SERIALIZED_NAME_PROGRESS_DETAILS = "progressDetails";
  @SerializedName(SERIALIZED_NAME_PROGRESS_DETAILS)
  private List<V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner> progressDetails;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * workloadType references workload type of component in ClusterDefinition.
   */
  @JsonAdapter(WorkloadTypeEnum.Adapter.class)
  public enum WorkloadTypeEnum {
    STATELESS("Stateless"),
    
    STATEFUL("Stateful"),
    
    CONSENSUS("Consensus"),
    
    REPLICATION("Replication");

    private String value;

    WorkloadTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkloadTypeEnum fromValue(String value) {
      for (WorkloadTypeEnum b : WorkloadTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkloadTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkloadTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkloadTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkloadTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WORKLOAD_TYPE = "workloadType";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_TYPE)
  private WorkloadTypeEnum workloadType;

  public V1alpha1OpsRequestStatusComponentsValue() {
  }

  public V1alpha1OpsRequestStatusComponentsValue lastFailedTime(OffsetDateTime lastFailedTime) {
    
    this.lastFailedTime = lastFailedTime;
    return this;
  }

   /**
   * lastFailedTime is the last time the component phase transitioned to Failed or Abnormal.
   * @return lastFailedTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getLastFailedTime() {
    return lastFailedTime;
  }


  public void setLastFailedTime(OffsetDateTime lastFailedTime) {
    this.lastFailedTime = lastFailedTime;
  }


  public V1alpha1OpsRequestStatusComponentsValue message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * message is a human-readable message indicating details about this operation.
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1OpsRequestStatusComponentsValue phase(PhaseEnum phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * phase describes the component phase, reference Cluster.status.component.phase.
   * @return phase
  **/
  @jakarta.annotation.Nullable
  public PhaseEnum getPhase() {
    return phase;
  }


  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }


  public V1alpha1OpsRequestStatusComponentsValue progressDetails(List<V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner> progressDetails) {
    
    this.progressDetails = progressDetails;
    return this;
  }

  public V1alpha1OpsRequestStatusComponentsValue addProgressDetailsItem(V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner progressDetailsItem) {
    if (this.progressDetails == null) {
      this.progressDetails = new ArrayList<>();
    }
    this.progressDetails.add(progressDetailsItem);
    return this;
  }

   /**
   * progressDetails describes the progress details of the component for this operation.
   * @return progressDetails
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner> getProgressDetails() {
    return progressDetails;
  }


  public void setProgressDetails(List<V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner> progressDetails) {
    this.progressDetails = progressDetails;
  }


  public V1alpha1OpsRequestStatusComponentsValue reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * reason describes the reason for the component phase.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1alpha1OpsRequestStatusComponentsValue workloadType(WorkloadTypeEnum workloadType) {
    
    this.workloadType = workloadType;
    return this;
  }

   /**
   * workloadType references workload type of component in ClusterDefinition.
   * @return workloadType
  **/
  @jakarta.annotation.Nullable
  public WorkloadTypeEnum getWorkloadType() {
    return workloadType;
  }


  public void setWorkloadType(WorkloadTypeEnum workloadType) {
    this.workloadType = workloadType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestStatusComponentsValue v1alpha1OpsRequestStatusComponentsValue = (V1alpha1OpsRequestStatusComponentsValue) o;
    return Objects.equals(this.lastFailedTime, v1alpha1OpsRequestStatusComponentsValue.lastFailedTime) &&
        Objects.equals(this.message, v1alpha1OpsRequestStatusComponentsValue.message) &&
        Objects.equals(this.phase, v1alpha1OpsRequestStatusComponentsValue.phase) &&
        Objects.equals(this.progressDetails, v1alpha1OpsRequestStatusComponentsValue.progressDetails) &&
        Objects.equals(this.reason, v1alpha1OpsRequestStatusComponentsValue.reason) &&
        Objects.equals(this.workloadType, v1alpha1OpsRequestStatusComponentsValue.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastFailedTime, message, phase, progressDetails, reason, workloadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestStatusComponentsValue {\n");
    sb.append("    lastFailedTime: ").append(toIndentedString(lastFailedTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progressDetails: ").append(toIndentedString(progressDetails)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
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
    openapiFields.add("lastFailedTime");
    openapiFields.add("message");
    openapiFields.add("phase");
    openapiFields.add("progressDetails");
    openapiFields.add("reason");
    openapiFields.add("workloadType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestStatusComponentsValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestStatusComponentsValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestStatusComponentsValue is not found in the empty JSON string", V1alpha1OpsRequestStatusComponentsValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestStatusComponentsValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestStatusComponentsValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if (jsonObj.get("progressDetails") != null && !jsonObj.get("progressDetails").isJsonNull()) {
        JsonArray jsonArrayprogressDetails = jsonObj.getAsJsonArray("progressDetails");
        if (jsonArrayprogressDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("progressDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `progressDetails` to be an array in the JSON string but got `%s`", jsonObj.get("progressDetails").toString()));
          }

          // validate the optional field `progressDetails` (array)
          for (int i = 0; i < jsonArrayprogressDetails.size(); i++) {
            V1alpha1OpsRequestStatusComponentsValueProgressDetailsInner.validateJsonObject(jsonArrayprogressDetails.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("workloadType") != null && !jsonObj.get("workloadType").isJsonNull()) && !jsonObj.get("workloadType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workloadType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workloadType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestStatusComponentsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestStatusComponentsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestStatusComponentsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestStatusComponentsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestStatusComponentsValue>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestStatusComponentsValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestStatusComponentsValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestStatusComponentsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestStatusComponentsValue
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestStatusComponentsValue
  */
  public static V1alpha1OpsRequestStatusComponentsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsRequestStatusComponentsValue.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestStatusComponentsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
