/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.28.3
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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner;
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
 * Defines the user-defined volumes.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REFS = "configMapRefs";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REFS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner> configMapRefs;

  public static final String SERIALIZED_NAME_SECRET_REFS = "secretRefs";
  @SerializedName(SERIALIZED_NAME_SECRET_REFS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner> secretRefs;

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs configMapRefs(List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner> configMapRefs) {
    
    this.configMapRefs = configMapRefs;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs addConfigMapRefsItem(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner configMapRefsItem) {
    if (this.configMapRefs == null) {
      this.configMapRefs = new ArrayList<>();
    }
    this.configMapRefs.add(configMapRefsItem);
    return this;
  }

   /**
   * ConfigMapRefs defines the user-defined config maps.
   * @return configMapRefs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner> getConfigMapRefs() {
    return configMapRefs;
  }


  public void setConfigMapRefs(List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner> configMapRefs) {
    this.configMapRefs = configMapRefs;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs secretRefs(List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner> secretRefs) {
    
    this.secretRefs = secretRefs;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs addSecretRefsItem(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner secretRefsItem) {
    if (this.secretRefs == null) {
      this.secretRefs = new ArrayList<>();
    }
    this.secretRefs.add(secretRefsItem);
    return this;
  }

   /**
   * SecretRefs defines the user-defined secrets.
   * @return secretRefs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner> getSecretRefs() {
    return secretRefs;
  }


  public void setSecretRefs(List<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner> secretRefs) {
    this.secretRefs = secretRefs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs = (V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs) o;
    return Objects.equals(this.configMapRefs, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.configMapRefs) &&
        Objects.equals(this.secretRefs, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.secretRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRefs, secretRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs {\n");
    sb.append("    configMapRefs: ").append(toIndentedString(configMapRefs)).append("\n");
    sb.append("    secretRefs: ").append(toIndentedString(secretRefs)).append("\n");
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
    openapiFields.add("configMapRefs");
    openapiFields.add("secretRefs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("configMapRefs") != null && !jsonObj.get("configMapRefs").isJsonNull()) {
        JsonArray jsonArrayconfigMapRefs = jsonObj.getAsJsonArray("configMapRefs");
        if (jsonArrayconfigMapRefs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configMapRefs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configMapRefs` to be an array in the JSON string but got `%s`", jsonObj.get("configMapRefs").toString()));
          }

          // validate the optional field `configMapRefs` (array)
          for (int i = 0; i < jsonArrayconfigMapRefs.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.validateJsonObject(jsonArrayconfigMapRefs.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("secretRefs") != null && !jsonObj.get("secretRefs").isJsonNull()) {
        JsonArray jsonArraysecretRefs = jsonObj.getAsJsonArray("secretRefs");
        if (jsonArraysecretRefs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secretRefs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secretRefs` to be an array in the JSON string but got `%s`", jsonObj.get("secretRefs").toString()));
          }

          // validate the optional field `secretRefs` (array)
          for (int i = 0; i < jsonArraysecretRefs.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsSecretRefsInner.validateJsonObject(jsonArraysecretRefs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

