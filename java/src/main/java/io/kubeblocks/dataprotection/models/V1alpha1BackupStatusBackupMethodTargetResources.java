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
import io.kubeblocks.dataprotection.models.V1alpha1BackupStatusBackupMethodTargetResourcesSelector;
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
 * Specifies the kubernetes resources to back up.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:30.430950Z[Etc/UTC]")
public class V1alpha1BackupStatusBackupMethodTargetResources {
  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  private List<String> excluded;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private List<String> included;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1alpha1BackupStatusBackupMethodTargetResourcesSelector selector;

  public V1alpha1BackupStatusBackupMethodTargetResources() {
  }

  public V1alpha1BackupStatusBackupMethodTargetResources excluded(List<String> excluded) {
    
    this.excluded = excluded;
    return this;
  }

  public V1alpha1BackupStatusBackupMethodTargetResources addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * excluded is a slice of namespaced-scoped resource type names to exclude in the kubernetes resources. The default value is empty.
   * @return excluded
  **/
  @jakarta.annotation.Nullable
  public List<String> getExcluded() {
    return excluded;
  }


  public void setExcluded(List<String> excluded) {
    this.excluded = excluded;
  }


  public V1alpha1BackupStatusBackupMethodTargetResources included(List<String> included) {
    
    this.included = included;
    return this;
  }

  public V1alpha1BackupStatusBackupMethodTargetResources addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * included is a slice of namespaced-scoped resource type names to include in the kubernetes resources. The default value is empty.
   * @return included
  **/
  @jakarta.annotation.Nullable
  public List<String> getIncluded() {
    return included;
  }


  public void setIncluded(List<String> included) {
    this.included = included;
  }


  public V1alpha1BackupStatusBackupMethodTargetResources selector(V1alpha1BackupStatusBackupMethodTargetResourcesSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public V1alpha1BackupStatusBackupMethodTargetResourcesSelector getSelector() {
    return selector;
  }


  public void setSelector(V1alpha1BackupStatusBackupMethodTargetResourcesSelector selector) {
    this.selector = selector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupStatusBackupMethodTargetResources v1alpha1BackupStatusBackupMethodTargetResources = (V1alpha1BackupStatusBackupMethodTargetResources) o;
    return Objects.equals(this.excluded, v1alpha1BackupStatusBackupMethodTargetResources.excluded) &&
        Objects.equals(this.included, v1alpha1BackupStatusBackupMethodTargetResources.included) &&
        Objects.equals(this.selector, v1alpha1BackupStatusBackupMethodTargetResources.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excluded, included, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupStatusBackupMethodTargetResources {\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
    openapiFields.add("excluded");
    openapiFields.add("included");
    openapiFields.add("selector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1BackupStatusBackupMethodTargetResources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1BackupStatusBackupMethodTargetResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1BackupStatusBackupMethodTargetResources is not found in the empty JSON string", V1alpha1BackupStatusBackupMethodTargetResources.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1BackupStatusBackupMethodTargetResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1BackupStatusBackupMethodTargetResources` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excluded") != null && !jsonObj.get("excluded").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excluded` to be an array in the JSON string but got `%s`", jsonObj.get("excluded").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("included") != null && !jsonObj.get("included").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `included` to be an array in the JSON string but got `%s`", jsonObj.get("included").toString()));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1alpha1BackupStatusBackupMethodTargetResourcesSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1BackupStatusBackupMethodTargetResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1BackupStatusBackupMethodTargetResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1BackupStatusBackupMethodTargetResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1BackupStatusBackupMethodTargetResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1BackupStatusBackupMethodTargetResources>() {
           @Override
           public void write(JsonWriter out, V1alpha1BackupStatusBackupMethodTargetResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1BackupStatusBackupMethodTargetResources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1BackupStatusBackupMethodTargetResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1BackupStatusBackupMethodTargetResources
  * @throws IOException if the JSON string is invalid with respect to V1alpha1BackupStatusBackupMethodTargetResources
  */
  public static V1alpha1BackupStatusBackupMethodTargetResources fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1BackupStatusBackupMethodTargetResources.class);
  }

 /**
  * Convert an instance of V1alpha1BackupStatusBackupMethodTargetResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

