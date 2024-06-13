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
import io.kubeblocks.apps.models.V1alpha1ClusterStatusConditionsInner;
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
 * ComponentStatus represents the observed state of a Component within the cluster.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ComponentStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1ClusterStatusConditionsInner> conditions;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private Map<String, String> message = new HashMap<>();

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  /**
   * Indicates the phase of the component. Detailed information for each phase is as follows:   - Creating: A special &#x60;Updating&#x60; phase with previous phase &#x60;empty&#x60;(means \&quot;\&quot;) or &#x60;Creating&#x60;. - Running: Component replicas &gt; 0 and all pod specs are latest with a Running state. - Updating: Component replicas &gt; 0 and no failed pods. The component is being updated. - Abnormal: Component replicas &gt; 0 but some pods have failed. The component is functional but in a fragile state. - Failed: Component replicas &gt; 0 but some pods have failed. The component is no longer functional. - Stopping: Component replicas &#x3D; 0 and pods are terminating. - Stopped: Component replicas &#x3D; 0 and all pods have been deleted. - Deleting: The component is being deleted.
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

  public V1alpha1ComponentStatus() {
  }

  public V1alpha1ComponentStatus conditions(List<V1alpha1ClusterStatusConditionsInner> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha1ComponentStatus addConditionsItem(V1alpha1ClusterStatusConditionsInner conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Defines the current state of the component API Resource, such as warnings.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterStatusConditionsInner> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1ClusterStatusConditionsInner> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1ComponentStatus message(Map<String, String> message) {
    
    this.message = message;
    return this;
  }

  public V1alpha1ComponentStatus putMessageItem(String key, String messageItem) {
    if (this.message == null) {
      this.message = new HashMap<>();
    }
    this.message.put(key, messageItem);
    return this;
  }

   /**
   * Records the detailed message of the component in its current phase. Keys can be podName, deployName, or statefulSetName. The format is &#x60;ObjectKind/Name&#x60;.
   * @return message
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getMessage() {
    return message;
  }


  public void setMessage(Map<String, String> message) {
    this.message = message;
  }


  public V1alpha1ComponentStatus observedGeneration(Long observedGeneration) {
    
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * Specifies the most recent generation observed for this Component. This corresponds to the Cluster&#39;s generation, which is updated by the API Server upon mutation.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1alpha1ComponentStatus phase(PhaseEnum phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Indicates the phase of the component. Detailed information for each phase is as follows:   - Creating: A special &#x60;Updating&#x60; phase with previous phase &#x60;empty&#x60;(means \&quot;\&quot;) or &#x60;Creating&#x60;. - Running: Component replicas &gt; 0 and all pod specs are latest with a Running state. - Updating: Component replicas &gt; 0 and no failed pods. The component is being updated. - Abnormal: Component replicas &gt; 0 but some pods have failed. The component is functional but in a fragile state. - Failed: Component replicas &gt; 0 but some pods have failed. The component is no longer functional. - Stopping: Component replicas &#x3D; 0 and pods are terminating. - Stopped: Component replicas &#x3D; 0 and all pods have been deleted. - Deleting: The component is being deleted.
   * @return phase
  **/
  @jakarta.annotation.Nullable
  public PhaseEnum getPhase() {
    return phase;
  }


  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentStatus v1alpha1ComponentStatus = (V1alpha1ComponentStatus) o;
    return Objects.equals(this.conditions, v1alpha1ComponentStatus.conditions) &&
        Objects.equals(this.message, v1alpha1ComponentStatus.message) &&
        Objects.equals(this.observedGeneration, v1alpha1ComponentStatus.observedGeneration) &&
        Objects.equals(this.phase, v1alpha1ComponentStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, message, observedGeneration, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("message");
    openapiFields.add("observedGeneration");
    openapiFields.add("phase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentStatus is not found in the empty JSON string", V1alpha1ComponentStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1alpha1ClusterStatusConditionsInner.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentStatus
  */
  public static V1alpha1ComponentStatus fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentStatus.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

