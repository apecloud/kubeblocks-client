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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfsSecretRef;
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
 * cephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T08:58:42.064637Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs {
  public static final String SERIALIZED_NAME_MONITORS = "monitors";
  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<String> monitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_FILE = "secretFile";
  @SerializedName(SERIALIZED_NAME_SECRET_FILE)
  private String secretFile;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfsSecretRef secretRef;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs monitors(List<String> monitors) {
    
    this.monitors = monitors;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs addMonitorsItem(String monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return monitors
  **/
  @jakarta.annotation.Nonnull
  public List<String> getMonitors() {
    return monitors;
  }


  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   * @return path
  **/
  @jakarta.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs secretFile(String secretFile) {
    
    this.secretFile = secretFile;
    return this;
  }

   /**
   * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return secretFile
  **/
  @jakarta.annotation.Nullable
  public String getSecretFile() {
    return secretFile;
  }


  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs secretRef(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfsSecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfsSecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfsSecretRef secretRef) {
    this.secretRef = secretRef;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return user
  **/
  @jakarta.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs = (V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs) o;
    return Objects.equals(this.monitors, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.monitors) &&
        Objects.equals(this.path, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.path) &&
        Objects.equals(this.readOnly, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.readOnly) &&
        Objects.equals(this.secretFile, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.secretFile) &&
        Objects.equals(this.secretRef, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.secretRef) &&
        Objects.equals(this.user, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs {\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretFile: ").append(toIndentedString(secretFile)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("monitors");
    openapiFields.add("path");
    openapiFields.add("readOnly");
    openapiFields.add("secretFile");
    openapiFields.add("secretRef");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("monitors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("monitors") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("monitors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitors` to be an array in the JSON string but got `%s`", jsonObj.get("monitors").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("secretFile") != null && !jsonObj.get("secretFile").isJsonNull()) && !jsonObj.get("secretFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretFile").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfsSecretRef.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInnerCephfs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

