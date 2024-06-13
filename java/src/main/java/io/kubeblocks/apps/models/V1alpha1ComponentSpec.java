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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerClassDefRef;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner;
import io.kubeblocks.apps.models.V1alpha1ComponentSpecAffinity;
import io.kubeblocks.apps.models.V1alpha1ComponentSpecTlsConfig;
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
 * ComponentSpec defines the desired state of Component
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ComponentSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1alpha1ComponentSpecAffinity affinity;

  public static final String SERIALIZED_NAME_CLASS_DEF_REF = "classDefRef";
  @SerializedName(SERIALIZED_NAME_CLASS_DEF_REF)
  private V1alpha1ClusterSpecComponentSpecsInnerClassDefRef classDefRef;

  public static final String SERIALIZED_NAME_COMP_DEF = "compDef";
  @SerializedName(SERIALIZED_NAME_COMP_DEF)
  private String compDef;

  public static final String SERIALIZED_NAME_CONFIGS = "configs";
  @SerializedName(SERIALIZED_NAME_CONFIGS)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> configs;

  public static final String SERIALIZED_NAME_ENABLED_LOGS = "enabledLogs";
  @SerializedName(SERIALIZED_NAME_ENABLED_LOGS)
  private List<String> enabledLogs;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances;

  public static final String SERIALIZED_NAME_MONITOR = "monitor";
  @SerializedName(SERIALIZED_NAME_MONITOR)
  private Boolean monitor;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Object resources;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SERVICE_REFS = "serviceRefs";
  @SerializedName(SERIALIZED_NAME_SERVICE_REFS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> serviceRefs;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1alpha1ComponentSpecTlsConfig tlsConfig;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> tolerations;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner> volumeClaimTemplates;

  public V1alpha1ComponentSpec() {
  }

  public V1alpha1ComponentSpec affinity(V1alpha1ComponentSpecAffinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentSpecAffinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1alpha1ComponentSpecAffinity affinity) {
    this.affinity = affinity;
  }


  public V1alpha1ComponentSpec classDefRef(V1alpha1ClusterSpecComponentSpecsInnerClassDefRef classDefRef) {
    
    this.classDefRef = classDefRef;
    return this;
  }

   /**
   * Get classDefRef
   * @return classDefRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerClassDefRef getClassDefRef() {
    return classDefRef;
  }


  public void setClassDefRef(V1alpha1ClusterSpecComponentSpecsInnerClassDefRef classDefRef) {
    this.classDefRef = classDefRef;
  }


  public V1alpha1ComponentSpec compDef(String compDef) {
    
    this.compDef = compDef;
    return this;
  }

   /**
   * Specifies the name of the referenced ComponentDefinition.
   * @return compDef
  **/
  @jakarta.annotation.Nonnull
  public String getCompDef() {
    return compDef;
  }


  public void setCompDef(String compDef) {
    this.compDef = compDef;
  }


  public V1alpha1ComponentSpec configs(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> configs) {
    
    this.configs = configs;
    return this;
  }

  public V1alpha1ComponentSpec addConfigsItem(V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Defines the configuration for the component.
   * @return configs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> getConfigs() {
    return configs;
  }


  public void setConfigs(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner> configs) {
    this.configs = configs;
  }


  public V1alpha1ComponentSpec enabledLogs(List<String> enabledLogs) {
    
    this.enabledLogs = enabledLogs;
    return this;
  }

  public V1alpha1ComponentSpec addEnabledLogsItem(String enabledLogsItem) {
    if (this.enabledLogs == null) {
      this.enabledLogs = new ArrayList<>();
    }
    this.enabledLogs.add(enabledLogsItem);
    return this;
  }

   /**
   * Indicates which log file takes effect in the database cluster, element is the log type which is defined in ComponentDefinition logConfig.name.
   * @return enabledLogs
  **/
  @jakarta.annotation.Nullable
  public List<String> getEnabledLogs() {
    return enabledLogs;
  }


  public void setEnabledLogs(List<String> enabledLogs) {
    this.enabledLogs = enabledLogs;
  }


  public V1alpha1ComponentSpec instances(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances) {
    
    this.instances = instances;
    return this;
  }

  public V1alpha1ComponentSpec addInstancesItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInner instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Overrides values in default Template.
   * @return instances
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> getInstances() {
    return instances;
  }


  public void setInstances(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances) {
    this.instances = instances;
  }


  public V1alpha1ComponentSpec monitor(Boolean monitor) {
    
    this.monitor = monitor;
    return this;
  }

   /**
   * A switch to enable monitoring and is set as false by default. KubeBlocks provides an extension mechanism to support component level monitoring, which will scrape metrics auto or manually from servers in component and export metrics to Time Series Database.
   * @return monitor
  **/
  @jakarta.annotation.Nullable
  public Boolean getMonitor() {
    return monitor;
  }


  public void setMonitor(Boolean monitor) {
    this.monitor = monitor;
  }


  public V1alpha1ComponentSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Specifies the desired number of replicas for the component&#39;s workload.
   * minimum: 0
   * @return replicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1ComponentSpec resources(Object resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Requests and limits of workload resources.
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public Object getResources() {
    return resources;
  }


  public void setResources(Object resources) {
    this.resources = resources;
  }


  public V1alpha1ComponentSpec serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * The name of the ServiceAccount that running component depends on.
   * @return serviceAccountName
  **/
  @jakarta.annotation.Nullable
  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public V1alpha1ComponentSpec serviceRefs(List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> serviceRefs) {
    
    this.serviceRefs = serviceRefs;
    return this;
  }

  public V1alpha1ComponentSpec addServiceRefsItem(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner serviceRefsItem) {
    if (this.serviceRefs == null) {
      this.serviceRefs = new ArrayList<>();
    }
    this.serviceRefs.add(serviceRefsItem);
    return this;
  }

   /**
   * Define service references for the current component. Based on the referenced services, they can be categorized into two types: - Service provided by external sources: These services are provided by external sources and are not managed by KubeBlocks. They can be Kubernetes-based or non-Kubernetes services. For external services, you need to provide an additional ServiceDescriptor object to establish the service binding. - Service provided by other KubeBlocks clusters: These services are provided by other KubeBlocks clusters. You can bind to these services by specifying the name of the hosting cluster.   Each type of service reference requires specific configurations and bindings to establish the connection and interaction with the respective services. It should be noted that the ServiceRef has cluster-level semantic consistency, meaning that within the same Cluster, service references with the same ServiceRef.Name are considered to be the same service. It is only allowed to bind to the same Cluster or ServiceDescriptor.
   * @return serviceRefs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> getServiceRefs() {
    return serviceRefs;
  }


  public void setServiceRefs(List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> serviceRefs) {
    this.serviceRefs = serviceRefs;
  }


  public V1alpha1ComponentSpec tlsConfig(V1alpha1ComponentSpecTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentSpecTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(V1alpha1ComponentSpecTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
  }


  public V1alpha1ComponentSpec tolerations(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public V1alpha1ComponentSpec addTolerationsItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Specify the tolerations for the component&#39;s workload. If specified, they will override the cluster-wide toleration settings.
   * @return tolerations
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> tolerations) {
    this.tolerations = tolerations;
  }


  public V1alpha1ComponentSpec volumeClaimTemplates(List<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner> volumeClaimTemplates) {
    
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1alpha1ComponentSpec addVolumeClaimTemplatesItem(V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * Information for statefulset.spec.volumeClaimTemplates.
   * @return volumeClaimTemplates
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }


  public void setVolumeClaimTemplates(List<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentSpec v1alpha1ComponentSpec = (V1alpha1ComponentSpec) o;
    return Objects.equals(this.affinity, v1alpha1ComponentSpec.affinity) &&
        Objects.equals(this.classDefRef, v1alpha1ComponentSpec.classDefRef) &&
        Objects.equals(this.compDef, v1alpha1ComponentSpec.compDef) &&
        Objects.equals(this.configs, v1alpha1ComponentSpec.configs) &&
        Objects.equals(this.enabledLogs, v1alpha1ComponentSpec.enabledLogs) &&
        Objects.equals(this.instances, v1alpha1ComponentSpec.instances) &&
        Objects.equals(this.monitor, v1alpha1ComponentSpec.monitor) &&
        Objects.equals(this.replicas, v1alpha1ComponentSpec.replicas) &&
        Objects.equals(this.resources, v1alpha1ComponentSpec.resources) &&
        Objects.equals(this.serviceAccountName, v1alpha1ComponentSpec.serviceAccountName) &&
        Objects.equals(this.serviceRefs, v1alpha1ComponentSpec.serviceRefs) &&
        Objects.equals(this.tlsConfig, v1alpha1ComponentSpec.tlsConfig) &&
        Objects.equals(this.tolerations, v1alpha1ComponentSpec.tolerations) &&
        Objects.equals(this.volumeClaimTemplates, v1alpha1ComponentSpec.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, classDefRef, compDef, configs, enabledLogs, instances, monitor, replicas, resources, serviceAccountName, serviceRefs, tlsConfig, tolerations, volumeClaimTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    classDefRef: ").append(toIndentedString(classDefRef)).append("\n");
    sb.append("    compDef: ").append(toIndentedString(compDef)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    enabledLogs: ").append(toIndentedString(enabledLogs)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    serviceRefs: ").append(toIndentedString(serviceRefs)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
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
    openapiFields.add("affinity");
    openapiFields.add("classDefRef");
    openapiFields.add("compDef");
    openapiFields.add("configs");
    openapiFields.add("enabledLogs");
    openapiFields.add("instances");
    openapiFields.add("monitor");
    openapiFields.add("replicas");
    openapiFields.add("resources");
    openapiFields.add("serviceAccountName");
    openapiFields.add("serviceRefs");
    openapiFields.add("tlsConfig");
    openapiFields.add("tolerations");
    openapiFields.add("volumeClaimTemplates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("compDef");
    openapiRequiredFields.add("replicas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentSpec is not found in the empty JSON string", V1alpha1ComponentSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `affinity`
      if (jsonObj.get("affinity") != null && !jsonObj.get("affinity").isJsonNull()) {
        V1alpha1ComponentSpecAffinity.validateJsonObject(jsonObj.getAsJsonObject("affinity"));
      }
      // validate the optional field `classDefRef`
      if (jsonObj.get("classDefRef") != null && !jsonObj.get("classDefRef").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerClassDefRef.validateJsonObject(jsonObj.getAsJsonObject("classDefRef"));
      }
      if (!jsonObj.get("compDef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compDef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compDef").toString()));
      }
      if (jsonObj.get("configs") != null && !jsonObj.get("configs").isJsonNull()) {
        JsonArray jsonArrayconfigs = jsonObj.getAsJsonArray("configs");
        if (jsonArrayconfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configs` to be an array in the JSON string but got `%s`", jsonObj.get("configs").toString()));
          }

          // validate the optional field `configs` (array)
          for (int i = 0; i < jsonArrayconfigs.size(); i++) {
            V1alpha1ClusterDefinitionSpecComponentDefsInnerConfigSpecsInner.validateJsonObject(jsonArrayconfigs.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabledLogs") != null && !jsonObj.get("enabledLogs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledLogs` to be an array in the JSON string but got `%s`", jsonObj.get("enabledLogs").toString()));
      }
      if (jsonObj.get("instances") != null && !jsonObj.get("instances").isJsonNull()) {
        JsonArray jsonArrayinstances = jsonObj.getAsJsonArray("instances");
        if (jsonArrayinstances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("instances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `instances` to be an array in the JSON string but got `%s`", jsonObj.get("instances").toString()));
          }

          // validate the optional field `instances` (array)
          for (int i = 0; i < jsonArrayinstances.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.validateJsonObject(jsonArrayinstances.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("serviceAccountName") != null && !jsonObj.get("serviceAccountName").isJsonNull()) && !jsonObj.get("serviceAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccountName").toString()));
      }
      if (jsonObj.get("serviceRefs") != null && !jsonObj.get("serviceRefs").isJsonNull()) {
        JsonArray jsonArrayserviceRefs = jsonObj.getAsJsonArray("serviceRefs");
        if (jsonArrayserviceRefs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serviceRefs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serviceRefs` to be an array in the JSON string but got `%s`", jsonObj.get("serviceRefs").toString()));
          }

          // validate the optional field `serviceRefs` (array)
          for (int i = 0; i < jsonArrayserviceRefs.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner.validateJsonObject(jsonArrayserviceRefs.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `tlsConfig`
      if (jsonObj.get("tlsConfig") != null && !jsonObj.get("tlsConfig").isJsonNull()) {
        V1alpha1ComponentSpecTlsConfig.validateJsonObject(jsonObj.getAsJsonObject("tlsConfig"));
      }
      if (jsonObj.get("tolerations") != null && !jsonObj.get("tolerations").isJsonNull()) {
        JsonArray jsonArraytolerations = jsonObj.getAsJsonArray("tolerations");
        if (jsonArraytolerations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tolerations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tolerations` to be an array in the JSON string but got `%s`", jsonObj.get("tolerations").toString()));
          }

          // validate the optional field `tolerations` (array)
          for (int i = 0; i < jsonArraytolerations.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner.validateJsonObject(jsonArraytolerations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("volumeClaimTemplates") != null && !jsonObj.get("volumeClaimTemplates").isJsonNull()) {
        JsonArray jsonArrayvolumeClaimTemplates = jsonObj.getAsJsonArray("volumeClaimTemplates");
        if (jsonArrayvolumeClaimTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeClaimTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeClaimTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("volumeClaimTemplates").toString()));
          }

          // validate the optional field `volumeClaimTemplates` (array)
          for (int i = 0; i < jsonArrayvolumeClaimTemplates.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner.validateJsonObject(jsonArrayvolumeClaimTemplates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentSpec
  */
  public static V1alpha1ComponentSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ComponentSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

