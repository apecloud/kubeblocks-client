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
 * Primary status.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary {
  public static final String SERIALIZED_NAME_POD = "pod";
  @SerializedName(SERIALIZED_NAME_POD)
  private String pod;

  public V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary() {
  }

  public V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary pod(String pod) {
    
    this.pod = pod;
    return this;
  }

   /**
   * Pod name.
   * @return pod
  **/
  @jakarta.annotation.Nonnull
  public String getPod() {
    return pod;
  }


  public void setPod(String pod) {
    this.pod = pod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary v1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary = (V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary) o;
    return Objects.equals(this.pod, v1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.pod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary {\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
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
    openapiFields.add("pod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary is not found in the empty JSON string", V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("pod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary
  */
  public static V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterStatusComponentsValueReplicationSetStatusPrimary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

