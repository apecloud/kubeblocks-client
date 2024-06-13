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
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecConfigurationSchema;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecFormatterConfig;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecReloadOptions;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecScriptConfigsInner;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecSelector;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecToolsImageSpec;
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
 * ConfigConstraintSpec defines the desired state of ConfigConstraint
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpec {
  public static final String SERIALIZED_NAME_CFG_SCHEMA_TOP_LEVEL_NAME = "cfgSchemaTopLevelName";
  @SerializedName(SERIALIZED_NAME_CFG_SCHEMA_TOP_LEVEL_NAME)
  private String cfgSchemaTopLevelName;

  public static final String SERIALIZED_NAME_CONFIGURATION_SCHEMA = "configurationSchema";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_SCHEMA)
  private V1alpha1ConfigConstraintSpecConfigurationSchema configurationSchema;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I_OPTIONS = "downwardAPIOptions";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I_OPTIONS)
  private List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> downwardAPIOptions;

  public static final String SERIALIZED_NAME_DYNAMIC_PARAMETERS = "dynamicParameters";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_PARAMETERS)
  private List<String> dynamicParameters;

  public static final String SERIALIZED_NAME_FORCE_HOT_UPDATE = "forceHotUpdate";
  @SerializedName(SERIALIZED_NAME_FORCE_HOT_UPDATE)
  private Boolean forceHotUpdate;

  public static final String SERIALIZED_NAME_FORMATTER_CONFIG = "formatterConfig";
  @SerializedName(SERIALIZED_NAME_FORMATTER_CONFIG)
  private V1alpha1ConfigConstraintSpecFormatterConfig formatterConfig;

  public static final String SERIALIZED_NAME_IMMUTABLE_PARAMETERS = "immutableParameters";
  @SerializedName(SERIALIZED_NAME_IMMUTABLE_PARAMETERS)
  private List<String> immutableParameters;

  public static final String SERIALIZED_NAME_RELOAD_OPTIONS = "reloadOptions";
  @SerializedName(SERIALIZED_NAME_RELOAD_OPTIONS)
  private V1alpha1ConfigConstraintSpecReloadOptions reloadOptions;

  public static final String SERIALIZED_NAME_SCRIPT_CONFIGS = "scriptConfigs";
  @SerializedName(SERIALIZED_NAME_SCRIPT_CONFIGS)
  private List<V1alpha1ConfigConstraintSpecScriptConfigsInner> scriptConfigs;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1alpha1ConfigConstraintSpecSelector selector;

  public static final String SERIALIZED_NAME_STATIC_PARAMETERS = "staticParameters";
  @SerializedName(SERIALIZED_NAME_STATIC_PARAMETERS)
  private List<String> staticParameters;

  public static final String SERIALIZED_NAME_TOOLS_IMAGE_SPEC = "toolsImageSpec";
  @SerializedName(SERIALIZED_NAME_TOOLS_IMAGE_SPEC)
  private V1alpha1ConfigConstraintSpecToolsImageSpec toolsImageSpec;

  public V1alpha1ConfigConstraintSpec() {
  }

  public V1alpha1ConfigConstraintSpec cfgSchemaTopLevelName(String cfgSchemaTopLevelName) {
    
    this.cfgSchemaTopLevelName = cfgSchemaTopLevelName;
    return this;
  }

   /**
   * The cue type name, which generates the openapi schema.
   * @return cfgSchemaTopLevelName
  **/
  @jakarta.annotation.Nullable
  public String getCfgSchemaTopLevelName() {
    return cfgSchemaTopLevelName;
  }


  public void setCfgSchemaTopLevelName(String cfgSchemaTopLevelName) {
    this.cfgSchemaTopLevelName = cfgSchemaTopLevelName;
  }


  public V1alpha1ConfigConstraintSpec configurationSchema(V1alpha1ConfigConstraintSpecConfigurationSchema configurationSchema) {
    
    this.configurationSchema = configurationSchema;
    return this;
  }

   /**
   * Get configurationSchema
   * @return configurationSchema
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecConfigurationSchema getConfigurationSchema() {
    return configurationSchema;
  }


  public void setConfigurationSchema(V1alpha1ConfigConstraintSpecConfigurationSchema configurationSchema) {
    this.configurationSchema = configurationSchema;
  }


  public V1alpha1ConfigConstraintSpec downwardAPIOptions(List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> downwardAPIOptions) {
    
    this.downwardAPIOptions = downwardAPIOptions;
    return this;
  }

  public V1alpha1ConfigConstraintSpec addDownwardAPIOptionsItem(V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner downwardAPIOptionsItem) {
    if (this.downwardAPIOptions == null) {
      this.downwardAPIOptions = new ArrayList<>();
    }
    this.downwardAPIOptions.add(downwardAPIOptionsItem);
    return this;
  }

   /**
   * Used to monitor pod fields.
   * @return downwardAPIOptions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> getDownwardAPIOptions() {
    return downwardAPIOptions;
  }


  public void setDownwardAPIOptions(List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> downwardAPIOptions) {
    this.downwardAPIOptions = downwardAPIOptions;
  }


  public V1alpha1ConfigConstraintSpec dynamicParameters(List<String> dynamicParameters) {
    
    this.dynamicParameters = dynamicParameters;
    return this;
  }

  public V1alpha1ConfigConstraintSpec addDynamicParametersItem(String dynamicParametersItem) {
    if (this.dynamicParameters == null) {
      this.dynamicParameters = new ArrayList<>();
    }
    this.dynamicParameters.add(dynamicParametersItem);
    return this;
  }

   /**
   * A list of DynamicParameter. Modifications of these parameters trigger a config dynamic reload without process restart.
   * @return dynamicParameters
  **/
  @jakarta.annotation.Nullable
  public List<String> getDynamicParameters() {
    return dynamicParameters;
  }


  public void setDynamicParameters(List<String> dynamicParameters) {
    this.dynamicParameters = dynamicParameters;
  }


  public V1alpha1ConfigConstraintSpec forceHotUpdate(Boolean forceHotUpdate) {
    
    this.forceHotUpdate = forceHotUpdate;
    return this;
  }

   /**
   * Indicates whether to execute hot update parameters when the pod needs to be restarted. If set to true, the controller performs the hot update and then restarts the pod.
   * @return forceHotUpdate
  **/
  @jakarta.annotation.Nullable
  public Boolean getForceHotUpdate() {
    return forceHotUpdate;
  }


  public void setForceHotUpdate(Boolean forceHotUpdate) {
    this.forceHotUpdate = forceHotUpdate;
  }


  public V1alpha1ConfigConstraintSpec formatterConfig(V1alpha1ConfigConstraintSpecFormatterConfig formatterConfig) {
    
    this.formatterConfig = formatterConfig;
    return this;
  }

   /**
   * Get formatterConfig
   * @return formatterConfig
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ConfigConstraintSpecFormatterConfig getFormatterConfig() {
    return formatterConfig;
  }


  public void setFormatterConfig(V1alpha1ConfigConstraintSpecFormatterConfig formatterConfig) {
    this.formatterConfig = formatterConfig;
  }


  public V1alpha1ConfigConstraintSpec immutableParameters(List<String> immutableParameters) {
    
    this.immutableParameters = immutableParameters;
    return this;
  }

  public V1alpha1ConfigConstraintSpec addImmutableParametersItem(String immutableParametersItem) {
    if (this.immutableParameters == null) {
      this.immutableParameters = new ArrayList<>();
    }
    this.immutableParameters.add(immutableParametersItem);
    return this;
  }

   /**
   * Describes parameters that users are prohibited from modifying.
   * @return immutableParameters
  **/
  @jakarta.annotation.Nullable
  public List<String> getImmutableParameters() {
    return immutableParameters;
  }


  public void setImmutableParameters(List<String> immutableParameters) {
    this.immutableParameters = immutableParameters;
  }


  public V1alpha1ConfigConstraintSpec reloadOptions(V1alpha1ConfigConstraintSpecReloadOptions reloadOptions) {
    
    this.reloadOptions = reloadOptions;
    return this;
  }

   /**
   * Get reloadOptions
   * @return reloadOptions
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecReloadOptions getReloadOptions() {
    return reloadOptions;
  }


  public void setReloadOptions(V1alpha1ConfigConstraintSpecReloadOptions reloadOptions) {
    this.reloadOptions = reloadOptions;
  }


  public V1alpha1ConfigConstraintSpec scriptConfigs(List<V1alpha1ConfigConstraintSpecScriptConfigsInner> scriptConfigs) {
    
    this.scriptConfigs = scriptConfigs;
    return this;
  }

  public V1alpha1ConfigConstraintSpec addScriptConfigsItem(V1alpha1ConfigConstraintSpecScriptConfigsInner scriptConfigsItem) {
    if (this.scriptConfigs == null) {
      this.scriptConfigs = new ArrayList<>();
    }
    this.scriptConfigs.add(scriptConfigsItem);
    return this;
  }

   /**
   * A list of ScriptConfig. These scripts can be used by volume trigger, downward trigger, or tool image.
   * @return scriptConfigs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ConfigConstraintSpecScriptConfigsInner> getScriptConfigs() {
    return scriptConfigs;
  }


  public void setScriptConfigs(List<V1alpha1ConfigConstraintSpecScriptConfigsInner> scriptConfigs) {
    this.scriptConfigs = scriptConfigs;
  }


  public V1alpha1ConfigConstraintSpec selector(V1alpha1ConfigConstraintSpecSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecSelector getSelector() {
    return selector;
  }


  public void setSelector(V1alpha1ConfigConstraintSpecSelector selector) {
    this.selector = selector;
  }


  public V1alpha1ConfigConstraintSpec staticParameters(List<String> staticParameters) {
    
    this.staticParameters = staticParameters;
    return this;
  }

  public V1alpha1ConfigConstraintSpec addStaticParametersItem(String staticParametersItem) {
    if (this.staticParameters == null) {
      this.staticParameters = new ArrayList<>();
    }
    this.staticParameters.add(staticParametersItem);
    return this;
  }

   /**
   * A list of StaticParameter. Modifications of these parameters trigger a process restart.
   * @return staticParameters
  **/
  @jakarta.annotation.Nullable
  public List<String> getStaticParameters() {
    return staticParameters;
  }


  public void setStaticParameters(List<String> staticParameters) {
    this.staticParameters = staticParameters;
  }


  public V1alpha1ConfigConstraintSpec toolsImageSpec(V1alpha1ConfigConstraintSpecToolsImageSpec toolsImageSpec) {
    
    this.toolsImageSpec = toolsImageSpec;
    return this;
  }

   /**
   * Get toolsImageSpec
   * @return toolsImageSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecToolsImageSpec getToolsImageSpec() {
    return toolsImageSpec;
  }


  public void setToolsImageSpec(V1alpha1ConfigConstraintSpecToolsImageSpec toolsImageSpec) {
    this.toolsImageSpec = toolsImageSpec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigConstraintSpec v1alpha1ConfigConstraintSpec = (V1alpha1ConfigConstraintSpec) o;
    return Objects.equals(this.cfgSchemaTopLevelName, v1alpha1ConfigConstraintSpec.cfgSchemaTopLevelName) &&
        Objects.equals(this.configurationSchema, v1alpha1ConfigConstraintSpec.configurationSchema) &&
        Objects.equals(this.downwardAPIOptions, v1alpha1ConfigConstraintSpec.downwardAPIOptions) &&
        Objects.equals(this.dynamicParameters, v1alpha1ConfigConstraintSpec.dynamicParameters) &&
        Objects.equals(this.forceHotUpdate, v1alpha1ConfigConstraintSpec.forceHotUpdate) &&
        Objects.equals(this.formatterConfig, v1alpha1ConfigConstraintSpec.formatterConfig) &&
        Objects.equals(this.immutableParameters, v1alpha1ConfigConstraintSpec.immutableParameters) &&
        Objects.equals(this.reloadOptions, v1alpha1ConfigConstraintSpec.reloadOptions) &&
        Objects.equals(this.scriptConfigs, v1alpha1ConfigConstraintSpec.scriptConfigs) &&
        Objects.equals(this.selector, v1alpha1ConfigConstraintSpec.selector) &&
        Objects.equals(this.staticParameters, v1alpha1ConfigConstraintSpec.staticParameters) &&
        Objects.equals(this.toolsImageSpec, v1alpha1ConfigConstraintSpec.toolsImageSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfgSchemaTopLevelName, configurationSchema, downwardAPIOptions, dynamicParameters, forceHotUpdate, formatterConfig, immutableParameters, reloadOptions, scriptConfigs, selector, staticParameters, toolsImageSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpec {\n");
    sb.append("    cfgSchemaTopLevelName: ").append(toIndentedString(cfgSchemaTopLevelName)).append("\n");
    sb.append("    configurationSchema: ").append(toIndentedString(configurationSchema)).append("\n");
    sb.append("    downwardAPIOptions: ").append(toIndentedString(downwardAPIOptions)).append("\n");
    sb.append("    dynamicParameters: ").append(toIndentedString(dynamicParameters)).append("\n");
    sb.append("    forceHotUpdate: ").append(toIndentedString(forceHotUpdate)).append("\n");
    sb.append("    formatterConfig: ").append(toIndentedString(formatterConfig)).append("\n");
    sb.append("    immutableParameters: ").append(toIndentedString(immutableParameters)).append("\n");
    sb.append("    reloadOptions: ").append(toIndentedString(reloadOptions)).append("\n");
    sb.append("    scriptConfigs: ").append(toIndentedString(scriptConfigs)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    staticParameters: ").append(toIndentedString(staticParameters)).append("\n");
    sb.append("    toolsImageSpec: ").append(toIndentedString(toolsImageSpec)).append("\n");
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
    openapiFields.add("cfgSchemaTopLevelName");
    openapiFields.add("configurationSchema");
    openapiFields.add("downwardAPIOptions");
    openapiFields.add("dynamicParameters");
    openapiFields.add("forceHotUpdate");
    openapiFields.add("formatterConfig");
    openapiFields.add("immutableParameters");
    openapiFields.add("reloadOptions");
    openapiFields.add("scriptConfigs");
    openapiFields.add("selector");
    openapiFields.add("staticParameters");
    openapiFields.add("toolsImageSpec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("formatterConfig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpec is not found in the empty JSON string", V1alpha1ConfigConstraintSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ConfigConstraintSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cfgSchemaTopLevelName") != null && !jsonObj.get("cfgSchemaTopLevelName").isJsonNull()) && !jsonObj.get("cfgSchemaTopLevelName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cfgSchemaTopLevelName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cfgSchemaTopLevelName").toString()));
      }
      // validate the optional field `configurationSchema`
      if (jsonObj.get("configurationSchema") != null && !jsonObj.get("configurationSchema").isJsonNull()) {
        V1alpha1ConfigConstraintSpecConfigurationSchema.validateJsonObject(jsonObj.getAsJsonObject("configurationSchema"));
      }
      if (jsonObj.get("downwardAPIOptions") != null && !jsonObj.get("downwardAPIOptions").isJsonNull()) {
        JsonArray jsonArraydownwardAPIOptions = jsonObj.getAsJsonArray("downwardAPIOptions");
        if (jsonArraydownwardAPIOptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("downwardAPIOptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `downwardAPIOptions` to be an array in the JSON string but got `%s`", jsonObj.get("downwardAPIOptions").toString()));
          }

          // validate the optional field `downwardAPIOptions` (array)
          for (int i = 0; i < jsonArraydownwardAPIOptions.size(); i++) {
            V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.validateJsonObject(jsonArraydownwardAPIOptions.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dynamicParameters") != null && !jsonObj.get("dynamicParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamicParameters` to be an array in the JSON string but got `%s`", jsonObj.get("dynamicParameters").toString()));
      }
      // validate the required field `formatterConfig`
      V1alpha1ConfigConstraintSpecFormatterConfig.validateJsonObject(jsonObj.getAsJsonObject("formatterConfig"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("immutableParameters") != null && !jsonObj.get("immutableParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `immutableParameters` to be an array in the JSON string but got `%s`", jsonObj.get("immutableParameters").toString()));
      }
      // validate the optional field `reloadOptions`
      if (jsonObj.get("reloadOptions") != null && !jsonObj.get("reloadOptions").isJsonNull()) {
        V1alpha1ConfigConstraintSpecReloadOptions.validateJsonObject(jsonObj.getAsJsonObject("reloadOptions"));
      }
      if (jsonObj.get("scriptConfigs") != null && !jsonObj.get("scriptConfigs").isJsonNull()) {
        JsonArray jsonArrayscriptConfigs = jsonObj.getAsJsonArray("scriptConfigs");
        if (jsonArrayscriptConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scriptConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scriptConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("scriptConfigs").toString()));
          }

          // validate the optional field `scriptConfigs` (array)
          for (int i = 0; i < jsonArrayscriptConfigs.size(); i++) {
            V1alpha1ConfigConstraintSpecScriptConfigsInner.validateJsonObject(jsonArrayscriptConfigs.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1alpha1ConfigConstraintSpecSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("staticParameters") != null && !jsonObj.get("staticParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `staticParameters` to be an array in the JSON string but got `%s`", jsonObj.get("staticParameters").toString()));
      }
      // validate the optional field `toolsImageSpec`
      if (jsonObj.get("toolsImageSpec") != null && !jsonObj.get("toolsImageSpec").isJsonNull()) {
        V1alpha1ConfigConstraintSpecToolsImageSpec.validateJsonObject(jsonObj.getAsJsonObject("toolsImageSpec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpec
  */
  public static V1alpha1ConfigConstraintSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

