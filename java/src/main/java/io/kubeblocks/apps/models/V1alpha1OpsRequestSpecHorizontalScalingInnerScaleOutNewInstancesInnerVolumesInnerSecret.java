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


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner;
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
 * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:47.298634Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner> items;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret() {
  }

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret defaultMode(Integer defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @jakarta.annotation.Nullable
  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret items(List<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret addItemsItem(V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner> getItems() {
    return items;
  }


  public void setItems(List<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner> items) {
    this.items = items;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * optional field specify whether the Secret or its keys must be defined
   * @return optional
  **/
  @jakarta.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * secretName is the name of the secret in the pod&#39;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secretName
  **/
  @jakarta.annotation.Nullable
  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret = (V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret) o;
    return Objects.equals(this.defaultMode, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.defaultMode) &&
        Objects.equals(this.items, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.items) &&
        Objects.equals(this.optional, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.optional) &&
        Objects.equals(this.secretName, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items, optional, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
    openapiFields.add("defaultMode");
    openapiFields.add("items");
    openapiFields.add("optional");
    openapiFields.add("secretName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret is not found in the empty JSON string", V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerConfigMapItemsInner.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("secretName") != null && !jsonObj.get("secretName").isJsonNull()) && !jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret
  */
  public static V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerSecret to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

