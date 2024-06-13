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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler;
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
 * Specifies the actions and corresponding policy to be executed when a component is created. The precondition for executing PostProvision can be defined using Action.PreCondition. The default precondition for PostProvision action is ComponentReady. The PostProvision Action will be executed only once. The following dedicated environment variables are available for the action:   - KB_CLUSTER_COMPONENT_LIST: Lists all components in the cluster, joined by &#39;,&#39; (e.g., \&quot;comp1,comp2\&quot;). - KB_CLUSTER_COMPONENT_POD_NAME_LIST: Lists all pod names in this component, joined by &#39;,&#39; (e.g., \&quot;pod1,pod2\&quot;). - KB_CLUSTER_COMPONENT_POD_IP_LIST: Lists the IP addresses of each pod in this component, corresponding one-to-one with each pod in the KB_CLUSTER_COMPONENT_POD_NAME_LIST. Joined by &#39;,&#39; (e.g., \&quot;podIp1,podIp2\&quot;). - KB_CLUSTER_COMPONENT_POD_HOST_NAME_LIST: Lists the host names where each pod resides in this component, corresponding one-to-one with each pod in the KB_CLUSTER_COMPONENT_POD_NAME_LIST. Joined by &#39;,&#39; (e.g., \&quot;hostName1,hostName2\&quot;). - KB_CLUSTER_COMPONENT_POD_HOST_IP_LIST: Lists the host IP addresses where each pod resides in this component, corresponding one-to-one with each pod in the KB_CLUSTER_COMPONENT_POD_NAME_LIST. Joined by &#39;,&#39; (e.g., \&quot;hostIp1,hostIp2\&quot;).   This field cannot be updated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision {
  public static final String SERIALIZED_NAME_BUILTIN_HANDLER = "builtinHandler";
  @SerializedName(SERIALIZED_NAME_BUILTIN_HANDLER)
  private String builtinHandler;

  public static final String SERIALIZED_NAME_CUSTOM_HANDLER = "customHandler";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HANDLER)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler;

  public V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision() {
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision builtinHandler(String builtinHandler) {
    
    this.builtinHandler = builtinHandler;
    return this;
  }

   /**
   * BuiltinHandler specifies the builtin action handler name to do the action. the BuiltinHandler within the same ComponentLifecycleActions should be consistent. Details can be queried through official documentation in the future. use CustomHandler to define your own actions if none of them satisfies the requirement.
   * @return builtinHandler
  **/
  @jakarta.annotation.Nullable
  public String getBuiltinHandler() {
    return builtinHandler;
  }


  public void setBuiltinHandler(String builtinHandler) {
    this.builtinHandler = builtinHandler;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision customHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    
    this.customHandler = customHandler;
    return this;
  }

   /**
   * Get customHandler
   * @return customHandler
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler getCustomHandler() {
    return customHandler;
  }


  public void setCustomHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    this.customHandler = customHandler;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision v1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision = (V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision) o;
    return Objects.equals(this.builtinHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.builtinHandler) &&
        Objects.equals(this.customHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.customHandler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinHandler, customHandler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision {\n");
    sb.append("    builtinHandler: ").append(toIndentedString(builtinHandler)).append("\n");
    sb.append("    customHandler: ").append(toIndentedString(customHandler)).append("\n");
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
    openapiFields.add("builtinHandler");
    openapiFields.add("customHandler");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("builtinHandler") != null && !jsonObj.get("builtinHandler").isJsonNull()) && !jsonObj.get("builtinHandler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builtinHandler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builtinHandler").toString()));
      }
      // validate the optional field `customHandler`
      if (jsonObj.get("customHandler") != null && !jsonObj.get("customHandler").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler.validateJsonObject(jsonObj.getAsJsonObject("customHandler"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision
  */
  public static V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsPostProvision to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

