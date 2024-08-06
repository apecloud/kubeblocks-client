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
 * ContainerResizePolicy represents resource resize policy for the container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T13:56:35.521733Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner {
  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  private String restartPolicy;

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.
   * @return resourceName
  **/
  @jakarta.annotation.Nonnull
  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner restartPolicy(String restartPolicy) {
    
    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.
   * @return restartPolicy
  **/
  @jakarta.annotation.Nonnull
  public String getRestartPolicy() {
    return restartPolicy;
  }


  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner = (V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner) o;
    return Objects.equals(this.resourceName, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.resourceName) &&
        Objects.equals(this.restartPolicy, v1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.restartPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, restartPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
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
    openapiFields.add("resourceName");
    openapiFields.add("restartPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceName");
    openapiRequiredFields.add("restartPolicy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("resourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceName").toString()));
      }
      if (!jsonObj.get("restartPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restartPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restartPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpecContainersInnerResizePolicyInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

