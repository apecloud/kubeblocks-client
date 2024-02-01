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
 * condition declares how the operation can be executed.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecPreConditionsInnerRule {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public V1alpha1OpsDefinitionSpecPreConditionsInnerRule() {
  }

  public V1alpha1OpsDefinitionSpecPreConditionsInnerRule expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * expression declares how the operation can be executed using go template expression. it should return \&quot;true\&quot; or \&quot;false\&quot;, built-in objects: - \&quot;params\&quot; are input parameters. - \&quot;cluster\&quot; is referenced cluster object. - \&quot;component\&quot; is referenced the component Object.
   * @return expression
  **/
  @jakarta.annotation.Nonnull
  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public V1alpha1OpsDefinitionSpecPreConditionsInnerRule message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * report the message if the rule is not matched.
   * @return message
  **/
  @jakarta.annotation.Nonnull
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecPreConditionsInnerRule v1alpha1OpsDefinitionSpecPreConditionsInnerRule = (V1alpha1OpsDefinitionSpecPreConditionsInnerRule) o;
    return Objects.equals(this.expression, v1alpha1OpsDefinitionSpecPreConditionsInnerRule.expression) &&
        Objects.equals(this.message, v1alpha1OpsDefinitionSpecPreConditionsInnerRule.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecPreConditionsInnerRule {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("expression");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expression");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecPreConditionsInnerRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecPreConditionsInnerRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecPreConditionsInnerRule is not found in the empty JSON string", V1alpha1OpsDefinitionSpecPreConditionsInnerRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecPreConditionsInnerRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecPreConditionsInnerRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecPreConditionsInnerRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecPreConditionsInnerRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecPreConditionsInnerRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecPreConditionsInnerRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecPreConditionsInnerRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecPreConditionsInnerRule>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecPreConditionsInnerRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecPreConditionsInnerRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecPreConditionsInnerRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecPreConditionsInnerRule
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecPreConditionsInnerRule
  */
  public static V1alpha1OpsDefinitionSpecPreConditionsInnerRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecPreConditionsInnerRule.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecPreConditionsInnerRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

