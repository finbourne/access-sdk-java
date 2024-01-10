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
import com.finbourne.access.model.SelectorDefinition;
import com.finbourne.access.model.TemplateMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Response object for policy generated from template
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeneratedPolicyComponents {
  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<String> applications;

  public static final String SERIALIZED_NAME_TEMPLATE_METADATA = "templateMetadata";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_METADATA)
  private TemplateMetadata templateMetadata;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<SelectorDefinition> selectors;

  public GeneratedPolicyComponents() {
  }

  public GeneratedPolicyComponents applications(List<String> applications) {
    
    this.applications = applications;
    return this;
  }

  public GeneratedPolicyComponents addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Applications to which the policy applies
   * @return applications
  **/
  @jakarta.annotation.Nullable
  public List<String> getApplications() {
    return applications;
  }


  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  public GeneratedPolicyComponents templateMetadata(TemplateMetadata templateMetadata) {
    
    this.templateMetadata = templateMetadata;
    return this;
  }

   /**
   * Get templateMetadata
   * @return templateMetadata
  **/
  @jakarta.annotation.Nullable
  public TemplateMetadata getTemplateMetadata() {
    return templateMetadata;
  }


  public void setTemplateMetadata(TemplateMetadata templateMetadata) {
    this.templateMetadata = templateMetadata;
  }


  public GeneratedPolicyComponents selectors(List<SelectorDefinition> selectors) {
    
    this.selectors = selectors;
    return this;
  }

  public GeneratedPolicyComponents addSelectorsItem(SelectorDefinition selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Selectors that this policy will be applied to
   * @return selectors
  **/
  @jakarta.annotation.Nullable
  public List<SelectorDefinition> getSelectors() {
    return selectors;
  }


  public void setSelectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratedPolicyComponents generatedPolicyComponents = (GeneratedPolicyComponents) o;
    return Objects.equals(this.applications, generatedPolicyComponents.applications) &&
        Objects.equals(this.templateMetadata, generatedPolicyComponents.templateMetadata) &&
        Objects.equals(this.selectors, generatedPolicyComponents.selectors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, templateMetadata, selectors);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratedPolicyComponents {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    templateMetadata: ").append(toIndentedString(templateMetadata)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
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
    openapiFields.add("applications");
    openapiFields.add("templateMetadata");
    openapiFields.add("selectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GeneratedPolicyComponents
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GeneratedPolicyComponents.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratedPolicyComponents is not found in the empty JSON string", GeneratedPolicyComponents.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("applications") != null && !jsonObj.get("applications").isJsonNull() && !jsonObj.get("applications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applications` to be an array in the JSON string but got `%s`", jsonObj.get("applications").toString()));
      }
      // validate the optional field `templateMetadata`
      if (jsonObj.get("templateMetadata") != null && !jsonObj.get("templateMetadata").isJsonNull()) {
        TemplateMetadata.validateJsonElement(jsonObj.get("templateMetadata"));
      }
      if (jsonObj.get("selectors") != null && !jsonObj.get("selectors").isJsonNull()) {
        JsonArray jsonArrayselectors = jsonObj.getAsJsonArray("selectors");
        if (jsonArrayselectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selectors` to be an array in the JSON string but got `%s`", jsonObj.get("selectors").toString()));
          }

          // validate the optional field `selectors` (array)
          for (int i = 0; i < jsonArrayselectors.size(); i++) {
            SelectorDefinition.validateJsonElement(jsonArrayselectors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratedPolicyComponents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratedPolicyComponents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratedPolicyComponents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratedPolicyComponents.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratedPolicyComponents>() {
           @Override
           public void write(JsonWriter out, GeneratedPolicyComponents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GeneratedPolicyComponents read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GeneratedPolicyComponents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratedPolicyComponents
  * @throws IOException if the JSON string is invalid with respect to GeneratedPolicyComponents
  */
  public static GeneratedPolicyComponents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratedPolicyComponents.class);
  }

 /**
  * Convert an instance of GeneratedPolicyComponents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
