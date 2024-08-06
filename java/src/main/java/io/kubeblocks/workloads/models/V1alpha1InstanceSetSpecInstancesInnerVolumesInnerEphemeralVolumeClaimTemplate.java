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


package io.kubeblocks.workloads.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubeblocks.workloads.models.V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateMetadata;
import io.kubeblocks.workloads.models.V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateSpec;
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
 * Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be &#x60;&lt;pod name&gt;-&lt;volume name&gt;&#x60; where &#x60;&lt;volume name&gt;&#x60; is the name from the &#x60;PodSpec.Volumes&#x60; array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).   An existing PVC with that name that is not owned by the pod will *not* be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.   This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.   Required, must not be nil.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:03:17.809844Z[Etc/UTC]")
public class V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateMetadata metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateSpec spec;

  public V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate() {
  }

  public V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate metadata(V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  public V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateMetadata metadata) {
    this.metadata = metadata;
  }


  public V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate spec(V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateSpec getSpec() {
    return spec;
  }


  public void setSpec(V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateSpec spec) {
    this.spec = spec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate v1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate = (V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate) o;
    return Objects.equals(this.metadata, v1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.metadata) &&
        Objects.equals(this.spec, v1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("spec");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate is not found in the empty JSON string", V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the required field `spec`
      V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplateSpec.validateJsonObject(jsonObj.getAsJsonObject("spec"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate>() {
           @Override
           public void write(JsonWriter out, V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate
  * @throws IOException if the JSON string is invalid with respect to V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate
  */
  public static V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate.class);
  }

 /**
  * Convert an instance of V1alpha1InstanceSetSpecInstancesInnerVolumesInnerEphemeralVolumeClaimTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

