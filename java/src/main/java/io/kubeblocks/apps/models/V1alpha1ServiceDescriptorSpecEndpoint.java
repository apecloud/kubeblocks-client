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
import io.kubeblocks.apps.models.V1alpha1ServiceDescriptorSpecAuthPasswordValueFrom;
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
 * Specifies the endpoint of the external service.   If the service is exposed via a cluster, the endpoint will be provided in the format of &#x60;host:port&#x60;.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:58:21.605056Z[Etc/UTC]")
public class V1alpha1ServiceDescriptorSpecEndpoint {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private V1alpha1ServiceDescriptorSpecAuthPasswordValueFrom valueFrom;

  public V1alpha1ServiceDescriptorSpecEndpoint() {
  }

  public V1alpha1ServiceDescriptorSpecEndpoint value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Holds a direct string or an expression that can be evaluated to a string.   It can include variables denoted by $(VAR_NAME). These variables are expanded to the value of the environment variables defined in the container. If a variable cannot be resolved, it remains unchanged in the output.   To escape variable expansion and retain the literal value, use double $ characters.   For example:   - \&quot;$(VAR_NAME)\&quot; will be expanded to the value of the environment variable VAR_NAME. - \&quot;$$(VAR_NAME)\&quot; will result in \&quot;$(VAR_NAME)\&quot; in the output, without any variable expansion.   Default value is an empty string.
   * @return value
  **/
  @jakarta.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public V1alpha1ServiceDescriptorSpecEndpoint valueFrom(V1alpha1ServiceDescriptorSpecAuthPasswordValueFrom valueFrom) {
    
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Get valueFrom
   * @return valueFrom
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ServiceDescriptorSpecAuthPasswordValueFrom getValueFrom() {
    return valueFrom;
  }


  public void setValueFrom(V1alpha1ServiceDescriptorSpecAuthPasswordValueFrom valueFrom) {
    this.valueFrom = valueFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ServiceDescriptorSpecEndpoint v1alpha1ServiceDescriptorSpecEndpoint = (V1alpha1ServiceDescriptorSpecEndpoint) o;
    return Objects.equals(this.value, v1alpha1ServiceDescriptorSpecEndpoint.value) &&
        Objects.equals(this.valueFrom, v1alpha1ServiceDescriptorSpecEndpoint.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ServiceDescriptorSpecEndpoint {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("valueFrom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ServiceDescriptorSpecEndpoint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ServiceDescriptorSpecEndpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ServiceDescriptorSpecEndpoint is not found in the empty JSON string", V1alpha1ServiceDescriptorSpecEndpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ServiceDescriptorSpecEndpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ServiceDescriptorSpecEndpoint` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // validate the optional field `valueFrom`
      if (jsonObj.get("valueFrom") != null && !jsonObj.get("valueFrom").isJsonNull()) {
        V1alpha1ServiceDescriptorSpecAuthPasswordValueFrom.validateJsonObject(jsonObj.getAsJsonObject("valueFrom"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ServiceDescriptorSpecEndpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ServiceDescriptorSpecEndpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ServiceDescriptorSpecEndpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ServiceDescriptorSpecEndpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ServiceDescriptorSpecEndpoint>() {
           @Override
           public void write(JsonWriter out, V1alpha1ServiceDescriptorSpecEndpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ServiceDescriptorSpecEndpoint read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ServiceDescriptorSpecEndpoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ServiceDescriptorSpecEndpoint
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ServiceDescriptorSpecEndpoint
  */
  public static V1alpha1ServiceDescriptorSpecEndpoint fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ServiceDescriptorSpecEndpoint.class);
  }

 /**
  * Convert an instance of V1alpha1ServiceDescriptorSpecEndpoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

