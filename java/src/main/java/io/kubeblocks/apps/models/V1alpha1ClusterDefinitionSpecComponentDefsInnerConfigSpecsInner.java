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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInnerLegacyRenderedConfigSpec;
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
 * V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner {
  public static final String SERIALIZED_NAME_AS_ENV_FROM = "asEnvFrom";
  @SerializedName(SERIALIZED_NAME_AS_ENV_FROM)
  private List<String> asEnvFrom;

  public static final String SERIALIZED_NAME_CONSTRAINT_REF = "constraintRef";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_REF)
  private String constraintRef;

  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys;

  public static final String SERIALIZED_NAME_LEGACY_RENDERED_CONFIG_SPEC = "legacyRenderedConfigSpec";
  @SerializedName(SERIALIZED_NAME_LEGACY_RENDERED_CONFIG_SPEC)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInnerLegacyRenderedConfigSpec legacyRenderedConfigSpec;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private String templateRef;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner asEnvFrom(List<String> asEnvFrom) {
    
    this.asEnvFrom = asEnvFrom;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner addAsEnvFromItem(String asEnvFromItem) {
    if (this.asEnvFrom == null) {
      this.asEnvFrom = new ArrayList<>();
    }
    this.asEnvFrom.add(asEnvFromItem);
    return this;
  }

   /**
   * asEnvFrom is optional: the list of containers will be injected into EnvFrom.
   * @return asEnvFrom
  **/
  @jakarta.annotation.Nullable
  public List<String> getAsEnvFrom() {
    return asEnvFrom;
  }


  public void setAsEnvFrom(List<String> asEnvFrom) {
    this.asEnvFrom = asEnvFrom;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner constraintRef(String constraintRef) {
    
    this.constraintRef = constraintRef;
    return this;
  }

   /**
   * Specify the name of the referenced the configuration constraints object.
   * @return constraintRef
  **/
  @jakarta.annotation.Nullable
  public String getConstraintRef() {
    return constraintRef;
  }


  public void setConstraintRef(String constraintRef) {
    this.constraintRef = constraintRef;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner defaultMode(Integer defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * defaultMode is optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @jakarta.annotation.Nullable
  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner keys(List<String> keys) {
    
    this.keys = keys;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Specify a list of keys. If empty, ConfigConstraint takes effect for all keys in configmap.
   * @return keys
  **/
  @jakarta.annotation.Nullable
  public List<String> getKeys() {
    return keys;
  }


  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner legacyRenderedConfigSpec(V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInnerLegacyRenderedConfigSpec legacyRenderedConfigSpec) {
    
    this.legacyRenderedConfigSpec = legacyRenderedConfigSpec;
    return this;
  }

   /**
   * Get legacyRenderedConfigSpec
   * @return legacyRenderedConfigSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInnerLegacyRenderedConfigSpec getLegacyRenderedConfigSpec() {
    return legacyRenderedConfigSpec;
  }


  public void setLegacyRenderedConfigSpec(V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInnerLegacyRenderedConfigSpec legacyRenderedConfigSpec) {
    this.legacyRenderedConfigSpec = legacyRenderedConfigSpec;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specify the name of configuration template.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specify the namespace of the referenced the configuration template ConfigMap object. An empty namespace is equivalent to the \&quot;default\&quot; namespace.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner templateRef(String templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Specify the name of the referenced the configuration template ConfigMap object.
   * @return templateRef
  **/
  @jakarta.annotation.Nonnull
  public String getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(String templateRef) {
    this.templateRef = templateRef;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner volumeName(String volumeName) {
    
    this.volumeName = volumeName;
    return this;
  }

   /**
   * volumeName is the volume name of PodTemplate, which the configuration file produced through the configuration template will be mounted to the corresponding volume. Must be a DNS_LABEL name. The volume name must be defined in podSpec.containers[*].volumeMounts.
   * @return volumeName
  **/
  @jakarta.annotation.Nonnull
  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner = (V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner) o;
    return Objects.equals(this.asEnvFrom, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.asEnvFrom) &&
        Objects.equals(this.constraintRef, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.constraintRef) &&
        Objects.equals(this.defaultMode, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.defaultMode) &&
        Objects.equals(this.keys, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.keys) &&
        Objects.equals(this.legacyRenderedConfigSpec, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.legacyRenderedConfigSpec) &&
        Objects.equals(this.name, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.name) &&
        Objects.equals(this.namespace, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.namespace) &&
        Objects.equals(this.templateRef, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.templateRef) &&
        Objects.equals(this.volumeName, v1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asEnvFrom, constraintRef, defaultMode, keys, legacyRenderedConfigSpec, name, namespace, templateRef, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner {\n");
    sb.append("    asEnvFrom: ").append(toIndentedString(asEnvFrom)).append("\n");
    sb.append("    constraintRef: ").append(toIndentedString(constraintRef)).append("\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    legacyRenderedConfigSpec: ").append(toIndentedString(legacyRenderedConfigSpec)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
    openapiFields.add("asEnvFrom");
    openapiFields.add("constraintRef");
    openapiFields.add("defaultMode");
    openapiFields.add("keys");
    openapiFields.add("legacyRenderedConfigSpec");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("templateRef");
    openapiFields.add("volumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("templateRef");
    openapiRequiredFields.add("volumeName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("asEnvFrom") != null && !jsonObj.get("asEnvFrom").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `asEnvFrom` to be an array in the JSON string but got `%s`", jsonObj.get("asEnvFrom").toString()));
      }
      if ((jsonObj.get("constraintRef") != null && !jsonObj.get("constraintRef").isJsonNull()) && !jsonObj.get("constraintRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constraintRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constraintRef").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keys") != null && !jsonObj.get("keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keys` to be an array in the JSON string but got `%s`", jsonObj.get("keys").toString()));
      }
      // validate the optional field `legacyRenderedConfigSpec`
      if (jsonObj.get("legacyRenderedConfigSpec") != null && !jsonObj.get("legacyRenderedConfigSpec").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInnerLegacyRenderedConfigSpec.validateJsonObject(jsonObj.getAsJsonObject("legacyRenderedConfigSpec"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (!jsonObj.get("templateRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateRef").toString()));
      }
      if (!jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

