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


package io.kubeblocks.workloads.models;

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
 * Range represents a range with a start and an end value. It is used to define a continuous segment.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:03:17.809844Z[Etc/UTC]")
public class V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner() {
  }

  public V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nonnull
  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nonnull
  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner v1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner = (V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner) o;
    return Objects.equals(this.end, v1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.end) &&
        Objects.equals(this.start, v1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
    openapiFields.add("end");
    openapiFields.add("start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("start");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner is not found in the empty JSON string", V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner
  */
  public static V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner.class);
  }

 /**
  * Convert an instance of V1alpha1InstanceSetSpecDefaultTemplateOrdinalsRangesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

