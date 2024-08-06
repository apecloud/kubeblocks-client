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
 * Selects a field of the pod: supports metadata.name, metadata.namespace, &#x60;metadata.labels[&#39;&lt;KEY&gt;&#39;]&#x60;, &#x60;metadata.annotations[&#39;&lt;KEY&gt;&#39;]&#x60;, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:01:13.011869Z[Etc/UTC]")
public class V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;

  public V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef() {
  }

  public V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Version of the schema the FieldPath is written in terms of, defaults to \&quot;v1\&quot;.
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef fieldPath(String fieldPath) {
    
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * Path of the field to select in the specified API version.
   * @return fieldPath
  **/
  @jakarta.annotation.Nonnull
  public String getFieldPath() {
    return fieldPath;
  }


  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef v1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef = (V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef) o;
    return Objects.equals(this.apiVersion, v1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.apiVersion) &&
        Objects.equals(this.fieldPath, v1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("fieldPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldPath");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef is not found in the empty JSON string", V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (!jsonObj.get("fieldPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef
  */
  public static V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef.class);
  }

 /**
  * Convert an instance of V1alpha1BackupPolicySpecBackupMethodsInnerEnvInnerValueFromFieldRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

