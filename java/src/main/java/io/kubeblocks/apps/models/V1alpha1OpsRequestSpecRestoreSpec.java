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
 * restoreSpec defines how to restore the cluster.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecRestoreSpec {
  public static final String SERIALIZED_NAME_BACKUP_NAME = "backupName";
  @SerializedName(SERIALIZED_NAME_BACKUP_NAME)
  private String backupName;

  public static final String SERIALIZED_NAME_EFFECTIVE_COMMON_COMPONENT_DEF = "effectiveCommonComponentDef";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_COMMON_COMPONENT_DEF)
  private Boolean effectiveCommonComponentDef;

  public static final String SERIALIZED_NAME_RESTORE_TIME_STR = "restoreTimeStr";
  @SerializedName(SERIALIZED_NAME_RESTORE_TIME_STR)
  private String restoreTimeStr;

  /**
   * the volume claim restore policy, support values: [Serial, Parallel]
   */
  @JsonAdapter(VolumeRestorePolicyEnum.Adapter.class)
  public enum VolumeRestorePolicyEnum {
    SERIAL("Serial"),
    
    PARALLEL("Parallel");

    private String value;

    VolumeRestorePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VolumeRestorePolicyEnum fromValue(String value) {
      for (VolumeRestorePolicyEnum b : VolumeRestorePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VolumeRestorePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VolumeRestorePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VolumeRestorePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VolumeRestorePolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VOLUME_RESTORE_POLICY = "volumeRestorePolicy";
  @SerializedName(SERIALIZED_NAME_VOLUME_RESTORE_POLICY)
  private VolumeRestorePolicyEnum volumeRestorePolicy;

  public V1alpha1OpsRequestSpecRestoreSpec() {
  }

  public V1alpha1OpsRequestSpecRestoreSpec backupName(String backupName) {
    
    this.backupName = backupName;
    return this;
  }

   /**
   * backupName is the name of the backup.
   * @return backupName
  **/
  @jakarta.annotation.Nonnull
  public String getBackupName() {
    return backupName;
  }


  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }


  public V1alpha1OpsRequestSpecRestoreSpec effectiveCommonComponentDef(Boolean effectiveCommonComponentDef) {
    
    this.effectiveCommonComponentDef = effectiveCommonComponentDef;
    return this;
  }

   /**
   * effectiveCommonComponentDef describes this backup will be restored for all components which refer to common ComponentDefinition.
   * @return effectiveCommonComponentDef
  **/
  @jakarta.annotation.Nullable
  public Boolean getEffectiveCommonComponentDef() {
    return effectiveCommonComponentDef;
  }


  public void setEffectiveCommonComponentDef(Boolean effectiveCommonComponentDef) {
    this.effectiveCommonComponentDef = effectiveCommonComponentDef;
  }


  public V1alpha1OpsRequestSpecRestoreSpec restoreTimeStr(String restoreTimeStr) {
    
    this.restoreTimeStr = restoreTimeStr;
    return this;
  }

   /**
   * restoreTime point in time to restore
   * @return restoreTimeStr
  **/
  @jakarta.annotation.Nullable
  public String getRestoreTimeStr() {
    return restoreTimeStr;
  }


  public void setRestoreTimeStr(String restoreTimeStr) {
    this.restoreTimeStr = restoreTimeStr;
  }


  public V1alpha1OpsRequestSpecRestoreSpec volumeRestorePolicy(VolumeRestorePolicyEnum volumeRestorePolicy) {
    
    this.volumeRestorePolicy = volumeRestorePolicy;
    return this;
  }

   /**
   * the volume claim restore policy, support values: [Serial, Parallel]
   * @return volumeRestorePolicy
  **/
  @jakarta.annotation.Nullable
  public VolumeRestorePolicyEnum getVolumeRestorePolicy() {
    return volumeRestorePolicy;
  }


  public void setVolumeRestorePolicy(VolumeRestorePolicyEnum volumeRestorePolicy) {
    this.volumeRestorePolicy = volumeRestorePolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecRestoreSpec v1alpha1OpsRequestSpecRestoreSpec = (V1alpha1OpsRequestSpecRestoreSpec) o;
    return Objects.equals(this.backupName, v1alpha1OpsRequestSpecRestoreSpec.backupName) &&
        Objects.equals(this.effectiveCommonComponentDef, v1alpha1OpsRequestSpecRestoreSpec.effectiveCommonComponentDef) &&
        Objects.equals(this.restoreTimeStr, v1alpha1OpsRequestSpecRestoreSpec.restoreTimeStr) &&
        Objects.equals(this.volumeRestorePolicy, v1alpha1OpsRequestSpecRestoreSpec.volumeRestorePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, effectiveCommonComponentDef, restoreTimeStr, volumeRestorePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecRestoreSpec {\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    effectiveCommonComponentDef: ").append(toIndentedString(effectiveCommonComponentDef)).append("\n");
    sb.append("    restoreTimeStr: ").append(toIndentedString(restoreTimeStr)).append("\n");
    sb.append("    volumeRestorePolicy: ").append(toIndentedString(volumeRestorePolicy)).append("\n");
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
    openapiFields.add("backupName");
    openapiFields.add("effectiveCommonComponentDef");
    openapiFields.add("restoreTimeStr");
    openapiFields.add("volumeRestorePolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("backupName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecRestoreSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecRestoreSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecRestoreSpec is not found in the empty JSON string", V1alpha1OpsRequestSpecRestoreSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecRestoreSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecRestoreSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecRestoreSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("backupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupName").toString()));
      }
      if ((jsonObj.get("restoreTimeStr") != null && !jsonObj.get("restoreTimeStr").isJsonNull()) && !jsonObj.get("restoreTimeStr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restoreTimeStr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restoreTimeStr").toString()));
      }
      if ((jsonObj.get("volumeRestorePolicy") != null && !jsonObj.get("volumeRestorePolicy").isJsonNull()) && !jsonObj.get("volumeRestorePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeRestorePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeRestorePolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecRestoreSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecRestoreSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecRestoreSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecRestoreSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecRestoreSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecRestoreSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecRestoreSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecRestoreSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecRestoreSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecRestoreSpec
  */
  public static V1alpha1OpsRequestSpecRestoreSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecRestoreSpec.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecRestoreSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

