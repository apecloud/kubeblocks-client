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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner;
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
 * projected items for all in one resources secrets, configmaps, and downward API
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner> sources;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected defaultMode(Integer defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @jakarta.annotation.Nullable
  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected sources(List<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner> sources) {
    
    this.sources = sources;
    return this;
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected addSourcesItem(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * sources is the list of volume projections
   * @return sources
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner> getSources() {
    return sources;
  }


  public void setSources(List<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner> sources) {
    this.sources = sources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected) o;
    return Objects.equals(this.defaultMode, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.defaultMode) &&
        Objects.equals(this.sources, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
    openapiFields.add("defaultMode");
    openapiFields.add("sources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sources") != null && !jsonObj.get("sources").isJsonNull()) {
        JsonArray jsonArraysources = jsonObj.getAsJsonArray("sources");
        if (jsonArraysources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sources` to be an array in the JSON string but got `%s`", jsonObj.get("sources").toString()));
          }

          // validate the optional field `sources` (array)
          for (int i = 0; i < jsonArraysources.size(); i++) {
            V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.validateJsonObject(jsonArraysources.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjected to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

