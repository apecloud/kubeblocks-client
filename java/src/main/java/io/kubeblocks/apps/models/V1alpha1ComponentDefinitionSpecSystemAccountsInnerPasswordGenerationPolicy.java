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
import java.io.IOException;

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
 * Specifies the policy for generating the account&#39;s password. This field is immutable once set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T08:46:22.931435Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  /**
   * The case of the letters in the password.
   */
  @JsonAdapter(LetterCaseEnum.Adapter.class)
  public enum LetterCaseEnum {
    LOWERCASES("LowerCases"),
    
    UPPERCASES("UpperCases"),
    
    MIXEDCASES("MixedCases");

    private String value;

    LetterCaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LetterCaseEnum fromValue(String value) {
      for (LetterCaseEnum b : LetterCaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LetterCaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LetterCaseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LetterCaseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LetterCaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LETTER_CASE = "letterCase";
  @SerializedName(SERIALIZED_NAME_LETTER_CASE)
  private LetterCaseEnum letterCase;

  public static final String SERIALIZED_NAME_NUM_DIGITS = "numDigits";
  @SerializedName(SERIALIZED_NAME_NUM_DIGITS)
  private Integer numDigits;

  public static final String SERIALIZED_NAME_NUM_SYMBOLS = "numSymbols";
  @SerializedName(SERIALIZED_NAME_NUM_SYMBOLS)
  private Integer numSymbols;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private String seed;

  public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy() {
  }

  public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * The length of the password.
   * minimum: 8
   * maximum: 32
   * @return length
  **/
  @jakarta.annotation.Nullable
  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy letterCase(LetterCaseEnum letterCase) {
    
    this.letterCase = letterCase;
    return this;
  }

   /**
   * The case of the letters in the password.
   * @return letterCase
  **/
  @jakarta.annotation.Nullable
  public LetterCaseEnum getLetterCase() {
    return letterCase;
  }


  public void setLetterCase(LetterCaseEnum letterCase) {
    this.letterCase = letterCase;
  }


  public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy numDigits(Integer numDigits) {
    
    this.numDigits = numDigits;
    return this;
  }

   /**
   * The number of digits in the password.
   * minimum: 0
   * maximum: 8
   * @return numDigits
  **/
  @jakarta.annotation.Nullable
  public Integer getNumDigits() {
    return numDigits;
  }


  public void setNumDigits(Integer numDigits) {
    this.numDigits = numDigits;
  }


  public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy numSymbols(Integer numSymbols) {
    
    this.numSymbols = numSymbols;
    return this;
  }

   /**
   * The number of symbols in the password.
   * minimum: 0
   * maximum: 8
   * @return numSymbols
  **/
  @jakarta.annotation.Nullable
  public Integer getNumSymbols() {
    return numSymbols;
  }


  public void setNumSymbols(Integer numSymbols) {
    this.numSymbols = numSymbols;
  }


  public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy seed(String seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * Seed to generate the account&#39;s password. Cannot be updated.
   * @return seed
  **/
  @jakarta.annotation.Nullable
  public String getSeed() {
    return seed;
  }


  public void setSeed(String seed) {
    this.seed = seed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy v1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy = (V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy) o;
    return Objects.equals(this.length, v1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.length) &&
        Objects.equals(this.letterCase, v1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.letterCase) &&
        Objects.equals(this.numDigits, v1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.numDigits) &&
        Objects.equals(this.numSymbols, v1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.numSymbols) &&
        Objects.equals(this.seed, v1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.seed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, letterCase, numDigits, numSymbols, seed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    letterCase: ").append(toIndentedString(letterCase)).append("\n");
    sb.append("    numDigits: ").append(toIndentedString(numDigits)).append("\n");
    sb.append("    numSymbols: ").append(toIndentedString(numSymbols)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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
    openapiFields.add("length");
    openapiFields.add("letterCase");
    openapiFields.add("numDigits");
    openapiFields.add("numSymbols");
    openapiFields.add("seed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("letterCase") != null && !jsonObj.get("letterCase").isJsonNull()) && !jsonObj.get("letterCase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `letterCase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("letterCase").toString()));
      }
      if ((jsonObj.get("seed") != null && !jsonObj.get("seed").isJsonNull()) && !jsonObj.get("seed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy
  */
  public static V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecSystemAccountsInnerPasswordGenerationPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

