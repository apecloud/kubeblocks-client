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
import io.kubeblocks.apps.models.V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner;
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
 * ComponentClassDefinitionStatus defines the observed state of ComponentClassDefinition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ComponentClassDefinitionStatus {
  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> classes;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public V1alpha1ComponentClassDefinitionStatus() {
  }

  public V1alpha1ComponentClassDefinitionStatus classes(List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> classes) {
    
    this.classes = classes;
    return this;
  }

  public V1alpha1ComponentClassDefinitionStatus addClassesItem(V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * classes is the list of classes that have been observed for this ComponentClassDefinition
   * @return classes
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> getClasses() {
    return classes;
  }


  public void setClasses(List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> classes) {
    this.classes = classes;
  }


  public V1alpha1ComponentClassDefinitionStatus observedGeneration(Long observedGeneration) {
    
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the most recent generation observed for this ComponentClassDefinition. It corresponds to the ComponentClassDefinition&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentClassDefinitionStatus v1alpha1ComponentClassDefinitionStatus = (V1alpha1ComponentClassDefinitionStatus) o;
    return Objects.equals(this.classes, v1alpha1ComponentClassDefinitionStatus.classes) &&
        Objects.equals(this.observedGeneration, v1alpha1ComponentClassDefinitionStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, observedGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentClassDefinitionStatus {\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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
    openapiFields.add("classes");
    openapiFields.add("observedGeneration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentClassDefinitionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentClassDefinitionStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentClassDefinitionStatus is not found in the empty JSON string", V1alpha1ComponentClassDefinitionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentClassDefinitionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentClassDefinitionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("classes") != null && !jsonObj.get("classes").isJsonNull()) {
        JsonArray jsonArrayclasses = jsonObj.getAsJsonArray("classes");
        if (jsonArrayclasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("classes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `classes` to be an array in the JSON string but got `%s`", jsonObj.get("classes").toString()));
          }

          // validate the optional field `classes` (array)
          for (int i = 0; i < jsonArrayclasses.size(); i++) {
            V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.validateJsonObject(jsonArrayclasses.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentClassDefinitionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentClassDefinitionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentClassDefinitionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentClassDefinitionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentClassDefinitionStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentClassDefinitionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentClassDefinitionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentClassDefinitionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentClassDefinitionStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentClassDefinitionStatus
  */
  public static V1alpha1ComponentClassDefinitionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentClassDefinitionStatus.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentClassDefinitionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

