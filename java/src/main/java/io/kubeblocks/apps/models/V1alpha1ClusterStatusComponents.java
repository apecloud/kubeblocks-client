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
import io.kubeblocks.apps.models.V1alpha1ClusterStatusConsensusSetStatus;
import io.kubeblocks.apps.models.V1alpha1ClusterStatusMembersStatus;
import io.kubeblocks.apps.models.V1alpha1ClusterStatusReplicationSetStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClusterComponentStatus records components status.
 */
@ApiModel(description = "ClusterComponentStatus records components status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T07:24:37.743Z[Etc/UTC]")
public class V1alpha1ClusterStatusComponents {
  public static final String SERIALIZED_NAME_CONSENSUS_SET_STATUS = "consensusSetStatus";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_SET_STATUS)
  private V1alpha1ClusterStatusConsensusSetStatus consensusSetStatus;

  public static final String SERIALIZED_NAME_MEMBERS_STATUS = "membersStatus";
  @SerializedName(SERIALIZED_NAME_MEMBERS_STATUS)
  private List<V1alpha1ClusterStatusMembersStatus> membersStatus = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private Map<String, String> message = null;

  /**
   * phase describes the phase of the component and the detail information of the phases are as following: Creating: &#x60;Creating&#x60; is a special &#x60;Updating&#x60; with previous phase &#x60;empty&#x60;(means \&quot;\&quot;) or &#x60;Creating&#x60;. Running: component replicas &gt; 0 and all pod specs are latest with a Running state. Updating: component replicas &gt; 0 and has no failed pods. the component is being updated. Abnormal: component replicas &gt; 0 but having some failed pods. the component basically works but in a fragile state. Failed: component replicas &gt; 0 but having some failed pods. the component doesn&#39;t work anymore. Stopping: component replicas &#x3D; 0 and has terminating pods. Stopped: component replicas &#x3D; 0 and all pods have been deleted. Deleting: the component is being deleted.
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    CREATING("Creating"),
    
    RUNNING("Running"),
    
    UPDATING("Updating"),
    
    STOPPING("Stopping"),
    
    STOPPED("Stopped"),
    
    DELETING("Deleting"),
    
    FAILED("Failed"),
    
    ABNORMAL("Abnormal");

    private String value;

    PhaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhaseEnum fromValue(String value) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhaseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhaseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private PhaseEnum phase;

  public static final String SERIALIZED_NAME_PODS_READY = "podsReady";
  @SerializedName(SERIALIZED_NAME_PODS_READY)
  private Boolean podsReady;

  public static final String SERIALIZED_NAME_PODS_READY_TIME = "podsReadyTime";
  @SerializedName(SERIALIZED_NAME_PODS_READY_TIME)
  private OffsetDateTime podsReadyTime;

  public static final String SERIALIZED_NAME_REPLICATION_SET_STATUS = "replicationSetStatus";
  @SerializedName(SERIALIZED_NAME_REPLICATION_SET_STATUS)
  private V1alpha1ClusterStatusReplicationSetStatus replicationSetStatus;


  public V1alpha1ClusterStatusComponents consensusSetStatus(V1alpha1ClusterStatusConsensusSetStatus consensusSetStatus) {
    
    this.consensusSetStatus = consensusSetStatus;
    return this;
  }

   /**
   * Get consensusSetStatus
   * @return consensusSetStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterStatusConsensusSetStatus getConsensusSetStatus() {
    return consensusSetStatus;
  }


  public void setConsensusSetStatus(V1alpha1ClusterStatusConsensusSetStatus consensusSetStatus) {
    this.consensusSetStatus = consensusSetStatus;
  }


  public V1alpha1ClusterStatusComponents membersStatus(List<V1alpha1ClusterStatusMembersStatus> membersStatus) {
    
    this.membersStatus = membersStatus;
    return this;
  }

  public V1alpha1ClusterStatusComponents addMembersStatusItem(V1alpha1ClusterStatusMembersStatus membersStatusItem) {
    if (this.membersStatus == null) {
      this.membersStatus = new ArrayList<>();
    }
    this.membersStatus.add(membersStatusItem);
    return this;
  }

   /**
   * members&#39; status.
   * @return membersStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "members' status.")

  public List<V1alpha1ClusterStatusMembersStatus> getMembersStatus() {
    return membersStatus;
  }


  public void setMembersStatus(List<V1alpha1ClusterStatusMembersStatus> membersStatus) {
    this.membersStatus = membersStatus;
  }


  public V1alpha1ClusterStatusComponents message(Map<String, String> message) {
    
    this.message = message;
    return this;
  }

  public V1alpha1ClusterStatusComponents putMessageItem(String key, String messageItem) {
    if (this.message == null) {
      this.message = new HashMap<>();
    }
    this.message.put(key, messageItem);
    return this;
  }

   /**
   * message records the component details message in current phase. Keys are podName or deployName or statefulSetName. The format is &#x60;ObjectKind/Name&#x60;.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message records the component details message in current phase. Keys are podName or deployName or statefulSetName. The format is `ObjectKind/Name`.")

  public Map<String, String> getMessage() {
    return message;
  }


  public void setMessage(Map<String, String> message) {
    this.message = message;
  }


  public V1alpha1ClusterStatusComponents phase(PhaseEnum phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * phase describes the phase of the component and the detail information of the phases are as following: Creating: &#x60;Creating&#x60; is a special &#x60;Updating&#x60; with previous phase &#x60;empty&#x60;(means \&quot;\&quot;) or &#x60;Creating&#x60;. Running: component replicas &gt; 0 and all pod specs are latest with a Running state. Updating: component replicas &gt; 0 and has no failed pods. the component is being updated. Abnormal: component replicas &gt; 0 but having some failed pods. the component basically works but in a fragile state. Failed: component replicas &gt; 0 but having some failed pods. the component doesn&#39;t work anymore. Stopping: component replicas &#x3D; 0 and has terminating pods. Stopped: component replicas &#x3D; 0 and all pods have been deleted. Deleting: the component is being deleted.
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "phase describes the phase of the component and the detail information of the phases are as following: Creating: `Creating` is a special `Updating` with previous phase `empty`(means \"\") or `Creating`. Running: component replicas > 0 and all pod specs are latest with a Running state. Updating: component replicas > 0 and has no failed pods. the component is being updated. Abnormal: component replicas > 0 but having some failed pods. the component basically works but in a fragile state. Failed: component replicas > 0 but having some failed pods. the component doesn't work anymore. Stopping: component replicas = 0 and has terminating pods. Stopped: component replicas = 0 and all pods have been deleted. Deleting: the component is being deleted.")

  public PhaseEnum getPhase() {
    return phase;
  }


  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }


  public V1alpha1ClusterStatusComponents podsReady(Boolean podsReady) {
    
    this.podsReady = podsReady;
    return this;
  }

   /**
   * podsReady checks if all pods of the component are ready.
   * @return podsReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "podsReady checks if all pods of the component are ready.")

  public Boolean getPodsReady() {
    return podsReady;
  }


  public void setPodsReady(Boolean podsReady) {
    this.podsReady = podsReady;
  }


  public V1alpha1ClusterStatusComponents podsReadyTime(OffsetDateTime podsReadyTime) {
    
    this.podsReadyTime = podsReadyTime;
    return this;
  }

   /**
   * podsReadyTime what time point of all component pods are ready, this time is the ready time of the last component pod.
   * @return podsReadyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "podsReadyTime what time point of all component pods are ready, this time is the ready time of the last component pod.")

  public OffsetDateTime getPodsReadyTime() {
    return podsReadyTime;
  }


  public void setPodsReadyTime(OffsetDateTime podsReadyTime) {
    this.podsReadyTime = podsReadyTime;
  }


  public V1alpha1ClusterStatusComponents replicationSetStatus(V1alpha1ClusterStatusReplicationSetStatus replicationSetStatus) {
    
    this.replicationSetStatus = replicationSetStatus;
    return this;
  }

   /**
   * Get replicationSetStatus
   * @return replicationSetStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterStatusReplicationSetStatus getReplicationSetStatus() {
    return replicationSetStatus;
  }


  public void setReplicationSetStatus(V1alpha1ClusterStatusReplicationSetStatus replicationSetStatus) {
    this.replicationSetStatus = replicationSetStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterStatusComponents v1alpha1ClusterStatusComponents = (V1alpha1ClusterStatusComponents) o;
    return Objects.equals(this.consensusSetStatus, v1alpha1ClusterStatusComponents.consensusSetStatus) &&
        Objects.equals(this.membersStatus, v1alpha1ClusterStatusComponents.membersStatus) &&
        Objects.equals(this.message, v1alpha1ClusterStatusComponents.message) &&
        Objects.equals(this.phase, v1alpha1ClusterStatusComponents.phase) &&
        Objects.equals(this.podsReady, v1alpha1ClusterStatusComponents.podsReady) &&
        Objects.equals(this.podsReadyTime, v1alpha1ClusterStatusComponents.podsReadyTime) &&
        Objects.equals(this.replicationSetStatus, v1alpha1ClusterStatusComponents.replicationSetStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusSetStatus, membersStatus, message, phase, podsReady, podsReadyTime, replicationSetStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterStatusComponents {\n");
    sb.append("    consensusSetStatus: ").append(toIndentedString(consensusSetStatus)).append("\n");
    sb.append("    membersStatus: ").append(toIndentedString(membersStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podsReady: ").append(toIndentedString(podsReady)).append("\n");
    sb.append("    podsReadyTime: ").append(toIndentedString(podsReadyTime)).append("\n");
    sb.append("    replicationSetStatus: ").append(toIndentedString(replicationSetStatus)).append("\n");
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
