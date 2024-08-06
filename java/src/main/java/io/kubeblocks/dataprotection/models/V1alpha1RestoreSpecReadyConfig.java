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


package io.kubeblocks.dataprotection.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecReadyConfigConnectionCredential;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecReadyConfigExecAction;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecReadyConfigJobAction;
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecReadyConfigReadinessProbe;
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
 * Configuration for the action of \&quot;postReady\&quot; phase.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:51.636603Z[Etc/UTC]")
public class V1alpha1RestoreSpecReadyConfig {
  public static final String SERIALIZED_NAME_CONNECTION_CREDENTIAL = "connectionCredential";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CREDENTIAL)
  private V1alpha1RestoreSpecReadyConfigConnectionCredential connectionCredential;

  public static final String SERIALIZED_NAME_EXEC_ACTION = "execAction";
  @SerializedName(SERIALIZED_NAME_EXEC_ACTION)
  private V1alpha1RestoreSpecReadyConfigExecAction execAction;

  public static final String SERIALIZED_NAME_JOB_ACTION = "jobAction";
  @SerializedName(SERIALIZED_NAME_JOB_ACTION)
  private V1alpha1RestoreSpecReadyConfigJobAction jobAction;

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";
  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  private V1alpha1RestoreSpecReadyConfigReadinessProbe readinessProbe;

  public V1alpha1RestoreSpecReadyConfig() {
  }

  public V1alpha1RestoreSpecReadyConfig connectionCredential(V1alpha1RestoreSpecReadyConfigConnectionCredential connectionCredential) {
    
    this.connectionCredential = connectionCredential;
    return this;
  }

   /**
   * Get connectionCredential
   * @return connectionCredential
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecReadyConfigConnectionCredential getConnectionCredential() {
    return connectionCredential;
  }


  public void setConnectionCredential(V1alpha1RestoreSpecReadyConfigConnectionCredential connectionCredential) {
    this.connectionCredential = connectionCredential;
  }


  public V1alpha1RestoreSpecReadyConfig execAction(V1alpha1RestoreSpecReadyConfigExecAction execAction) {
    
    this.execAction = execAction;
    return this;
  }

   /**
   * Get execAction
   * @return execAction
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecReadyConfigExecAction getExecAction() {
    return execAction;
  }


  public void setExecAction(V1alpha1RestoreSpecReadyConfigExecAction execAction) {
    this.execAction = execAction;
  }


  public V1alpha1RestoreSpecReadyConfig jobAction(V1alpha1RestoreSpecReadyConfigJobAction jobAction) {
    
    this.jobAction = jobAction;
    return this;
  }

   /**
   * Get jobAction
   * @return jobAction
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecReadyConfigJobAction getJobAction() {
    return jobAction;
  }


  public void setJobAction(V1alpha1RestoreSpecReadyConfigJobAction jobAction) {
    this.jobAction = jobAction;
  }


  public V1alpha1RestoreSpecReadyConfig readinessProbe(V1alpha1RestoreSpecReadyConfigReadinessProbe readinessProbe) {
    
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecReadyConfigReadinessProbe getReadinessProbe() {
    return readinessProbe;
  }


  public void setReadinessProbe(V1alpha1RestoreSpecReadyConfigReadinessProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RestoreSpecReadyConfig v1alpha1RestoreSpecReadyConfig = (V1alpha1RestoreSpecReadyConfig) o;
    return Objects.equals(this.connectionCredential, v1alpha1RestoreSpecReadyConfig.connectionCredential) &&
        Objects.equals(this.execAction, v1alpha1RestoreSpecReadyConfig.execAction) &&
        Objects.equals(this.jobAction, v1alpha1RestoreSpecReadyConfig.jobAction) &&
        Objects.equals(this.readinessProbe, v1alpha1RestoreSpecReadyConfig.readinessProbe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionCredential, execAction, jobAction, readinessProbe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RestoreSpecReadyConfig {\n");
    sb.append("    connectionCredential: ").append(toIndentedString(connectionCredential)).append("\n");
    sb.append("    execAction: ").append(toIndentedString(execAction)).append("\n");
    sb.append("    jobAction: ").append(toIndentedString(jobAction)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
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
    openapiFields.add("connectionCredential");
    openapiFields.add("execAction");
    openapiFields.add("jobAction");
    openapiFields.add("readinessProbe");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RestoreSpecReadyConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RestoreSpecReadyConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RestoreSpecReadyConfig is not found in the empty JSON string", V1alpha1RestoreSpecReadyConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RestoreSpecReadyConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RestoreSpecReadyConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `connectionCredential`
      if (jsonObj.get("connectionCredential") != null && !jsonObj.get("connectionCredential").isJsonNull()) {
        V1alpha1RestoreSpecReadyConfigConnectionCredential.validateJsonObject(jsonObj.getAsJsonObject("connectionCredential"));
      }
      // validate the optional field `execAction`
      if (jsonObj.get("execAction") != null && !jsonObj.get("execAction").isJsonNull()) {
        V1alpha1RestoreSpecReadyConfigExecAction.validateJsonObject(jsonObj.getAsJsonObject("execAction"));
      }
      // validate the optional field `jobAction`
      if (jsonObj.get("jobAction") != null && !jsonObj.get("jobAction").isJsonNull()) {
        V1alpha1RestoreSpecReadyConfigJobAction.validateJsonObject(jsonObj.getAsJsonObject("jobAction"));
      }
      // validate the optional field `readinessProbe`
      if (jsonObj.get("readinessProbe") != null && !jsonObj.get("readinessProbe").isJsonNull()) {
        V1alpha1RestoreSpecReadyConfigReadinessProbe.validateJsonObject(jsonObj.getAsJsonObject("readinessProbe"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RestoreSpecReadyConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RestoreSpecReadyConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RestoreSpecReadyConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RestoreSpecReadyConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RestoreSpecReadyConfig>() {
           @Override
           public void write(JsonWriter out, V1alpha1RestoreSpecReadyConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RestoreSpecReadyConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RestoreSpecReadyConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RestoreSpecReadyConfig
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RestoreSpecReadyConfig
  */
  public static V1alpha1RestoreSpecReadyConfig fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1RestoreSpecReadyConfig.class);
  }

 /**
  * Convert an instance of V1alpha1RestoreSpecReadyConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
