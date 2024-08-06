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
 * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:03:17.809844Z[Etc/UTC]")
public class V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner() {
  }

  public V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner v1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner = (V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner) o;
    return Objects.equals(this.name, v1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner is not found in the empty JSON string", V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner
  */
  public static V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner.class);
  }

 /**
  * Convert an instance of V1alpha1InstanceSetSpecTemplateSpecImagePullSecretsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

