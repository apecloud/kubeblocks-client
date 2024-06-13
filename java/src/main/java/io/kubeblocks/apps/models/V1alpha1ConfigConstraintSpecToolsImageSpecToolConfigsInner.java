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
 * V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner() {
  }

  public V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Used to execute commands for init containers.
   * @return command
  **/
  @jakarta.annotation.Nonnull
  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  public V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Represents the name of the container image for the tools.
   * @return image
  **/
  @jakarta.annotation.Nullable
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the initContainer. This must be a DNS_LABEL name.
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
    V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner v1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner = (V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner) o;
    return Objects.equals(this.command, v1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.command) &&
        Objects.equals(this.image, v1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.image) &&
        Objects.equals(this.name, v1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, image, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    openapiFields.add("command");
    openapiFields.add("image");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("command");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner is not found in the empty JSON string", V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("command") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be an array in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner
  */
  public static V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigConstraintSpecToolsImageSpecToolConfigsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

