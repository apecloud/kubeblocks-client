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
 * ServicePort contains information on service&#39;s port.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner {
  public static final String SERIALIZED_NAME_APP_PROTOCOL = "appProtocol";
  @SerializedName(SERIALIZED_NAME_APP_PROTOCOL)
  private String appProtocol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_PORT = "nodePort";
  @SerializedName(SERIALIZED_NAME_NODE_PORT)
  private Integer nodePort;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private Object targetPort;

  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner() {
  }

  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner appProtocol(String appProtocol) {
    
    this.appProtocol = appProtocol;
    return this;
  }

   /**
   * The application protocol for this port. This is used as a hint for implementations to offer richer behavior for protocols that they understand. This field follows standard Kubernetes label syntax. Valid values are either:   * Un-prefixed protocol names - reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names).   * Kubernetes-defined prefixed names: * &#39;kubernetes.io/h2c&#39; - HTTP/2 over cleartext as described in https://www.rfc-editor.org/rfc/rfc7540 * &#39;kubernetes.io/ws&#39;  - WebSocket over cleartext as described in https://www.rfc-editor.org/rfc/rfc6455 * &#39;kubernetes.io/wss&#39; - WebSocket over TLS as described in https://www.rfc-editor.org/rfc/rfc6455   * Other protocols should use implementation-defined prefixed names such as mycompany.com/my-custom-protocol.
   * @return appProtocol
  **/
  @jakarta.annotation.Nullable
  public String getAppProtocol() {
    return appProtocol;
  }


  public void setAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
  }


  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the &#39;name&#39; field in the EndpointPort. Optional if only one ServicePort is defined on this service.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner nodePort(Integer nodePort) {
    
    this.nodePort = nodePort;
    return this;
  }

   /**
   * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   * @return nodePort
  **/
  @jakarta.annotation.Nullable
  public Integer getNodePort() {
    return nodePort;
  }


  public void setNodePort(Integer nodePort) {
    this.nodePort = nodePort;
  }


  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port that will be exposed by this service.
   * @return port
  **/
  @jakarta.annotation.Nonnull
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * The IP protocol for this port. Supports \&quot;TCP\&quot;, \&quot;UDP\&quot;, and \&quot;SCTP\&quot;. Default is TCP.
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner targetPort(Object targetPort) {
    
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod&#39;s container ports. If this is not specified, the value of the &#39;port&#39; field is used (an identity map). This field is ignored for services with clusterIP&#x3D;None, and should be omitted or set equal to the &#39;port&#39; field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
   * @return targetPort
  **/
  @jakarta.annotation.Nullable
  public Object getTargetPort() {
    return targetPort;
  }


  public void setTargetPort(Object targetPort) {
    this.targetPort = targetPort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner = (V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner) o;
    return Objects.equals(this.appProtocol, v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.appProtocol) &&
        Objects.equals(this.name, v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.name) &&
        Objects.equals(this.nodePort, v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.nodePort) &&
        Objects.equals(this.port, v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.port) &&
        Objects.equals(this.protocol, v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.protocol) &&
        Objects.equals(this.targetPort, v1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProtocol, name, nodePort, port, protocol, targetPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner {\n");
    sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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
    openapiFields.add("appProtocol");
    openapiFields.add("name");
    openapiFields.add("nodePort");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("targetPort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("port");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("appProtocol") != null && !jsonObj.get("appProtocol").isJsonNull()) && !jsonObj.get("appProtocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appProtocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appProtocol").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner
  */
  public static V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecServicesInnerSpecPortsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

