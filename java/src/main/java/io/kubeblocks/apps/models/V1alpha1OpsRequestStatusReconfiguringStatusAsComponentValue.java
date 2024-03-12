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
import io.kubeblocks.apps.models.V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner;
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
 * V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T08:58:42.064637Z[Etc/UTC]")
public class V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1ClusterStatusConditionsInner> conditions;

  public static final String SERIALIZED_NAME_CONFIGURATION_STATUS = "configurationStatus";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_STATUS)
  private List<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner> configurationStatus = new ArrayList<>();

  public V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue() {
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue conditions(List<V1alpha1ClusterStatusConditionsInner> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue addConditionsItem(V1alpha1ClusterStatusConditionsInner conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Describes the reconfiguring detail status.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterStatusConditionsInner> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1ClusterStatusConditionsInner> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue configurationStatus(List<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner> configurationStatus) {
    
    this.configurationStatus = configurationStatus;
    return this;
  }

  public V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue addConfigurationStatusItem(V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner configurationStatusItem) {
    if (this.configurationStatus == null) {
      this.configurationStatus = new ArrayList<>();
    }
    this.configurationStatus.add(configurationStatusItem);
    return this;
  }

   /**
   * Describes the status of the component reconfiguring.
   * @return configurationStatus
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner> getConfigurationStatus() {
    return configurationStatus;
  }


  public void setConfigurationStatus(List<V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner> configurationStatus) {
    this.configurationStatus = configurationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue v1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue = (V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue) o;
    return Objects.equals(this.conditions, v1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.conditions) &&
        Objects.equals(this.configurationStatus, v1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.configurationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, configurationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    configurationStatus: ").append(toIndentedString(configurationStatus)).append("\n");
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
    openapiFields.add("configurationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configurationStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue is not found in the empty JSON string", V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
      // ensure the json data is an array
      if (!jsonObj.get("configurationStatus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationStatus` to be an array in the JSON string but got `%s`", jsonObj.get("configurationStatus").toString()));
      }

      JsonArray jsonArrayconfigurationStatus = jsonObj.getAsJsonArray("configurationStatus");
      // validate the required field `configurationStatus` (array)
      for (int i = 0; i < jsonArrayconfigurationStatus.size(); i++) {
        V1alpha1OpsRequestStatusReconfiguringStatusConfigurationStatusInner.validateJsonObject(jsonArrayconfigurationStatus.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue
  */
  public static V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestStatusReconfiguringStatusAsComponentValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

