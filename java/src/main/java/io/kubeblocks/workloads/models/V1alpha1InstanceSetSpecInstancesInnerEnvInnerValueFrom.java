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


package io.kubeblocks.workloads.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.workloads.models.V1alpha1InstanceSetSpecCredentialPasswordValueFromConfigMapKeyRef;
import io.kubeblocks.workloads.models.V1alpha1InstanceSetSpecCredentialPasswordValueFromFieldRef;
import io.kubeblocks.workloads.models.V1alpha1InstanceSetSpecCredentialPasswordValueFromResourceFieldRef;
import io.kubeblocks.workloads.models.V1alpha1InstanceSetSpecCredentialPasswordValueFromSecretKeyRef;
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
 * Source for the environment variable&#39;s value. Cannot be used if value is not empty.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:03:17.809844Z[Etc/UTC]")
public class V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1alpha1InstanceSetSpecCredentialPasswordValueFromConfigMapKeyRef configMapKeyRef;

  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1alpha1InstanceSetSpecCredentialPasswordValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1alpha1InstanceSetSpecCredentialPasswordValueFromResourceFieldRef resourceFieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1alpha1InstanceSetSpecCredentialPasswordValueFromSecretKeyRef secretKeyRef;

  public V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom() {
  }

  public V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom configMapKeyRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromConfigMapKeyRef configMapKeyRef) {
    
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1InstanceSetSpecCredentialPasswordValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }


  public void setConfigMapKeyRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }


  public V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom fieldRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1InstanceSetSpecCredentialPasswordValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom resourceFieldRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromResourceFieldRef resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1InstanceSetSpecCredentialPasswordValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  public V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom secretKeyRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromSecretKeyRef secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1InstanceSetSpecCredentialPasswordValueFromSecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1alpha1InstanceSetSpecCredentialPasswordValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom v1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom = (V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom) o;
    return Objects.equals(this.configMapKeyRef, v1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.configMapKeyRef) &&
        Objects.equals(this.fieldRef, v1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.fieldRef) &&
        Objects.equals(this.resourceFieldRef, v1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, v1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
    openapiFields.add("fieldRef");
    openapiFields.add("resourceFieldRef");
    openapiFields.add("secretKeyRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom is not found in the empty JSON string", V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `configMapKeyRef`
      if (jsonObj.get("configMapKeyRef") != null && !jsonObj.get("configMapKeyRef").isJsonNull()) {
        V1alpha1InstanceSetSpecCredentialPasswordValueFromConfigMapKeyRef.validateJsonObject(jsonObj.getAsJsonObject("configMapKeyRef"));
      }
      // validate the optional field `fieldRef`
      if (jsonObj.get("fieldRef") != null && !jsonObj.get("fieldRef").isJsonNull()) {
        V1alpha1InstanceSetSpecCredentialPasswordValueFromFieldRef.validateJsonObject(jsonObj.getAsJsonObject("fieldRef"));
      }
      // validate the optional field `resourceFieldRef`
      if (jsonObj.get("resourceFieldRef") != null && !jsonObj.get("resourceFieldRef").isJsonNull()) {
        V1alpha1InstanceSetSpecCredentialPasswordValueFromResourceFieldRef.validateJsonObject(jsonObj.getAsJsonObject("resourceFieldRef"));
      }
      // validate the optional field `secretKeyRef`
      if (jsonObj.get("secretKeyRef") != null && !jsonObj.get("secretKeyRef").isJsonNull()) {
        V1alpha1InstanceSetSpecCredentialPasswordValueFromSecretKeyRef.validateJsonObject(jsonObj.getAsJsonObject("secretKeyRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom>() {
           @Override
           public void write(JsonWriter out, V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom
  * @throws IOException if the JSON string is invalid with respect to V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom
  */
  public static V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom.class);
  }

 /**
  * Convert an instance of V1alpha1InstanceSetSpecInstancesInnerEnvInnerValueFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

