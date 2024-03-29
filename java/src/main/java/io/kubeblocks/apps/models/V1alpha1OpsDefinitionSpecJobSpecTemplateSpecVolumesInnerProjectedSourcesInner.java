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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerConfigMap;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerDownwardAPI;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerSecret;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerServiceAccountToken;
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
 * Projection that may be projected along with other supported volume types
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner {
  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerConfigMap configMap;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerDownwardAPI downwardAPI;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerSecret secret;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN = "serviceAccountToken";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN)
  private V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerServiceAccountToken serviceAccountToken;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner configMap(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerConfigMap configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerConfigMap getConfigMap() {
    return configMap;
  }


  public void setConfigMap(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerConfigMap configMap) {
    this.configMap = configMap;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner downwardAPI(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerDownwardAPI downwardAPI) {
    
    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerDownwardAPI getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerDownwardAPI downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner secret(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerSecret secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerSecret getSecret() {
    return secret;
  }


  public void setSecret(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerSecret secret) {
    this.secret = secret;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner serviceAccountToken(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerServiceAccountToken serviceAccountToken) {
    
    this.serviceAccountToken = serviceAccountToken;
    return this;
  }

   /**
   * Get serviceAccountToken
   * @return serviceAccountToken
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerServiceAccountToken getServiceAccountToken() {
    return serviceAccountToken;
  }


  public void setServiceAccountToken(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerServiceAccountToken serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner) o;
    return Objects.equals(this.configMap, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.configMap) &&
        Objects.equals(this.downwardAPI, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.downwardAPI) &&
        Objects.equals(this.secret, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.secret) &&
        Objects.equals(this.serviceAccountToken, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.serviceAccountToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap, downwardAPI, secret, serviceAccountToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner {\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceAccountToken: ").append(toIndentedString(serviceAccountToken)).append("\n");
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
    openapiFields.add("configMap");
    openapiFields.add("downwardAPI");
    openapiFields.add("secret");
    openapiFields.add("serviceAccountToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `configMap`
      if (jsonObj.get("configMap") != null && !jsonObj.get("configMap").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerConfigMap.validateJsonObject(jsonObj.getAsJsonObject("configMap"));
      }
      // validate the optional field `downwardAPI`
      if (jsonObj.get("downwardAPI") != null && !jsonObj.get("downwardAPI").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerDownwardAPI.validateJsonObject(jsonObj.getAsJsonObject("downwardAPI"));
      }
      // validate the optional field `secret`
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerSecret.validateJsonObject(jsonObj.getAsJsonObject("secret"));
      }
      // validate the optional field `serviceAccountToken`
      if (jsonObj.get("serviceAccountToken") != null && !jsonObj.get("serviceAccountToken").isJsonNull()) {
        V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInnerServiceAccountToken.validateJsonObject(jsonObj.getAsJsonObject("serviceAccountToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecVolumesInnerProjectedSourcesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

