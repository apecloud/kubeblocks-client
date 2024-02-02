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
 * horizontalScalePolicy controls the behavior of horizontal scale.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy {
  public static final String SERIALIZED_NAME_BACKUP_POLICY_TEMPLATE_NAME = "backupPolicyTemplateName";
  @SerializedName(SERIALIZED_NAME_BACKUP_POLICY_TEMPLATE_NAME)
  private String backupPolicyTemplateName;

  /**
   * type controls what kind of data synchronization do when component scale out. Policy is in enum of {None, CloneVolume}. The default policy is &#x60;None&#x60;. None: Default policy, create empty volume and no data clone. CloneVolume: Do data clone to newly scaled pods. Prefer to use volume snapshot first, and will try backup tool if volume snapshot is not enabled, finally report error if both above cannot work. Snapshot: Deprecated, alias for CloneVolume.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("None"),
    
    CLONEVOLUME("CloneVolume"),
    
    SNAPSHOT("Snapshot");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS_NAME = "volumeMountsName";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS_NAME)
  private String volumeMountsName;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy backupPolicyTemplateName(String backupPolicyTemplateName) {
    
    this.backupPolicyTemplateName = backupPolicyTemplateName;
    return this;
  }

   /**
   * BackupPolicyTemplateName reference the backup policy template.
   * @return backupPolicyTemplateName
  **/
  @jakarta.annotation.Nullable
  public String getBackupPolicyTemplateName() {
    return backupPolicyTemplateName;
  }


  public void setBackupPolicyTemplateName(String backupPolicyTemplateName) {
    this.backupPolicyTemplateName = backupPolicyTemplateName;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * type controls what kind of data synchronization do when component scale out. Policy is in enum of {None, CloneVolume}. The default policy is &#x60;None&#x60;. None: Default policy, create empty volume and no data clone. CloneVolume: Do data clone to newly scaled pods. Prefer to use volume snapshot first, and will try backup tool if volume snapshot is not enabled, finally report error if both above cannot work. Snapshot: Deprecated, alias for CloneVolume.
   * @return type
  **/
  @jakarta.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy volumeMountsName(String volumeMountsName) {
    
    this.volumeMountsName = volumeMountsName;
    return this;
  }

   /**
   * volumeMountsName defines which volumeMount of the container to do backup, only work if Type is not None if not specified, the 1st volumeMount will be chosen
   * @return volumeMountsName
  **/
  @jakarta.annotation.Nullable
  public String getVolumeMountsName() {
    return volumeMountsName;
  }


  public void setVolumeMountsName(String volumeMountsName) {
    this.volumeMountsName = volumeMountsName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy v1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy = (V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy) o;
    return Objects.equals(this.backupPolicyTemplateName, v1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.backupPolicyTemplateName) &&
        Objects.equals(this.type, v1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.type) &&
        Objects.equals(this.volumeMountsName, v1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.volumeMountsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPolicyTemplateName, type, volumeMountsName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy {\n");
    sb.append("    backupPolicyTemplateName: ").append(toIndentedString(backupPolicyTemplateName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volumeMountsName: ").append(toIndentedString(volumeMountsName)).append("\n");
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
    openapiFields.add("backupPolicyTemplateName");
    openapiFields.add("type");
    openapiFields.add("volumeMountsName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("backupPolicyTemplateName") != null && !jsonObj.get("backupPolicyTemplateName").isJsonNull()) && !jsonObj.get("backupPolicyTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupPolicyTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupPolicyTemplateName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("volumeMountsName") != null && !jsonObj.get("volumeMountsName").isJsonNull()) && !jsonObj.get("volumeMountsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeMountsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeMountsName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerHorizontalScalePolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

