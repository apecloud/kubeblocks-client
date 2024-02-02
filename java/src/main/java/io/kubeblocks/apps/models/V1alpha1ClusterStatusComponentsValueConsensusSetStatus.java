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
import io.kubeblocks.apps.models.V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner;
import io.kubeblocks.apps.models.V1alpha1ClusterStatusComponentsValueConsensusSetStatusLeader;
import io.kubeblocks.apps.models.V1alpha1ClusterStatusComponentsValueConsensusSetStatusLearner;
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
 * consensusSetStatus specifies the mapping of role and pod name.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterStatusComponentsValueConsensusSetStatus {
  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private List<V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner> followers;

  public static final String SERIALIZED_NAME_LEADER = "leader";
  @SerializedName(SERIALIZED_NAME_LEADER)
  private V1alpha1ClusterStatusComponentsValueConsensusSetStatusLeader leader;

  public static final String SERIALIZED_NAME_LEARNER = "learner";
  @SerializedName(SERIALIZED_NAME_LEARNER)
  private V1alpha1ClusterStatusComponentsValueConsensusSetStatusLearner learner;

  public V1alpha1ClusterStatusComponentsValueConsensusSetStatus() {
  }

  public V1alpha1ClusterStatusComponentsValueConsensusSetStatus followers(List<V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner> followers) {
    
    this.followers = followers;
    return this;
  }

  public V1alpha1ClusterStatusComponentsValueConsensusSetStatus addFollowersItem(V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

   /**
   * Followers status.
   * @return followers
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner> getFollowers() {
    return followers;
  }


  public void setFollowers(List<V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner> followers) {
    this.followers = followers;
  }


  public V1alpha1ClusterStatusComponentsValueConsensusSetStatus leader(V1alpha1ClusterStatusComponentsValueConsensusSetStatusLeader leader) {
    
    this.leader = leader;
    return this;
  }

   /**
   * Get leader
   * @return leader
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1ClusterStatusComponentsValueConsensusSetStatusLeader getLeader() {
    return leader;
  }


  public void setLeader(V1alpha1ClusterStatusComponentsValueConsensusSetStatusLeader leader) {
    this.leader = leader;
  }


  public V1alpha1ClusterStatusComponentsValueConsensusSetStatus learner(V1alpha1ClusterStatusComponentsValueConsensusSetStatusLearner learner) {
    
    this.learner = learner;
    return this;
  }

   /**
   * Get learner
   * @return learner
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterStatusComponentsValueConsensusSetStatusLearner getLearner() {
    return learner;
  }


  public void setLearner(V1alpha1ClusterStatusComponentsValueConsensusSetStatusLearner learner) {
    this.learner = learner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterStatusComponentsValueConsensusSetStatus v1alpha1ClusterStatusComponentsValueConsensusSetStatus = (V1alpha1ClusterStatusComponentsValueConsensusSetStatus) o;
    return Objects.equals(this.followers, v1alpha1ClusterStatusComponentsValueConsensusSetStatus.followers) &&
        Objects.equals(this.leader, v1alpha1ClusterStatusComponentsValueConsensusSetStatus.leader) &&
        Objects.equals(this.learner, v1alpha1ClusterStatusComponentsValueConsensusSetStatus.learner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followers, leader, learner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterStatusComponentsValueConsensusSetStatus {\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    learner: ").append(toIndentedString(learner)).append("\n");
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
    openapiFields.add("followers");
    openapiFields.add("leader");
    openapiFields.add("learner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("leader");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterStatusComponentsValueConsensusSetStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterStatusComponentsValueConsensusSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterStatusComponentsValueConsensusSetStatus is not found in the empty JSON string", V1alpha1ClusterStatusComponentsValueConsensusSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterStatusComponentsValueConsensusSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterStatusComponentsValueConsensusSetStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterStatusComponentsValueConsensusSetStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("followers") != null && !jsonObj.get("followers").isJsonNull()) {
        JsonArray jsonArrayfollowers = jsonObj.getAsJsonArray("followers");
        if (jsonArrayfollowers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("followers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `followers` to be an array in the JSON string but got `%s`", jsonObj.get("followers").toString()));
          }

          // validate the optional field `followers` (array)
          for (int i = 0; i < jsonArrayfollowers.size(); i++) {
            V1alpha1ClusterStatusComponentsValueConsensusSetStatusFollowersInner.validateJsonObject(jsonArrayfollowers.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `leader`
      V1alpha1ClusterStatusComponentsValueConsensusSetStatusLeader.validateJsonObject(jsonObj.getAsJsonObject("leader"));
      // validate the optional field `learner`
      if (jsonObj.get("learner") != null && !jsonObj.get("learner").isJsonNull()) {
        V1alpha1ClusterStatusComponentsValueConsensusSetStatusLearner.validateJsonObject(jsonObj.getAsJsonObject("learner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterStatusComponentsValueConsensusSetStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterStatusComponentsValueConsensusSetStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterStatusComponentsValueConsensusSetStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterStatusComponentsValueConsensusSetStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterStatusComponentsValueConsensusSetStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterStatusComponentsValueConsensusSetStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterStatusComponentsValueConsensusSetStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterStatusComponentsValueConsensusSetStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterStatusComponentsValueConsensusSetStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterStatusComponentsValueConsensusSetStatus
  */
  public static V1alpha1ClusterStatusComponentsValueConsensusSetStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterStatusComponentsValueConsensusSetStatus.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterStatusComponentsValueConsensusSetStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
