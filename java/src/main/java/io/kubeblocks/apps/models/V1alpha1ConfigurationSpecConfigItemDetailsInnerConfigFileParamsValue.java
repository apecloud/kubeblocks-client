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
 * V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = new HashMap<>();

  public V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue() {
  }

  public V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Holds the configuration keys and values. This field is a workaround for issues found in kubebuilder and code-generator. Refer to https://github.com/kubernetes-sigs/kubebuilder/issues/528 and https://github.com/kubernetes/code-generator/issues/50 for more details.   Represents the content of the configuration file.
   * @return content
  **/
  @jakarta.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Represents the updated parameters for a single configuration file.
   * @return parameters
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue v1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue = (V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue) o;
    return Objects.equals(this.content, v1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.content) &&
        Objects.equals(this.parameters, v1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue is not found in the empty JSON string", V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue
  */
  public static V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigurationSpecConfigItemDetailsInnerConfigFileParamsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

