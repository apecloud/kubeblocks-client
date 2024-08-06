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
import io.kubeblocks.dataprotection.models.V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelectionSourceOfOneToMany;
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
 * Specifies the restore policy, which is required when the pod selection strategy for the source target is &#39;All&#39;. This field is ignored if the pod selection strategy is &#39;Any&#39;. optional
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T14:00:51.636603Z[Etc/UTC]")
public class V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection {
  public static final String SERIALIZED_NAME_DATA_RESTORE_POLICY = "dataRestorePolicy";
  @SerializedName(SERIALIZED_NAME_DATA_RESTORE_POLICY)
  private String dataRestorePolicy;

  public static final String SERIALIZED_NAME_SOURCE_OF_ONE_TO_MANY = "sourceOfOneToMany";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_ONE_TO_MANY)
  private V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelectionSourceOfOneToMany sourceOfOneToMany;

  public V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection() {
  }

  public V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection dataRestorePolicy(String dataRestorePolicy) {
    
    this.dataRestorePolicy = dataRestorePolicy;
    return this;
  }

   /**
   * Specifies the data restore policy. Options include: - OneToMany: Enables restoration of all volumes from a single data copy of the original target instance. The &#39;sourceOfOneToMany&#39; field must be set when using this policy. - OneToOne: Restricts data restoration such that each data piece can only be restored to a single target instance. This is the default policy. When the number of target instances specified for restoration surpasses the count of original backup target instances.
   * @return dataRestorePolicy
  **/
  @jakarta.annotation.Nonnull
  public String getDataRestorePolicy() {
    return dataRestorePolicy;
  }


  public void setDataRestorePolicy(String dataRestorePolicy) {
    this.dataRestorePolicy = dataRestorePolicy;
  }


  public V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection sourceOfOneToMany(V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelectionSourceOfOneToMany sourceOfOneToMany) {
    
    this.sourceOfOneToMany = sourceOfOneToMany;
    return this;
  }

   /**
   * Get sourceOfOneToMany
   * @return sourceOfOneToMany
  **/
  @jakarta.annotation.Nullable
  public V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelectionSourceOfOneToMany getSourceOfOneToMany() {
    return sourceOfOneToMany;
  }


  public void setSourceOfOneToMany(V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelectionSourceOfOneToMany sourceOfOneToMany) {
    this.sourceOfOneToMany = sourceOfOneToMany;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection v1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection = (V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection) o;
    return Objects.equals(this.dataRestorePolicy, v1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.dataRestorePolicy) &&
        Objects.equals(this.sourceOfOneToMany, v1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.sourceOfOneToMany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRestorePolicy, sourceOfOneToMany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection {\n");
    sb.append("    dataRestorePolicy: ").append(toIndentedString(dataRestorePolicy)).append("\n");
    sb.append("    sourceOfOneToMany: ").append(toIndentedString(sourceOfOneToMany)).append("\n");
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
    openapiFields.add("dataRestorePolicy");
    openapiFields.add("sourceOfOneToMany");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataRestorePolicy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection is not found in the empty JSON string", V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("dataRestorePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataRestorePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataRestorePolicy").toString()));
      }
      // validate the optional field `sourceOfOneToMany`
      if (jsonObj.get("sourceOfOneToMany") != null && !jsonObj.get("sourceOfOneToMany").isJsonNull()) {
        V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelectionSourceOfOneToMany.validateJsonObject(jsonObj.getAsJsonObject("sourceOfOneToMany"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection>() {
           @Override
           public void write(JsonWriter out, V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection
  */
  public static V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection.class);
  }

 /**
  * Convert an instance of V1alpha1RestoreSpecPrepareDataConfigRequiredPolicyForAllPodSelection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

