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
 * V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner {
  public static final String SERIALIZED_NAME_BACKUP_METHOD = "backupMethod";
  @SerializedName(SERIALIZED_NAME_BACKUP_METHOD)
  private String backupMethod;

  public static final String SERIALIZED_NAME_CRON_EXPRESSION = "cronExpression";
  @SerializedName(SERIALIZED_NAME_CRON_EXPRESSION)
  private String cronExpression;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_RETENTION_PERIOD = "retentionPeriod";
  @SerializedName(SERIALIZED_NAME_RETENTION_PERIOD)
  private String retentionPeriod;

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner() {
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner backupMethod(String backupMethod) {
    
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * backupMethod specifies the backup method name that is defined in backupPolicy.
   * @return backupMethod
  **/
  @jakarta.annotation.Nonnull
  public String getBackupMethod() {
    return backupMethod;
  }


  public void setBackupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner cronExpression(String cronExpression) {
    
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * the cron expression for schedule, the timezone is in UTC. see https://en.wikipedia.org/wiki/Cron.
   * @return cronExpression
  **/
  @jakarta.annotation.Nonnull
  public String getCronExpression() {
    return cronExpression;
  }


  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * enabled specifies whether the backup schedule is enabled or not.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner retentionPeriod(String retentionPeriod) {
    
    this.retentionPeriod = retentionPeriod;
    return this;
  }

   /**
   * retentionPeriod determines a duration up to which the backup should be kept. controller will remove all backups that are older than the RetentionPeriod. For example, RetentionPeriod of &#x60;30d&#x60; will keep only the backups of last 30 days. Sample duration format: - years:  2y - months:  6mo - days:   30d - hours:  12h - minutes:  30m You can also combine the above durations. For example: 30d12h30m
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
    V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner = (V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner) o;
    return Objects.equals(this.backupMethod, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.backupMethod) &&
        Objects.equals(this.cronExpression, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.cronExpression) &&
        Objects.equals(this.enabled, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.enabled) &&
        Objects.equals(this.retentionPeriod, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.retentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupMethod, cronExpression, enabled, retentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner {\n");
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("cronExpression");
    openapiFields.add("enabled");
    openapiFields.add("retentionPeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("backupMethod");
    openapiRequiredFields.add("cronExpression");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner is not found in the empty JSON string", V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("backupMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupMethod").toString()));
      }
      if (!jsonObj.get("cronExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cronExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cronExpression").toString()));
      }
      if ((jsonObj.get("retentionPeriod") != null && !jsonObj.get("retentionPeriod").isJsonNull()) && !jsonObj.get("retentionPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retentionPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retentionPeriod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner
  */
  public static V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.class);
  }

 /**
  * Convert an instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

