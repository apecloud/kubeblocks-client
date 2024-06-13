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
 * Defines the context for container images for component versions. This value replaces the values in clusterDefinition.spec.componentDefs.podSpec.[initContainers | containers].
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext {
  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Object containers;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private Object initContainers;

  public V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext() {
  }

  public V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext containers(Object containers) {
    
    this.containers = containers;
    return this;
  }

   /**
   * Provides override values for ClusterDefinition.spec.componentDefs.podSpec.containers. Typically used in scenarios such as updating application container images.
   * @return containers
  **/
  @jakarta.annotation.Nullable
  public Object getContainers() {
    return containers;
  }


  public void setContainers(Object containers) {
    this.containers = containers;
  }


  public V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext initContainers(Object initContainers) {
    
    this.initContainers = initContainers;
    return this;
  }

   /**
   * Provides override values for ClusterDefinition.spec.componentDefs.podSpec.initContainers. Typically used in scenarios such as updating application container images.
   * @return initContainers
  **/
  @jakarta.annotation.Nullable
  public Object getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(Object initContainers) {
    this.initContainers = initContainers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext v1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext = (V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext) o;
    return Objects.equals(this.containers, v1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.containers) &&
        Objects.equals(this.initContainers, v1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.initContainers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, initContainers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
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
    openapiFields.add("containers");
    openapiFields.add("initContainers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext is not found in the empty JSON string", V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext
  */
  public static V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterVersionSpecComponentVersionsInnerVersionsContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

