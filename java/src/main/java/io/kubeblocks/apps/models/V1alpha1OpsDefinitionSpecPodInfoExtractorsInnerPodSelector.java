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
 * Used to select the target Pod from which environment variables and volumes are extracted from its PodSpec.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector {
  /**
   * Defines the policy for selecting the target pod when multiple pods match the podSelector. It can be either &#39;Any&#39; (select any one pod that matches the podSelector) or &#39;All&#39; (select all pods that match the podSelector).
   */
  @JsonAdapter(MultiPodSelectionPolicyEnum.Adapter.class)
  public enum MultiPodSelectionPolicyEnum {
    ALL("All"),
    
    ANY("Any");

    private String value;

    MultiPodSelectionPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MultiPodSelectionPolicyEnum fromValue(String value) {
      for (MultiPodSelectionPolicyEnum b : MultiPodSelectionPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MultiPodSelectionPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MultiPodSelectionPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MultiPodSelectionPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MultiPodSelectionPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MULTI_POD_SELECTION_POLICY = "multiPodSelectionPolicy";
  @SerializedName(SERIALIZED_NAME_MULTI_POD_SELECTION_POLICY)
  private MultiPodSelectionPolicyEnum multiPodSelectionPolicy;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector() {
  }

  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector multiPodSelectionPolicy(MultiPodSelectionPolicyEnum multiPodSelectionPolicy) {
    
    this.multiPodSelectionPolicy = multiPodSelectionPolicy;
    return this;
  }

   /**
   * Defines the policy for selecting the target pod when multiple pods match the podSelector. It can be either &#39;Any&#39; (select any one pod that matches the podSelector) or &#39;All&#39; (select all pods that match the podSelector).
   * @return multiPodSelectionPolicy
  **/
  @jakarta.annotation.Nullable
  public MultiPodSelectionPolicyEnum getMultiPodSelectionPolicy() {
    return multiPodSelectionPolicy;
  }


  public void setMultiPodSelectionPolicy(MultiPodSelectionPolicyEnum multiPodSelectionPolicy) {
    this.multiPodSelectionPolicy = multiPodSelectionPolicy;
  }


  public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Specifies the role of the target Pod.
   * @return role
  **/
  @jakarta.annotation.Nullable
  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector v1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector = (V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector) o;
    return Objects.equals(this.multiPodSelectionPolicy, v1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.multiPodSelectionPolicy) &&
        Objects.equals(this.role, v1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiPodSelectionPolicy, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector {\n");
    sb.append("    multiPodSelectionPolicy: ").append(toIndentedString(multiPodSelectionPolicy)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("multiPodSelectionPolicy");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector is not found in the empty JSON string", V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("multiPodSelectionPolicy") != null && !jsonObj.get("multiPodSelectionPolicy").isJsonNull()) && !jsonObj.get("multiPodSelectionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multiPodSelectionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multiPodSelectionPolicy").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector
  */
  public static V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecPodInfoExtractorsInnerPodSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

