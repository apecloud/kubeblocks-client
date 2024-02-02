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
 * configurationSchema imposes restrictions on database parameter&#39;s rule.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpecConfigurationSchema {
  public static final String SERIALIZED_NAME_CUE = "cue";
  @SerializedName(SERIALIZED_NAME_CUE)
  private String cue;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Object schema;

  public V1alpha1ConfigConstraintSpecConfigurationSchema() {
  }

  public V1alpha1ConfigConstraintSpecConfigurationSchema cue(String cue) {
    
    this.cue = cue;
    return this;
  }

   /**
   * cue that to let provider verify user configuration through cue language.
   * @return cue
  **/
  @jakarta.annotation.Nullable
  public String getCue() {
    return cue;
  }


  public void setCue(String cue) {
    this.cue = cue;
  }


  public V1alpha1ConfigConstraintSpecConfigurationSchema schema(Object schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * schema provides a way for providers to validate the changed parameters through json.
   * @return schema
  **/
  @jakarta.annotation.Nullable
  public Object getSchema() {
    return schema;
  }


  public void setSchema(Object schema) {
    this.schema = schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigConstraintSpecConfigurationSchema v1alpha1ConfigConstraintSpecConfigurationSchema = (V1alpha1ConfigConstraintSpecConfigurationSchema) o;
    return Objects.equals(this.cue, v1alpha1ConfigConstraintSpecConfigurationSchema.cue) &&
        Objects.equals(this.schema, v1alpha1ConfigConstraintSpecConfigurationSchema.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cue, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpecConfigurationSchema {\n");
    sb.append("    cue: ").append(toIndentedString(cue)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("cue");
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpecConfigurationSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpecConfigurationSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpecConfigurationSchema is not found in the empty JSON string", V1alpha1ConfigConstraintSpecConfigurationSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpecConfigurationSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpecConfigurationSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cue") != null && !jsonObj.get("cue").isJsonNull()) && !jsonObj.get("cue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpecConfigurationSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpecConfigurationSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpecConfigurationSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpecConfigurationSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpecConfigurationSchema>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpecConfigurationSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpecConfigurationSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpecConfigurationSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpecConfigurationSchema
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpecConfigurationSchema
  */
  public static V1alpha1ConfigConstraintSpecConfigurationSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpecConfigurationSchema.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpecConfigurationSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

