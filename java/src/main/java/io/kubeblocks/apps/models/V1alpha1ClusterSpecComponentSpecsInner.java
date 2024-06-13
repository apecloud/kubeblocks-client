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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecAffinity;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerClassDefRef;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerIssuer;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerServicesInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerSwitchPolicy;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner;
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
 * ClusterComponentSpec defines the specifications for a cluster component. TODO +kubebuilder:validation:XValidation:rule&#x3D;\&quot;!has(oldSelf.componentDefRef) || has(self.componentDefRef)\&quot;, message&#x3D;\&quot;componentDefRef is required once set\&quot; TODO +kubebuilder:validation:XValidation:rule&#x3D;\&quot;!has(oldSelf.componentDef) || has(self.componentDef)\&quot;, message&#x3D;\&quot;componentDef is required once set\&quot;
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T14:34:07.299798Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInner {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1alpha1ClusterSpecAffinity affinity;

  public static final String SERIALIZED_NAME_CLASS_DEF_REF = "classDefRef";
  @SerializedName(SERIALIZED_NAME_CLASS_DEF_REF)
  private V1alpha1ClusterSpecComponentSpecsInnerClassDefRef classDefRef;

  public static final String SERIALIZED_NAME_COMPONENT_DEF = "componentDef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF)
  private String componentDef;

  public static final String SERIALIZED_NAME_COMPONENT_DEF_REF = "componentDefRef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF_REF)
  private String componentDefRef;

  public static final String SERIALIZED_NAME_ENABLED_LOGS = "enabledLogs";
  @SerializedName(SERIALIZED_NAME_ENABLED_LOGS)
  private List<String> enabledLogs;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private V1alpha1ClusterSpecComponentSpecsInnerIssuer issuer;

  public static final String SERIALIZED_NAME_MONITOR = "monitor";
  @SerializedName(SERIALIZED_NAME_MONITOR)
  private Boolean monitor;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerServicesInner> services;

  public static final String SERIALIZED_NAME_SWITCH_POLICY = "switchPolicy";
  @SerializedName(SERIALIZED_NAME_SWITCH_POLICY)
  private V1alpha1ClusterSpecComponentSpecsInnerSwitchPolicy switchPolicy;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private Boolean tls;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private Object tolerations;

  /**
   * Defines the update strategy for the component. Not supported.
   */
  @JsonAdapter(UpdateStrategyEnum.Adapter.class)
  public enum UpdateStrategyEnum {
    SERIAL("Serial"),
    
    BESTEFFORTPARALLEL("BestEffortParallel"),
    
    PARALLEL("Parallel");

    private String value;

    UpdateStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateStrategyEnum fromValue(String value) {
      for (UpdateStrategyEnum b : UpdateStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";
  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  private UpdateStrategyEnum updateStrategy;

  public static final String SERIALIZED_NAME_USER_RESOURCE_REFS = "userResourceRefs";
  @SerializedName(SERIALIZED_NAME_USER_RESOURCE_REFS)
  private V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs userResourceRefs;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner> volumeClaimTemplates;

  public V1alpha1ClusterSpecComponentSpecsInner() {
  }

  public V1alpha1ClusterSpecComponentSpecsInner affinity(V1alpha1ClusterSpecAffinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecAffinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1alpha1ClusterSpecAffinity affinity) {
    this.affinity = affinity;
  }


  public V1alpha1ClusterSpecComponentSpecsInner classDefRef(V1alpha1ClusterSpecComponentSpecsInnerClassDefRef classDefRef) {
    
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


  public V1alpha1ClusterSpecComponentSpecsInner componentDef(String componentDef) {
    
    this.componentDef = componentDef;
    return this;
  }

   /**
   * References the name of the ComponentDefinition. If both componentDefRef and componentDef are provided, the componentDef will take precedence over componentDefRef.   TODO +kubebuilder:validation:XValidation:rule&#x3D;\&quot;self &#x3D;&#x3D; oldSelf\&quot;,message&#x3D;\&quot;componentDef is immutable\&quot;
   * @return componentDef
  **/
  @jakarta.annotation.Nullable
  public String getComponentDef() {
    return componentDef;
  }


  public void setComponentDef(String componentDef) {
    this.componentDef = componentDef;
  }


  public V1alpha1ClusterSpecComponentSpecsInner componentDefRef(String componentDefRef) {
    
    this.componentDefRef = componentDefRef;
    return this;
  }

   /**
   * References the componentDef defined in the ClusterDefinition spec. Must comply with the IANA Service Naming rule.   TODO +kubebuilder:validation:XValidation:rule&#x3D;\&quot;self &#x3D;&#x3D; oldSelf\&quot;,message&#x3D;\&quot;componentDefRef is immutable\&quot;
   * @return componentDefRef
  **/
  @jakarta.annotation.Nullable
  public String getComponentDefRef() {
    return componentDefRef;
  }


  public void setComponentDefRef(String componentDefRef) {
    this.componentDefRef = componentDefRef;
  }


  public V1alpha1ClusterSpecComponentSpecsInner enabledLogs(List<String> enabledLogs) {
    
    this.enabledLogs = enabledLogs;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInner addEnabledLogsItem(String enabledLogsItem) {
    if (this.enabledLogs == null) {
      this.enabledLogs = new ArrayList<>();
    }
    this.enabledLogs.add(enabledLogsItem);
    return this;
  }

   /**
   * Indicates which log file takes effect in the database cluster.
   * @return enabledLogs
  **/
  @jakarta.annotation.Nullable
  public List<String> getEnabledLogs() {
    return enabledLogs;
  }


  public void setEnabledLogs(List<String> enabledLogs) {
    this.enabledLogs = enabledLogs;
  }


  public V1alpha1ClusterSpecComponentSpecsInner instances(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances) {
    
    this.instances = instances;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInner addInstancesItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInner instancesItem) {
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


  public V1alpha1ClusterSpecComponentSpecsInner issuer(V1alpha1ClusterSpecComponentSpecsInnerIssuer issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerIssuer getIssuer() {
    return issuer;
  }


  public void setIssuer(V1alpha1ClusterSpecComponentSpecsInnerIssuer issuer) {
    this.issuer = issuer;
  }


  public V1alpha1ClusterSpecComponentSpecsInner monitor(Boolean monitor) {
    
    this.monitor = monitor;
    return this;
  }

   /**
   * To enable monitoring.
   * @return monitor
  **/
  @jakarta.annotation.Nullable
  public Boolean getMonitor() {
    return monitor;
  }


  public void setMonitor(Boolean monitor) {
    this.monitor = monitor;
  }


  public V1alpha1ClusterSpecComponentSpecsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the cluster&#39;s component. This name is also part of the Service DNS name and must comply with the IANA Service Naming rule. When ClusterComponentSpec is referenced as a template, the name is optional. Otherwise, it is required.   TODO +kubebuilder:validation:XValidation:rule&#x3D;\&quot;self &#x3D;&#x3D; oldSelf\&quot;,message&#x3D;\&quot;name is immutable\&quot;
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecComponentSpecsInner replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Specifies the number of component replicas.
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


  public V1alpha1ClusterSpecComponentSpecsInner resources(Object resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Specifies the resources requests and limits of the workload.
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public Object getResources() {
    return resources;
  }


  public void setResources(Object resources) {
    this.resources = resources;
  }


  public V1alpha1ClusterSpecComponentSpecsInner serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * Specifies the name of the ServiceAccount that the running component depends on.
   * @return serviceAccountName
  **/
  @jakarta.annotation.Nullable
  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public V1alpha1ClusterSpecComponentSpecsInner serviceRefs(List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> serviceRefs) {
    
    this.serviceRefs = serviceRefs;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInner addServiceRefsItem(V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner serviceRefsItem) {
    if (this.serviceRefs == null) {
      this.serviceRefs = new ArrayList<>();
    }
    this.serviceRefs.add(serviceRefsItem);
    return this;
  }

   /**
   * Defines service references for the current component.   Based on the referenced services, they can be categorized into two types:   - Service provided by external sources: These services are provided by external sources and are not managed by KubeBlocks. They can be Kubernetes-based or non-Kubernetes services. For external services, an additional ServiceDescriptor object is needed to establish the service binding. - Service provided by other KubeBlocks clusters: These services are provided by other KubeBlocks clusters. Binding to these services is done by specifying the name of the hosting cluster.   Each type of service reference requires specific configurations and bindings to establish the connection and interaction with the respective services. Note that the ServiceRef has cluster-level semantic consistency, meaning that within the same Cluster, service references with the same ServiceRef.Name are considered to be the same service. It is only allowed to bind to the same Cluster or ServiceDescriptor.
   * @return serviceRefs
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> getServiceRefs() {
    return serviceRefs;
  }


  public void setServiceRefs(List<V1alpha1ClusterSpecComponentSpecsInnerServiceRefsInner> serviceRefs) {
    this.serviceRefs = serviceRefs;
  }


  public V1alpha1ClusterSpecComponentSpecsInner services(List<V1alpha1ClusterSpecComponentSpecsInnerServicesInner> services) {
    
    this.services = services;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInner addServicesItem(V1alpha1ClusterSpecComponentSpecsInnerServicesInner servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Services expose endpoints that can be accessed by clients.
   * @return services
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerServicesInner> getServices() {
    return services;
  }


  public void setServices(List<V1alpha1ClusterSpecComponentSpecsInnerServicesInner> services) {
    this.services = services;
  }


  public V1alpha1ClusterSpecComponentSpecsInner switchPolicy(V1alpha1ClusterSpecComponentSpecsInnerSwitchPolicy switchPolicy) {
    
    this.switchPolicy = switchPolicy;
    return this;
  }

   /**
   * Get switchPolicy
   * @return switchPolicy
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerSwitchPolicy getSwitchPolicy() {
    return switchPolicy;
  }


  public void setSwitchPolicy(V1alpha1ClusterSpecComponentSpecsInnerSwitchPolicy switchPolicy) {
    this.switchPolicy = switchPolicy;
  }


  public V1alpha1ClusterSpecComponentSpecsInner tls(Boolean tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Enables or disables TLS certs.
   * @return tls
  **/
  @jakarta.annotation.Nullable
  public Boolean getTls() {
    return tls;
  }


  public void setTls(Boolean tls) {
    this.tls = tls;
  }


  public V1alpha1ClusterSpecComponentSpecsInner tolerations(Object tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

   /**
   * Attached to tolerate any taint that matches the triple &#x60;key,value,effect&#x60; using the matching operator &#x60;operator&#x60;.
   * @return tolerations
  **/
  @jakarta.annotation.Nullable
  public Object getTolerations() {
    return tolerations;
  }


  public void setTolerations(Object tolerations) {
    this.tolerations = tolerations;
  }


  public V1alpha1ClusterSpecComponentSpecsInner updateStrategy(UpdateStrategyEnum updateStrategy) {
    
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * Defines the update strategy for the component. Not supported.
   * @return updateStrategy
  **/
  @jakarta.annotation.Nullable
  public UpdateStrategyEnum getUpdateStrategy() {
    return updateStrategy;
  }


  public void setUpdateStrategy(UpdateStrategyEnum updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  public V1alpha1ClusterSpecComponentSpecsInner userResourceRefs(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs userResourceRefs) {
    
    this.userResourceRefs = userResourceRefs;
    return this;
  }

   /**
   * Get userResourceRefs
   * @return userResourceRefs
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs getUserResourceRefs() {
    return userResourceRefs;
  }


  public void setUserResourceRefs(V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs userResourceRefs) {
    this.userResourceRefs = userResourceRefs;
  }


  public V1alpha1ClusterSpecComponentSpecsInner volumeClaimTemplates(List<V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner> volumeClaimTemplates) {
    
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInner addVolumeClaimTemplatesItem(V1alpha1ClusterSpecComponentSpecsInnerVolumeClaimTemplatesInner volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * Provides information for statefulset.spec.volumeClaimTemplates.
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
    V1alpha1ClusterSpecComponentSpecsInner v1alpha1ClusterSpecComponentSpecsInner = (V1alpha1ClusterSpecComponentSpecsInner) o;
    return Objects.equals(this.affinity, v1alpha1ClusterSpecComponentSpecsInner.affinity) &&
        Objects.equals(this.classDefRef, v1alpha1ClusterSpecComponentSpecsInner.classDefRef) &&
        Objects.equals(this.componentDef, v1alpha1ClusterSpecComponentSpecsInner.componentDef) &&
        Objects.equals(this.componentDefRef, v1alpha1ClusterSpecComponentSpecsInner.componentDefRef) &&
        Objects.equals(this.enabledLogs, v1alpha1ClusterSpecComponentSpecsInner.enabledLogs) &&
        Objects.equals(this.instances, v1alpha1ClusterSpecComponentSpecsInner.instances) &&
        Objects.equals(this.issuer, v1alpha1ClusterSpecComponentSpecsInner.issuer) &&
        Objects.equals(this.monitor, v1alpha1ClusterSpecComponentSpecsInner.monitor) &&
        Objects.equals(this.name, v1alpha1ClusterSpecComponentSpecsInner.name) &&
        Objects.equals(this.replicas, v1alpha1ClusterSpecComponentSpecsInner.replicas) &&
        Objects.equals(this.resources, v1alpha1ClusterSpecComponentSpecsInner.resources) &&
        Objects.equals(this.serviceAccountName, v1alpha1ClusterSpecComponentSpecsInner.serviceAccountName) &&
        Objects.equals(this.serviceRefs, v1alpha1ClusterSpecComponentSpecsInner.serviceRefs) &&
        Objects.equals(this.services, v1alpha1ClusterSpecComponentSpecsInner.services) &&
        Objects.equals(this.switchPolicy, v1alpha1ClusterSpecComponentSpecsInner.switchPolicy) &&
        Objects.equals(this.tls, v1alpha1ClusterSpecComponentSpecsInner.tls) &&
        Objects.equals(this.tolerations, v1alpha1ClusterSpecComponentSpecsInner.tolerations) &&
        Objects.equals(this.updateStrategy, v1alpha1ClusterSpecComponentSpecsInner.updateStrategy) &&
        Objects.equals(this.userResourceRefs, v1alpha1ClusterSpecComponentSpecsInner.userResourceRefs) &&
        Objects.equals(this.volumeClaimTemplates, v1alpha1ClusterSpecComponentSpecsInner.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, classDefRef, componentDef, componentDefRef, enabledLogs, instances, issuer, monitor, name, replicas, resources, serviceAccountName, serviceRefs, services, switchPolicy, tls, tolerations, updateStrategy, userResourceRefs, volumeClaimTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInner {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    classDefRef: ").append(toIndentedString(classDefRef)).append("\n");
    sb.append("    componentDef: ").append(toIndentedString(componentDef)).append("\n");
    sb.append("    componentDefRef: ").append(toIndentedString(componentDefRef)).append("\n");
    sb.append("    enabledLogs: ").append(toIndentedString(enabledLogs)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    serviceRefs: ").append(toIndentedString(serviceRefs)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    switchPolicy: ").append(toIndentedString(switchPolicy)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    userResourceRefs: ").append(toIndentedString(userResourceRefs)).append("\n");
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
    openapiFields.add("componentDef");
    openapiFields.add("componentDefRef");
    openapiFields.add("enabledLogs");
    openapiFields.add("instances");
    openapiFields.add("issuer");
    openapiFields.add("monitor");
    openapiFields.add("name");
    openapiFields.add("replicas");
    openapiFields.add("resources");
    openapiFields.add("serviceAccountName");
    openapiFields.add("serviceRefs");
    openapiFields.add("services");
    openapiFields.add("switchPolicy");
    openapiFields.add("tls");
    openapiFields.add("tolerations");
    openapiFields.add("updateStrategy");
    openapiFields.add("userResourceRefs");
    openapiFields.add("volumeClaimTemplates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("replicas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInner is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterSpecComponentSpecsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `affinity`
      if (jsonObj.get("affinity") != null && !jsonObj.get("affinity").isJsonNull()) {
        V1alpha1ClusterSpecAffinity.validateJsonObject(jsonObj.getAsJsonObject("affinity"));
      }
      // validate the optional field `classDefRef`
      if (jsonObj.get("classDefRef") != null && !jsonObj.get("classDefRef").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerClassDefRef.validateJsonObject(jsonObj.getAsJsonObject("classDefRef"));
      }
      if ((jsonObj.get("componentDef") != null && !jsonObj.get("componentDef").isJsonNull()) && !jsonObj.get("componentDef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentDef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentDef").toString()));
      }
      if ((jsonObj.get("componentDefRef") != null && !jsonObj.get("componentDefRef").isJsonNull()) && !jsonObj.get("componentDefRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentDefRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentDefRef").toString()));
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
      // validate the optional field `issuer`
      if (jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerIssuer.validateJsonObject(jsonObj.getAsJsonObject("issuer"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      if (jsonObj.get("services") != null && !jsonObj.get("services").isJsonNull()) {
        JsonArray jsonArrayservices = jsonObj.getAsJsonArray("services");
        if (jsonArrayservices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("services").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `services` to be an array in the JSON string but got `%s`", jsonObj.get("services").toString()));
          }

          // validate the optional field `services` (array)
          for (int i = 0; i < jsonArrayservices.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerServicesInner.validateJsonObject(jsonArrayservices.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `switchPolicy`
      if (jsonObj.get("switchPolicy") != null && !jsonObj.get("switchPolicy").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerSwitchPolicy.validateJsonObject(jsonObj.getAsJsonObject("switchPolicy"));
      }
      if ((jsonObj.get("updateStrategy") != null && !jsonObj.get("updateStrategy").isJsonNull()) && !jsonObj.get("updateStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateStrategy").toString()));
      }
      // validate the optional field `userResourceRefs`
      if (jsonObj.get("userResourceRefs") != null && !jsonObj.get("userResourceRefs").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerUserResourceRefs.validateJsonObject(jsonObj.getAsJsonObject("userResourceRefs"));
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
       if (!V1alpha1ClusterSpecComponentSpecsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInner
  */
  public static V1alpha1ClusterSpecComponentSpecsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

