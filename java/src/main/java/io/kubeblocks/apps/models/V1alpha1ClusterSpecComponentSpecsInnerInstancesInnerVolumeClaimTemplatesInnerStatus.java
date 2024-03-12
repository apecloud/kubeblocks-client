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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner;
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
 * status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T08:58:42.064637Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes;

  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCE_STATUSES = "allocatedResourceStatuses";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCE_STATUSES)
  private Map<String, String> allocatedResourceStatuses = new HashMap<>();

  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCES = "allocatedResources";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCES)
  private Map<String, Object> allocatedResources = new HashMap<>();

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Map<String, Object> capacity = new HashMap<>();

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner> conditions;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus accessModes(List<String> accessModes) {
    
    this.accessModes = accessModes;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @jakarta.annotation.Nullable
  public List<String> getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus allocatedResourceStatuses(Map<String, String> allocatedResourceStatuses) {
    
    this.allocatedResourceStatuses = allocatedResourceStatuses;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus putAllocatedResourceStatusesItem(String key, String allocatedResourceStatusesItem) {
    if (this.allocatedResourceStatuses == null) {
      this.allocatedResourceStatuses = new HashMap<>();
    }
    this.allocatedResourceStatuses.put(key, allocatedResourceStatusesItem);
    return this;
  }

   /**
   * allocatedResourceStatuses stores status of resource being resized for the given PVC. Key names follow standard Kubernetes label syntax. Valid values are either: * Un-prefixed keys: - storage - the capacity of the volume. * Custom resources must use implementation-defined prefixed names such as \&quot;example.com/my-custom-resource\&quot; Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.   ClaimResourceStatus can be in any of following states: - ControllerResizeInProgress: State set when resize controller starts resizing the volume in control-plane. - ControllerResizeFailed: State set when resize has failed in resize controller with a terminal error. - NodeResizePending: State set when resize controller has finished resizing the volume but further resizing of volume is needed on the node. - NodeResizeInProgress: State set when kubelet starts resizing the volume. - NodeResizeFailed: State set when resizing has failed in kubelet with a terminal error. Transient errors don&#39;t set NodeResizeFailed. For example: if expanding a PVC for more capacity - this field can be one of the following states: - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;ControllerResizeInProgress\&quot; - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;ControllerResizeFailed\&quot; - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;NodeResizePending\&quot; - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;NodeResizeInProgress\&quot; - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;NodeResizeFailed\&quot; When this field is not set, it means that no resize operation is in progress for the given PVC.   A controller that receives PVC update with previously unknown resourceName or ClaimResourceStatus should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.   This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   * @return allocatedResourceStatuses
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAllocatedResourceStatuses() {
    return allocatedResourceStatuses;
  }


  public void setAllocatedResourceStatuses(Map<String, String> allocatedResourceStatuses) {
    this.allocatedResourceStatuses = allocatedResourceStatuses;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus allocatedResources(Map<String, Object> allocatedResources) {
    
    this.allocatedResources = allocatedResources;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus putAllocatedResourcesItem(String key, Object allocatedResourcesItem) {
    if (this.allocatedResources == null) {
      this.allocatedResources = new HashMap<>();
    }
    this.allocatedResources.put(key, allocatedResourcesItem);
    return this;
  }

   /**
   * allocatedResources tracks the resources allocated to a PVC including its capacity. Key names follow standard Kubernetes label syntax. Valid values are either: * Un-prefixed keys: - storage - the capacity of the volume. * Custom resources must use implementation-defined prefixed names such as \&quot;example.com/my-custom-resource\&quot; Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.   Capacity reported here may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity.   A controller that receives PVC update with previously unknown resourceName should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.   This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   * @return allocatedResources
  **/
  @jakarta.annotation.Nullable
  public Map<String, Object> getAllocatedResources() {
    return allocatedResources;
  }


  public void setAllocatedResources(Map<String, Object> allocatedResources) {
    this.allocatedResources = allocatedResources;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus capacity(Map<String, Object> capacity) {
    
    this.capacity = capacity;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus putCapacityItem(String key, Object capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * capacity represents the actual resources of the underlying volume.
   * @return capacity
  **/
  @jakarta.annotation.Nullable
  public Map<String, Object> getCapacity() {
    return capacity;
  }


  public void setCapacity(Map<String, Object> capacity) {
    this.capacity = capacity;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus conditions(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus addConditionsItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to &#39;ResizeStarted&#39;.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * phase represents the current phase of PersistentVolumeClaim.
   * @return phase
  **/
  @jakarta.annotation.Nullable
  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus = (V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus) o;
    return Objects.equals(this.accessModes, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.accessModes) &&
        Objects.equals(this.allocatedResourceStatuses, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.allocatedResourceStatuses) &&
        Objects.equals(this.allocatedResources, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.allocatedResources) &&
        Objects.equals(this.capacity, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.capacity) &&
        Objects.equals(this.conditions, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.conditions) &&
        Objects.equals(this.phase, v1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, allocatedResourceStatuses, allocatedResources, capacity, conditions, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    allocatedResourceStatuses: ").append(toIndentedString(allocatedResourceStatuses)).append("\n");
    sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
    openapiFields.add("accessModes");
    openapiFields.add("allocatedResourceStatuses");
    openapiFields.add("allocatedResources");
    openapiFields.add("capacity");
    openapiFields.add("conditions");
    openapiFields.add("phase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessModes") != null && !jsonObj.get("accessModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessModes` to be an array in the JSON string but got `%s`", jsonObj.get("accessModes").toString()));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatusConditionsInner.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInnerStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

