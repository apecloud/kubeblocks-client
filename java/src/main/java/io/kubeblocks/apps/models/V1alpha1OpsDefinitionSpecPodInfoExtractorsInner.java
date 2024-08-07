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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner;
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector;
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
 * V1alpha1OpsDefinitionSpecPodInfoExtractorsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecPodInfoExtractorsInner {
  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner> env;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POD_SELECTOR = "podSelector";
  @SerializedName(SERIALIZED_NAME_POD_SELECTOR)
  private V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector podSelector;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> volumeMounts;

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner() {
  }

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner env(List<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner> env) {
    
    this.env = env;
    return this;
  }

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner addEnvItem(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Specifies a list of environment variables to be extracted from a selected Pod, and injected into the containers executing each OpsAction.
   * @return env
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner> getEnv() {
    return env;
  }


  public void setEnv(List<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner> env) {
    this.env = env;
  }


  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the PodInfoExtractor.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner podSelector(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector podSelector) {
    
    this.podSelector = podSelector;
    return this;
  }

   /**
   * Get podSelector
   * @return podSelector
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector getPodSelector() {
    return podSelector;
  }


  public void setPodSelector(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector podSelector) {
    this.podSelector = podSelector;
  }


  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner volumeMounts(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner addVolumeMountsItem(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Specifies a list of volumes, along with their respective mount points, that are to be extracted from a selected Pod, and mounted onto the containers executing each OpsAction. This allows the containers to access shared or persistent data necessary for the operation.
   * @return volumeMounts
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecPodInfoExtractorsInner v1alpha1OpsDefinitionSpecPodInfoExtractorsInner = (V1alpha1OpsDefinitionSpecPodInfoExtractorsInner) o;
    return Objects.equals(this.env, v1alpha1OpsDefinitionSpecPodInfoExtractorsInner.env) &&
        Objects.equals(this.name, v1alpha1OpsDefinitionSpecPodInfoExtractorsInner.name) &&
        Objects.equals(this.podSelector, v1alpha1OpsDefinitionSpecPodInfoExtractorsInner.podSelector) &&
        Objects.equals(this.volumeMounts, v1alpha1OpsDefinitionSpecPodInfoExtractorsInner.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, name, podSelector, volumeMounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecPodInfoExtractorsInner {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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
    openapiFields.add("env");
    openapiFields.add("name");
    openapiFields.add("podSelector");
    openapiFields.add("volumeMounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("podSelector");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecPodInfoExtractorsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecPodInfoExtractorsInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecPodInfoExtractorsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull()) {
        JsonArray jsonArrayenv = jsonObj.getAsJsonArray("env");
        if (jsonArrayenv != null) {
          // ensure the json data is an array
          if (!jsonObj.get("env").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
          }

          // validate the optional field `env` (array)
          for (int i = 0; i < jsonArrayenv.size(); i++) {
            V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerEnvInner.validateJsonObject(jsonArrayenv.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `podSelector`
      V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.validateJsonObject(jsonObj.getAsJsonObject("podSelector"));
      if (jsonObj.get("volumeMounts") != null && !jsonObj.get("volumeMounts").isJsonNull()) {
        JsonArray jsonArrayvolumeMounts = jsonObj.getAsJsonArray("volumeMounts");
        if (jsonArrayvolumeMounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeMounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeMounts` to be an array in the JSON string but got `%s`", jsonObj.get("volumeMounts").toString()));
          }

          // validate the optional field `volumeMounts` (array)
          for (int i = 0; i < jsonArrayvolumeMounts.size(); i++) {
            V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner.validateJsonObject(jsonArrayvolumeMounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecPodInfoExtractorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecPodInfoExtractorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecPodInfoExtractorsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecPodInfoExtractorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecPodInfoExtractorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecPodInfoExtractorsInner
  */
  public static V1alpha1OpsDefinitionSpecPodInfoExtractorsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecPodInfoExtractorsInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

