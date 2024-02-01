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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner;
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
 * scriptFrom defines the script to be executed from configMap or secret.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecScriptSpecScriptFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private List<V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner> configMapRef;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private List<V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner> secretRef;

  public V1alpha1OpsRequestSpecScriptSpecScriptFrom() {
  }

  public V1alpha1OpsRequestSpecScriptSpecScriptFrom configMapRef(List<V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner> configMapRef) {
    
    this.configMapRef = configMapRef;
    return this;
  }

  public V1alpha1OpsRequestSpecScriptSpecScriptFrom addConfigMapRefItem(V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner configMapRefItem) {
    if (this.configMapRef == null) {
      this.configMapRef = new ArrayList<>();
    }
    this.configMapRef.add(configMapRefItem);
    return this;
  }

   /**
   * configMapRef defines the configMap to be executed.
   * @return configMapRef
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner> getConfigMapRef() {
    return configMapRef;
  }


  public void setConfigMapRef(List<V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner> configMapRef) {
    this.configMapRef = configMapRef;
  }


  public V1alpha1OpsRequestSpecScriptSpecScriptFrom secretRef(List<V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner> secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

  public V1alpha1OpsRequestSpecScriptSpecScriptFrom addSecretRefItem(V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner secretRefItem) {
    if (this.secretRef == null) {
      this.secretRef = new ArrayList<>();
    }
    this.secretRef.add(secretRefItem);
    return this;
  }

   /**
   * secretRef defines the secret to be executed.
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner> getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(List<V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner> secretRef) {
    this.secretRef = secretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecScriptSpecScriptFrom v1alpha1OpsRequestSpecScriptSpecScriptFrom = (V1alpha1OpsRequestSpecScriptSpecScriptFrom) o;
    return Objects.equals(this.configMapRef, v1alpha1OpsRequestSpecScriptSpecScriptFrom.configMapRef) &&
        Objects.equals(this.secretRef, v1alpha1OpsRequestSpecScriptSpecScriptFrom.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecScriptSpecScriptFrom {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
    openapiFields.add("configMapRef");
    openapiFields.add("secretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecScriptSpecScriptFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecScriptSpecScriptFrom.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecScriptSpecScriptFrom is not found in the empty JSON string", V1alpha1OpsRequestSpecScriptSpecScriptFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecScriptSpecScriptFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecScriptSpecScriptFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("configMapRef") != null && !jsonObj.get("configMapRef").isJsonNull()) {
        JsonArray jsonArrayconfigMapRef = jsonObj.getAsJsonArray("configMapRef");
        if (jsonArrayconfigMapRef != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configMapRef").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configMapRef` to be an array in the JSON string but got `%s`", jsonObj.get("configMapRef").toString()));
          }

          // validate the optional field `configMapRef` (array)
          for (int i = 0; i < jsonArrayconfigMapRef.size(); i++) {
            V1alpha1OpsRequestSpecScriptSpecScriptFromConfigMapRefInner.validateJsonObject(jsonArrayconfigMapRef.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        JsonArray jsonArraysecretRef = jsonObj.getAsJsonArray("secretRef");
        if (jsonArraysecretRef != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secretRef").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secretRef` to be an array in the JSON string but got `%s`", jsonObj.get("secretRef").toString()));
          }

          // validate the optional field `secretRef` (array)
          for (int i = 0; i < jsonArraysecretRef.size(); i++) {
            V1alpha1OpsRequestSpecScriptSpecScriptFromSecretRefInner.validateJsonObject(jsonArraysecretRef.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecScriptSpecScriptFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecScriptSpecScriptFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecScriptSpecScriptFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecScriptSpecScriptFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecScriptSpecScriptFrom>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecScriptSpecScriptFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecScriptSpecScriptFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecScriptSpecScriptFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecScriptSpecScriptFrom
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecScriptSpecScriptFrom
  */
  public static V1alpha1OpsRequestSpecScriptSpecScriptFrom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsRequestSpecScriptSpecScriptFrom.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecScriptSpecScriptFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

