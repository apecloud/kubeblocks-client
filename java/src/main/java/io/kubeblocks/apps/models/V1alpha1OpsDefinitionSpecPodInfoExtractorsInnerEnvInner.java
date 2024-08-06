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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInnerValueFrom;
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
 * V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:56:35.521733Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInnerValueFrom valueFrom;

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner() {
  }

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the environment variable to be injected into Pods executing OpsActions. It must conform to the C_IDENTIFIER format, which includes only alphanumeric characters and underscores, and cannot begin with a digit.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner valueFrom(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInnerValueFrom valueFrom) {
    
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Get valueFrom
   * @return valueFrom
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInnerValueFrom getValueFrom() {
    return valueFrom;
  }


  public void setValueFrom(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInnerValueFrom valueFrom) {
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
    V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner v1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner = (V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner) o;
    return Objects.equals(this.name, v1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.name) &&
        Objects.equals(this.valueFrom, v1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valueFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("valueFrom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("valueFrom");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `valueFrom`
      V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInnerValueFrom.validateJsonObject(jsonObj.getAsJsonObject("valueFrom"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner
  */
  public static V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

