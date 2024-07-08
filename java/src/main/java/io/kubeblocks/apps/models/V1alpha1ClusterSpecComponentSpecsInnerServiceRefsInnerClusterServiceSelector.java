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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorCredential;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorService;
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
 * References a service provided by another KubeBlocks Cluster. It specifies the ClusterService and the account credentials needed for access.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  private V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorCredential credential;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorService service;

  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * The name of the Cluster being referenced.
   * @return cluster
  **/
  @jakarta.annotation.Nonnull
  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector credential(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorCredential credential) {
    
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorCredential getCredential() {
    return credential;
  }


  public void setCredential(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorCredential credential) {
    this.credential = credential;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector service(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorService service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorService getService() {
    return service;
  }


  public void setService(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorService service) {
    this.service = service;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector = (V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector) o;
    return Objects.equals(this.cluster, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.cluster) &&
        Objects.equals(this.credential, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.credential) &&
        Objects.equals(this.service, v1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, credential, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
    openapiFields.add("cluster");
    openapiFields.add("credential");
    openapiFields.add("service");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cluster");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cluster").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster").toString()));
      }
      // validate the optional field `credential`
      if (jsonObj.get("credential") != null && !jsonObj.get("credential").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorCredential.validateJsonObject(jsonObj.getAsJsonObject("credential"));
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelectorService.validateJsonObject(jsonObj.getAsJsonObject("service"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInnerClusterServiceSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

