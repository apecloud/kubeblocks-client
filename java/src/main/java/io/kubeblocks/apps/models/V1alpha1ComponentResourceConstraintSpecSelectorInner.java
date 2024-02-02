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
import io.kubeblocks.apps.models.V1alpha1ComponentResourceConstraintSpecComponentSelectorInner;
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
 * V1alpha1ComponentResourceConstraintSpecSelectorInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentResourceConstraintSpecSelectorInner {
  public static final String SERIALIZED_NAME_CLUSTER_DEF_REF = "clusterDefRef";
  @SerializedName(SERIALIZED_NAME_CLUSTER_DEF_REF)
  private String clusterDefRef;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> components = new ArrayList<>();

  public V1alpha1ComponentResourceConstraintSpecSelectorInner() {
  }

  public V1alpha1ComponentResourceConstraintSpecSelectorInner clusterDefRef(String clusterDefRef) {
    
    this.clusterDefRef = clusterDefRef;
    return this;
  }

   /**
   * clusterDefRef is the name of the cluster definition.
   * @return clusterDefRef
  **/
  @jakarta.annotation.Nonnull
  public String getClusterDefRef() {
    return clusterDefRef;
  }


  public void setClusterDefRef(String clusterDefRef) {
    this.clusterDefRef = clusterDefRef;
  }


  public V1alpha1ComponentResourceConstraintSpecSelectorInner components(List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> components) {
    
    this.components = components;
    return this;
  }

  public V1alpha1ComponentResourceConstraintSpecSelectorInner addComponentsItem(V1alpha1ComponentResourceConstraintSpecComponentSelectorInner componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * selector is used to bind the resource constraint to components.
   * @return components
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> getComponents() {
    return components;
  }


  public void setComponents(List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> components) {
    this.components = components;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentResourceConstraintSpecSelectorInner v1alpha1ComponentResourceConstraintSpecSelectorInner = (V1alpha1ComponentResourceConstraintSpecSelectorInner) o;
    return Objects.equals(this.clusterDefRef, v1alpha1ComponentResourceConstraintSpecSelectorInner.clusterDefRef) &&
        Objects.equals(this.components, v1alpha1ComponentResourceConstraintSpecSelectorInner.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterDefRef, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentResourceConstraintSpecSelectorInner {\n");
    sb.append("    clusterDefRef: ").append(toIndentedString(clusterDefRef)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
    openapiFields.add("clusterDefRef");
    openapiFields.add("components");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clusterDefRef");
    openapiRequiredFields.add("components");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentResourceConstraintSpecSelectorInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentResourceConstraintSpecSelectorInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentResourceConstraintSpecSelectorInner is not found in the empty JSON string", V1alpha1ComponentResourceConstraintSpecSelectorInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentResourceConstraintSpecSelectorInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentResourceConstraintSpecSelectorInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentResourceConstraintSpecSelectorInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("clusterDefRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterDefRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterDefRef").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("components").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
      }

      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      // validate the required field `components` (array)
      for (int i = 0; i < jsonArraycomponents.size(); i++) {
        V1alpha1ComponentResourceConstraintSpecComponentSelectorInner.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentResourceConstraintSpecSelectorInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentResourceConstraintSpecSelectorInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentResourceConstraintSpecSelectorInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentResourceConstraintSpecSelectorInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentResourceConstraintSpecSelectorInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentResourceConstraintSpecSelectorInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentResourceConstraintSpecSelectorInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentResourceConstraintSpecSelectorInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentResourceConstraintSpecSelectorInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentResourceConstraintSpecSelectorInner
  */
  public static V1alpha1ComponentResourceConstraintSpecSelectorInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentResourceConstraintSpecSelectorInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentResourceConstraintSpecSelectorInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

