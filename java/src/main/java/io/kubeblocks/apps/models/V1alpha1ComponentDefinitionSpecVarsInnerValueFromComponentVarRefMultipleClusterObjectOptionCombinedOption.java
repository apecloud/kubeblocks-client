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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat;
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
 * Define the options for handling combined variables. Valid only when the strategy is set to \&quot;combined\&quot;.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption {
  public static final String SERIALIZED_NAME_FLATTEN_FORMAT = "flattenFormat";
  @SerializedName(SERIALIZED_NAME_FLATTEN_FORMAT)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat flattenFormat;

  public static final String SERIALIZED_NAME_NEW_VAR_SUFFIX = "newVarSuffix";
  @SerializedName(SERIALIZED_NAME_NEW_VAR_SUFFIX)
  private String newVarSuffix;

  public static final String SERIALIZED_NAME_VALUE_FORMAT = "valueFormat";
  @SerializedName(SERIALIZED_NAME_VALUE_FORMAT)
  private String valueFormat;

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption() {
  }

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption flattenFormat(V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat flattenFormat) {
    
    this.flattenFormat = flattenFormat;
    return this;
  }

   /**
   * Get flattenFormat
   * @return flattenFormat
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat getFlattenFormat() {
    return flattenFormat;
  }


  public void setFlattenFormat(V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat flattenFormat) {
    this.flattenFormat = flattenFormat;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption newVarSuffix(String newVarSuffix) {
    
    this.newVarSuffix = newVarSuffix;
    return this;
  }

   /**
   * If set, the existing variable will be kept, and a new variable will be defined with the specified suffix in pattern: $(var.name)_$(suffix). The new variable will be auto-created and placed behind the existing one. If not set, the existing variable will be reused with the value format defined below.
   * @return newVarSuffix
  **/
  @jakarta.annotation.Nullable
  public String getNewVarSuffix() {
    return newVarSuffix;
  }


  public void setNewVarSuffix(String newVarSuffix) {
    this.newVarSuffix = newVarSuffix;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption valueFormat(String valueFormat) {
    
    this.valueFormat = valueFormat;
    return this;
  }

   /**
   * The format of the value that the operator will use to compose values from multiple components.
   * @return valueFormat
  **/
  @jakarta.annotation.Nullable
  public String getValueFormat() {
    return valueFormat;
  }


  public void setValueFormat(String valueFormat) {
    this.valueFormat = valueFormat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption = (V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption) o;
    return Objects.equals(this.flattenFormat, v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.flattenFormat) &&
        Objects.equals(this.newVarSuffix, v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.newVarSuffix) &&
        Objects.equals(this.valueFormat, v1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.valueFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flattenFormat, newVarSuffix, valueFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption {\n");
    sb.append("    flattenFormat: ").append(toIndentedString(flattenFormat)).append("\n");
    sb.append("    newVarSuffix: ").append(toIndentedString(newVarSuffix)).append("\n");
    sb.append("    valueFormat: ").append(toIndentedString(valueFormat)).append("\n");
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
    openapiFields.add("flattenFormat");
    openapiFields.add("newVarSuffix");
    openapiFields.add("valueFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `flattenFormat`
      if (jsonObj.get("flattenFormat") != null && !jsonObj.get("flattenFormat").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOptionFlattenFormat.validateJsonObject(jsonObj.getAsJsonObject("flattenFormat"));
      }
      if ((jsonObj.get("newVarSuffix") != null && !jsonObj.get("newVarSuffix").isJsonNull()) && !jsonObj.get("newVarSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newVarSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newVarSuffix").toString()));
      }
      if ((jsonObj.get("valueFormat") != null && !jsonObj.get("valueFormat").isJsonNull()) && !jsonObj.get("valueFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption
  */
  public static V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromComponentVarRefMultipleClusterObjectOptionCombinedOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

