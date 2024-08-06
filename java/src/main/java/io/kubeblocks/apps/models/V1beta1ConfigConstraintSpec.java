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


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner;
import io.kubeblocks.apps.models.V1beta1ConfigConstraintSpecFileFormatConfig;
import io.kubeblocks.apps.models.V1beta1ConfigConstraintSpecParametersSchema;
import io.kubeblocks.apps.models.V1beta1ConfigConstraintSpecReloadAction;
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
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:58:00.823553Z[Etc/UTC]")
public class V1beta1ConfigConstraintSpec {
  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I_CHANGE_TRIGGERED_ACTIONS = "downwardAPIChangeTriggeredActions";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I_CHANGE_TRIGGERED_ACTIONS)
  private List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> downwardAPIChangeTriggeredActions;

  public static final String SERIALIZED_NAME_DYNAMIC_PARAMETERS = "dynamicParameters";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_PARAMETERS)
  private List<String> dynamicParameters;

  public static final String SERIALIZED_NAME_FILE_FORMAT_CONFIG = "fileFormatConfig";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT_CONFIG)
  private V1beta1ConfigConstraintSpecFileFormatConfig fileFormatConfig;

  public static final String SERIALIZED_NAME_IMMUTABLE_PARAMETERS = "immutableParameters";
  @SerializedName(SERIALIZED_NAME_IMMUTABLE_PARAMETERS)
  private List<String> immutableParameters;

  public static final String SERIALIZED_NAME_MERGE_RELOAD_AND_RESTART = "mergeReloadAndRestart";
  @SerializedName(SERIALIZED_NAME_MERGE_RELOAD_AND_RESTART)
  private Boolean mergeReloadAndRestart;

  public static final String SERIALIZED_NAME_PARAMETERS_SCHEMA = "parametersSchema";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_SCHEMA)
  private V1beta1ConfigConstraintSpecParametersSchema parametersSchema;

  public static final String SERIALIZED_NAME_RELOAD_ACTION = "reloadAction";
  @SerializedName(SERIALIZED_NAME_RELOAD_ACTION)
  private V1beta1ConfigConstraintSpecReloadAction reloadAction;

  public static final String SERIALIZED_NAME_RELOAD_STATIC_PARAMS_BEFORE_RESTART = "reloadStaticParamsBeforeRestart";
  @SerializedName(SERIALIZED_NAME_RELOAD_STATIC_PARAMS_BEFORE_RESTART)
  private Boolean reloadStaticParamsBeforeRestart;

  public static final String SERIALIZED_NAME_STATIC_PARAMETERS = "staticParameters";
  @SerializedName(SERIALIZED_NAME_STATIC_PARAMETERS)
  private List<String> staticParameters;

  public V1beta1ConfigConstraintSpec() {
  }

  public V1beta1ConfigConstraintSpec downwardAPIChangeTriggeredActions(List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> downwardAPIChangeTriggeredActions) {
    
    this.downwardAPIChangeTriggeredActions = downwardAPIChangeTriggeredActions;
    return this;
  }

  public V1beta1ConfigConstraintSpec addDownwardAPIChangeTriggeredActionsItem(V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner downwardAPIChangeTriggeredActionsItem) {
    if (this.downwardAPIChangeTriggeredActions == null) {
      this.downwardAPIChangeTriggeredActions = new ArrayList<>();
    }
    this.downwardAPIChangeTriggeredActions.add(downwardAPIChangeTriggeredActionsItem);
    return this;
  }

   /**
   * TODO: migrate DownwardAPITriggeredActions to ComponentDefinition.spec.lifecycleActions Specifies a list of actions to execute specified commands based on Pod labels.   It utilizes the K8s Downward API to mount label information as a volume into the pod. The &#39;config-manager&#39; sidecar container watches for changes in the role label and dynamically invoke registered commands (usually execute some SQL statements) when a change is detected.   It is designed for scenarios where:   - Replicas with different roles have different configurations, such as Redis primary &amp; secondary replicas. - After a role switch (e.g., from secondary to primary), some changes in configuration are needed   to reflect the new role.
   * @return downwardAPIChangeTriggeredActions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> getDownwardAPIChangeTriggeredActions() {
    return downwardAPIChangeTriggeredActions;
  }


  public void setDownwardAPIChangeTriggeredActions(List<V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner> downwardAPIChangeTriggeredActions) {
    this.downwardAPIChangeTriggeredActions = downwardAPIChangeTriggeredActions;
  }


  public V1beta1ConfigConstraintSpec dynamicParameters(List<String> dynamicParameters) {
    
    this.dynamicParameters = dynamicParameters;
    return this;
  }

  public V1beta1ConfigConstraintSpec addDynamicParametersItem(String dynamicParametersItem) {
    if (this.dynamicParameters == null) {
      this.dynamicParameters = new ArrayList<>();
    }
    this.dynamicParameters.add(dynamicParametersItem);
    return this;
  }

   /**
   * List dynamic parameters. Modifications to these parameters trigger a configuration reload without requiring a process restart.
   * @return dynamicParameters
  **/
  @jakarta.annotation.Nullable
  public List<String> getDynamicParameters() {
    return dynamicParameters;
  }


  public void setDynamicParameters(List<String> dynamicParameters) {
    this.dynamicParameters = dynamicParameters;
  }


  public V1beta1ConfigConstraintSpec fileFormatConfig(V1beta1ConfigConstraintSpecFileFormatConfig fileFormatConfig) {
    
    this.fileFormatConfig = fileFormatConfig;
    return this;
  }

   /**
   * Get fileFormatConfig
   * @return fileFormatConfig
  **/
  @jakarta.annotation.Nonnull
  public V1beta1ConfigConstraintSpecFileFormatConfig getFileFormatConfig() {
    return fileFormatConfig;
  }


  public void setFileFormatConfig(V1beta1ConfigConstraintSpecFileFormatConfig fileFormatConfig) {
    this.fileFormatConfig = fileFormatConfig;
  }


  public V1beta1ConfigConstraintSpec immutableParameters(List<String> immutableParameters) {
    
    this.immutableParameters = immutableParameters;
    return this;
  }

  public V1beta1ConfigConstraintSpec addImmutableParametersItem(String immutableParametersItem) {
    if (this.immutableParameters == null) {
      this.immutableParameters = new ArrayList<>();
    }
    this.immutableParameters.add(immutableParametersItem);
    return this;
  }

   /**
   * Lists the parameters that cannot be modified once set. Attempting to change any of these parameters will be ignored.
   * @return immutableParameters
  **/
  @jakarta.annotation.Nullable
  public List<String> getImmutableParameters() {
    return immutableParameters;
  }


  public void setImmutableParameters(List<String> immutableParameters) {
    this.immutableParameters = immutableParameters;
  }


  public V1beta1ConfigConstraintSpec mergeReloadAndRestart(Boolean mergeReloadAndRestart) {
    
    this.mergeReloadAndRestart = mergeReloadAndRestart;
    return this;
  }

   /**
   * Indicates whether to consolidate dynamic reload and restart actions into a single restart.   - If true, updates requiring both actions will result in only a restart, merging the actions. - If false, updates will trigger both actions executed sequentially: first dynamic reload, then restart.   This flag allows for more efficient handling of configuration changes by potentially eliminating an unnecessary reload step.
   * @return mergeReloadAndRestart
  **/
  @jakarta.annotation.Nullable
  public Boolean getMergeReloadAndRestart() {
    return mergeReloadAndRestart;
  }


  public void setMergeReloadAndRestart(Boolean mergeReloadAndRestart) {
    this.mergeReloadAndRestart = mergeReloadAndRestart;
  }


  public V1beta1ConfigConstraintSpec parametersSchema(V1beta1ConfigConstraintSpecParametersSchema parametersSchema) {
    
    this.parametersSchema = parametersSchema;
    return this;
  }

   /**
   * Get parametersSchema
   * @return parametersSchema
  **/
  @jakarta.annotation.Nullable
  public V1beta1ConfigConstraintSpecParametersSchema getParametersSchema() {
    return parametersSchema;
  }


  public void setParametersSchema(V1beta1ConfigConstraintSpecParametersSchema parametersSchema) {
    this.parametersSchema = parametersSchema;
  }


  public V1beta1ConfigConstraintSpec reloadAction(V1beta1ConfigConstraintSpecReloadAction reloadAction) {
    
    this.reloadAction = reloadAction;
    return this;
  }

   /**
   * Get reloadAction
   * @return reloadAction
  **/
  @jakarta.annotation.Nullable
  public V1beta1ConfigConstraintSpecReloadAction getReloadAction() {
    return reloadAction;
  }


  public void setReloadAction(V1beta1ConfigConstraintSpecReloadAction reloadAction) {
    this.reloadAction = reloadAction;
  }


  public V1beta1ConfigConstraintSpec reloadStaticParamsBeforeRestart(Boolean reloadStaticParamsBeforeRestart) {
    
    this.reloadStaticParamsBeforeRestart = reloadStaticParamsBeforeRestart;
    return this;
  }

   /**
   * Configures whether the dynamic reload specified in &#x60;reloadAction&#x60; applies only to dynamic parameters or to all parameters (including static parameters).   - false (default): Only modifications to the dynamic parameters listed in &#x60;dynamicParameters&#x60;   will trigger a dynamic reload. - true: Modifications to both dynamic parameters listed in &#x60;dynamicParameters&#x60; and static parameters   listed in &#x60;staticParameters&#x60; will trigger a dynamic reload.   The \&quot;all\&quot; option is for certain engines that require static parameters to be set   via SQL statements before they can take effect on restart.
   * @return reloadStaticParamsBeforeRestart
  **/
  @jakarta.annotation.Nullable
  public Boolean getReloadStaticParamsBeforeRestart() {
    return reloadStaticParamsBeforeRestart;
  }


  public void setReloadStaticParamsBeforeRestart(Boolean reloadStaticParamsBeforeRestart) {
    this.reloadStaticParamsBeforeRestart = reloadStaticParamsBeforeRestart;
  }


  public V1beta1ConfigConstraintSpec staticParameters(List<String> staticParameters) {
    
    this.staticParameters = staticParameters;
    return this;
  }

  public V1beta1ConfigConstraintSpec addStaticParametersItem(String staticParametersItem) {
    if (this.staticParameters == null) {
      this.staticParameters = new ArrayList<>();
    }
    this.staticParameters.add(staticParametersItem);
    return this;
  }

   /**
   * List static parameters. Modifications to any of these parameters require a restart of the process to take effect.
   * @return staticParameters
  **/
  @jakarta.annotation.Nullable
  public List<String> getStaticParameters() {
    return staticParameters;
  }


  public void setStaticParameters(List<String> staticParameters) {
    this.staticParameters = staticParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ConfigConstraintSpec v1beta1ConfigConstraintSpec = (V1beta1ConfigConstraintSpec) o;
    return Objects.equals(this.downwardAPIChangeTriggeredActions, v1beta1ConfigConstraintSpec.downwardAPIChangeTriggeredActions) &&
        Objects.equals(this.dynamicParameters, v1beta1ConfigConstraintSpec.dynamicParameters) &&
        Objects.equals(this.fileFormatConfig, v1beta1ConfigConstraintSpec.fileFormatConfig) &&
        Objects.equals(this.immutableParameters, v1beta1ConfigConstraintSpec.immutableParameters) &&
        Objects.equals(this.mergeReloadAndRestart, v1beta1ConfigConstraintSpec.mergeReloadAndRestart) &&
        Objects.equals(this.parametersSchema, v1beta1ConfigConstraintSpec.parametersSchema) &&
        Objects.equals(this.reloadAction, v1beta1ConfigConstraintSpec.reloadAction) &&
        Objects.equals(this.reloadStaticParamsBeforeRestart, v1beta1ConfigConstraintSpec.reloadStaticParamsBeforeRestart) &&
        Objects.equals(this.staticParameters, v1beta1ConfigConstraintSpec.staticParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downwardAPIChangeTriggeredActions, dynamicParameters, fileFormatConfig, immutableParameters, mergeReloadAndRestart, parametersSchema, reloadAction, reloadStaticParamsBeforeRestart, staticParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ConfigConstraintSpec {\n");
    sb.append("    downwardAPIChangeTriggeredActions: ").append(toIndentedString(downwardAPIChangeTriggeredActions)).append("\n");
    sb.append("    dynamicParameters: ").append(toIndentedString(dynamicParameters)).append("\n");
    sb.append("    fileFormatConfig: ").append(toIndentedString(fileFormatConfig)).append("\n");
    sb.append("    immutableParameters: ").append(toIndentedString(immutableParameters)).append("\n");
    sb.append("    mergeReloadAndRestart: ").append(toIndentedString(mergeReloadAndRestart)).append("\n");
    sb.append("    parametersSchema: ").append(toIndentedString(parametersSchema)).append("\n");
    sb.append("    reloadAction: ").append(toIndentedString(reloadAction)).append("\n");
    sb.append("    reloadStaticParamsBeforeRestart: ").append(toIndentedString(reloadStaticParamsBeforeRestart)).append("\n");
    sb.append("    staticParameters: ").append(toIndentedString(staticParameters)).append("\n");
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
    openapiFields.add("downwardAPIChangeTriggeredActions");
    openapiFields.add("dynamicParameters");
    openapiFields.add("fileFormatConfig");
    openapiFields.add("immutableParameters");
    openapiFields.add("mergeReloadAndRestart");
    openapiFields.add("parametersSchema");
    openapiFields.add("reloadAction");
    openapiFields.add("reloadStaticParamsBeforeRestart");
    openapiFields.add("staticParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fileFormatConfig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1ConfigConstraintSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1ConfigConstraintSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ConfigConstraintSpec is not found in the empty JSON string", V1beta1ConfigConstraintSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ConfigConstraintSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ConfigConstraintSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1ConfigConstraintSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("downwardAPIChangeTriggeredActions") != null && !jsonObj.get("downwardAPIChangeTriggeredActions").isJsonNull()) {
        JsonArray jsonArraydownwardAPIChangeTriggeredActions = jsonObj.getAsJsonArray("downwardAPIChangeTriggeredActions");
        if (jsonArraydownwardAPIChangeTriggeredActions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("downwardAPIChangeTriggeredActions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `downwardAPIChangeTriggeredActions` to be an array in the JSON string but got `%s`", jsonObj.get("downwardAPIChangeTriggeredActions").toString()));
          }

          // validate the optional field `downwardAPIChangeTriggeredActions` (array)
          for (int i = 0; i < jsonArraydownwardAPIChangeTriggeredActions.size(); i++) {
            V1alpha1ConfigConstraintSpecDownwardAPIOptionsInner.validateJsonObject(jsonArraydownwardAPIChangeTriggeredActions.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dynamicParameters") != null && !jsonObj.get("dynamicParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamicParameters` to be an array in the JSON string but got `%s`", jsonObj.get("dynamicParameters").toString()));
      }
      // validate the required field `fileFormatConfig`
      V1beta1ConfigConstraintSpecFileFormatConfig.validateJsonObject(jsonObj.getAsJsonObject("fileFormatConfig"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("immutableParameters") != null && !jsonObj.get("immutableParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `immutableParameters` to be an array in the JSON string but got `%s`", jsonObj.get("immutableParameters").toString()));
      }
      // validate the optional field `parametersSchema`
      if (jsonObj.get("parametersSchema") != null && !jsonObj.get("parametersSchema").isJsonNull()) {
        V1beta1ConfigConstraintSpecParametersSchema.validateJsonObject(jsonObj.getAsJsonObject("parametersSchema"));
      }
      // validate the optional field `reloadAction`
      if (jsonObj.get("reloadAction") != null && !jsonObj.get("reloadAction").isJsonNull()) {
        V1beta1ConfigConstraintSpecReloadAction.validateJsonObject(jsonObj.getAsJsonObject("reloadAction"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("staticParameters") != null && !jsonObj.get("staticParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `staticParameters` to be an array in the JSON string but got `%s`", jsonObj.get("staticParameters").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ConfigConstraintSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ConfigConstraintSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ConfigConstraintSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ConfigConstraintSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ConfigConstraintSpec>() {
           @Override
           public void write(JsonWriter out, V1beta1ConfigConstraintSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ConfigConstraintSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ConfigConstraintSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ConfigConstraintSpec
  * @throws IOException if the JSON string is invalid with respect to V1beta1ConfigConstraintSpec
  */
  public static V1beta1ConfigConstraintSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1beta1ConfigConstraintSpec.class);
  }

 /**
  * Convert an instance of V1beta1ConfigConstraintSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
