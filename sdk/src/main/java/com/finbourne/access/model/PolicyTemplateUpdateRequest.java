/*
 * FINBOURNE Access Management API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.access.model;

import java.util.Objects;
import com.finbourne.access.model.PolicyTemplatedSelector;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import com.finbourne.access.JSON;

/**
 * Update policy template request
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyTemplateUpdateRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TEMPLATED_SELECTORS = "templatedSelectors";
  @SerializedName(SERIALIZED_NAME_TEMPLATED_SELECTORS)
  private List<PolicyTemplatedSelector> templatedSelectors = new ArrayList<>();

  public PolicyTemplateUpdateRequest() {
  }

  public PolicyTemplateUpdateRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the policy template being created
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PolicyTemplateUpdateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the policy template being craeted
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PolicyTemplateUpdateRequest templatedSelectors(List<PolicyTemplatedSelector> templatedSelectors) {
    
    this.templatedSelectors = templatedSelectors;
    return this;
  }

  public PolicyTemplateUpdateRequest addTemplatedSelectorsItem(PolicyTemplatedSelector templatedSelectorsItem) {
    if (this.templatedSelectors == null) {
      this.templatedSelectors = new ArrayList<>();
    }
    this.templatedSelectors.add(templatedSelectorsItem);
    return this;
  }

   /**
   * The selector definitions of policies included in this policy template
   * @return templatedSelectors
  **/
  @jakarta.annotation.Nonnull
  public List<PolicyTemplatedSelector> getTemplatedSelectors() {
    return templatedSelectors;
  }


  public void setTemplatedSelectors(List<PolicyTemplatedSelector> templatedSelectors) {
    this.templatedSelectors = templatedSelectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyTemplateUpdateRequest policyTemplateUpdateRequest = (PolicyTemplateUpdateRequest) o;
    return Objects.equals(this.displayName, policyTemplateUpdateRequest.displayName) &&
        Objects.equals(this.description, policyTemplateUpdateRequest.description) &&
        Objects.equals(this.templatedSelectors, policyTemplateUpdateRequest.templatedSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description, templatedSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyTemplateUpdateRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templatedSelectors: ").append(toIndentedString(templatedSelectors)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("templatedSelectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("templatedSelectors");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PolicyTemplateUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PolicyTemplateUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyTemplateUpdateRequest is not found in the empty JSON string", PolicyTemplateUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PolicyTemplateUpdateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("templatedSelectors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `templatedSelectors` to be an array in the JSON string but got `%s`", jsonObj.get("templatedSelectors").toString()));
      }

      JsonArray jsonArraytemplatedSelectors = jsonObj.getAsJsonArray("templatedSelectors");
      // validate the required field `templatedSelectors` (array)
      for (int i = 0; i < jsonArraytemplatedSelectors.size(); i++) {
        PolicyTemplatedSelector.validateJsonElement(jsonArraytemplatedSelectors.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyTemplateUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyTemplateUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyTemplateUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyTemplateUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyTemplateUpdateRequest>() {
           @Override
           public void write(JsonWriter out, PolicyTemplateUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PolicyTemplateUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PolicyTemplateUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyTemplateUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to PolicyTemplateUpdateRequest
  */
  public static PolicyTemplateUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyTemplateUpdateRequest.class);
  }

 /**
  * Convert an instance of PolicyTemplateUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
