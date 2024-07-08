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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecUpgradeComponentsInner;
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
 * Specifies the desired new version of the Cluster.   Note: This field is immutable once set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecUpgrade {
  public static final String SERIALIZED_NAME_CLUSTER_VERSION_REF = "clusterVersionRef";
  @SerializedName(SERIALIZED_NAME_CLUSTER_VERSION_REF)
  private String clusterVersionRef;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<V1alpha1OpsRequestSpecUpgradeComponentsInner> components;

  public V1alpha1OpsRequestSpecUpgrade() {
  }

  public V1alpha1OpsRequestSpecUpgrade clusterVersionRef(String clusterVersionRef) {
    
    this.clusterVersionRef = clusterVersionRef;
    return this;
  }

   /**
   * Deprecated: since v0.9 because ClusterVersion is deprecated. Specifies the name of the target ClusterVersion for the upgrade.
   * @return clusterVersionRef
  **/
  @jakarta.annotation.Nullable
  public String getClusterVersionRef() {
    return clusterVersionRef;
  }


  public void setClusterVersionRef(String clusterVersionRef) {
    this.clusterVersionRef = clusterVersionRef;
  }


  public V1alpha1OpsRequestSpecUpgrade components(List<V1alpha1OpsRequestSpecUpgradeComponentsInner> components) {
    
    this.components = components;
    return this;
  }

  public V1alpha1OpsRequestSpecUpgrade addComponentsItem(V1alpha1OpsRequestSpecUpgradeComponentsInner componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Lists components to be upgrade based on desired ComponentDefinition and ServiceVersion. From the perspective of cluster API, the reasonable combinations should be: 1. (comp-def, service-ver) - upgrade to the specified service version and component definition, the user takes the responsibility to ensure that they are compatible. 2. (\&quot;\&quot;, service-ver) - upgrade to the specified service version, let the operator choose the latest compatible component definition. 3. (comp-def, \&quot;\&quot;) - upgrade to the specified component definition, let the operator choose the latest compatible service version. 4. (\&quot;\&quot;, \&quot;\&quot;) - upgrade to the latest service version and component definition, the operator will ensure the compatibility between the selected versions.
   * @return components
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecUpgradeComponentsInner> getComponents() {
    return components;
  }


  public void setComponents(List<V1alpha1OpsRequestSpecUpgradeComponentsInner> components) {
    this.components = components;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecUpgrade v1alpha1OpsRequestSpecUpgrade = (V1alpha1OpsRequestSpecUpgrade) o;
    return Objects.equals(this.clusterVersionRef, v1alpha1OpsRequestSpecUpgrade.clusterVersionRef) &&
        Objects.equals(this.components, v1alpha1OpsRequestSpecUpgrade.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterVersionRef, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecUpgrade {\n");
    sb.append("    clusterVersionRef: ").append(toIndentedString(clusterVersionRef)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
    openapiFields.add("clusterVersionRef");
    openapiFields.add("components");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecUpgrade
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecUpgrade.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecUpgrade is not found in the empty JSON string", V1alpha1OpsRequestSpecUpgrade.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecUpgrade.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecUpgrade` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("clusterVersionRef") != null && !jsonObj.get("clusterVersionRef").isJsonNull()) && !jsonObj.get("clusterVersionRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterVersionRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterVersionRef").toString()));
      }
      if (jsonObj.get("components") != null && !jsonObj.get("components").isJsonNull()) {
        JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
        if (jsonArraycomponents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("components").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
          }

          // validate the optional field `components` (array)
          for (int i = 0; i < jsonArraycomponents.size(); i++) {
            V1alpha1OpsRequestSpecUpgradeComponentsInner.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecUpgrade.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecUpgrade' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecUpgrade> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecUpgrade.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecUpgrade>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecUpgrade value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecUpgrade read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecUpgrade given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecUpgrade
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecUpgrade
  */
  public static V1alpha1OpsRequestSpecUpgrade fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecUpgrade.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecUpgrade to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

