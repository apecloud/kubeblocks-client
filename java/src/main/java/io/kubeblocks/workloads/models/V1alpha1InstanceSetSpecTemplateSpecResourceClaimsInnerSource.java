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
 * Source describes where to find the ResourceClaim.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:03:17.809844Z[Etc/UTC]")
public class V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource {
  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_NAME = "resourceClaimName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_NAME)
  private String resourceClaimName;

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_TEMPLATE_NAME = "resourceClaimTemplateName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_TEMPLATE_NAME)
  private String resourceClaimTemplateName;

  public V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource() {
  }

  public V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource resourceClaimName(String resourceClaimName) {
    
    this.resourceClaimName = resourceClaimName;
    return this;
  }

   /**
   * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
   * @return resourceClaimName
  **/
  @jakarta.annotation.Nullable
  public String getResourceClaimName() {
    return resourceClaimName;
  }


  public void setResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
  }


  public V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource resourceClaimTemplateName(String resourceClaimTemplateName) {
    
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return this;
  }

   /**
   * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.   The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.   This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
   * @return resourceClaimTemplateName
  **/
  @jakarta.annotation.Nullable
  public String getResourceClaimTemplateName() {
    return resourceClaimTemplateName;
  }


  public void setResourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource v1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource = (V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource) o;
    return Objects.equals(this.resourceClaimName, v1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.resourceClaimName) &&
        Objects.equals(this.resourceClaimTemplateName, v1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.resourceClaimTemplateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceClaimName, resourceClaimTemplateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource {\n");
    sb.append("    resourceClaimName: ").append(toIndentedString(resourceClaimName)).append("\n");
    sb.append("    resourceClaimTemplateName: ").append(toIndentedString(resourceClaimTemplateName)).append("\n");
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
    openapiFields.add("resourceClaimName");
    openapiFields.add("resourceClaimTemplateName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource is not found in the empty JSON string", V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("resourceClaimName") != null && !jsonObj.get("resourceClaimName").isJsonNull()) && !jsonObj.get("resourceClaimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceClaimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClaimName").toString()));
      }
      if ((jsonObj.get("resourceClaimTemplateName") != null && !jsonObj.get("resourceClaimTemplateName").isJsonNull()) && !jsonObj.get("resourceClaimTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceClaimTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClaimTemplateName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource>() {
           @Override
           public void write(JsonWriter out, V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource
  * @throws IOException if the JSON string is invalid with respect to V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource
  */
  public static V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource.class);
  }

 /**
  * Convert an instance of V1alpha1InstanceSetSpecTemplateSpecResourceClaimsInnerSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

