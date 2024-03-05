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
 * Specifies the configuration template. It is optional.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  /**
   * Defines the strategy for merging externally imported templates into component templates.
   */
  @JsonAdapter(PolicyEnum.Adapter.class)
  public enum PolicyEnum {
    PATCH("patch"),
    
    REPLACE("replace"),
    
    NONE("none");

    private String value;

    PolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyEnum fromValue(String value) {
      for (PolicyEnum b : PolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private PolicyEnum policy;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private String templateRef;

  public V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef() {
  }

  public V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies the namespace of the referenced configuration template ConfigMap object. An empty namespace is equivalent to the \&quot;default\&quot; namespace.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef policy(PolicyEnum policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Defines the strategy for merging externally imported templates into component templates.
   * @return policy
  **/
  @jakarta.annotation.Nullable
  public PolicyEnum getPolicy() {
    return policy;
  }


  public void setPolicy(PolicyEnum policy) {
    this.policy = policy;
  }


  public V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef templateRef(String templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Specifies the name of the referenced configuration template ConfigMap object.
   * @return templateRef
  **/
  @jakarta.annotation.Nonnull
  public String getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(String templateRef) {
    this.templateRef = templateRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef v1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef = (V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef) o;
    return Objects.equals(this.namespace, v1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.namespace) &&
        Objects.equals(this.policy, v1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.policy) &&
        Objects.equals(this.templateRef, v1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.templateRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, policy, templateRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
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
    openapiFields.add("namespace");
    openapiFields.add("policy");
    openapiFields.add("templateRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("templateRef");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef is not found in the empty JSON string", V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("policy") != null && !jsonObj.get("policy").isJsonNull()) && !jsonObj.get("policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy").toString()));
      }
      if (!jsonObj.get("templateRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef>() {
           @Override
           public void write(JsonWriter out, V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef
  */
  public static V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef.class);
  }

 /**
  * Convert an instance of V1alpha1ConfigurationSpecConfigItemDetailsInnerImportTemplateRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

