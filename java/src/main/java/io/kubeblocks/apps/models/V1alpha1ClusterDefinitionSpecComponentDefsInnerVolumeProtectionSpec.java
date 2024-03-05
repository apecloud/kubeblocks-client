/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.28.3
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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner;
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
 * Defines settings to do volume protect.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec {
  public static final String SERIALIZED_NAME_HIGH_WATERMARK = "highWatermark";
  @SerializedName(SERIALIZED_NAME_HIGH_WATERMARK)
  private Integer highWatermark;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner> volumes;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec highWatermark(Integer highWatermark) {
    
    this.highWatermark = highWatermark;
    return this;
  }

   /**
   * The high watermark threshold for volume space usage. If there is any specified volumes who&#39;s space usage is over the threshold, the pre-defined \&quot;LOCK\&quot; action will be triggered to degrade the service to protect volume from space exhaustion, such as to set the instance as read-only. And after that, if all volumes&#39; space usage drops under the threshold later, the pre-defined \&quot;UNLOCK\&quot; action will be performed to recover the service normally.
   * minimum: 0
   * maximum: 100
   * @return highWatermark
  **/
  @jakarta.annotation.Nullable
  public Integer getHighWatermark() {
    return highWatermark;
  }


  public void setHighWatermark(Integer highWatermark) {
    this.highWatermark = highWatermark;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec volumes(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec addVolumesItem(V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * The Volumes to be protected.
   * @return volumes
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec v1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec = (V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec) o;
    return Objects.equals(this.highWatermark, v1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.highWatermark) &&
        Objects.equals(this.volumes, v1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highWatermark, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec {\n");
    sb.append("    highWatermark: ").append(toIndentedString(highWatermark)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("highWatermark");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpecVolumesInner.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerVolumeProtectionSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

