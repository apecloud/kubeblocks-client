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
 * V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:55:52.016509Z[Etc/UTC]")
public class V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner {
  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> classes;

  public static final String SERIALIZED_NAME_NAMING_TEMPLATE = "namingTemplate";
  @SerializedName(SERIALIZED_NAME_NAMING_TEMPLATE)
  private String namingTemplate;

  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner() {
  }

  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner classes(List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> classes) {
    
    this.classes = classes;
    return this;
  }

  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner addClassesItem(V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * classes are definitions of classes that come in two forms. In the first form, only ComponentClass.Args need to be defined, and the complete class definition is generated by rendering the ComponentClassGroup.Template and Name. In the second form, the Name, CPU and Memory must be defined.
   * @return classes
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> getClasses() {
    return classes;
  }


  public void setClasses(List<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> classes) {
    this.classes = classes;
  }


  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner namingTemplate(String namingTemplate) {
    
    this.namingTemplate = namingTemplate;
    return this;
  }

   /**
   * namingTemplate is a template that uses the Go template syntax and allows for referencing variables defined in ComponentClassGroup.Template. This enables dynamic generation of class names. For example: name: \&quot;general-{{ .cpu }}c{{ .memory }}g\&quot;
   * @return namingTemplate
  **/
  @jakarta.annotation.Nullable
  public String getNamingTemplate() {
    return namingTemplate;
  }


  public void setNamingTemplate(String namingTemplate) {
    this.namingTemplate = namingTemplate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner = (V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner) o;
    return Objects.equals(this.classes, v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.classes) &&
        Objects.equals(this.namingTemplate, v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.namingTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, namingTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner {\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    namingTemplate: ").append(toIndentedString(namingTemplate)).append("\n");
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
    openapiFields.add("namingTemplate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner is not found in the empty JSON string", V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("namingTemplate") != null && !jsonObj.get("namingTemplate").isJsonNull()) && !jsonObj.get("namingTemplate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namingTemplate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namingTemplate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner
  */
  public static V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

