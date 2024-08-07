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
import java.util.HashMap;
import java.util.Map;

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
 * ComponentVersionRelease represents a release of component instances within a ComponentVersion.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentVersionSpecReleasesInner {
  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private String changes;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private Map<String, String> images = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SERVICE_VERSION = "serviceVersion";
  @SerializedName(SERIALIZED_NAME_SERVICE_VERSION)
  private String serviceVersion;

  public V1alpha1ComponentVersionSpecReleasesInner() {
  }

  public V1alpha1ComponentVersionSpecReleasesInner changes(String changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Changes provides information about the changes made in this release.
   * @return changes
  **/
  @jakarta.annotation.Nullable
  public String getChanges() {
    return changes;
  }


  public void setChanges(String changes) {
    this.changes = changes;
  }


  public V1alpha1ComponentVersionSpecReleasesInner images(Map<String, String> images) {
    
    this.images = images;
    return this;
  }

  public V1alpha1ComponentVersionSpecReleasesInner putImagesItem(String key, String imagesItem) {
    if (this.images == null) {
      this.images = new HashMap<>();
    }
    this.images.put(key, imagesItem);
    return this;
  }

   /**
   * Images define the new images for different containers within the release.
   * @return images
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getImages() {
    return images;
  }


  public void setImages(Map<String, String> images) {
    this.images = images;
  }


  public V1alpha1ComponentVersionSpecReleasesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is a unique identifier for this release. Cannot be updated.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ComponentVersionSpecReleasesInner serviceVersion(String serviceVersion) {
    
    this.serviceVersion = serviceVersion;
    return this;
  }

   /**
   * ServiceVersion defines the version of the well-known service that the component provides. The version should follow the syntax and semantics of the \&quot;Semantic Versioning\&quot; specification (http://semver.org/). If the release is used, it will serve as the service version for component instances, overriding the one defined in the component definition. Cannot be updated.
   * @return serviceVersion
  **/
  @jakarta.annotation.Nonnull
  public String getServiceVersion() {
    return serviceVersion;
  }


  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentVersionSpecReleasesInner v1alpha1ComponentVersionSpecReleasesInner = (V1alpha1ComponentVersionSpecReleasesInner) o;
    return Objects.equals(this.changes, v1alpha1ComponentVersionSpecReleasesInner.changes) &&
        Objects.equals(this.images, v1alpha1ComponentVersionSpecReleasesInner.images) &&
        Objects.equals(this.name, v1alpha1ComponentVersionSpecReleasesInner.name) &&
        Objects.equals(this.serviceVersion, v1alpha1ComponentVersionSpecReleasesInner.serviceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, images, name, serviceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentVersionSpecReleasesInner {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
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
    openapiFields.add("changes");
    openapiFields.add("images");
    openapiFields.add("name");
    openapiFields.add("serviceVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("images");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("serviceVersion");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentVersionSpecReleasesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentVersionSpecReleasesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentVersionSpecReleasesInner is not found in the empty JSON string", V1alpha1ComponentVersionSpecReleasesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentVersionSpecReleasesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentVersionSpecReleasesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentVersionSpecReleasesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("changes") != null && !jsonObj.get("changes").isJsonNull()) && !jsonObj.get("changes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changes").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("serviceVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentVersionSpecReleasesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentVersionSpecReleasesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentVersionSpecReleasesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentVersionSpecReleasesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentVersionSpecReleasesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentVersionSpecReleasesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentVersionSpecReleasesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentVersionSpecReleasesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentVersionSpecReleasesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentVersionSpecReleasesInner
  */
  public static V1alpha1ComponentVersionSpecReleasesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentVersionSpecReleasesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentVersionSpecReleasesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

