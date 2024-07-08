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
 * Defines the strategy to be taken when retrying the Action after a failure.   It specifies the conditions under which the Action should be retried and the limits to apply, such as the maximum number of retries and backoff strategy.   This field cannot be updated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy {
  public static final String SERIALIZED_NAME_MAX_RETRIES = "maxRetries";
  @SerializedName(SERIALIZED_NAME_MAX_RETRIES)
  private Integer maxRetries;

  public static final String SERIALIZED_NAME_RETRY_INTERVAL = "retryInterval";
  @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL)
  private Long retryInterval;

  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy() {
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy maxRetries(Integer maxRetries) {
    
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Defines the maximum number of retry attempts that should be made for a given Action. This value is set to 0 by default, indicating that no retries will be made.
   * @return maxRetries
  **/
  @jakarta.annotation.Nullable
  public Integer getMaxRetries() {
    return maxRetries;
  }


  public void setMaxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy retryInterval(Long retryInterval) {
    
    this.retryInterval = retryInterval;
    return this;
  }

   /**
   * Indicates the duration of time to wait between each retry attempt. This value is set to 0 by default, indicating that there will be no delay between retry attempts.
   * @return retryInterval
  **/
  @jakarta.annotation.Nullable
  public Long getRetryInterval() {
    return retryInterval;
  }


  public void setRetryInterval(Long retryInterval) {
    this.retryInterval = retryInterval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy v1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy = (V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy) o;
    return Objects.equals(this.maxRetries, v1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.maxRetries) &&
        Objects.equals(this.retryInterval, v1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.retryInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRetries, retryInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy {\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
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
    openapiFields.add("maxRetries");
    openapiFields.add("retryInterval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy
  */
  public static V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandlerRetryPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

