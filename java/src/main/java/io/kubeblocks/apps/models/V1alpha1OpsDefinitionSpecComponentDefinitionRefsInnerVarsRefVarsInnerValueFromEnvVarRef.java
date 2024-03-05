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
 * Specifies a reference to a specific environment variable within a container. Used to specify the source of the variable, which can be either \&quot;env\&quot; or \&quot;envFrom\&quot;.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_ENV_NAME = "envName";
  @SerializedName(SERIALIZED_NAME_ENV_NAME)
  private String envName;

  public V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef() {
  }

  public V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef containerName(String containerName) {
    
    this.containerName = containerName;
    return this;
  }

   /**
   * Specifies the name of the container as defined in the componentDefinition or as injected by the kubeBlocks controller. If not specified, the first container will be used by default.
   * @return containerName
  **/
  @jakarta.annotation.Nullable
  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef envName(String envName) {
    
    this.envName = envName;
    return this;
  }

   /**
   * Defines the name of the environment variable.
   * @return envName
  **/
  @jakarta.annotation.Nonnull
  public String getEnvName() {
    return envName;
  }


  public void setEnvName(String envName) {
    this.envName = envName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef v1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef = (V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef) o;
    return Objects.equals(this.containerName, v1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.containerName) &&
        Objects.equals(this.envName, v1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.envName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, envName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
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
    openapiFields.add("containerName");
    openapiFields.add("envName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("envName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef is not found in the empty JSON string", V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("containerName") != null && !jsonObj.get("containerName").isJsonNull()) && !jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      if (!jsonObj.get("envName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef
  */
  public static V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecComponentDefinitionRefsInnerVarsRefVarsInnerValueFromEnvVarRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

