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
 * Specifies the connection credential to connect to the target database cluster.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:01:13.011869Z[Etc/UTC]")
public class V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential {
  public static final String SERIALIZED_NAME_HOST_KEY = "hostKey";
  @SerializedName(SERIALIZED_NAME_HOST_KEY)
  private String hostKey;

  public static final String SERIALIZED_NAME_PASSWORD_KEY = "passwordKey";
  @SerializedName(SERIALIZED_NAME_PASSWORD_KEY)
  private String passwordKey;

  public static final String SERIALIZED_NAME_PORT_KEY = "portKey";
  @SerializedName(SERIALIZED_NAME_PORT_KEY)
  private String portKey;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_USERNAME_KEY = "usernameKey";
  @SerializedName(SERIALIZED_NAME_USERNAME_KEY)
  private String usernameKey;

  public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential() {
  }

  public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential hostKey(String hostKey) {
    
    this.hostKey = hostKey;
    return this;
  }

   /**
   * Specifies the map key of the host in the connection credential secret.
   * @return hostKey
  **/
  @jakarta.annotation.Nullable
  public String getHostKey() {
    return hostKey;
  }


  public void setHostKey(String hostKey) {
    this.hostKey = hostKey;
  }


  public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential passwordKey(String passwordKey) {
    
    this.passwordKey = passwordKey;
    return this;
  }

   /**
   * Specifies the map key of the password in the connection credential secret. This password will be saved in the backup annotation for full backup. You can use the environment variable DP_ENCRYPTION_KEY to specify encryption key.
   * @return passwordKey
  **/
  @jakarta.annotation.Nullable
  public String getPasswordKey() {
    return passwordKey;
  }


  public void setPasswordKey(String passwordKey) {
    this.passwordKey = passwordKey;
  }


  public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential portKey(String portKey) {
    
    this.portKey = portKey;
    return this;
  }

   /**
   * Specifies the map key of the port in the connection credential secret.
   * @return portKey
  **/
  @jakarta.annotation.Nullable
  public String getPortKey() {
    return portKey;
  }


  public void setPortKey(String portKey) {
    this.portKey = portKey;
  }


  public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * Refers to the Secret object that contains the connection credential.
   * @return secretName
  **/
  @jakarta.annotation.Nonnull
  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential usernameKey(String usernameKey) {
    
    this.usernameKey = usernameKey;
    return this;
  }

   /**
   * Specifies the map key of the user in the connection credential secret.
   * @return usernameKey
  **/
  @jakarta.annotation.Nullable
  public String getUsernameKey() {
    return usernameKey;
  }


  public void setUsernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential v1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential = (V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential) o;
    return Objects.equals(this.hostKey, v1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.hostKey) &&
        Objects.equals(this.passwordKey, v1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.passwordKey) &&
        Objects.equals(this.portKey, v1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.portKey) &&
        Objects.equals(this.secretName, v1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.secretName) &&
        Objects.equals(this.usernameKey, v1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.usernameKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostKey, passwordKey, portKey, secretName, usernameKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential {\n");
    sb.append("    hostKey: ").append(toIndentedString(hostKey)).append("\n");
    sb.append("    passwordKey: ").append(toIndentedString(passwordKey)).append("\n");
    sb.append("    portKey: ").append(toIndentedString(portKey)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    usernameKey: ").append(toIndentedString(usernameKey)).append("\n");
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
    openapiFields.add("hostKey");
    openapiFields.add("passwordKey");
    openapiFields.add("portKey");
    openapiFields.add("secretName");
    openapiFields.add("usernameKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secretName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential is not found in the empty JSON string", V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hostKey") != null && !jsonObj.get("hostKey").isJsonNull()) && !jsonObj.get("hostKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostKey").toString()));
      }
      if ((jsonObj.get("passwordKey") != null && !jsonObj.get("passwordKey").isJsonNull()) && !jsonObj.get("passwordKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordKey").toString()));
      }
      if ((jsonObj.get("portKey") != null && !jsonObj.get("portKey").isJsonNull()) && !jsonObj.get("portKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portKey").toString()));
      }
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
      if ((jsonObj.get("usernameKey") != null && !jsonObj.get("usernameKey").isJsonNull()) && !jsonObj.get("usernameKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usernameKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usernameKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential
  */
  public static V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential.class);
  }

 /**
  * Convert an instance of V1alpha1BackupPolicySpecBackupMethodsInnerTargetConnectionCredential to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
