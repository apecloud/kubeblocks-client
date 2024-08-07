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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerConfigMapRef;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerSecretRef;
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
 * EnvFromSource represents the source of a set of ConfigMaps
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerConfigMapRef configMapRef;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerSecretRef secretRef;

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner configMapRef(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerConfigMapRef configMapRef) {
    
    this.configMapRef = configMapRef;
    return this;
  }

   /**
   * Get configMapRef
   * @return configMapRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerConfigMapRef getConfigMapRef() {
    return configMapRef;
  }


  public void setConfigMapRef(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerConfigMapRef configMapRef) {
    this.configMapRef = configMapRef;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner secretRef(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerSecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerSecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerSecretRef secretRef) {
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
    V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner = (V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner) o;
    return Objects.equals(this.configMapRef, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.configMapRef) &&
        Objects.equals(this.prefix, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.prefix) &&
        Objects.equals(this.secretRef, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
    openapiFields.add("prefix");
    openapiFields.add("secretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `configMapRef`
      if (jsonObj.get("configMapRef") != null && !jsonObj.get("configMapRef").isJsonNull()) {
        V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerConfigMapRef.validateJsonObject(jsonObj.getAsJsonObject("configMapRef"));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInnerSecretRef.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerEnvFromInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

