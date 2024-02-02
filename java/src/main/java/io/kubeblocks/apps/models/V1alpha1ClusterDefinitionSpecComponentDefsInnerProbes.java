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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbe;
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRunningProbe;
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesStatusProbe;
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
 * probes setting for healthy checks.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes {
  public static final String SERIALIZED_NAME_ROLE_PROBE = "roleProbe";
  @SerializedName(SERIALIZED_NAME_ROLE_PROBE)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbe roleProbe;

  public static final String SERIALIZED_NAME_ROLE_PROBE_TIMEOUT_AFTER_PODS_READY = "roleProbeTimeoutAfterPodsReady";
  @SerializedName(SERIALIZED_NAME_ROLE_PROBE_TIMEOUT_AFTER_PODS_READY)
  private Integer roleProbeTimeoutAfterPodsReady;

  public static final String SERIALIZED_NAME_RUNNING_PROBE = "runningProbe";
  @SerializedName(SERIALIZED_NAME_RUNNING_PROBE)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRunningProbe runningProbe;

  public static final String SERIALIZED_NAME_STATUS_PROBE = "statusProbe";
  @SerializedName(SERIALIZED_NAME_STATUS_PROBE)
  private V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesStatusProbe statusProbe;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes roleProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbe roleProbe) {
    
    this.roleProbe = roleProbe;
    return this;
  }

   /**
   * Get roleProbe
   * @return roleProbe
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbe getRoleProbe() {
    return roleProbe;
  }


  public void setRoleProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbe roleProbe) {
    this.roleProbe = roleProbe;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes roleProbeTimeoutAfterPodsReady(Integer roleProbeTimeoutAfterPodsReady) {
    
    this.roleProbeTimeoutAfterPodsReady = roleProbeTimeoutAfterPodsReady;
    return this;
  }

   /**
   * roleProbeTimeoutAfterPodsReady(in seconds), when all pods of the component are ready, it will detect whether the application is available in the pod. if pods exceed the InitializationTimeoutSeconds time without a role label, this component will enter the Failed/Abnormal phase. Note that this configuration will only take effect if the component supports RoleProbe and will not affect the life cycle of the pod. default values are 60 seconds.
   * minimum: 30
   * @return roleProbeTimeoutAfterPodsReady
  **/
  @jakarta.annotation.Nullable
  public Integer getRoleProbeTimeoutAfterPodsReady() {
    return roleProbeTimeoutAfterPodsReady;
  }


  public void setRoleProbeTimeoutAfterPodsReady(Integer roleProbeTimeoutAfterPodsReady) {
    this.roleProbeTimeoutAfterPodsReady = roleProbeTimeoutAfterPodsReady;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes runningProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRunningProbe runningProbe) {
    
    this.runningProbe = runningProbe;
    return this;
  }

   /**
   * Get runningProbe
   * @return runningProbe
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRunningProbe getRunningProbe() {
    return runningProbe;
  }


  public void setRunningProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRunningProbe runningProbe) {
    this.runningProbe = runningProbe;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes statusProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesStatusProbe statusProbe) {
    
    this.statusProbe = statusProbe;
    return this;
  }

   /**
   * Get statusProbe
   * @return statusProbe
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesStatusProbe getStatusProbe() {
    return statusProbe;
  }


  public void setStatusProbe(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesStatusProbe statusProbe) {
    this.statusProbe = statusProbe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes v1alpha1ClusterDefinitionSpecComponentDefsInnerProbes = (V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes) o;
    return Objects.equals(this.roleProbe, v1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.roleProbe) &&
        Objects.equals(this.roleProbeTimeoutAfterPodsReady, v1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.roleProbeTimeoutAfterPodsReady) &&
        Objects.equals(this.runningProbe, v1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.runningProbe) &&
        Objects.equals(this.statusProbe, v1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.statusProbe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleProbe, roleProbeTimeoutAfterPodsReady, runningProbe, statusProbe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes {\n");
    sb.append("    roleProbe: ").append(toIndentedString(roleProbe)).append("\n");
    sb.append("    roleProbeTimeoutAfterPodsReady: ").append(toIndentedString(roleProbeTimeoutAfterPodsReady)).append("\n");
    sb.append("    runningProbe: ").append(toIndentedString(runningProbe)).append("\n");
    sb.append("    statusProbe: ").append(toIndentedString(statusProbe)).append("\n");
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
    openapiFields.add("roleProbe");
    openapiFields.add("roleProbeTimeoutAfterPodsReady");
    openapiFields.add("runningProbe");
    openapiFields.add("statusProbe");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `roleProbe`
      if (jsonObj.get("roleProbe") != null && !jsonObj.get("roleProbe").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbe.validateJsonObject(jsonObj.getAsJsonObject("roleProbe"));
      }
      // validate the optional field `runningProbe`
      if (jsonObj.get("runningProbe") != null && !jsonObj.get("runningProbe").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRunningProbe.validateJsonObject(jsonObj.getAsJsonObject("runningProbe"));
      }
      // validate the optional field `statusProbe`
      if (jsonObj.get("statusProbe") != null && !jsonObj.get("statusProbe").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesStatusProbe.validateJsonObject(jsonObj.getAsJsonObject("statusProbe"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerProbes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

