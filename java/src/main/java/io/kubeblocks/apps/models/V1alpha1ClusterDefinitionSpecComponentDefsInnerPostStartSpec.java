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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecCmdExecutorConfig;
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Defines the command to be executed when the component is ready, and the command will only be executed once after the component becomes ready.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec {
  public static final String SERIALIZED_NAME_CMD_EXECUTOR_CONFIG = "cmdExecutorConfig";
  @SerializedName(SERIALIZED_NAME_CMD_EXECUTOR_CONFIG)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecCmdExecutorConfig cmdExecutorConfig;

  public static final String SERIALIZED_NAME_SCRIPT_SPEC_SELECTORS = "scriptSpecSelectors";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SPEC_SELECTORS)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner> scriptSpecSelectors;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec cmdExecutorConfig(V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecCmdExecutorConfig cmdExecutorConfig) {
    
    this.cmdExecutorConfig = cmdExecutorConfig;
    return this;
  }

   /**
   * Get cmdExecutorConfig
   * @return cmdExecutorConfig
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecCmdExecutorConfig getCmdExecutorConfig() {
    return cmdExecutorConfig;
  }


  public void setCmdExecutorConfig(V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecCmdExecutorConfig cmdExecutorConfig) {
    this.cmdExecutorConfig = cmdExecutorConfig;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec scriptSpecSelectors(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner> scriptSpecSelectors) {
    
    this.scriptSpecSelectors = scriptSpecSelectors;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec addScriptSpecSelectorsItem(V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner scriptSpecSelectorsItem) {
    if (this.scriptSpecSelectors == null) {
      this.scriptSpecSelectors = new ArrayList<>();
    }
    this.scriptSpecSelectors.add(scriptSpecSelectorsItem);
    return this;
  }

   /**
   * Used to select the script that need to be referenced. When defined, the scripts defined in scriptSpecs can be referenced within the CmdExecutorConfig.
   * @return scriptSpecSelectors
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner> getScriptSpecSelectors() {
    return scriptSpecSelectors;
  }


  public void setScriptSpecSelectors(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner> scriptSpecSelectors) {
    this.scriptSpecSelectors = scriptSpecSelectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec v1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec = (V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec) o;
    return Objects.equals(this.cmdExecutorConfig, v1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.cmdExecutorConfig) &&
        Objects.equals(this.scriptSpecSelectors, v1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.scriptSpecSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmdExecutorConfig, scriptSpecSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec {\n");
    sb.append("    cmdExecutorConfig: ").append(toIndentedString(cmdExecutorConfig)).append("\n");
    sb.append("    scriptSpecSelectors: ").append(toIndentedString(scriptSpecSelectors)).append("\n");
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
    openapiFields.add("scriptSpecSelectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cmdExecutorConfig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `cmdExecutorConfig`
      V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecCmdExecutorConfig.validateJsonObject(jsonObj.getAsJsonObject("cmdExecutorConfig"));
      if (jsonObj.get("scriptSpecSelectors") != null && !jsonObj.get("scriptSpecSelectors").isJsonNull()) {
        JsonArray jsonArrayscriptSpecSelectors = jsonObj.getAsJsonArray("scriptSpecSelectors");
        if (jsonArrayscriptSpecSelectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scriptSpecSelectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scriptSpecSelectors` to be an array in the JSON string but got `%s`", jsonObj.get("scriptSpecSelectors").toString()));
          }

          // validate the optional field `scriptSpecSelectors` (array)
          for (int i = 0; i < jsonArrayscriptSpecSelectors.size(); i++) {
            V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpecScriptSpecSelectorsInner.validateJsonObject(jsonArrayscriptSpecSelectors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerPostStartSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

