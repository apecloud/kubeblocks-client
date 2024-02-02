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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler;
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
 * RoleProbe defines how to probe the role of replicas. Cannot be updated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe {
  public static final String SERIALIZED_NAME_BUILTIN_HANDLER = "builtinHandler";
  @SerializedName(SERIALIZED_NAME_BUILTIN_HANDLER)
  private String builtinHandler;

  public static final String SERIALIZED_NAME_CUSTOM_HANDLER = "customHandler";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HANDLER)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler;

  public static final String SERIALIZED_NAME_FAILURE_THRESHOLD = "failureThreshold";
  @SerializedName(SERIALIZED_NAME_FAILURE_THRESHOLD)
  private Integer failureThreshold;

  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_SUCCESS_THRESHOLD = "successThreshold";
  @SerializedName(SERIALIZED_NAME_SUCCESS_THRESHOLD)
  private Integer successThreshold;

  public static final String SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS = "terminationGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS)
  private Long terminationGracePeriodSeconds;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe() {
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe builtinHandler(String builtinHandler) {
    
    this.builtinHandler = builtinHandler;
    return this;
  }

   /**
   * builtinHandler specifies the builtin action handler name to do the action. the BuiltinHandler within the same ComponentLifecycleActions should be consistent. Details can be queried through official documentation in the future. use CustomHandler to define your own actions if none of them satisfies the requirement.
   * @return builtinHandler
  **/
  @jakarta.annotation.Nullable
  public String getBuiltinHandler() {
    return builtinHandler;
  }


  public void setBuiltinHandler(String builtinHandler) {
    this.builtinHandler = builtinHandler;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe customHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    
    this.customHandler = customHandler;
    return this;
  }

   /**
   * Get customHandler
   * @return customHandler
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler getCustomHandler() {
    return customHandler;
  }


  public void setCustomHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    this.customHandler = customHandler;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe failureThreshold(Integer failureThreshold) {
    
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   * @return failureThreshold
  **/
  @jakarta.annotation.Nullable
  public Integer getFailureThreshold() {
    return failureThreshold;
  }


  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe initialDelaySeconds(Integer initialDelaySeconds) {
    
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return initialDelaySeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }


  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe periodSeconds(Integer periodSeconds) {
    
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   * @return periodSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }


  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe successThreshold(Integer successThreshold) {
    
    this.successThreshold = successThreshold;
    return this;
  }

   /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
   * @return successThreshold
  **/
  @jakarta.annotation.Nullable
  public Integer getSuccessThreshold() {
    return successThreshold;
  }


  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
   * @return terminationGracePeriodSeconds
  **/
  @jakarta.annotation.Nullable
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }


  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
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
    V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe = (V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe) o;
    return Objects.equals(this.builtinHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.builtinHandler) &&
        Objects.equals(this.customHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.customHandler) &&
        Objects.equals(this.failureThreshold, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.failureThreshold) &&
        Objects.equals(this.initialDelaySeconds, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.periodSeconds) &&
        Objects.equals(this.successThreshold, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.successThreshold) &&
        Objects.equals(this.terminationGracePeriodSeconds, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.terminationGracePeriodSeconds) &&
        Objects.equals(this.timeoutSeconds, v1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinHandler, customHandler, failureThreshold, initialDelaySeconds, periodSeconds, successThreshold, terminationGracePeriodSeconds, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe {\n");
    sb.append("    builtinHandler: ").append(toIndentedString(builtinHandler)).append("\n");
    sb.append("    customHandler: ").append(toIndentedString(customHandler)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
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
    openapiFields.add("builtinHandler");
    openapiFields.add("customHandler");
    openapiFields.add("failureThreshold");
    openapiFields.add("initialDelaySeconds");
    openapiFields.add("periodSeconds");
    openapiFields.add("successThreshold");
    openapiFields.add("terminationGracePeriodSeconds");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("builtinHandler") != null && !jsonObj.get("builtinHandler").isJsonNull()) && !jsonObj.get("builtinHandler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builtinHandler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builtinHandler").toString()));
      }
      // validate the optional field `customHandler`
      if (jsonObj.get("customHandler") != null && !jsonObj.get("customHandler").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler.validateJsonObject(jsonObj.getAsJsonObject("customHandler"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe
  */
  public static V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsRoleProbe to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

