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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecExposeInnerServicesInner;
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
 * V1alpha1OpsRequestSpecExposeInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecExposeInner {
  public static final String SERIALIZED_NAME_COMPONENT_NAME = "componentName";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<V1alpha1OpsRequestSpecExposeInnerServicesInner> services = new ArrayList<>();

  /**
   * Controls the expose operation. If set to Enable, the corresponding service will be exposed. Conversely, if set to Disable, the service will be removed.
   */
  @JsonAdapter(SwitchEnum.Adapter.class)
  public enum SwitchEnum {
    ENABLE("Enable"),
    
    DISABLE("Disable");

    private String value;

    SwitchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SwitchEnum fromValue(String value) {
      for (SwitchEnum b : SwitchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SwitchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SwitchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SwitchEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SwitchEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SWITCH = "switch";
  @SerializedName(SERIALIZED_NAME_SWITCH)
  private SwitchEnum _switch;

  public V1alpha1OpsRequestSpecExposeInner() {
  }

  public V1alpha1OpsRequestSpecExposeInner componentName(String componentName) {
    
    this.componentName = componentName;
    return this;
  }

   /**
   * Specifies the name of the cluster component.
   * @return componentName
  **/
  @jakarta.annotation.Nonnull
  public String getComponentName() {
    return componentName;
  }


  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public V1alpha1OpsRequestSpecExposeInner services(List<V1alpha1OpsRequestSpecExposeInnerServicesInner> services) {
    
    this.services = services;
    return this;
  }

  public V1alpha1OpsRequestSpecExposeInner addServicesItem(V1alpha1OpsRequestSpecExposeInnerServicesInner servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * A list of services that are to be exposed or removed. If componentNamem is not specified, each &#x60;OpsService&#x60; in the list must specify ports and selectors.
   * @return services
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1OpsRequestSpecExposeInnerServicesInner> getServices() {
    return services;
  }


  public void setServices(List<V1alpha1OpsRequestSpecExposeInnerServicesInner> services) {
    this.services = services;
  }


  public V1alpha1OpsRequestSpecExposeInner _switch(SwitchEnum _switch) {
    
    this._switch = _switch;
    return this;
  }

   /**
   * Controls the expose operation. If set to Enable, the corresponding service will be exposed. Conversely, if set to Disable, the service will be removed.
   * @return _switch
  **/
  @jakarta.annotation.Nonnull
  public SwitchEnum getSwitch() {
    return _switch;
  }


  public void setSwitch(SwitchEnum _switch) {
    this._switch = _switch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecExposeInner v1alpha1OpsRequestSpecExposeInner = (V1alpha1OpsRequestSpecExposeInner) o;
    return Objects.equals(this.componentName, v1alpha1OpsRequestSpecExposeInner.componentName) &&
        Objects.equals(this.services, v1alpha1OpsRequestSpecExposeInner.services) &&
        Objects.equals(this._switch, v1alpha1OpsRequestSpecExposeInner._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentName, services, _switch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecExposeInner {\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
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
    openapiFields.add("componentName");
    openapiFields.add("services");
    openapiFields.add("switch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("componentName");
    openapiRequiredFields.add("services");
    openapiRequiredFields.add("switch");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecExposeInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecExposeInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecExposeInner is not found in the empty JSON string", V1alpha1OpsRequestSpecExposeInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecExposeInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecExposeInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecExposeInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("componentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("services").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `services` to be an array in the JSON string but got `%s`", jsonObj.get("services").toString()));
      }

      JsonArray jsonArrayservices = jsonObj.getAsJsonArray("services");
      // validate the required field `services` (array)
      for (int i = 0; i < jsonArrayservices.size(); i++) {
        V1alpha1OpsRequestSpecExposeInnerServicesInner.validateJsonObject(jsonArrayservices.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("switch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `switch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("switch").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecExposeInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecExposeInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecExposeInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecExposeInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecExposeInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecExposeInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecExposeInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecExposeInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecExposeInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecExposeInner
  */
  public static V1alpha1OpsRequestSpecExposeInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecExposeInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecExposeInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

