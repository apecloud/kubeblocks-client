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
import io.kubeblocks.apps.models.V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpec;
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
 * Specifies the configuration for a &#39;workload&#39; action. This action leads to the creation of a K8s workload, such as a Pod or Job, to execute specified tasks.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerWorkload {
  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_POD_INFO_EXTRACTOR_NAME = "podInfoExtractorName";
  @SerializedName(SERIALIZED_NAME_POD_INFO_EXTRACTOR_NAME)
  private String podInfoExtractorName;

  public static final String SERIALIZED_NAME_POD_SPEC = "podSpec";
  @SerializedName(SERIALIZED_NAME_POD_SPEC)
  private V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpec podSpec;

  /**
   * Defines the workload type of the action. Valid values include \&quot;Job\&quot; and \&quot;Pod\&quot;.   - \&quot;Job\&quot;: Creates a Job to execute the action. - \&quot;Pod\&quot;: Creates a Pod to execute the action. Note: unlike Jobs, manually deleting a Pod does not affect the &#x60;backoffLimit&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    JOB("Job"),
    
    POD("Pod");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public V1alpha1OpsDefinitionSpecActionsInnerWorkload() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerWorkload backoffLimit(Integer backoffLimit) {
    
    this.backoffLimit = backoffLimit;
    return this;
  }

   /**
   * Specifies the number of retries allowed before marking the action as failed.
   * minimum: 0
   * @return backoffLimit
  **/
  @jakarta.annotation.Nullable
  public Integer getBackoffLimit() {
    return backoffLimit;
  }


  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkload podInfoExtractorName(String podInfoExtractorName) {
    
    this.podInfoExtractorName = podInfoExtractorName;
    return this;
  }

   /**
   * Specifies a PodInfoExtractor defined in the &#x60;opsDefinition.spec.podInfoExtractors&#x60;.
   * @return podInfoExtractorName
  **/
  @jakarta.annotation.Nullable
  public String getPodInfoExtractorName() {
    return podInfoExtractorName;
  }


  public void setPodInfoExtractorName(String podInfoExtractorName) {
    this.podInfoExtractorName = podInfoExtractorName;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkload podSpec(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpec podSpec) {
    
    this.podSpec = podSpec;
    return this;
  }

   /**
   * Get podSpec
   * @return podSpec
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpec getPodSpec() {
    return podSpec;
  }


  public void setPodSpec(V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpec podSpec) {
    this.podSpec = podSpec;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerWorkload type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the workload type of the action. Valid values include \&quot;Job\&quot; and \&quot;Pod\&quot;.   - \&quot;Job\&quot;: Creates a Job to execute the action. - \&quot;Pod\&quot;: Creates a Pod to execute the action. Note: unlike Jobs, manually deleting a Pod does not affect the &#x60;backoffLimit&#x60;.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerWorkload v1alpha1OpsDefinitionSpecActionsInnerWorkload = (V1alpha1OpsDefinitionSpecActionsInnerWorkload) o;
    return Objects.equals(this.backoffLimit, v1alpha1OpsDefinitionSpecActionsInnerWorkload.backoffLimit) &&
        Objects.equals(this.podInfoExtractorName, v1alpha1OpsDefinitionSpecActionsInnerWorkload.podInfoExtractorName) &&
        Objects.equals(this.podSpec, v1alpha1OpsDefinitionSpecActionsInnerWorkload.podSpec) &&
        Objects.equals(this.type, v1alpha1OpsDefinitionSpecActionsInnerWorkload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoffLimit, podInfoExtractorName, podSpec, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerWorkload {\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    podInfoExtractorName: ").append(toIndentedString(podInfoExtractorName)).append("\n");
    sb.append("    podSpec: ").append(toIndentedString(podSpec)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("backoffLimit");
    openapiFields.add("podInfoExtractorName");
    openapiFields.add("podSpec");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("podSpec");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerWorkload is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerWorkload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerWorkload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerWorkload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecActionsInnerWorkload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("podInfoExtractorName") != null && !jsonObj.get("podInfoExtractorName").isJsonNull()) && !jsonObj.get("podInfoExtractorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podInfoExtractorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podInfoExtractorName").toString()));
      }
      // validate the required field `podSpec`
      V1alpha1OpsDefinitionSpecActionsInnerWorkloadPodSpec.validateJsonObject(jsonObj.getAsJsonObject("podSpec"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerWorkload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerWorkload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerWorkload.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerWorkload>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerWorkload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerWorkload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerWorkload
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerWorkload
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerWorkload fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerWorkload.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerWorkload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

