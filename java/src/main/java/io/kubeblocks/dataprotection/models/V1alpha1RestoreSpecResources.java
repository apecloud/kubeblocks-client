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


package io.kubeblocks.dataprotection.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecResourcesIncludedInner;
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
 * Restores the specified resources of Kubernetes.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:51.636603Z[Etc/UTC]")
public class V1alpha1RestoreSpecResources {
  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private List<V1alpha1RestoreSpecResourcesIncludedInner> included;

  public V1alpha1RestoreSpecResources() {
  }

  public V1alpha1RestoreSpecResources included(List<V1alpha1RestoreSpecResourcesIncludedInner> included) {
    
    this.included = included;
    return this;
  }

  public V1alpha1RestoreSpecResources addIncludedItem(V1alpha1RestoreSpecResourcesIncludedInner includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Restores the specified resources.
   * @return included
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1RestoreSpecResourcesIncludedInner> getIncluded() {
    return included;
  }


  public void setIncluded(List<V1alpha1RestoreSpecResourcesIncludedInner> included) {
    this.included = included;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RestoreSpecResources v1alpha1RestoreSpecResources = (V1alpha1RestoreSpecResources) o;
    return Objects.equals(this.included, v1alpha1RestoreSpecResources.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RestoreSpecResources {\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
    openapiFields.add("included");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RestoreSpecResources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RestoreSpecResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RestoreSpecResources is not found in the empty JSON string", V1alpha1RestoreSpecResources.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RestoreSpecResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RestoreSpecResources` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("included") != null && !jsonObj.get("included").isJsonNull()) {
        JsonArray jsonArrayincluded = jsonObj.getAsJsonArray("included");
        if (jsonArrayincluded != null) {
          // ensure the json data is an array
          if (!jsonObj.get("included").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `included` to be an array in the JSON string but got `%s`", jsonObj.get("included").toString()));
          }

          // validate the optional field `included` (array)
          for (int i = 0; i < jsonArrayincluded.size(); i++) {
            V1alpha1RestoreSpecResourcesIncludedInner.validateJsonObject(jsonArrayincluded.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RestoreSpecResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RestoreSpecResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RestoreSpecResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RestoreSpecResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RestoreSpecResources>() {
           @Override
           public void write(JsonWriter out, V1alpha1RestoreSpecResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RestoreSpecResources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RestoreSpecResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RestoreSpecResources
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RestoreSpecResources
  */
  public static V1alpha1RestoreSpecResources fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1RestoreSpecResources.class);
  }

 /**
  * Convert an instance of V1alpha1RestoreSpecResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
