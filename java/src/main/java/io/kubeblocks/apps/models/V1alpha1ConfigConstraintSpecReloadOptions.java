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
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecReloadOptionsAutoTrigger;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecReloadOptionsShellTrigger;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecReloadOptionsTplScriptTrigger;
import io.kubeblocks.apps.models.V1alpha1ConfigConstraintSpecReloadOptionsUnixSignalTrigger;
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
 * Specifies the dynamic reload action supported by the engine. When set, the controller executes the method defined here to execute hot parameter updates.   Dynamic reloading is triggered only if both of the following conditions are met:   1. The modified parameters are listed in the &#x60;dynamicParameters&#x60; field. If &#x60;reloadStaticParamsBeforeRestart&#x60; is set to true, modifications to &#x60;staticParameters&#x60; can also trigger a reload. 2. &#x60;reloadOptions&#x60; is set.   If &#x60;reloadOptions&#x60; is not set or the modified parameters are not listed in &#x60;dynamicParameters&#x60;, dynamic reloading will not be triggered.   Example: &#x60;&#x60;&#x60;yaml reloadOptions: tplScriptTrigger: namespace: kb-system scriptConfigMapRef: mysql-reload-script sync: true &#x60;&#x60;&#x60;
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpecReloadOptions {
  public static final String SERIALIZED_NAME_AUTO_TRIGGER = "autoTrigger";
  @SerializedName(SERIALIZED_NAME_AUTO_TRIGGER)
  private V1alpha1ConfigConstraintSpecReloadOptionsAutoTrigger autoTrigger;

  public static final String SERIALIZED_NAME_SHELL_TRIGGER = "shellTrigger";
  @SerializedName(SERIALIZED_NAME_SHELL_TRIGGER)
  private V1alpha1ConfigConstraintSpecReloadOptionsShellTrigger shellTrigger;

  public static final String SERIALIZED_NAME_TPL_SCRIPT_TRIGGER = "tplScriptTrigger";
  @SerializedName(SERIALIZED_NAME_TPL_SCRIPT_TRIGGER)
  private V1alpha1ConfigConstraintSpecReloadOptionsTplScriptTrigger tplScriptTrigger;

  public static final String SERIALIZED_NAME_UNIX_SIGNAL_TRIGGER = "unixSignalTrigger";
  @SerializedName(SERIALIZED_NAME_UNIX_SIGNAL_TRIGGER)
  private V1alpha1ConfigConstraintSpecReloadOptionsUnixSignalTrigger unixSignalTrigger;

  public V1alpha1ConfigConstraintSpecReloadOptions() {
  }

  public V1alpha1ConfigConstraintSpecReloadOptions autoTrigger(V1alpha1ConfigConstraintSpecReloadOptionsAutoTrigger autoTrigger) {
    
    this.autoTrigger = autoTrigger;
    return this;
  }

   /**
   * Get autoTrigger
   * @return autoTrigger
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecReloadOptionsAutoTrigger getAutoTrigger() {
    return autoTrigger;
  }


  public void setAutoTrigger(V1alpha1ConfigConstraintSpecReloadOptionsAutoTrigger autoTrigger) {
    this.autoTrigger = autoTrigger;
  }


  public V1alpha1ConfigConstraintSpecReloadOptions shellTrigger(V1alpha1ConfigConstraintSpecReloadOptionsShellTrigger shellTrigger) {
    
    this.shellTrigger = shellTrigger;
    return this;
  }

   /**
   * Get shellTrigger
   * @return shellTrigger
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecReloadOptionsShellTrigger getShellTrigger() {
    return shellTrigger;
  }


  public void setShellTrigger(V1alpha1ConfigConstraintSpecReloadOptionsShellTrigger shellTrigger) {
    this.shellTrigger = shellTrigger;
  }


  public V1alpha1ConfigConstraintSpecReloadOptions tplScriptTrigger(V1alpha1ConfigConstraintSpecReloadOptionsTplScriptTrigger tplScriptTrigger) {
    
    this.tplScriptTrigger = tplScriptTrigger;
    return this;
  }

   /**
   * Get tplScriptTrigger
   * @return tplScriptTrigger
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecReloadOptionsTplScriptTrigger getTplScriptTrigger() {
    return tplScriptTrigger;
  }


  public void setTplScriptTrigger(V1alpha1ConfigConstraintSpecReloadOptionsTplScriptTrigger tplScriptTrigger) {
    this.tplScriptTrigger = tplScriptTrigger;
  }


  public V1alpha1ConfigConstraintSpecReloadOptions unixSignalTrigger(V1alpha1ConfigConstraintSpecReloadOptionsUnixSignalTrigger unixSignalTrigger) {
    
    this.unixSignalTrigger = unixSignalTrigger;
    return this;
  }

   /**
   * Get unixSignalTrigger
   * @return unixSignalTrigger
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ConfigConstraintSpecReloadOptionsUnixSignalTrigger getUnixSignalTrigger() {
    return unixSignalTrigger;
  }


  public void setUnixSignalTrigger(V1alpha1ConfigConstraintSpecReloadOptionsUnixSignalTrigger unixSignalTrigger) {
    this.unixSignalTrigger = unixSignalTrigger;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigConstraintSpecReloadOptions v1alpha1ConfigConstraintSpecReloadOptions = (V1alpha1ConfigConstraintSpecReloadOptions) o;
    return Objects.equals(this.autoTrigger, v1alpha1ConfigConstraintSpecReloadOptions.autoTrigger) &&
        Objects.equals(this.shellTrigger, v1alpha1ConfigConstraintSpecReloadOptions.shellTrigger) &&
        Objects.equals(this.tplScriptTrigger, v1alpha1ConfigConstraintSpecReloadOptions.tplScriptTrigger) &&
        Objects.equals(this.unixSignalTrigger, v1alpha1ConfigConstraintSpecReloadOptions.unixSignalTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTrigger, shellTrigger, tplScriptTrigger, unixSignalTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpecReloadOptions {\n");
    sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
    sb.append("    shellTrigger: ").append(toIndentedString(shellTrigger)).append("\n");
    sb.append("    tplScriptTrigger: ").append(toIndentedString(tplScriptTrigger)).append("\n");
    sb.append("    unixSignalTrigger: ").append(toIndentedString(unixSignalTrigger)).append("\n");
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
    openapiFields.add("autoTrigger");
    openapiFields.add("shellTrigger");
    openapiFields.add("tplScriptTrigger");
    openapiFields.add("unixSignalTrigger");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpecReloadOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpecReloadOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpecReloadOptions is not found in the empty JSON string", V1alpha1ConfigConstraintSpecReloadOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpecReloadOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpecReloadOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `autoTrigger`
      if (jsonObj.get("autoTrigger") != null && !jsonObj.get("autoTrigger").isJsonNull()) {
        V1alpha1ConfigConstraintSpecReloadOptionsAutoTrigger.validateJsonObject(jsonObj.getAsJsonObject("autoTrigger"));
      }
      // validate the optional field `shellTrigger`
      if (jsonObj.get("shellTrigger") != null && !jsonObj.get("shellTrigger").isJsonNull()) {
        V1alpha1ConfigConstraintSpecReloadOptionsShellTrigger.validateJsonObject(jsonObj.getAsJsonObject("shellTrigger"));
      }
      // validate the optional field `tplScriptTrigger`
      if (jsonObj.get("tplScriptTrigger") != null && !jsonObj.get("tplScriptTrigger").isJsonNull()) {
        V1alpha1ConfigConstraintSpecReloadOptionsTplScriptTrigger.validateJsonObject(jsonObj.getAsJsonObject("tplScriptTrigger"));
      }
      // validate the optional field `unixSignalTrigger`
      if (jsonObj.get("unixSignalTrigger") != null && !jsonObj.get("unixSignalTrigger").isJsonNull()) {
        V1alpha1ConfigConstraintSpecReloadOptionsUnixSignalTrigger.validateJsonObject(jsonObj.getAsJsonObject("unixSignalTrigger"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpecReloadOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpecReloadOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpecReloadOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpecReloadOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpecReloadOptions>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpecReloadOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpecReloadOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpecReloadOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpecReloadOptions
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpecReloadOptions
  */
  public static V1alpha1ConfigConstraintSpecReloadOptions fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpecReloadOptions.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpecReloadOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

