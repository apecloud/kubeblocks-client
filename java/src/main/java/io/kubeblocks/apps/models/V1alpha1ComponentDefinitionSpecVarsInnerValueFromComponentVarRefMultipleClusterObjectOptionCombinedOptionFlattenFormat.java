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
 * The flatten format, default is: $(comp-name-1):value,$(comp-name-2):value.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:09.127576Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat {
  public static final String SERIALIZED_NAME_DELIMITER = "delimiter";
  @SerializedName(SERIALIZED_NAME_DELIMITER)
  private String delimiter;

  public static final String SERIALIZED_NAME_KEY_VALUE_DELIMITER = "keyValueDelimiter";
  @SerializedName(SERIALIZED_NAME_KEY_VALUE_DELIMITER)
  private String keyValueDelimiter;

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat() {
  }

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat delimiter(String delimiter) {
    
    this.delimiter = delimiter;
    return this;
  }

   /**
   * Pair delimiter.
   * @return delimiter
  **/
  @jakarta.annotation.Nonnull
  public String getDelimiter() {
    return delimiter;
  }


  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat keyValueDelimiter(String keyValueDelimiter) {
    
    this.keyValueDelimiter = keyValueDelimiter;
    return this;
  }

   /**
   * Key-value delimiter.
   * @return keyValueDelimiter
  **/
  @jakarta.annotation.Nonnull
  public String getKeyValueDelimiter() {
    return keyValueDelimiter;
  }


  public void setKeyValueDelimiter(String keyValueDelimiter) {
    this.keyValueDelimiter = keyValueDelimiter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat = (V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat) o;
    return Objects.equals(this.delimiter, v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.delimiter) &&
        Objects.equals(this.keyValueDelimiter, v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.keyValueDelimiter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delimiter, keyValueDelimiter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat {\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    keyValueDelimiter: ").append(toIndentedString(keyValueDelimiter)).append("\n");
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
    openapiFields.add("delimiter");
    openapiFields.add("keyValueDelimiter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("delimiter");
    openapiRequiredFields.add("keyValueDelimiter");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("delimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delimiter").toString()));
      }
      if (!jsonObj.get("keyValueDelimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyValueDelimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyValueDelimiter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat
  */
  public static V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
