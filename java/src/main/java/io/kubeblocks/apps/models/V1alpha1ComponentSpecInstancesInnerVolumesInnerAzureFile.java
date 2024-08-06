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
 * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:58:42.635097Z[Etc/UTC]")
public class V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile {
  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SHARE_NAME = "shareName";
  @SerializedName(SERIALIZED_NAME_SHARE_NAME)
  private String shareName;

  public V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile() {
  }

  public V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * secretName is the  name of secret that contains Azure Storage Account Name and Key
   * @return secretName
  **/
  @jakarta.annotation.Nonnull
  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile shareName(String shareName) {
    
    this.shareName = shareName;
    return this;
  }

   /**
   * shareName is the azure share Name
   * @return shareName
  **/
  @jakarta.annotation.Nonnull
  public String getShareName() {
    return shareName;
  }


  public void setShareName(String shareName) {
    this.shareName = shareName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile v1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile = (V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile) o;
    return Objects.equals(this.readOnly, v1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.readOnly) &&
        Objects.equals(this.secretName, v1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.secretName) &&
        Objects.equals(this.shareName, v1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, secretName, shareName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile {\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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
    openapiFields.add("readOnly");
    openapiFields.add("secretName");
    openapiFields.add("shareName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secretName");
    openapiRequiredFields.add("shareName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile is not found in the empty JSON string", V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
      if (!jsonObj.get("shareName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shareName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shareName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile
  */
  public static V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentSpecInstancesInnerVolumesInnerAzureFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

