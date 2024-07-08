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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions;
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
 * Specifies a method to determine if the action has been completed.   Note: This feature has not been implemented yet.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe {
  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions matchExpressions;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe initialDelaySeconds(Integer initialDelaySeconds) {
    
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Specifies the number of seconds to wait after the resource has been patched before initiating completion probes. The default value is 5 seconds, with a minimum value of 1.
   * minimum: 1
   * @return initialDelaySeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }


  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe matchExpressions(V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions matchExpressions) {
    
    this.matchExpressions = matchExpressions;
    return this;
  }

   /**
   * Get matchExpressions
   * @return matchExpressions
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe periodSeconds(Integer periodSeconds) {
    
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * Specifies the frequency (in seconds) at which the probe should be performed. The default value is 5 seconds, with a minimum value of 1.
   * minimum: 1
   * @return periodSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }


  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Specifies the number of seconds after which the probe times out. The default value is 60 seconds, with a minimum value of 1.
   * minimum: 1
   * @return timeoutSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe = (V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe) o;
    return Objects.equals(this.initialDelaySeconds, v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.initialDelaySeconds) &&
        Objects.equals(this.matchExpressions, v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.matchExpressions) &&
        Objects.equals(this.periodSeconds, v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.periodSeconds) &&
        Objects.equals(this.timeoutSeconds, v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialDelaySeconds, matchExpressions, periodSeconds, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe {\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    openapiFields.add("initialDelaySeconds");
    openapiFields.add("matchExpressions");
    openapiFields.add("periodSeconds");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("matchExpressions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `matchExpressions`
      V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.validateJsonObject(jsonObj.getAsJsonObject("matchExpressions"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbe to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

