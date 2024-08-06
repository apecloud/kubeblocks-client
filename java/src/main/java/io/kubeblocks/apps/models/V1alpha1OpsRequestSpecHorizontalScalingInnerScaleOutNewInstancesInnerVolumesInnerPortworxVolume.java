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
 * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:59:47.298634Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_I_D = "volumeID";
  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume() {
  }

  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume volumeID(String volumeID) {
    
    this.volumeID = volumeID;
    return this;
  }

   /**
   * volumeID uniquely identifies a Portworx volume
   * @return volumeID
  **/
  @jakarta.annotation.Nonnull
  public String getVolumeID() {
    return volumeID;
  }


  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume = (V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume) o;
    return Objects.equals(this.fsType, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.fsType) &&
        Objects.equals(this.readOnly, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.readOnly) &&
        Objects.equals(this.volumeID, v1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("readOnly");
    openapiFields.add("volumeID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("volumeID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume is not found in the empty JSON string", V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("volumeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume
  */
  public static V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecHorizontalScalingInnerScaleOutNewInstancesInnerVolumesInnerPortworxVolume to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

