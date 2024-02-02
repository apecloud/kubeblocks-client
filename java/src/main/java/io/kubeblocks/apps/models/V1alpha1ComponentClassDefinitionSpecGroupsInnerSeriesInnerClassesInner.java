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
 * V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private Object cpu;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Object memory;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner() {
  }

  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * args are variable&#39;s value
   * @return args
  **/
  @jakarta.annotation.Nullable
  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner cpu(Object cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * the CPU of the class
   * @return cpu
  **/
  @jakarta.annotation.Nullable
  public Object getCpu() {
    return cpu;
  }


  public void setCpu(Object cpu) {
    this.cpu = cpu;
  }


  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner memory(Object memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * the memory of the class
   * @return memory
  **/
  @jakarta.annotation.Nullable
  public Object getMemory() {
    return memory;
  }


  public void setMemory(Object memory) {
    this.memory = memory;
  }


  public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name is the class name
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
    V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner = (V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner) o;
    return Objects.equals(this.args, v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.args) &&
        Objects.equals(this.cpu, v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.cpu) &&
        Objects.equals(this.memory, v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.memory) &&
        Objects.equals(this.name, v1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, cpu, memory, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
    openapiFields.add("args");
    openapiFields.add("cpu");
    openapiFields.add("memory");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner is not found in the empty JSON string", V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("args") != null && !jsonObj.get("args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `args` to be an array in the JSON string but got `%s`", jsonObj.get("args").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner
  */
  public static V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentClassDefinitionSpecGroupsInnerSeriesInnerClassesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

