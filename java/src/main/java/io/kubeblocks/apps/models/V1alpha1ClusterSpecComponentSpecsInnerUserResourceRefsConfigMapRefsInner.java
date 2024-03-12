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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInnerConfigMap;
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
 * ConfigMapRef defines a reference to a ConfigMap.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T08:58:42.064637Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner {
  public static final String SERIALIZED_NAME_AS_VOLUME_FROM = "asVolumeFrom";
  @SerializedName(SERIALIZED_NAME_AS_VOLUME_FROM)
  private List<String> asVolumeFrom;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInnerConfigMap configMap;

  public static final String SERIALIZED_NAME_MOUNT_POINT = "mountPoint";
  @SerializedName(SERIALIZED_NAME_MOUNT_POINT)
  private String mountPoint;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner asVolumeFrom(List<String> asVolumeFrom) {
    
    this.asVolumeFrom = asVolumeFrom;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner addAsVolumeFromItem(String asVolumeFromItem) {
    if (this.asVolumeFrom == null) {
      this.asVolumeFrom = new ArrayList<>();
    }
    this.asVolumeFrom.add(asVolumeFromItem);
    return this;
  }

   /**
   * AsVolumeFrom lists the names of containers in which the volume should be mounted.
   * @return asVolumeFrom
  **/
  @jakarta.annotation.Nullable
  public List<String> getAsVolumeFrom() {
    return asVolumeFrom;
  }


  public void setAsVolumeFrom(List<String> asVolumeFrom) {
    this.asVolumeFrom = asVolumeFrom;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner configMap(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInnerConfigMap configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInnerConfigMap getConfigMap() {
    return configMap;
  }


  public void setConfigMap(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInnerConfigMap configMap) {
    this.configMap = configMap;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner mountPoint(String mountPoint) {
    
    this.mountPoint = mountPoint;
    return this;
  }

   /**
   * MountPoint is the filesystem path where the volume will be mounted.
   * @return mountPoint
  **/
  @jakarta.annotation.Nonnull
  public String getMountPoint() {
    return mountPoint;
  }


  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the referenced ConfigMap or Secret object. It must conform to DNS label standards.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * SubPath specifies a path within the volume from which to mount.
   * @return subPath
  **/
  @jakarta.annotation.Nullable
  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner = (V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner) o;
    return Objects.equals(this.asVolumeFrom, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.asVolumeFrom) &&
        Objects.equals(this.configMap, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.configMap) &&
        Objects.equals(this.mountPoint, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.mountPoint) &&
        Objects.equals(this.name, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.name) &&
        Objects.equals(this.subPath, v1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asVolumeFrom, configMap, mountPoint, name, subPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner {\n");
    sb.append("    asVolumeFrom: ").append(toIndentedString(asVolumeFrom)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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
    openapiFields.add("asVolumeFrom");
    openapiFields.add("configMap");
    openapiFields.add("mountPoint");
    openapiFields.add("name");
    openapiFields.add("subPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configMap");
    openapiRequiredFields.add("mountPoint");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("asVolumeFrom") != null && !jsonObj.get("asVolumeFrom").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `asVolumeFrom` to be an array in the JSON string but got `%s`", jsonObj.get("asVolumeFrom").toString()));
      }
      // validate the required field `configMap`
      V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInnerConfigMap.validateJsonObject(jsonObj.getAsJsonObject("configMap"));
      if (!jsonObj.get("mountPoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPoint").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subPath") != null && !jsonObj.get("subPath").isJsonNull()) && !jsonObj.get("subPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefsConfigMapRefsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

