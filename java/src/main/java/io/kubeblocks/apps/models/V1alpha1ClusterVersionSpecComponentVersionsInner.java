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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec;
import io.kubeblocks.apps.models.V1alpha1ClusterVersionSpecComponentVersionsInnerSystemAccountSpec;
import io.kubeblocks.apps.models.V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext;
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
 * ClusterComponentVersion is an application version component spec.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterVersionSpecComponentVersionsInner {
  public static final String SERIALIZED_NAME_COMPONENT_DEF_REF = "componentDefRef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF_REF)
  private String componentDefRef;

  public static final String SERIALIZED_NAME_CONFIG_SPECS = "configSpecs";
  @SerializedName(SERIALIZED_NAME_CONFIG_SPECS)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> configSpecs;

  public static final String SERIALIZED_NAME_SWITCHOVER_SPEC = "switchoverSpec";
  @SerializedName(SERIALIZED_NAME_SWITCHOVER_SPEC)
  private V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec switchoverSpec;

  public static final String SERIALIZED_NAME_SYSTEM_ACCOUNT_SPEC = "systemAccountSpec";
  @SerializedName(SERIALIZED_NAME_SYSTEM_ACCOUNT_SPEC)
  private V1alpha1ClusterVersionSpecComponentVersionsInnerSystemAccountSpec systemAccountSpec;

  public static final String SERIALIZED_NAME_VERSIONS_CONTEXT = "versionsContext";
  @SerializedName(SERIALIZED_NAME_VERSIONS_CONTEXT)
  private V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext versionsContext;

  public V1alpha1ClusterVersionSpecComponentVersionsInner() {
  }

  public V1alpha1ClusterVersionSpecComponentVersionsInner componentDefRef(String componentDefRef) {
    
    this.componentDefRef = componentDefRef;
    return this;
  }

   /**
   * componentDefRef reference one of the cluster component definition names in ClusterDefinition API (spec.componentDefs.name).
   * @return componentDefRef
  **/
  @jakarta.annotation.Nonnull
  public String getComponentDefRef() {
    return componentDefRef;
  }


  public void setComponentDefRef(String componentDefRef) {
    this.componentDefRef = componentDefRef;
  }


  public V1alpha1ClusterVersionSpecComponentVersionsInner configSpecs(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> configSpecs) {
    
    this.configSpecs = configSpecs;
    return this;
  }

  public V1alpha1ClusterVersionSpecComponentVersionsInner addConfigSpecsItem(V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner configSpecsItem) {
    if (this.configSpecs == null) {
      this.configSpecs = new ArrayList<>();
    }
    this.configSpecs.add(configSpecsItem);
    return this;
  }

   /**
   * configSpecs defines a configuration extension mechanism to handle configuration differences between versions, the configTemplateRefs field, together with configTemplateRefs in the ClusterDefinition, determines the final configuration file.
   * @return configSpecs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> getConfigSpecs() {
    return configSpecs;
  }


  public void setConfigSpecs(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> configSpecs) {
    this.configSpecs = configSpecs;
  }


  public V1alpha1ClusterVersionSpecComponentVersionsInner switchoverSpec(V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec switchoverSpec) {
    
    this.switchoverSpec = switchoverSpec;
    return this;
  }

   /**
   * Get switchoverSpec
   * @return switchoverSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec getSwitchoverSpec() {
    return switchoverSpec;
  }


  public void setSwitchoverSpec(V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec switchoverSpec) {
    this.switchoverSpec = switchoverSpec;
  }


  public V1alpha1ClusterVersionSpecComponentVersionsInner systemAccountSpec(V1alpha1ClusterVersionSpecComponentVersionsInnerSystemAccountSpec systemAccountSpec) {
    
    this.systemAccountSpec = systemAccountSpec;
    return this;
  }

   /**
   * Get systemAccountSpec
   * @return systemAccountSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterVersionSpecComponentVersionsInnerSystemAccountSpec getSystemAccountSpec() {
    return systemAccountSpec;
  }


  public void setSystemAccountSpec(V1alpha1ClusterVersionSpecComponentVersionsInnerSystemAccountSpec systemAccountSpec) {
    this.systemAccountSpec = systemAccountSpec;
  }


  public V1alpha1ClusterVersionSpecComponentVersionsInner versionsContext(V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext versionsContext) {
    
    this.versionsContext = versionsContext;
    return this;
  }

   /**
   * Get versionsContext
   * @return versionsContext
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext getVersionsContext() {
    return versionsContext;
  }


  public void setVersionsContext(V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext versionsContext) {
    this.versionsContext = versionsContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterVersionSpecComponentVersionsInner v1alpha1ClusterVersionSpecComponentVersionsInner = (V1alpha1ClusterVersionSpecComponentVersionsInner) o;
    return Objects.equals(this.componentDefRef, v1alpha1ClusterVersionSpecComponentVersionsInner.componentDefRef) &&
        Objects.equals(this.configSpecs, v1alpha1ClusterVersionSpecComponentVersionsInner.configSpecs) &&
        Objects.equals(this.switchoverSpec, v1alpha1ClusterVersionSpecComponentVersionsInner.switchoverSpec) &&
        Objects.equals(this.systemAccountSpec, v1alpha1ClusterVersionSpecComponentVersionsInner.systemAccountSpec) &&
        Objects.equals(this.versionsContext, v1alpha1ClusterVersionSpecComponentVersionsInner.versionsContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentDefRef, configSpecs, switchoverSpec, systemAccountSpec, versionsContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterVersionSpecComponentVersionsInner {\n");
    sb.append("    componentDefRef: ").append(toIndentedString(componentDefRef)).append("\n");
    sb.append("    configSpecs: ").append(toIndentedString(configSpecs)).append("\n");
    sb.append("    switchoverSpec: ").append(toIndentedString(switchoverSpec)).append("\n");
    sb.append("    systemAccountSpec: ").append(toIndentedString(systemAccountSpec)).append("\n");
    sb.append("    versionsContext: ").append(toIndentedString(versionsContext)).append("\n");
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
    openapiFields.add("componentDefRef");
    openapiFields.add("configSpecs");
    openapiFields.add("switchoverSpec");
    openapiFields.add("systemAccountSpec");
    openapiFields.add("versionsContext");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("componentDefRef");
    openapiRequiredFields.add("versionsContext");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterVersionSpecComponentVersionsInner is not found in the empty JSON string", V1alpha1ClusterVersionSpecComponentVersionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterVersionSpecComponentVersionsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterVersionSpecComponentVersionsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("componentDefRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentDefRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentDefRef").toString()));
      }
      if (jsonObj.get("configSpecs") != null && !jsonObj.get("configSpecs").isJsonNull()) {
        JsonArray jsonArrayconfigSpecs = jsonObj.getAsJsonArray("configSpecs");
        if (jsonArrayconfigSpecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configSpecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("configSpecs").toString()));
          }

          // validate the optional field `configSpecs` (array)
          for (int i = 0; i < jsonArrayconfigSpecs.size(); i++) {
            V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.validateJsonObject(jsonArrayconfigSpecs.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `switchoverSpec`
      if (jsonObj.get("switchoverSpec") != null && !jsonObj.get("switchoverSpec").isJsonNull()) {
        V1alpha1ClusterVersionSpecComponentVersionsInnerSwitchoverSpec.validateJsonObject(jsonObj.getAsJsonObject("switchoverSpec"));
      }
      // validate the optional field `systemAccountSpec`
      if (jsonObj.get("systemAccountSpec") != null && !jsonObj.get("systemAccountSpec").isJsonNull()) {
        V1alpha1ClusterVersionSpecComponentVersionsInnerSystemAccountSpec.validateJsonObject(jsonObj.getAsJsonObject("systemAccountSpec"));
      }
      // validate the required field `versionsContext`
      V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.validateJsonObject(jsonObj.getAsJsonObject("versionsContext"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterVersionSpecComponentVersionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterVersionSpecComponentVersionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterVersionSpecComponentVersionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterVersionSpecComponentVersionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterVersionSpecComponentVersionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterVersionSpecComponentVersionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterVersionSpecComponentVersionsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInner
  */
  public static V1alpha1ClusterVersionSpecComponentVersionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterVersionSpecComponentVersionsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterVersionSpecComponentVersionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

