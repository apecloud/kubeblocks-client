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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInnerValueFromConfigMapKeyRef;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecVarsInnerValueFromCredentialVarRef;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecVarsInnerValueFromSecretKeyRef;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceRefVarRef;
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef;
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
 * Source for the variable&#39;s value. Cannot be used if value is not empty.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecVarsInnerValueFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInnerValueFromConfigMapKeyRef configMapKeyRef;

  public static final String SERIALIZED_NAME_CREDENTIAL_VAR_REF = "credentialVarRef";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_VAR_REF)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromCredentialVarRef credentialVarRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromSecretKeyRef secretKeyRef;

  public static final String SERIALIZED_NAME_SERVICE_REF_VAR_REF = "serviceRefVarRef";
  @SerializedName(SERIALIZED_NAME_SERVICE_REF_VAR_REF)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceRefVarRef serviceRefVarRef;

  public static final String SERIALIZED_NAME_SERVICE_VAR_REF = "serviceVarRef";
  @SerializedName(SERIALIZED_NAME_SERVICE_VAR_REF)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef serviceVarRef;

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom() {
  }

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom configMapKeyRef(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInnerValueFromConfigMapKeyRef configMapKeyRef) {
    
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInnerValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }


  public void setConfigMapKeyRef(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInnerValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom credentialVarRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromCredentialVarRef credentialVarRef) {
    
    this.credentialVarRef = credentialVarRef;
    return this;
  }

   /**
   * Get credentialVarRef
   * @return credentialVarRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromCredentialVarRef getCredentialVarRef() {
    return credentialVarRef;
  }


  public void setCredentialVarRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromCredentialVarRef credentialVarRef) {
    this.credentialVarRef = credentialVarRef;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom secretKeyRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromSecretKeyRef secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromSecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom serviceRefVarRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceRefVarRef serviceRefVarRef) {
    
    this.serviceRefVarRef = serviceRefVarRef;
    return this;
  }

   /**
   * Get serviceRefVarRef
   * @return serviceRefVarRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceRefVarRef getServiceRefVarRef() {
    return serviceRefVarRef;
  }


  public void setServiceRefVarRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceRefVarRef serviceRefVarRef) {
    this.serviceRefVarRef = serviceRefVarRef;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom serviceVarRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef serviceVarRef) {
    
    this.serviceVarRef = serviceVarRef;
    return this;
  }

   /**
   * Get serviceVarRef
   * @return serviceVarRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef getServiceVarRef() {
    return serviceVarRef;
  }


  public void setServiceVarRef(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef serviceVarRef) {
    this.serviceVarRef = serviceVarRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecVarsInnerValueFrom v1alpha1ComponentDefinitionSpecVarsInnerValueFrom = (V1alpha1ComponentDefinitionSpecVarsInnerValueFrom) o;
    return Objects.equals(this.configMapKeyRef, v1alpha1ComponentDefinitionSpecVarsInnerValueFrom.configMapKeyRef) &&
        Objects.equals(this.credentialVarRef, v1alpha1ComponentDefinitionSpecVarsInnerValueFrom.credentialVarRef) &&
        Objects.equals(this.secretKeyRef, v1alpha1ComponentDefinitionSpecVarsInnerValueFrom.secretKeyRef) &&
        Objects.equals(this.serviceRefVarRef, v1alpha1ComponentDefinitionSpecVarsInnerValueFrom.serviceRefVarRef) &&
        Objects.equals(this.serviceVarRef, v1alpha1ComponentDefinitionSpecVarsInnerValueFrom.serviceVarRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, credentialVarRef, secretKeyRef, serviceRefVarRef, serviceVarRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecVarsInnerValueFrom {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    credentialVarRef: ").append(toIndentedString(credentialVarRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
    sb.append("    serviceRefVarRef: ").append(toIndentedString(serviceRefVarRef)).append("\n");
    sb.append("    serviceVarRef: ").append(toIndentedString(serviceVarRef)).append("\n");
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
    openapiFields.add("configMapKeyRef");
    openapiFields.add("credentialVarRef");
    openapiFields.add("secretKeyRef");
    openapiFields.add("serviceRefVarRef");
    openapiFields.add("serviceVarRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFrom.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecVarsInnerValueFrom is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecVarsInnerValueFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecVarsInnerValueFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `configMapKeyRef`
      if (jsonObj.get("configMapKeyRef") != null && !jsonObj.get("configMapKeyRef").isJsonNull()) {
        V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerEnvInnerValueFromConfigMapKeyRef.validateJsonObject(jsonObj.getAsJsonObject("configMapKeyRef"));
      }
      // validate the optional field `credentialVarRef`
      if (jsonObj.get("credentialVarRef") != null && !jsonObj.get("credentialVarRef").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromCredentialVarRef.validateJsonObject(jsonObj.getAsJsonObject("credentialVarRef"));
      }
      // validate the optional field `secretKeyRef`
      if (jsonObj.get("secretKeyRef") != null && !jsonObj.get("secretKeyRef").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromSecretKeyRef.validateJsonObject(jsonObj.getAsJsonObject("secretKeyRef"));
      }
      // validate the optional field `serviceRefVarRef`
      if (jsonObj.get("serviceRefVarRef") != null && !jsonObj.get("serviceRefVarRef").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceRefVarRef.validateJsonObject(jsonObj.getAsJsonObject("serviceRefVarRef"));
      }
      // validate the optional field `serviceVarRef`
      if (jsonObj.get("serviceVarRef") != null && !jsonObj.get("serviceVarRef").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.validateJsonObject(jsonObj.getAsJsonObject("serviceVarRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecVarsInnerValueFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecVarsInnerValueFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFrom>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecVarsInnerValueFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecVarsInnerValueFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFrom
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFrom
  */
  public static V1alpha1ComponentDefinitionSpecVarsInnerValueFrom fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecVarsInnerValueFrom.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

