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
 * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:56:35.521733Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk {
  public static final String SERIALIZED_NAME_CACHING_MODE = "cachingMode";
  @SerializedName(SERIALIZED_NAME_CACHING_MODE)
  private String cachingMode;

  public static final String SERIALIZED_NAME_DISK_NAME = "diskName";
  @SerializedName(SERIALIZED_NAME_DISK_NAME)
  private String diskName;

  public static final String SERIALIZED_NAME_DISK_U_R_I = "diskURI";
  @SerializedName(SERIALIZED_NAME_DISK_U_R_I)
  private String diskURI;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk cachingMode(String cachingMode) {
    
    this.cachingMode = cachingMode;
    return this;
  }

   /**
   * cachingMode is the Host Caching mode: None, Read Only, Read Write.
   * @return cachingMode
  **/
  @jakarta.annotation.Nullable
  public String getCachingMode() {
    return cachingMode;
  }


  public void setCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk diskName(String diskName) {
    
    this.diskName = diskName;
    return this;
  }

   /**
   * diskName is the Name of the data disk in the blob storage
   * @return diskName
  **/
  @jakarta.annotation.Nonnull
  public String getDiskName() {
    return diskName;
  }


  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk diskURI(String diskURI) {
    
    this.diskURI = diskURI;
    return this;
  }

   /**
   * diskURI is the URI of data disk in the blob storage
   * @return diskURI
  **/
  @jakarta.annotation.Nonnull
  public String getDiskURI() {
    return diskURI;
  }


  public void setDiskURI(String diskURI) {
    this.diskURI = diskURI;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk = (V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk) o;
    return Objects.equals(this.cachingMode, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.cachingMode) &&
        Objects.equals(this.diskName, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.diskName) &&
        Objects.equals(this.diskURI, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.diskURI) &&
        Objects.equals(this.fsType, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.fsType) &&
        Objects.equals(this.kind, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.kind) &&
        Objects.equals(this.readOnly, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk {\n");
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
    openapiFields.add("cachingMode");
    openapiFields.add("diskName");
    openapiFields.add("diskURI");
    openapiFields.add("fsType");
    openapiFields.add("kind");
    openapiFields.add("readOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("diskName");
    openapiRequiredFields.add("diskURI");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cachingMode") != null && !jsonObj.get("cachingMode").isJsonNull()) && !jsonObj.get("cachingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cachingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cachingMode").toString()));
      }
      if (!jsonObj.get("diskName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diskName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diskName").toString()));
      }
      if (!jsonObj.get("diskURI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diskURI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diskURI").toString()));
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecVolumesInnerAzureDisk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

