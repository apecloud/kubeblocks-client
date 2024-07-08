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
import io.kubeblocks.apps.models.V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig;
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
 * Defines the images for the component to perform a switchover. This overrides the image and env attributes defined in clusterDefinition.spec.componentDefs.SwitchoverSpec.CommandExecutorEnvItem.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec {
  public static final String SERIALIZED_NAME_CMD_EXECUTOR_CONFIG = "cmdExecutorConfig";
  @SerializedName(SERIALIZED_NAME_CMD_EXECUTOR_CONFIG)
  private V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig cmdExecutorConfig;

  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec() {
  }

  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec cmdExecutorConfig(V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig cmdExecutorConfig) {
    
    this.cmdExecutorConfig = cmdExecutorConfig;
    return this;
  }

   /**
   * Get cmdExecutorConfig
   * @return cmdExecutorConfig
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig getCmdExecutorConfig() {
    return cmdExecutorConfig;
  }


  public void setCmdExecutorConfig(V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig cmdExecutorConfig) {
    this.cmdExecutorConfig = cmdExecutorConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec v1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec = (V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec) o;
    return Objects.equals(this.cmdExecutorConfig, v1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.cmdExecutorConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmdExecutorConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec {\n");
    sb.append("    cmdExecutorConfig: ").append(toIndentedString(cmdExecutorConfig)).append("\n");
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
    openapiFields.add("cmdExecutorConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cmdExecutorConfig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec is not found in the empty JSON string", V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `cmdExecutorConfig`
      V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpecCmdExecutorConfig.validateJsonObject(jsonObj.getAsJsonObject("cmdExecutorConfig"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec
  */
  public static V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

