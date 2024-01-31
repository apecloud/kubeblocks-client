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
import io.kubeblocks.apps.models.V1alpha1ComponentClassDefinitionSpecClasses;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1ComponentClassDefinitionSpecSeries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T08:54:21.102Z[Etc/UTC]")
public class V1alpha1ComponentClassDefinitionSpecSeries {
  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<V1alpha1ComponentClassDefinitionSpecClasses> classes = null;

  public static final String SERIALIZED_NAME_NAMING_TEMPLATE = "namingTemplate";
  @SerializedName(SERIALIZED_NAME_NAMING_TEMPLATE)
  private String namingTemplate;


  public V1alpha1ComponentClassDefinitionSpecSeries classes(List<V1alpha1ComponentClassDefinitionSpecClasses> classes) {
    
    this.classes = classes;
    return this;
  }

  public V1alpha1ComponentClassDefinitionSpecSeries addClassesItem(V1alpha1ComponentClassDefinitionSpecClasses classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * classes are definitions of classes that come in two forms. In the first form, only ComponentClass.Args need to be defined, and the complete class definition is generated by rendering the ComponentClassGroup.Template and Name. In the second form, the Name, CPU and Memory must be defined.
   * @return classes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "classes are definitions of classes that come in two forms. In the first form, only ComponentClass.Args need to be defined, and the complete class definition is generated by rendering the ComponentClassGroup.Template and Name. In the second form, the Name, CPU and Memory must be defined.")

  public List<V1alpha1ComponentClassDefinitionSpecClasses> getClasses() {
    return classes;
  }


  public void setClasses(List<V1alpha1ComponentClassDefinitionSpecClasses> classes) {
    this.classes = classes;
  }


  public V1alpha1ComponentClassDefinitionSpecSeries namingTemplate(String namingTemplate) {
    
    this.namingTemplate = namingTemplate;
    return this;
  }

   /**
   * namingTemplate is a template that uses the Go template syntax and allows for referencing variables defined in ComponentClassGroup.Template. This enables dynamic generation of class names. For example: name: \&quot;general-{{ .cpu }}c{{ .memory }}g\&quot;
   * @return namingTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "namingTemplate is a template that uses the Go template syntax and allows for referencing variables defined in ComponentClassGroup.Template. This enables dynamic generation of class names. For example: name: \"general-{{ .cpu }}c{{ .memory }}g\"")

  public String getNamingTemplate() {
    return namingTemplate;
  }


  public void setNamingTemplate(String namingTemplate) {
    this.namingTemplate = namingTemplate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentClassDefinitionSpecSeries v1alpha1ComponentClassDefinitionSpecSeries = (V1alpha1ComponentClassDefinitionSpecSeries) o;
    return Objects.equals(this.classes, v1alpha1ComponentClassDefinitionSpecSeries.classes) &&
        Objects.equals(this.namingTemplate, v1alpha1ComponentClassDefinitionSpecSeries.namingTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, namingTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentClassDefinitionSpecSeries {\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    namingTemplate: ").append(toIndentedString(namingTemplate)).append("\n");
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

