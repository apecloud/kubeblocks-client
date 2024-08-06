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


package io.kubeblocks.dataprotection.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Specifies the standard metadata for the object. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:51.636603Z[Etc/UTC]")
public class V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";
  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  private List<String> finalizers;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata() {
  }

  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata finalizers(List<String> finalizers) {
    
    this.finalizers = finalizers;
    return this;
  }

  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Get finalizers
   * @return finalizers
  **/
  @jakarta.annotation.Nullable
  public List<String> getFinalizers() {
    return finalizers;
  }


  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }


  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata v1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata = (V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata) o;
    return Objects.equals(this.annotations, v1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.annotations) &&
        Objects.equals(this.finalizers, v1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.finalizers) &&
        Objects.equals(this.labels, v1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.labels) &&
        Objects.equals(this.name, v1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.name) &&
        Objects.equals(this.namespace, v1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, finalizers, labels, name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("finalizers");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("namespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata is not found in the empty JSON string", V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("finalizers") != null && !jsonObj.get("finalizers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `finalizers` to be an array in the JSON string but got `%s`", jsonObj.get("finalizers").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata>() {
           @Override
           public void write(JsonWriter out, V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata
  */
  public static V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata.class);
  }

 /**
  * Convert an instance of V1alpha1RestoreSpecPrepareDataConfigVolumeClaimsInnerMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

