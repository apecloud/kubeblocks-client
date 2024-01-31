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
import io.kubeblocks.apps.models.V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * valueFrom defines source of the env value.
 */
@ApiModel(description = "valueFrom defines source of the env value.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T07:53:54.854Z[Etc/UTC]")
public class V1alpha1BackupPolicyTemplateSpecValueFrom1 {
  public static final String SERIALIZED_NAME_CLUSTER_VERSION_REF = "clusterVersionRef";
  @SerializedName(SERIALIZED_NAME_CLUSTER_VERSION_REF)
  private List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> clusterVersionRef = null;

  public static final String SERIALIZED_NAME_COMPONENT_DEF = "componentDef";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DEF)
  private List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> componentDef = null;


  public V1alpha1BackupPolicyTemplateSpecValueFrom1 clusterVersionRef(List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> clusterVersionRef) {
    
    this.clusterVersionRef = clusterVersionRef;
    return this;
  }

  public V1alpha1BackupPolicyTemplateSpecValueFrom1 addClusterVersionRefItem(V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef clusterVersionRefItem) {
    if (this.clusterVersionRef == null) {
      this.clusterVersionRef = new ArrayList<>();
    }
    this.clusterVersionRef.add(clusterVersionRefItem);
    return this;
  }

   /**
   * mapped ClusterVersionRef to env value.
   * @return clusterVersionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mapped ClusterVersionRef to env value.")

  public List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> getClusterVersionRef() {
    return clusterVersionRef;
  }


  public void setClusterVersionRef(List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> clusterVersionRef) {
    this.clusterVersionRef = clusterVersionRef;
  }


  public V1alpha1BackupPolicyTemplateSpecValueFrom1 componentDef(List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> componentDef) {
    
    this.componentDef = componentDef;
    return this;
  }

  public V1alpha1BackupPolicyTemplateSpecValueFrom1 addComponentDefItem(V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef componentDefItem) {
    if (this.componentDef == null) {
      this.componentDef = new ArrayList<>();
    }
    this.componentDef.add(componentDefItem);
    return this;
  }

   /**
   * mapped ComponentDefinition to env value.
   * @return componentDef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mapped ComponentDefinition to env value.")

  public List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> getComponentDef() {
    return componentDef;
  }


  public void setComponentDef(List<V1alpha1BackupPolicyTemplateSpecValueFrom1ClusterVersionRef> componentDef) {
    this.componentDef = componentDef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1BackupPolicyTemplateSpecValueFrom1 v1alpha1BackupPolicyTemplateSpecValueFrom1 = (V1alpha1BackupPolicyTemplateSpecValueFrom1) o;
    return Objects.equals(this.clusterVersionRef, v1alpha1BackupPolicyTemplateSpecValueFrom1.clusterVersionRef) &&
        Objects.equals(this.componentDef, v1alpha1BackupPolicyTemplateSpecValueFrom1.componentDef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterVersionRef, componentDef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1BackupPolicyTemplateSpecValueFrom1 {\n");
    sb.append("    clusterVersionRef: ").append(toIndentedString(clusterVersionRef)).append("\n");
    sb.append("    componentDef: ").append(toIndentedString(componentDef)).append("\n");
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
