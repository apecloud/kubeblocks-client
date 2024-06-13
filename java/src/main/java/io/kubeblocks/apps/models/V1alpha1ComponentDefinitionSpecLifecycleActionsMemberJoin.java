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
 * Defines the method to add a new replica to the replication group. This action is typically invoked when a new replica needs to be added, such as during scale-out. It may involve updating configuration, notifying other members, and ensuring data consistency.   The following dedicated environment variables are available for the action:   - KB_SERVICE_PORT: The port on which the DB service listens. - KB_SERVICE_USER: The username used to access the DB service with sufficient privileges. - KB_SERVICE_PASSWORD: The password of the user used to access the DB service . - KB_PRIMARY_POD_FQDN: The FQDN of the original primary Pod before switchover. - KB_NEW_MEMBER_POD_NAME: The name of the new member&#39;s Pod.   Output of the action: - ERROR: Any error message if the action fails.   This field cannot be updated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin {
  public static final String SERIALIZED_NAME_BUILTIN_HANDLER = "builtinHandler";
  @SerializedName(SERIALIZED_NAME_BUILTIN_HANDLER)
  private String builtinHandler;

  public static final String SERIALIZED_NAME_CUSTOM_HANDLER = "customHandler";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HANDLER)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler;

  public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin() {
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin builtinHandler(String builtinHandler) {
    
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


  public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin customHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    
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
    V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin v1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin = (V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin) o;
    return Objects.equals(this.builtinHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.builtinHandler) &&
        Objects.equals(this.customHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.customHandler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinHandler, customHandler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin
  */
  public static V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

