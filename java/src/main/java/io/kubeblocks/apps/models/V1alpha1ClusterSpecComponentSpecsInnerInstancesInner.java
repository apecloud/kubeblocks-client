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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerResources;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner;
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
 * V1alpha1ClusterSpecComponentSpecsInnerInstancesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ClusterSpecComponentSpecsInnerInstancesInner {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = new HashMap<>();

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerResources resources;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> tolerations;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner> volumeClaimTemplates;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> volumeMounts;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner> volumes;

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner() {
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Defines annotations to override. Add new or override existing annotations.
   * @return annotations
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Defines labels to override. Add new or override existing labels.
   * @return labels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines the name of the instance. Only applied when Replicas is 1.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Defines NodeName to override.
   * @return nodeName
  **/
  @jakarta.annotation.Nullable
  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * Defines NodeSelector to override.
   * @return nodeSelector
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of replicas of this template. Default is 1.
   * minimum: 0
   * @return replicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner resources(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerResources resources) {
    this.resources = resources;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner tolerations(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner addTolerationsItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Defines Tolerations to override. Add new or override existing tolerations.
   * @return tolerations
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerTolerationsInner> tolerations) {
    this.tolerations = tolerations;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner volumeClaimTemplates(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner> volumeClaimTemplates) {
    
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner addVolumeClaimTemplatesItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * Defines VolumeClaimTemplates to override. Add new or override existing volume claim templates.
   * @return volumeClaimTemplates
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }


  public void setVolumeClaimTemplates(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner volumeMounts(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner addVolumeMountsItem(V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Defines VolumeMounts to override. Add new or override existing volume mounts.
   * @return volumeMounts
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner volumes(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner addVolumesItem(V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Defines Volumes to override. Add new or override existing volumes.
   * @return volumes
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecComponentSpecsInnerInstancesInner v1alpha1ClusterSpecComponentSpecsInnerInstancesInner = (V1alpha1ClusterSpecComponentSpecsInnerInstancesInner) o;
    return Objects.equals(this.annotations, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.annotations) &&
        Objects.equals(this.labels, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.labels) &&
        Objects.equals(this.name, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.name) &&
        Objects.equals(this.nodeName, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.nodeName) &&
        Objects.equals(this.nodeSelector, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.nodeSelector) &&
        Objects.equals(this.replicas, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.replicas) &&
        Objects.equals(this.resources, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.resources) &&
        Objects.equals(this.tolerations, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.tolerations) &&
        Objects.equals(this.volumeClaimTemplates, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.volumeClaimTemplates) &&
        Objects.equals(this.volumeMounts, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.volumeMounts) &&
        Objects.equals(this.volumes, v1alpha1ClusterSpecComponentSpecsInnerInstancesInner.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels, name, nodeName, nodeSelector, replicas, resources, tolerations, volumeClaimTemplates, volumeMounts, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecComponentSpecsInnerInstancesInner {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("nodeName");
    openapiFields.add("nodeSelector");
    openapiFields.add("replicas");
    openapiFields.add("resources");
    openapiFields.add("tolerations");
    openapiFields.add("volumeClaimTemplates");
    openapiFields.add("volumeMounts");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterSpecComponentSpecsInnerInstancesInner is not found in the empty JSON string", V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterSpecComponentSpecsInnerInstancesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerResources.validateJsonObject(jsonObj.getAsJsonObject("resources"));
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
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumeClaimTemplatesInner.validateJsonObject(jsonArrayvolumeClaimTemplates.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("volumeMounts") != null && !jsonObj.get("volumeMounts").isJsonNull()) {
        JsonArray jsonArrayvolumeMounts = jsonObj.getAsJsonArray("volumeMounts");
        if (jsonArrayvolumeMounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeMounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeMounts` to be an array in the JSON string but got `%s`", jsonObj.get("volumeMounts").toString()));
          }

          // validate the optional field `volumeMounts` (array)
          for (int i = 0; i < jsonArrayvolumeMounts.size(); i++) {
            V1alpha1BackupPolicyTemplateSpecBackupPoliciesInnerBackupMethodsInnerTargetVolumesVolumeMountsInner.validateJsonObject(jsonArrayvolumeMounts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            V1alpha1ClusterSpecComponentSpecsInnerInstancesInnerVolumesInner.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterSpecComponentSpecsInnerInstancesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterSpecComponentSpecsInnerInstancesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterSpecComponentSpecsInnerInstancesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterSpecComponentSpecsInnerInstancesInner
  */
  public static V1alpha1ClusterSpecComponentSpecsInnerInstancesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterSpecComponentSpecsInnerInstancesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterSpecComponentSpecsInnerInstancesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

