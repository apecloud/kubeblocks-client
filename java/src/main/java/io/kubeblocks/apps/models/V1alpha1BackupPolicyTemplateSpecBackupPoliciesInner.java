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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner;
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner;
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerTarget;
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
 * V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner {
  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_BACKUP_METHODS = "backupMethods";
  @SerializedName(SERIALIZED_NAME_BACKUP_METHODS)
  private List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner> backupMethods = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPONENT_DEF_REF = "componentDefRef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF_REF)
  private String componentDefRef;

  public static final String SERIALIZED_NAME_COMPONENT_DEFS = "componentDefs";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEFS)
  private List<String> componentDefs;

  public static final String SERIALIZED_NAME_SCHEDULES = "schedules";
  @SerializedName(SERIALIZED_NAME_SCHEDULES)
  private List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner> schedules;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerTarget target;

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner() {
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner backoffLimit(Integer backoffLimit) {
    
    this.backoffLimit = backoffLimit;
    return this;
  }

   /**
   * Specifies the number of retries before marking the backup as failed.
   * minimum: 0
   * maximum: 10
   * @return backoffLimit
  **/
  @jakarta.annotation.Nullable
  public Integer getBackoffLimit() {
    return backoffLimit;
  }


  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner backupMethods(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner> backupMethods) {
    
    this.backupMethods = backupMethods;
    return this;
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner addBackupMethodsItem(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner backupMethodsItem) {
    if (this.backupMethods == null) {
      this.backupMethods = new ArrayList<>();
    }
    this.backupMethods.add(backupMethodsItem);
    return this;
  }

   /**
   * Define the methods to be used for backups.
   * @return backupMethods
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner> getBackupMethods() {
    return backupMethods;
  }


  public void setBackupMethods(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner> backupMethods) {
    this.backupMethods = backupMethods;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner componentDefRef(String componentDefRef) {
    
    this.componentDefRef = componentDefRef;
    return this;
  }

   /**
   * References a componentDef defined in the ClusterDefinition spec. Must comply with the IANA Service Naming rule.
   * @return componentDefRef
  **/
  @jakarta.annotation.Nullable
  public String getComponentDefRef() {
    return componentDefRef;
  }


  public void setComponentDefRef(String componentDefRef) {
    this.componentDefRef = componentDefRef;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner componentDefs(List<String> componentDefs) {
    
    this.componentDefs = componentDefs;
    return this;
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner addComponentDefsItem(String componentDefsItem) {
    if (this.componentDefs == null) {
      this.componentDefs = new ArrayList<>();
    }
    this.componentDefs.add(componentDefsItem);
    return this;
  }

   /**
   * References to componentDefinitions. Must comply with the IANA Service Naming rule.
   * @return componentDefs
  **/
  @jakarta.annotation.Nullable
  public List<String> getComponentDefs() {
    return componentDefs;
  }


  public void setComponentDefs(List<String> componentDefs) {
    this.componentDefs = componentDefs;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner schedules(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner> schedules) {
    
    this.schedules = schedules;
    return this;
  }

  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner addSchedulesItem(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

   /**
   * Define the policy for backup scheduling.
   * @return schedules
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner> getSchedules() {
    return schedules;
  }


  public void setSchedules(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner> schedules) {
    this.schedules = schedules;
  }


  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner target(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @jakarta.annotation.Nullable
  public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerTarget getTarget() {
    return target;
  }


  public void setTarget(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerTarget target) {
    this.target = target;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner = (V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner) o;
    return Objects.equals(this.backoffLimit, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.backoffLimit) &&
        Objects.equals(this.backupMethods, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.backupMethods) &&
        Objects.equals(this.componentDefRef, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.componentDefRef) &&
        Objects.equals(this.componentDefs, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.componentDefs) &&
        Objects.equals(this.schedules, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.schedules) &&
        Objects.equals(this.target, v1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoffLimit, backupMethods, componentDefRef, componentDefs, schedules, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner {\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    backupMethods: ").append(toIndentedString(backupMethods)).append("\n");
    sb.append("    componentDefRef: ").append(toIndentedString(componentDefRef)).append("\n");
    sb.append("    componentDefs: ").append(toIndentedString(componentDefs)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
    openapiFields.add("backoffLimit");
    openapiFields.add("backupMethods");
    openapiFields.add("componentDefRef");
    openapiFields.add("componentDefs");
    openapiFields.add("schedules");
    openapiFields.add("target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("backupMethods");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner is not found in the empty JSON string", V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("backupMethods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupMethods` to be an array in the JSON string but got `%s`", jsonObj.get("backupMethods").toString()));
      }

      JsonArray jsonArraybackupMethods = jsonObj.getAsJsonArray("backupMethods");
      // validate the required field `backupMethods` (array)
      for (int i = 0; i < jsonArraybackupMethods.size(); i++) {
        V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInner.validateJsonObject(jsonArraybackupMethods.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("componentDefRef") != null && !jsonObj.get("componentDefRef").isJsonNull()) && !jsonObj.get("componentDefRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentDefRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentDefRef").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("componentDefs") != null && !jsonObj.get("componentDefs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentDefs` to be an array in the JSON string but got `%s`", jsonObj.get("componentDefs").toString()));
      }
      if (jsonObj.get("schedules") != null && !jsonObj.get("schedules").isJsonNull()) {
        JsonArray jsonArrayschedules = jsonObj.getAsJsonArray("schedules");
        if (jsonArrayschedules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("schedules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `schedules` to be an array in the JSON string but got `%s`", jsonObj.get("schedules").toString()));
          }

          // validate the optional field `schedules` (array)
          for (int i = 0; i < jsonArrayschedules.size(); i++) {
            V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerSchedulesInner.validateJsonObject(jsonArrayschedules.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `target`
      if (jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) {
        V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerTarget.validateJsonObject(jsonObj.getAsJsonObject("target"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner
  */
  public static V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner.class);
  }

 /**
  * Convert an instance of V1alpha1BackupPolicyTemplateSpecBackupPoliciesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

