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


package io.kubeblocks.extensions.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
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
 * Specifies the resource requirements.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:02:35.998799Z[Etc/UTC]")
public class V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources {
  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, Object> limits = new HashMap<>();

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Object> requests = new HashMap<>();

  public V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources() {
  }

  public V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources limits(Map<String, Object> limits) {
    
    this.limits = limits;
    return this;
  }

  public V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources putLimitsItem(String key, Object limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/.
   * @return limits
  **/
  @jakarta.annotation.Nullable
  public Map<String, Object> getLimits() {
    return limits;
  }


  public void setLimits(Map<String, Object> limits) {
    this.limits = limits;
  }


  public V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources requests(Map<String, Object> requests) {
    
    this.requests = requests;
    return this;
  }

  public V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources putRequestsItem(String key, Object requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified; otherwise, it defaults to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/.
   * @return requests
  **/
  @jakarta.annotation.Nullable
  public Map<String, Object> getRequests() {
    return requests;
  }


  public void setRequests(Map<String, Object> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources v1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources = (V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources) o;
    return Objects.equals(this.limits, v1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.limits) &&
        Objects.equals(this.requests, v1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("limits");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources is not found in the empty JSON string", V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources>() {
           @Override
           public void write(JsonWriter out, V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources
  * @throws IOException if the JSON string is invalid with respect to V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources
  */
  public static V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources.class);
  }

 /**
  * Convert an instance of V1alpha1AddonSpecDefaultInstallValuesInnerExtrasInnerResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

