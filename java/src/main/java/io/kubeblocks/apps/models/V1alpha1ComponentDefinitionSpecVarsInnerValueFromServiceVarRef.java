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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort;
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
 * Selects a defined var of a Service.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef {
  public static final String SERIALIZED_NAME_COMP_DEF = "compDef";
  @SerializedName(SERIALIZED_NAME_COMP_DEF)
  private String compDef;

  public static final String SERIALIZED_NAME_GENERATE_POD_ORDINAL_SERVICE_VAR = "generatePodOrdinalServiceVar";
  @SerializedName(SERIALIZED_NAME_GENERATE_POD_ORDINAL_SERVICE_VAR)
  private Boolean generatePodOrdinalServiceVar;

  /**
   * VarOption defines whether a variable is required or optional.
   */
  @JsonAdapter(HostEnum.Adapter.class)
  public enum HostEnum {
    REQUIRED("Required"),
    
    OPTIONAL("Optional");

    private String value;

    HostEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HostEnum fromValue(String value) {
      for (HostEnum b : HostEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HostEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HostEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HostEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HostEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private HostEnum host;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_PORT = "nodePort";
  @SerializedName(SERIALIZED_NAME_NODE_PORT)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort nodePort;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort port;

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef() {
  }

  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef compDef(String compDef) {
    
    this.compDef = compDef;
    return this;
  }

   /**
   * CompDef specifies the definition used by the component that the referent object resident in.
   * @return compDef
  **/
  @jakarta.annotation.Nullable
  public String getCompDef() {
    return compDef;
  }


  public void setCompDef(String compDef) {
    this.compDef = compDef;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef generatePodOrdinalServiceVar(Boolean generatePodOrdinalServiceVar) {
    
    this.generatePodOrdinalServiceVar = generatePodOrdinalServiceVar;
    return this;
  }

   /**
   * GeneratePodOrdinalServiceVar indicates whether to create a corresponding ServiceVars reference variable for each Pod. If set to true, a set of ServiceVars that can be referenced will be automatically generated for each Pod Ordinal. They can be referred to by adding the PodOrdinal to the defined name template with named pattern &#x60;$(Vars[x].Name)_$(PodOrdinal)&#x60;. For example, a ServiceVarRef might be defined as follows:   &#x60;&#x60;&#x60;yaml   name: MY_SERVICE_PORT valueFrom: serviceVarRef: compDef: my-component-definition name: my-service optional: true generatePodOrdinalServiceVar: true port: name: redis-sentinel   &#x60;&#x60;&#x60;   Assuming that the Component has 3 replicas, then you can reference the port of existing services named my-service-0, my-service-1, and my-service-2 with $MY_SERVICE_PORT_0, $MY_SERVICE_PORT_1, and $MY_SERVICE_PORT_2, respectively. It should be used in conjunction with Service.GeneratePodOrdinalService.
   * @return generatePodOrdinalServiceVar
  **/
  @jakarta.annotation.Nullable
  public Boolean getGeneratePodOrdinalServiceVar() {
    return generatePodOrdinalServiceVar;
  }


  public void setGeneratePodOrdinalServiceVar(Boolean generatePodOrdinalServiceVar) {
    this.generatePodOrdinalServiceVar = generatePodOrdinalServiceVar;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef host(HostEnum host) {
    
    this.host = host;
    return this;
  }

   /**
   * VarOption defines whether a variable is required or optional.
   * @return host
  **/
  @jakarta.annotation.Nullable
  public HostEnum getHost() {
    return host;
  }


  public void setHost(HostEnum host) {
    this.host = host;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent object.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef nodePort(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort nodePort) {
    
    this.nodePort = nodePort;
    return this;
  }

   /**
   * Get nodePort
   * @return nodePort
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort getNodePort() {
    return nodePort;
  }


  public void setNodePort(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort nodePort) {
    this.nodePort = nodePort;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the object must be defined.
   * @return optional
  **/
  @jakarta.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef port(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort getPort() {
    return port;
  }


  public void setPort(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef = (V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef) o;
    return Objects.equals(this.compDef, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.compDef) &&
        Objects.equals(this.generatePodOrdinalServiceVar, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.generatePodOrdinalServiceVar) &&
        Objects.equals(this.host, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.host) &&
        Objects.equals(this.name, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.name) &&
        Objects.equals(this.nodePort, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.nodePort) &&
        Objects.equals(this.optional, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.optional) &&
        Objects.equals(this.port, v1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compDef, generatePodOrdinalServiceVar, host, name, nodePort, optional, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef {\n");
    sb.append("    compDef: ").append(toIndentedString(compDef)).append("\n");
    sb.append("    generatePodOrdinalServiceVar: ").append(toIndentedString(generatePodOrdinalServiceVar)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("compDef");
    openapiFields.add("generatePodOrdinalServiceVar");
    openapiFields.add("host");
    openapiFields.add("name");
    openapiFields.add("nodePort");
    openapiFields.add("optional");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("compDef") != null && !jsonObj.get("compDef").isJsonNull()) && !jsonObj.get("compDef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compDef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compDef").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `nodePort`
      if (jsonObj.get("nodePort") != null && !jsonObj.get("nodePort").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort.validateJsonObject(jsonObj.getAsJsonObject("nodePort"));
      }
      // validate the optional field `port`
      if (jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRefNodePort.validateJsonObject(jsonObj.getAsJsonObject("port"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef
  */
  public static V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecVarsInnerValueFromServiceVarRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

