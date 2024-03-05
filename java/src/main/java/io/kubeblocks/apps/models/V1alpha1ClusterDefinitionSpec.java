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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInner;
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
 * ClusterDefinitionSpec defines the desired state of ClusterDefinition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpec {
  public static final String SERIALIZED_NAME_COMPONENT_DEFS = "componentDefs";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEFS)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInner> componentDefs = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNECTION_CREDENTIAL = "connectionCredential";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CREDENTIAL)
  private Map<String, String> connectionCredential = new HashMap<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1alpha1ClusterDefinitionSpec() {
  }

  public V1alpha1ClusterDefinitionSpec componentDefs(List<V1alpha1ClusterDefinitionSpecComponentDefsInner> componentDefs) {
    
    this.componentDefs = componentDefs;
    return this;
  }

  public V1alpha1ClusterDefinitionSpec addComponentDefsItem(V1alpha1ClusterDefinitionSpecComponentDefsInner componentDefsItem) {
    if (this.componentDefs == null) {
      this.componentDefs = new ArrayList<>();
    }
    this.componentDefs.add(componentDefsItem);
    return this;
  }

   /**
   * Provides the definitions for the cluster components.
   * @return componentDefs
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInner> getComponentDefs() {
    return componentDefs;
  }


  public void setComponentDefs(List<V1alpha1ClusterDefinitionSpecComponentDefsInner> componentDefs) {
    this.componentDefs = componentDefs;
  }


  public V1alpha1ClusterDefinitionSpec connectionCredential(Map<String, String> connectionCredential) {
    
    this.connectionCredential = connectionCredential;
    return this;
  }

  public V1alpha1ClusterDefinitionSpec putConnectionCredentialItem(String key, String connectionCredentialItem) {
    if (this.connectionCredential == null) {
      this.connectionCredential = new HashMap<>();
    }
    this.connectionCredential.put(key, connectionCredentialItem);
    return this;
  }

   /**
   * Connection credential template used for creating a connection credential secret for cluster objects.   Built-in objects are:   - &#x60;$(RANDOM_PASSWD)&#x60; random 8 characters. - &#x60;$(STRONG_RANDOM_PASSWD)&#x60; random 16 characters, with mixed cases, digits and symbols. - &#x60;$(UUID)&#x60; generate a random UUID v4 string. - &#x60;$(UUID_B64)&#x60; generate a random UUID v4 BASE64 encoded string. - &#x60;$(UUID_STR_B64)&#x60; generate a random UUID v4 string then BASE64 encoded. - &#x60;$(UUID_HEX)&#x60; generate a random UUID v4 HEX representation. - &#x60;$(HEADLESS_SVC_FQDN)&#x60; headless service FQDN placeholder, value pattern is &#x60;$(CLUSTER_NAME)-$(1ST_COMP_NAME)-headless.$(NAMESPACE).svc&#x60;, where 1ST_COMP_NAME is the 1st component that provide &#x60;ClusterDefinition.spec.componentDefs[].service&#x60; attribute; - &#x60;$(SVC_FQDN)&#x60; service FQDN placeholder, value pattern is &#x60;$(CLUSTER_NAME)-$(1ST_COMP_NAME).$(NAMESPACE).svc&#x60;, where 1ST_COMP_NAME is the 1st component that provide &#x60;ClusterDefinition.spec.componentDefs[].service&#x60; attribute; - &#x60;$(SVC_PORT_{PORT-NAME})&#x60; is ServicePort&#39;s port value with specified port name, i.e, a servicePort JSON struct: &#x60;{\&quot;name\&quot;: \&quot;mysql\&quot;, \&quot;targetPort\&quot;: \&quot;mysqlContainerPort\&quot;, \&quot;port\&quot;: 3306}&#x60;, and &#x60;$(SVC_PORT_mysql)&#x60; in the connection credential value is 3306.
   * @return connectionCredential
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getConnectionCredential() {
    return connectionCredential;
  }


  public void setConnectionCredential(Map<String, String> connectionCredential) {
    this.connectionCredential = connectionCredential;
  }


  public V1alpha1ClusterDefinitionSpec type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Specifies the well-known application cluster type, such as mysql, redis, or mongodb.
   * @return type
  **/
  @jakarta.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
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
    V1alpha1ClusterDefinitionSpec v1alpha1ClusterDefinitionSpec = (V1alpha1ClusterDefinitionSpec) o;
    return Objects.equals(this.componentDefs, v1alpha1ClusterDefinitionSpec.componentDefs) &&
        Objects.equals(this.connectionCredential, v1alpha1ClusterDefinitionSpec.connectionCredential) &&
        Objects.equals(this.type, v1alpha1ClusterDefinitionSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentDefs, connectionCredential, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpec {\n");
    sb.append("    componentDefs: ").append(toIndentedString(componentDefs)).append("\n");
    sb.append("    connectionCredential: ").append(toIndentedString(connectionCredential)).append("\n");
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
    openapiFields.add("componentDefs");
    openapiFields.add("connectionCredential");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("componentDefs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpec is not found in the empty JSON string", V1alpha1ClusterDefinitionSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("componentDefs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentDefs` to be an array in the JSON string but got `%s`", jsonObj.get("componentDefs").toString()));
      }

      JsonArray jsonArraycomponentDefs = jsonObj.getAsJsonArray("componentDefs");
      // validate the required field `componentDefs` (array)
      for (int i = 0; i < jsonArraycomponentDefs.size(); i++) {
        V1alpha1ClusterDefinitionSpecComponentDefsInner.validateJsonObject(jsonArraycomponentDefs.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpec
  */
  public static V1alpha1ClusterDefinitionSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

