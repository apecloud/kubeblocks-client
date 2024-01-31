/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecAffinity1;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecClassDefRef;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecIssuer;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecServiceRefs;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecServices;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecSwitchPolicy;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecUserResourceRefs;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecVolumeClaimTemplates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterComponentSpec defines the cluster component spec.
 */
@ApiModel(description = "ClusterComponentSpec defines the cluster component spec.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T07:24:37.743Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecs {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1alpha1ClusterSpecAffinity1 affinity;

  public static final String SERIALIZED_NAME_CLASS_DEF_REF = "classDefRef";
  @SerializedName(SERIALIZED_NAME_CLASS_DEF_REF)
  private V1alpha1ClusterSpecClassDefRef classDefRef;

  public static final String SERIALIZED_NAME_COMPONENT_DEF = "componentDef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF)
  private String componentDef;

  public static final String SERIALIZED_NAME_COMPONENT_DEF_REF = "componentDefRef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF_REF)
  private String componentDefRef;

  public static final String SERIALIZED_NAME_ENABLED_LOGS = "enabledLogs";
  @SerializedName(SERIALIZED_NAME_ENABLED_LOGS)
  private List<String> enabledLogs = null;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<String> instances = null;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private V1alpha1ClusterSpecIssuer issuer;

  public static final String SERIALIZED_NAME_MONITOR = "monitor";
  @SerializedName(SERIALIZED_NAME_MONITOR)
  private Boolean monitor;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NO_CREATE_P_D_B = "noCreatePDB";
  @SerializedName(SERIALIZED_NAME_NO_CREATE_P_D_B)
  private Boolean noCreatePDB;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<String> nodes = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Object resources;

  /**
   * RsmTransformPolicy defines the policy generate sts using rsm. ToSts: rsm transforms to statefulSet ToPod: rsm transforms to pods
   */
  @JsonAdapter(RsmTransformPolicyEnum.Adapter.class)
  public enum RsmTransformPolicyEnum {
    TOPOD("ToPod"),
    
    TOSTS("ToSts");

    private String value;

    RsmTransformPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RsmTransformPolicyEnum fromValue(String value) {
      for (RsmTransformPolicyEnum b : RsmTransformPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RsmTransformPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RsmTransformPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RsmTransformPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RsmTransformPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RSM_TRANSFORM_POLICY = "rsmTransformPolicy";
  @SerializedName(SERIALIZED_NAME_RSM_TRANSFORM_POLICY)
  private RsmTransformPolicyEnum rsmTransformPolicy;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SERVICE_REFS = "serviceRefs";
  @SerializedName(SERIALIZED_NAME_SERVICE_REFS)
  private List<V1alpha1ClusterSpecServiceRefs> serviceRefs = null;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<V1alpha1ClusterSpecServices> services = null;

  public static final String SERIALIZED_NAME_SWITCH_POLICY = "switchPolicy";
  @SerializedName(SERIALIZED_NAME_SWITCH_POLICY)
  private V1alpha1ClusterSpecSwitchPolicy switchPolicy;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private Boolean tls;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private Object tolerations;

  /**
   * updateStrategy defines the update strategy for the component.
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
  private V1alpha1ClusterSpecUserResourceRefs userResourceRefs;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  private List<V1alpha1ClusterSpecVolumeClaimTemplates> volumeClaimTemplates = null;


  public V1alpha1ClusterSpecComponentSpecs affinity(V1alpha1ClusterSpecAffinity1 affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterSpecAffinity1 getAffinity() {
    return affinity;
  }


  public void setAffinity(V1alpha1ClusterSpecAffinity1 affinity) {
    this.affinity = affinity;
  }


  public V1alpha1ClusterSpecComponentSpecs classDefRef(V1alpha1ClusterSpecClassDefRef classDefRef) {
    
    this.classDefRef = classDefRef;
    return this;
  }

   /**
   * Get classDefRef
   * @return classDefRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterSpecClassDefRef getClassDefRef() {
    return classDefRef;
  }


  public void setClassDefRef(V1alpha1ClusterSpecClassDefRef classDefRef) {
    this.classDefRef = classDefRef;
  }


  public V1alpha1ClusterSpecComponentSpecs componentDef(String componentDef) {
    
    this.componentDef = componentDef;
    return this;
  }

   /**
   * componentDef references the name of the ComponentDefinition. If both componentDefRef and componentDef are provided, the componentDef will take precedence over componentDefRef.
   * @return componentDef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "componentDef references the name of the ComponentDefinition. If both componentDefRef and componentDef are provided, the componentDef will take precedence over componentDefRef.")

  public String getComponentDef() {
    return componentDef;
  }


  public void setComponentDef(String componentDef) {
    this.componentDef = componentDef;
  }


  public V1alpha1ClusterSpecComponentSpecs componentDefRef(String componentDefRef) {
    
    this.componentDefRef = componentDefRef;
    return this;
  }

   /**
   * componentDefRef references componentDef defined in ClusterDefinition spec. Need to comply with IANA Service Naming rule.
   * @return componentDefRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "componentDefRef references componentDef defined in ClusterDefinition spec. Need to comply with IANA Service Naming rule.")

  public String getComponentDefRef() {
    return componentDefRef;
  }


  public void setComponentDefRef(String componentDefRef) {
    this.componentDefRef = componentDefRef;
  }


  public V1alpha1ClusterSpecComponentSpecs enabledLogs(List<String> enabledLogs) {
    
    this.enabledLogs = enabledLogs;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecs addEnabledLogsItem(String enabledLogsItem) {
    if (this.enabledLogs == null) {
      this.enabledLogs = new ArrayList<>();
    }
    this.enabledLogs.add(enabledLogsItem);
    return this;
  }

   /**
   * enabledLogs indicates which log file takes effect in the database cluster. element is the log type which is defined in cluster definition logConfig.name, and will set relative variables about this log type in database kernel.
   * @return enabledLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "enabledLogs indicates which log file takes effect in the database cluster. element is the log type which is defined in cluster definition logConfig.name, and will set relative variables about this log type in database kernel.")

  public List<String> getEnabledLogs() {
    return enabledLogs;
  }


  public void setEnabledLogs(List<String> enabledLogs) {
    this.enabledLogs = enabledLogs;
  }


  public V1alpha1ClusterSpecComponentSpecs instances(List<String> instances) {
    
    this.instances = instances;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecs addInstancesItem(String instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Instances defines the list of instance to be deleted priorly If the RsmTransformPolicy is specified as ToPod,the list of instances will be used.
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instances defines the list of instance to be deleted priorly If the RsmTransformPolicy is specified as ToPod,the list of instances will be used.")

  public List<String> getInstances() {
    return instances;
  }


  public void setInstances(List<String> instances) {
    this.instances = instances;
  }


  public V1alpha1ClusterSpecComponentSpecs issuer(V1alpha1ClusterSpecIssuer issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterSpecIssuer getIssuer() {
    return issuer;
  }


  public void setIssuer(V1alpha1ClusterSpecIssuer issuer) {
    this.issuer = issuer;
  }


  public V1alpha1ClusterSpecComponentSpecs monitor(Boolean monitor) {
    
    this.monitor = monitor;
    return this;
  }

   /**
   * monitor is a switch to enable monitoring and is set as false by default. KubeBlocks provides an extension mechanism to support component level monitoring, which will scrape metrics auto or manually from servers in component and export metrics to Time Series Database.
   * @return monitor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "monitor is a switch to enable monitoring and is set as false by default. KubeBlocks provides an extension mechanism to support component level monitoring, which will scrape metrics auto or manually from servers in component and export metrics to Time Series Database.")

  public Boolean getMonitor() {
    return monitor;
  }


  public void setMonitor(Boolean monitor) {
    this.monitor = monitor;
  }


  public V1alpha1ClusterSpecComponentSpecs name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name defines cluster&#39;s component name, this name is also part of Service DNS name, so this name will comply with IANA Service Naming rule.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name defines cluster's component name, this name is also part of Service DNS name, so this name will comply with IANA Service Naming rule.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecComponentSpecs noCreatePDB(Boolean noCreatePDB) {
    
    this.noCreatePDB = noCreatePDB;
    return this;
  }

   /**
   * noCreatePDB defines the PodDisruptionBudget creation behavior and is set to true if creation of PodDisruptionBudget for this component is not needed. It defaults to false.
   * @return noCreatePDB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "noCreatePDB defines the PodDisruptionBudget creation behavior and is set to true if creation of PodDisruptionBudget for this component is not needed. It defaults to false.")

  public Boolean getNoCreatePDB() {
    return noCreatePDB;
  }


  public void setNoCreatePDB(Boolean noCreatePDB) {
    this.noCreatePDB = noCreatePDB;
  }


  public V1alpha1ClusterSpecComponentSpecs nodes(List<String> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecs addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Nodes defines the list of nodes that pods can schedule If the RsmTransformPolicy is specified as ToPod,the list of nodes will be used. If the list of nodes is empty, no specific node will be assigned. However, if the list of node is filled, all pods will be evenly scheduled across the nodes in the list.
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nodes defines the list of nodes that pods can schedule If the RsmTransformPolicy is specified as ToPod,the list of nodes will be used. If the list of nodes is empty, no specific node will be assigned. However, if the list of node is filled, all pods will be evenly scheduled across the nodes in the list.")

  public List<String> getNodes() {
    return nodes;
  }


  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }


  public V1alpha1ClusterSpecComponentSpecs replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Component replicas.
   * minimum: 0
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "Component replicas.")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1ClusterSpecComponentSpecs resources(Object resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Resources requests and limits of workload.
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resources requests and limits of workload.")

  public Object getResources() {
    return resources;
  }


  public void setResources(Object resources) {
    this.resources = resources;
  }


  public V1alpha1ClusterSpecComponentSpecs rsmTransformPolicy(RsmTransformPolicyEnum rsmTransformPolicy) {
    
    this.rsmTransformPolicy = rsmTransformPolicy;
    return this;
  }

   /**
   * RsmTransformPolicy defines the policy generate sts using rsm. ToSts: rsm transforms to statefulSet ToPod: rsm transforms to pods
   * @return rsmTransformPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RsmTransformPolicy defines the policy generate sts using rsm. ToSts: rsm transforms to statefulSet ToPod: rsm transforms to pods")

  public RsmTransformPolicyEnum getRsmTransformPolicy() {
    return rsmTransformPolicy;
  }


  public void setRsmTransformPolicy(RsmTransformPolicyEnum rsmTransformPolicy) {
    this.rsmTransformPolicy = rsmTransformPolicy;
  }


  public V1alpha1ClusterSpecComponentSpecs serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * serviceAccountName is the name of the ServiceAccount that running component depends on.
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "serviceAccountName is the name of the ServiceAccount that running component depends on.")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public V1alpha1ClusterSpecComponentSpecs serviceRefs(List<V1alpha1ClusterSpecServiceRefs> serviceRefs) {
    
    this.serviceRefs = serviceRefs;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecs addServiceRefsItem(V1alpha1ClusterSpecServiceRefs serviceRefsItem) {
    if (this.serviceRefs == null) {
      this.serviceRefs = new ArrayList<>();
    }
    this.serviceRefs.add(serviceRefsItem);
    return this;
  }

   /**
   * serviceRefs define service references for the current component. Based on the referenced services, they can be categorized into two types: Service provided by external sources: These services are provided by external sources and are not managed by KubeBlocks. They can be Kubernetes-based or non-Kubernetes services. For external services, you need to provide an additional ServiceDescriptor object to establish the service binding. Service provided by other KubeBlocks clusters: These services are provided by other KubeBlocks clusters. You can bind to these services by specifying the name of the hosting cluster. Each type of service reference requires specific configurations and bindings to establish the connection and interaction with the respective services. It should be noted that the ServiceRef has cluster-level semantic consistency, meaning that within the same Cluster, service references with the same ServiceRef.Name are considered to be the same service. It is only allowed to bind to the same Cluster or ServiceDescriptor.
   * @return serviceRefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "serviceRefs define service references for the current component. Based on the referenced services, they can be categorized into two types: Service provided by external sources: These services are provided by external sources and are not managed by KubeBlocks. They can be Kubernetes-based or non-Kubernetes services. For external services, you need to provide an additional ServiceDescriptor object to establish the service binding. Service provided by other KubeBlocks clusters: These services are provided by other KubeBlocks clusters. You can bind to these services by specifying the name of the hosting cluster. Each type of service reference requires specific configurations and bindings to establish the connection and interaction with the respective services. It should be noted that the ServiceRef has cluster-level semantic consistency, meaning that within the same Cluster, service references with the same ServiceRef.Name are considered to be the same service. It is only allowed to bind to the same Cluster or ServiceDescriptor.")

  public List<V1alpha1ClusterSpecServiceRefs> getServiceRefs() {
    return serviceRefs;
  }


  public void setServiceRefs(List<V1alpha1ClusterSpecServiceRefs> serviceRefs) {
    this.serviceRefs = serviceRefs;
  }


  public V1alpha1ClusterSpecComponentSpecs services(List<V1alpha1ClusterSpecServices> services) {
    
    this.services = services;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecs addServicesItem(V1alpha1ClusterSpecServices servicesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Services expose endpoints that can be accessed by clients.")

  public List<V1alpha1ClusterSpecServices> getServices() {
    return services;
  }


  public void setServices(List<V1alpha1ClusterSpecServices> services) {
    this.services = services;
  }


  public V1alpha1ClusterSpecComponentSpecs switchPolicy(V1alpha1ClusterSpecSwitchPolicy switchPolicy) {
    
    this.switchPolicy = switchPolicy;
    return this;
  }

   /**
   * Get switchPolicy
   * @return switchPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterSpecSwitchPolicy getSwitchPolicy() {
    return switchPolicy;
  }


  public void setSwitchPolicy(V1alpha1ClusterSpecSwitchPolicy switchPolicy) {
    this.switchPolicy = switchPolicy;
  }


  public V1alpha1ClusterSpecComponentSpecs tls(Boolean tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Enables or disables TLS certs.
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enables or disables TLS certs.")

  public Boolean getTls() {
    return tls;
  }


  public void setTls(Boolean tls) {
    this.tls = tls;
  }


  public V1alpha1ClusterSpecComponentSpecs tolerations(Object tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

   /**
   * Component tolerations will override ClusterSpec.Tolerations if specified.
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component tolerations will override ClusterSpec.Tolerations if specified.")

  public Object getTolerations() {
    return tolerations;
  }


  public void setTolerations(Object tolerations) {
    this.tolerations = tolerations;
  }


  public V1alpha1ClusterSpecComponentSpecs updateStrategy(UpdateStrategyEnum updateStrategy) {
    
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * updateStrategy defines the update strategy for the component.
   * @return updateStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "updateStrategy defines the update strategy for the component.")

  public UpdateStrategyEnum getUpdateStrategy() {
    return updateStrategy;
  }


  public void setUpdateStrategy(UpdateStrategyEnum updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  public V1alpha1ClusterSpecComponentSpecs userResourceRefs(V1alpha1ClusterSpecUserResourceRefs userResourceRefs) {
    
    this.userResourceRefs = userResourceRefs;
    return this;
  }

   /**
   * Get userResourceRefs
   * @return userResourceRefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterSpecUserResourceRefs getUserResourceRefs() {
    return userResourceRefs;
  }


  public void setUserResourceRefs(V1alpha1ClusterSpecUserResourceRefs userResourceRefs) {
    this.userResourceRefs = userResourceRefs;
  }


  public V1alpha1ClusterSpecComponentSpecs volumeClaimTemplates(List<V1alpha1ClusterSpecVolumeClaimTemplates> volumeClaimTemplates) {
    
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecs addVolumeClaimTemplatesItem(V1alpha1ClusterSpecVolumeClaimTemplates volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * volumeClaimTemplates information for statefulset.spec.volumeClaimTemplates.
   * @return volumeClaimTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeClaimTemplates information for statefulset.spec.volumeClaimTemplates.")

  public List<V1alpha1ClusterSpecVolumeClaimTemplates> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }


  public void setVolumeClaimTemplates(List<V1alpha1ClusterSpecVolumeClaimTemplates> volumeClaimTemplates) {
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
    V1alpha1ClusterSpecComponentSpecs v1alpha1ClusterSpecComponentSpecs = (V1alpha1ClusterSpecComponentSpecs) o;
    return Objects.equals(this.affinity, v1alpha1ClusterSpecComponentSpecs.affinity) &&
        Objects.equals(this.classDefRef, v1alpha1ClusterSpecComponentSpecs.classDefRef) &&
        Objects.equals(this.componentDef, v1alpha1ClusterSpecComponentSpecs.componentDef) &&
        Objects.equals(this.componentDefRef, v1alpha1ClusterSpecComponentSpecs.componentDefRef) &&
        Objects.equals(this.enabledLogs, v1alpha1ClusterSpecComponentSpecs.enabledLogs) &&
        Objects.equals(this.instances, v1alpha1ClusterSpecComponentSpecs.instances) &&
        Objects.equals(this.issuer, v1alpha1ClusterSpecComponentSpecs.issuer) &&
        Objects.equals(this.monitor, v1alpha1ClusterSpecComponentSpecs.monitor) &&
        Objects.equals(this.name, v1alpha1ClusterSpecComponentSpecs.name) &&
        Objects.equals(this.noCreatePDB, v1alpha1ClusterSpecComponentSpecs.noCreatePDB) &&
        Objects.equals(this.nodes, v1alpha1ClusterSpecComponentSpecs.nodes) &&
        Objects.equals(this.replicas, v1alpha1ClusterSpecComponentSpecs.replicas) &&
        Objects.equals(this.resources, v1alpha1ClusterSpecComponentSpecs.resources) &&
        Objects.equals(this.rsmTransformPolicy, v1alpha1ClusterSpecComponentSpecs.rsmTransformPolicy) &&
        Objects.equals(this.serviceAccountName, v1alpha1ClusterSpecComponentSpecs.serviceAccountName) &&
        Objects.equals(this.serviceRefs, v1alpha1ClusterSpecComponentSpecs.serviceRefs) &&
        Objects.equals(this.services, v1alpha1ClusterSpecComponentSpecs.services) &&
        Objects.equals(this.switchPolicy, v1alpha1ClusterSpecComponentSpecs.switchPolicy) &&
        Objects.equals(this.tls, v1alpha1ClusterSpecComponentSpecs.tls) &&
        Objects.equals(this.tolerations, v1alpha1ClusterSpecComponentSpecs.tolerations) &&
        Objects.equals(this.updateStrategy, v1alpha1ClusterSpecComponentSpecs.updateStrategy) &&
        Objects.equals(this.userResourceRefs, v1alpha1ClusterSpecComponentSpecs.userResourceRefs) &&
        Objects.equals(this.volumeClaimTemplates, v1alpha1ClusterSpecComponentSpecs.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, classDefRef, componentDef, componentDefRef, enabledLogs, instances, issuer, monitor, name, noCreatePDB, nodes, replicas, resources, rsmTransformPolicy, serviceAccountName, serviceRefs, services, switchPolicy, tls, tolerations, updateStrategy, userResourceRefs, volumeClaimTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecs {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    classDefRef: ").append(toIndentedString(classDefRef)).append("\n");
    sb.append("    componentDef: ").append(toIndentedString(componentDef)).append("\n");
    sb.append("    componentDefRef: ").append(toIndentedString(componentDefRef)).append("\n");
    sb.append("    enabledLogs: ").append(toIndentedString(enabledLogs)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noCreatePDB: ").append(toIndentedString(noCreatePDB)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    rsmTransformPolicy: ").append(toIndentedString(rsmTransformPolicy)).append("\n");
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

}
