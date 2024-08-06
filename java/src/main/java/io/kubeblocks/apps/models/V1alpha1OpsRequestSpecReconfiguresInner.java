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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecReconfigureConfigurationsInner;
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
 * Reconfigure defines the parameters for updating a Component&#39;s configuration.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:47.298634Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecReconfiguresInner {
  public static final String SERIALIZED_NAME_COMPONENT_NAME = "componentName";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName;

  public static final String SERIALIZED_NAME_CONFIGURATIONS = "configurations";
  @SerializedName(SERIALIZED_NAME_CONFIGURATIONS)
  private List<V1alpha1OpsRequestSpecReconfigureConfigurationsInner> configurations = new ArrayList<>();

  public V1alpha1OpsRequestSpecReconfiguresInner() {
  }

  public V1alpha1OpsRequestSpecReconfiguresInner componentName(String componentName) {
    
    this.componentName = componentName;
    return this;
  }

   /**
   * Specifies the name of the Component.
   * @return componentName
  **/
  @jakarta.annotation.Nonnull
  public String getComponentName() {
    return componentName;
  }


  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public V1alpha1OpsRequestSpecReconfiguresInner configurations(List<V1alpha1OpsRequestSpecReconfigureConfigurationsInner> configurations) {
    
    this.configurations = configurations;
    return this;
  }

  public V1alpha1OpsRequestSpecReconfiguresInner addConfigurationsItem(V1alpha1OpsRequestSpecReconfigureConfigurationsInner configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Contains a list of ConfigurationItem objects, specifying the Component&#39;s configuration template name, upgrade policy, and parameter key-value pairs to be updated.
   * @return configurations
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1OpsRequestSpecReconfigureConfigurationsInner> getConfigurations() {
    return configurations;
  }


  public void setConfigurations(List<V1alpha1OpsRequestSpecReconfigureConfigurationsInner> configurations) {
    this.configurations = configurations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecReconfiguresInner v1alpha1OpsRequestSpecReconfiguresInner = (V1alpha1OpsRequestSpecReconfiguresInner) o;
    return Objects.equals(this.componentName, v1alpha1OpsRequestSpecReconfiguresInner.componentName) &&
        Objects.equals(this.configurations, v1alpha1OpsRequestSpecReconfiguresInner.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentName, configurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecReconfiguresInner {\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
    openapiFields.add("componentName");
    openapiFields.add("configurations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("componentName");
    openapiRequiredFields.add("configurations");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecReconfiguresInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecReconfiguresInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecReconfiguresInner is not found in the empty JSON string", V1alpha1OpsRequestSpecReconfiguresInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecReconfiguresInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecReconfiguresInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecReconfiguresInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("componentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("configurations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurations` to be an array in the JSON string but got `%s`", jsonObj.get("configurations").toString()));
      }

      JsonArray jsonArrayconfigurations = jsonObj.getAsJsonArray("configurations");
      // validate the required field `configurations` (array)
      for (int i = 0; i < jsonArrayconfigurations.size(); i++) {
        V1alpha1OpsRequestSpecReconfigureConfigurationsInner.validateJsonObject(jsonArrayconfigurations.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecReconfiguresInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecReconfiguresInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecReconfiguresInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecReconfiguresInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecReconfiguresInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecReconfiguresInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecReconfiguresInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecReconfiguresInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecReconfiguresInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecReconfiguresInner
  */
  public static V1alpha1OpsRequestSpecReconfiguresInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecReconfiguresInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecReconfiguresInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

