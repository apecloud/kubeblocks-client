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
 * cluster backup configuration.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterSpecBackup {
  public static final String SERIALIZED_NAME_CRON_EXPRESSION = "cronExpression";
  @SerializedName(SERIALIZED_NAME_CRON_EXPRESSION)
  private String cronExpression;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PITR_ENABLED = "pitrEnabled";
  @SerializedName(SERIALIZED_NAME_PITR_ENABLED)
  private Boolean pitrEnabled;

  public static final String SERIALIZED_NAME_REPO_NAME = "repoName";
  @SerializedName(SERIALIZED_NAME_REPO_NAME)
  private String repoName;

  public static final String SERIALIZED_NAME_RETENTION_PERIOD = "retentionPeriod";
  @SerializedName(SERIALIZED_NAME_RETENTION_PERIOD)
  private String retentionPeriod;

  public static final String SERIALIZED_NAME_STARTING_DEADLINE_MINUTES = "startingDeadlineMinutes";
  @SerializedName(SERIALIZED_NAME_STARTING_DEADLINE_MINUTES)
  private Long startingDeadlineMinutes;

  public V1alpha1ClusterSpecBackup() {
  }

  public V1alpha1ClusterSpecBackup cronExpression(String cronExpression) {
    
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * the cron expression for schedule, the timezone is in UTC. see https://en.wikipedia.org/wiki/Cron.
   * @return cronExpression
  **/
  @jakarta.annotation.Nullable
  public String getCronExpression() {
    return cronExpression;
  }


  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }


  public V1alpha1ClusterSpecBackup enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * enabled defines whether to enable automated backup.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public V1alpha1ClusterSpecBackup method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * backup method name to use, that is defined in backupPolicy.
   * @return method
  **/
  @jakarta.annotation.Nullable
  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public V1alpha1ClusterSpecBackup pitrEnabled(Boolean pitrEnabled) {
    
    this.pitrEnabled = pitrEnabled;
    return this;
  }

   /**
   * pitrEnabled defines whether to enable point-in-time recovery.
   * @return pitrEnabled
  **/
  @jakarta.annotation.Nullable
  public Boolean getPitrEnabled() {
    return pitrEnabled;
  }


  public void setPitrEnabled(Boolean pitrEnabled) {
    this.pitrEnabled = pitrEnabled;
  }


  public V1alpha1ClusterSpecBackup repoName(String repoName) {
    
    this.repoName = repoName;
    return this;
  }

   /**
   * repoName is the name of the backupRepo, if not set, will use the default backupRepo.
   * @return repoName
  **/
  @jakarta.annotation.Nullable
  public String getRepoName() {
    return repoName;
  }


  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }


  public V1alpha1ClusterSpecBackup retentionPeriod(String retentionPeriod) {
    
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


  public V1alpha1ClusterSpecBackup startingDeadlineMinutes(Long startingDeadlineMinutes) {
    
    this.startingDeadlineMinutes = startingDeadlineMinutes;
    return this;
  }

   /**
   * startingDeadlineMinutes defines the deadline in minutes for starting the backup job if it misses scheduled time for any reason.
   * minimum: 0
   * maximum: 1440
   * @return startingDeadlineMinutes
  **/
  @jakarta.annotation.Nullable
  public Long getStartingDeadlineMinutes() {
    return startingDeadlineMinutes;
  }


  public void setStartingDeadlineMinutes(Long startingDeadlineMinutes) {
    this.startingDeadlineMinutes = startingDeadlineMinutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecBackup v1alpha1ClusterSpecBackup = (V1alpha1ClusterSpecBackup) o;
    return Objects.equals(this.cronExpression, v1alpha1ClusterSpecBackup.cronExpression) &&
        Objects.equals(this.enabled, v1alpha1ClusterSpecBackup.enabled) &&
        Objects.equals(this.method, v1alpha1ClusterSpecBackup.method) &&
        Objects.equals(this.pitrEnabled, v1alpha1ClusterSpecBackup.pitrEnabled) &&
        Objects.equals(this.repoName, v1alpha1ClusterSpecBackup.repoName) &&
        Objects.equals(this.retentionPeriod, v1alpha1ClusterSpecBackup.retentionPeriod) &&
        Objects.equals(this.startingDeadlineMinutes, v1alpha1ClusterSpecBackup.startingDeadlineMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, enabled, method, pitrEnabled, repoName, retentionPeriod, startingDeadlineMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecBackup {\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    pitrEnabled: ").append(toIndentedString(pitrEnabled)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
    sb.append("    startingDeadlineMinutes: ").append(toIndentedString(startingDeadlineMinutes)).append("\n");
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
    openapiFields.add("cronExpression");
    openapiFields.add("enabled");
    openapiFields.add("method");
    openapiFields.add("pitrEnabled");
    openapiFields.add("repoName");
    openapiFields.add("retentionPeriod");
    openapiFields.add("startingDeadlineMinutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecBackup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecBackup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecBackup is not found in the empty JSON string", V1alpha1ClusterSpecBackup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecBackup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecBackup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cronExpression") != null && !jsonObj.get("cronExpression").isJsonNull()) && !jsonObj.get("cronExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cronExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cronExpression").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("repoName") != null && !jsonObj.get("repoName").isJsonNull()) && !jsonObj.get("repoName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repoName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repoName").toString()));
      }
      if ((jsonObj.get("retentionPeriod") != null && !jsonObj.get("retentionPeriod").isJsonNull()) && !jsonObj.get("retentionPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retentionPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retentionPeriod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecBackup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecBackup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecBackup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecBackup.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecBackup>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecBackup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecBackup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecBackup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecBackup
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecBackup
  */
  public static V1alpha1ClusterSpecBackup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterSpecBackup.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecBackup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

