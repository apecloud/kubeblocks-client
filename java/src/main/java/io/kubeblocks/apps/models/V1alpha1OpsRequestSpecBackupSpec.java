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
 * Defines how to backup the cluster.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecBackupSpec {
  public static final String SERIALIZED_NAME_BACKUP_METHOD = "backupMethod";
  @SerializedName(SERIALIZED_NAME_BACKUP_METHOD)
  private String backupMethod;

  public static final String SERIALIZED_NAME_BACKUP_NAME = "backupName";
  @SerializedName(SERIALIZED_NAME_BACKUP_NAME)
  private String backupName;

  public static final String SERIALIZED_NAME_BACKUP_POLICY_NAME = "backupPolicyName";
  @SerializedName(SERIALIZED_NAME_BACKUP_POLICY_NAME)
  private String backupPolicyName;

  /**
   * Determines whether the backup contents stored in backup repository should be deleted when the backup custom resource is deleted. Supported values are &#x60;Retain&#x60; and &#x60;Delete&#x60;. - &#x60;Retain&#x60; means that the backup content and its physical snapshot on backup repository are kept. - &#x60;Delete&#x60; means that the backup content and its physical snapshot on backup repository are deleted.
   */
  @JsonAdapter(DeletionPolicyEnum.Adapter.class)
  public enum DeletionPolicyEnum {
    DELETE("Delete"),
    
    RETAIN("Retain");

    private String value;

    DeletionPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeletionPolicyEnum fromValue(String value) {
      for (DeletionPolicyEnum b : DeletionPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeletionPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeletionPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeletionPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeletionPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELETION_POLICY = "deletionPolicy";
  @SerializedName(SERIALIZED_NAME_DELETION_POLICY)
  private DeletionPolicyEnum deletionPolicy;

  public static final String SERIALIZED_NAME_PARENT_BACKUP_NAME = "parentBackupName";
  @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_NAME)
  private String parentBackupName;

  public static final String SERIALIZED_NAME_RETENTION_PERIOD = "retentionPeriod";
  @SerializedName(SERIALIZED_NAME_RETENTION_PERIOD)
  private String retentionPeriod;

  public V1alpha1OpsRequestSpecBackupSpec() {
  }

  public V1alpha1OpsRequestSpecBackupSpec backupMethod(String backupMethod) {
    
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * Defines the backup method that is defined in backupPolicy.
   * @return backupMethod
  **/
  @jakarta.annotation.Nullable
  public String getBackupMethod() {
    return backupMethod;
  }


  public void setBackupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
  }


  public V1alpha1OpsRequestSpecBackupSpec backupName(String backupName) {
    
    this.backupName = backupName;
    return this;
  }

   /**
   * Specifies the name of the backup.
   * @return backupName
  **/
  @jakarta.annotation.Nullable
  public String getBackupName() {
    return backupName;
  }


  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }


  public V1alpha1OpsRequestSpecBackupSpec backupPolicyName(String backupPolicyName) {
    
    this.backupPolicyName = backupPolicyName;
    return this;
  }

   /**
   * Indicates the backupPolicy applied to perform this backup.
   * @return backupPolicyName
  **/
  @jakarta.annotation.Nullable
  public String getBackupPolicyName() {
    return backupPolicyName;
  }


  public void setBackupPolicyName(String backupPolicyName) {
    this.backupPolicyName = backupPolicyName;
  }


  public V1alpha1OpsRequestSpecBackupSpec deletionPolicy(DeletionPolicyEnum deletionPolicy) {
    
    this.deletionPolicy = deletionPolicy;
    return this;
  }

   /**
   * Determines whether the backup contents stored in backup repository should be deleted when the backup custom resource is deleted. Supported values are &#x60;Retain&#x60; and &#x60;Delete&#x60;. - &#x60;Retain&#x60; means that the backup content and its physical snapshot on backup repository are kept. - &#x60;Delete&#x60; means that the backup content and its physical snapshot on backup repository are deleted.
   * @return deletionPolicy
  **/
  @jakarta.annotation.Nullable
  public DeletionPolicyEnum getDeletionPolicy() {
    return deletionPolicy;
  }


  public void setDeletionPolicy(DeletionPolicyEnum deletionPolicy) {
    this.deletionPolicy = deletionPolicy;
  }


  public V1alpha1OpsRequestSpecBackupSpec parentBackupName(String parentBackupName) {
    
    this.parentBackupName = parentBackupName;
    return this;
  }

   /**
   * If backupType is incremental, parentBackupName is required.
   * @return parentBackupName
  **/
  @jakarta.annotation.Nullable
  public String getParentBackupName() {
    return parentBackupName;
  }


  public void setParentBackupName(String parentBackupName) {
    this.parentBackupName = parentBackupName;
  }


  public V1alpha1OpsRequestSpecBackupSpec retentionPeriod(String retentionPeriod) {
    
    this.retentionPeriod = retentionPeriod;
    return this;
  }

   /**
   * Determines a duration up to which the backup should be kept. Controller will remove all backups that are older than the RetentionPeriod. For example, RetentionPeriod of &#x60;30d&#x60; will keep only the backups of last 30 days. Sample duration format:   - years: 2y - months: 6mo - days: 30d - hours: 12h - minutes: 30m   You can also combine the above durations. For example: 30d12h30m. If not set, the backup will be kept forever.
   * @return retentionPeriod
  **/
  @jakarta.annotation.Nullable
  public String getRetentionPeriod() {
    return retentionPeriod;
  }


  public void setRetentionPeriod(String retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecBackupSpec v1alpha1OpsRequestSpecBackupSpec = (V1alpha1OpsRequestSpecBackupSpec) o;
    return Objects.equals(this.backupMethod, v1alpha1OpsRequestSpecBackupSpec.backupMethod) &&
        Objects.equals(this.backupName, v1alpha1OpsRequestSpecBackupSpec.backupName) &&
        Objects.equals(this.backupPolicyName, v1alpha1OpsRequestSpecBackupSpec.backupPolicyName) &&
        Objects.equals(this.deletionPolicy, v1alpha1OpsRequestSpecBackupSpec.deletionPolicy) &&
        Objects.equals(this.parentBackupName, v1alpha1OpsRequestSpecBackupSpec.parentBackupName) &&
        Objects.equals(this.retentionPeriod, v1alpha1OpsRequestSpecBackupSpec.retentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupMethod, backupName, backupPolicyName, deletionPolicy, parentBackupName, retentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecBackupSpec {\n");
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupPolicyName: ").append(toIndentedString(backupPolicyName)).append("\n");
    sb.append("    deletionPolicy: ").append(toIndentedString(deletionPolicy)).append("\n");
    sb.append("    parentBackupName: ").append(toIndentedString(parentBackupName)).append("\n");
    sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
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
    openapiFields.add("backupMethod");
    openapiFields.add("backupName");
    openapiFields.add("backupPolicyName");
    openapiFields.add("deletionPolicy");
    openapiFields.add("parentBackupName");
    openapiFields.add("retentionPeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecBackupSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecBackupSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecBackupSpec is not found in the empty JSON string", V1alpha1OpsRequestSpecBackupSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecBackupSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecBackupSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("backupMethod") != null && !jsonObj.get("backupMethod").isJsonNull()) && !jsonObj.get("backupMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupMethod").toString()));
      }
      if ((jsonObj.get("backupName") != null && !jsonObj.get("backupName").isJsonNull()) && !jsonObj.get("backupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupName").toString()));
      }
      if ((jsonObj.get("backupPolicyName") != null && !jsonObj.get("backupPolicyName").isJsonNull()) && !jsonObj.get("backupPolicyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupPolicyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupPolicyName").toString()));
      }
      if ((jsonObj.get("deletionPolicy") != null && !jsonObj.get("deletionPolicy").isJsonNull()) && !jsonObj.get("deletionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deletionPolicy").toString()));
      }
      if ((jsonObj.get("parentBackupName") != null && !jsonObj.get("parentBackupName").isJsonNull()) && !jsonObj.get("parentBackupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentBackupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentBackupName").toString()));
      }
      if ((jsonObj.get("retentionPeriod") != null && !jsonObj.get("retentionPeriod").isJsonNull()) && !jsonObj.get("retentionPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retentionPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retentionPeriod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecBackupSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecBackupSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecBackupSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecBackupSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecBackupSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecBackupSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecBackupSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecBackupSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecBackupSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecBackupSpec
  */
  public static V1alpha1OpsRequestSpecBackupSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecBackupSpec.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecBackupSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

