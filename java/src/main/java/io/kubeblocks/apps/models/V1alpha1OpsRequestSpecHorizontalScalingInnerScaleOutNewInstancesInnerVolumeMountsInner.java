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
 * VolumeMount describes a mounting of a Volume within a container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:47.298634Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_MOUNT_PROPAGATION = "mountPropagation";
  @SerializedName(SERIALIZED_NAME_MOUNT_PROPAGATION)
  private String mountPropagation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_SUB_PATH_EXPR = "subPathExpr";
  @SerializedName(SERIALIZED_NAME_SUB_PATH_EXPR)
  private String subPathExpr;

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner() {
  }

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner mountPath(String mountPath) {
    
    this.mountPath = mountPath;
    return this;
  }

   /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   * @return mountPath
  **/
  @jakarta.annotation.Nonnull
  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner mountPropagation(String mountPropagation) {
    
    this.mountPropagation = mountPropagation;
    return this;
  }

   /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
   * @return mountPropagation
  **/
  @jakarta.annotation.Nullable
  public String getMountPropagation() {
    return mountPropagation;
  }


  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This must match the Name of a Volume.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   * @return subPath
  **/
  @jakarta.annotation.Nullable
  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner subPathExpr(String subPathExpr) {
    
    this.subPathExpr = subPathExpr;
    return this;
  }

   /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to \&quot;\&quot; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
   * @return subPathExpr
  **/
  @jakarta.annotation.Nullable
  public String getSubPathExpr() {
    return subPathExpr;
  }


  public void setSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner = (V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner) o;
    return Objects.equals(this.mountPath, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.mountPath) &&
        Objects.equals(this.mountPropagation, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.mountPropagation) &&
        Objects.equals(this.name, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.name) &&
        Objects.equals(this.readOnly, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.readOnly) &&
        Objects.equals(this.subPath, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.subPath) &&
        Objects.equals(this.subPathExpr, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.subPathExpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, subPath, subPathExpr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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
    openapiFields.add("mountPath");
    openapiFields.add("mountPropagation");
    openapiFields.add("name");
    openapiFields.add("readOnly");
    openapiFields.add("subPath");
    openapiFields.add("subPathExpr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mountPath");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner is not found in the empty JSON string", V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("mountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPath").toString()));
      }
      if ((jsonObj.get("mountPropagation") != null && !jsonObj.get("mountPropagation").isJsonNull()) && !jsonObj.get("mountPropagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPropagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPropagation").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subPath") != null && !jsonObj.get("subPath").isJsonNull()) && !jsonObj.get("subPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPath").toString()));
      }
      if ((jsonObj.get("subPathExpr") != null && !jsonObj.get("subPathExpr").isJsonNull()) && !jsonObj.get("subPathExpr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPathExpr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPathExpr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner
  */
  public static V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumeMountsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

