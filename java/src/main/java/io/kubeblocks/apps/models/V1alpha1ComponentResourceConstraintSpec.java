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
import io.kubeblocks.apps.models.V1alpha1ComponentResourceConstraintSpecComponentSelectorInner;
import io.kubeblocks.apps.models.V1alpha1ComponentResourceConstraintSpecRulesInner;
import io.kubeblocks.apps.models.V1alpha1ComponentResourceConstraintSpecSelectorInner;
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
 * ComponentResourceConstraintSpec defines the desired state of ComponentResourceConstraint
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T07:33:32.812607Z[Etc/UTC]")
public class V1alpha1ComponentResourceConstraintSpec {
  public static final String SERIALIZED_NAME_COMPONENT_SELECTOR = "componentSelector";
  @SerializedName(SERIALIZED_NAME_COMPONENT_SELECTOR)
  private List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> componentSelector;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1alpha1ComponentResourceConstraintSpecRulesInner> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private List<V1alpha1ComponentResourceConstraintSpecSelectorInner> selector;

  public V1alpha1ComponentResourceConstraintSpec() {
  }

  public V1alpha1ComponentResourceConstraintSpec componentSelector(List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> componentSelector) {
    
    this.componentSelector = componentSelector;
    return this;
  }

  public V1alpha1ComponentResourceConstraintSpec addComponentSelectorItem(V1alpha1ComponentResourceConstraintSpecComponentSelectorInner componentSelectorItem) {
    if (this.componentSelector == null) {
      this.componentSelector = new ArrayList<>();
    }
    this.componentSelector.add(componentSelectorItem);
    return this;
  }

   /**
   * componentSelector is used to bind the resource constraint to components based on ComponentDefinition API.
   * @return componentSelector
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> getComponentSelector() {
    return componentSelector;
  }


  public void setComponentSelector(List<V1alpha1ComponentResourceConstraintSpecComponentSelectorInner> componentSelector) {
    this.componentSelector = componentSelector;
  }


  public V1alpha1ComponentResourceConstraintSpec rules(List<V1alpha1ComponentResourceConstraintSpecRulesInner> rules) {
    
    this.rules = rules;
    return this;
  }

  public V1alpha1ComponentResourceConstraintSpec addRulesItem(V1alpha1ComponentResourceConstraintSpecRulesInner rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Component resource constraint rules.
   * @return rules
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1ComponentResourceConstraintSpecRulesInner> getRules() {
    return rules;
  }


  public void setRules(List<V1alpha1ComponentResourceConstraintSpecRulesInner> rules) {
    this.rules = rules;
  }


  public V1alpha1ComponentResourceConstraintSpec selector(List<V1alpha1ComponentResourceConstraintSpecSelectorInner> selector) {
    
    this.selector = selector;
    return this;
  }

  public V1alpha1ComponentResourceConstraintSpec addSelectorItem(V1alpha1ComponentResourceConstraintSpecSelectorInner selectorItem) {
    if (this.selector == null) {
      this.selector = new ArrayList<>();
    }
    this.selector.add(selectorItem);
    return this;
  }

   /**
   * selector is used to bind the resource constraint to cluster definitions based on ClusterDefinition API.
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ComponentResourceConstraintSpecSelectorInner> getSelector() {
    return selector;
  }


  public void setSelector(List<V1alpha1ComponentResourceConstraintSpecSelectorInner> selector) {
    this.selector = selector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentResourceConstraintSpec v1alpha1ComponentResourceConstraintSpec = (V1alpha1ComponentResourceConstraintSpec) o;
    return Objects.equals(this.componentSelector, v1alpha1ComponentResourceConstraintSpec.componentSelector) &&
        Objects.equals(this.rules, v1alpha1ComponentResourceConstraintSpec.rules) &&
        Objects.equals(this.selector, v1alpha1ComponentResourceConstraintSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentSelector, rules, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentResourceConstraintSpec {\n");
    sb.append("    componentSelector: ").append(toIndentedString(componentSelector)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
    openapiFields.add("componentSelector");
    openapiFields.add("rules");
    openapiFields.add("selector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rules");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentResourceConstraintSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentResourceConstraintSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentResourceConstraintSpec is not found in the empty JSON string", V1alpha1ComponentResourceConstraintSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentResourceConstraintSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentResourceConstraintSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ComponentResourceConstraintSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("componentSelector") != null && !jsonObj.get("componentSelector").isJsonNull()) {
        JsonArray jsonArraycomponentSelector = jsonObj.getAsJsonArray("componentSelector");
        if (jsonArraycomponentSelector != null) {
          // ensure the json data is an array
          if (!jsonObj.get("componentSelector").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `componentSelector` to be an array in the JSON string but got `%s`", jsonObj.get("componentSelector").toString()));
          }

          // validate the optional field `componentSelector` (array)
          for (int i = 0; i < jsonArraycomponentSelector.size(); i++) {
            V1alpha1ComponentResourceConstraintSpecComponentSelectorInner.validateJsonObject(jsonArraycomponentSelector.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }

      JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
      // validate the required field `rules` (array)
      for (int i = 0; i < jsonArrayrules.size(); i++) {
        V1alpha1ComponentResourceConstraintSpecRulesInner.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
      };
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        JsonArray jsonArrayselector = jsonObj.getAsJsonArray("selector");
        if (jsonArrayselector != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selector").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selector` to be an array in the JSON string but got `%s`", jsonObj.get("selector").toString()));
          }

          // validate the optional field `selector` (array)
          for (int i = 0; i < jsonArrayselector.size(); i++) {
            V1alpha1ComponentResourceConstraintSpecSelectorInner.validateJsonObject(jsonArrayselector.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentResourceConstraintSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentResourceConstraintSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentResourceConstraintSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentResourceConstraintSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentResourceConstraintSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentResourceConstraintSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentResourceConstraintSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentResourceConstraintSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentResourceConstraintSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentResourceConstraintSpec
  */
  public static V1alpha1ComponentResourceConstraintSpec fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentResourceConstraintSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentResourceConstraintSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

