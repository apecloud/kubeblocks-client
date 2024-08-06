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
import io.kubeblocks.extensions.models.V1alpha1AddonSpecHelmValuesMappingExtrasInnerJsonMap;
import io.kubeblocks.extensions.models.V1alpha1AddonSpecHelmValuesMappingExtrasInnerResources;
import io.kubeblocks.extensions.models.V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap;
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
 * V1alpha1AddonSpecHelmValuesMappingExtrasInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:02:35.998799Z[Etc/UTC]")
public class V1alpha1AddonSpecHelmValuesMappingExtrasInner {
  public static final String SERIALIZED_NAME_JSON_MAP = "jsonMap";
  @SerializedName(SERIALIZED_NAME_JSON_MAP)
  private V1alpha1AddonSpecHelmValuesMappingExtrasInnerJsonMap jsonMap;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1AddonSpecHelmValuesMappingExtrasInnerResources resources;

  public static final String SERIALIZED_NAME_VALUE_MAP = "valueMap";
  @SerializedName(SERIALIZED_NAME_VALUE_MAP)
  private V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap valueMap;

  public V1alpha1AddonSpecHelmValuesMappingExtrasInner() {
  }

  public V1alpha1AddonSpecHelmValuesMappingExtrasInner jsonMap(V1alpha1AddonSpecHelmValuesMappingExtrasInnerJsonMap jsonMap) {
    
    this.jsonMap = jsonMap;
    return this;
  }

   /**
   * Get jsonMap
   * @return jsonMap
  **/
  @jakarta.annotation.Nullable
  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerJsonMap getJsonMap() {
    return jsonMap;
  }


  public void setJsonMap(V1alpha1AddonSpecHelmValuesMappingExtrasInnerJsonMap jsonMap) {
    this.jsonMap = jsonMap;
  }


  public V1alpha1AddonSpecHelmValuesMappingExtrasInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the item.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1AddonSpecHelmValuesMappingExtrasInner resources(V1alpha1AddonSpecHelmValuesMappingExtrasInnerResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1AddonSpecHelmValuesMappingExtrasInnerResources resources) {
    this.resources = resources;
  }


  public V1alpha1AddonSpecHelmValuesMappingExtrasInner valueMap(V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap valueMap) {
    
    this.valueMap = valueMap;
    return this;
  }

   /**
   * Get valueMap
   * @return valueMap
  **/
  @jakarta.annotation.Nullable
  public V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap getValueMap() {
    return valueMap;
  }


  public void setValueMap(V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap valueMap) {
    this.valueMap = valueMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AddonSpecHelmValuesMappingExtrasInner v1alpha1AddonSpecHelmValuesMappingExtrasInner = (V1alpha1AddonSpecHelmValuesMappingExtrasInner) o;
    return Objects.equals(this.jsonMap, v1alpha1AddonSpecHelmValuesMappingExtrasInner.jsonMap) &&
        Objects.equals(this.name, v1alpha1AddonSpecHelmValuesMappingExtrasInner.name) &&
        Objects.equals(this.resources, v1alpha1AddonSpecHelmValuesMappingExtrasInner.resources) &&
        Objects.equals(this.valueMap, v1alpha1AddonSpecHelmValuesMappingExtrasInner.valueMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonMap, name, resources, valueMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AddonSpecHelmValuesMappingExtrasInner {\n");
    sb.append("    jsonMap: ").append(toIndentedString(jsonMap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    valueMap: ").append(toIndentedString(valueMap)).append("\n");
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
    openapiFields.add("jsonMap");
    openapiFields.add("name");
    openapiFields.add("resources");
    openapiFields.add("valueMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1AddonSpecHelmValuesMappingExtrasInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1AddonSpecHelmValuesMappingExtrasInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1AddonSpecHelmValuesMappingExtrasInner is not found in the empty JSON string", V1alpha1AddonSpecHelmValuesMappingExtrasInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1AddonSpecHelmValuesMappingExtrasInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1AddonSpecHelmValuesMappingExtrasInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1AddonSpecHelmValuesMappingExtrasInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `jsonMap`
      if (jsonObj.get("jsonMap") != null && !jsonObj.get("jsonMap").isJsonNull()) {
        V1alpha1AddonSpecHelmValuesMappingExtrasInnerJsonMap.validateJsonObject(jsonObj.getAsJsonObject("jsonMap"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1alpha1AddonSpecHelmValuesMappingExtrasInnerResources.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
      // validate the optional field `valueMap`
      if (jsonObj.get("valueMap") != null && !jsonObj.get("valueMap").isJsonNull()) {
        V1alpha1AddonSpecHelmValuesMappingExtrasInnerValueMap.validateJsonObject(jsonObj.getAsJsonObject("valueMap"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1AddonSpecHelmValuesMappingExtrasInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1AddonSpecHelmValuesMappingExtrasInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1AddonSpecHelmValuesMappingExtrasInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1AddonSpecHelmValuesMappingExtrasInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1AddonSpecHelmValuesMappingExtrasInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1AddonSpecHelmValuesMappingExtrasInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1AddonSpecHelmValuesMappingExtrasInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1AddonSpecHelmValuesMappingExtrasInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1AddonSpecHelmValuesMappingExtrasInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1AddonSpecHelmValuesMappingExtrasInner
  */
  public static V1alpha1AddonSpecHelmValuesMappingExtrasInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1AddonSpecHelmValuesMappingExtrasInner.class);
  }

 /**
  * Convert an instance of V1alpha1AddonSpecHelmValuesMappingExtrasInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

