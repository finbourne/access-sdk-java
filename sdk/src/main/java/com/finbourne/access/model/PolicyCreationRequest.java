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
import com.finbourne.access.model.ForSpec;
import com.finbourne.access.model.Grant;
import com.finbourne.access.model.HowSpec;
import com.finbourne.access.model.IfExpression;
import com.finbourne.access.model.SelectorDefinition;
import com.finbourne.access.model.TemplateMetadata;
import com.finbourne.access.model.WhenSpec;
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
 * Request to create a policy
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyCreationRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<String> applications;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Grant grant;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<SelectorDefinition> selectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOR = "for";
  @SerializedName(SERIALIZED_NAME_FOR)
  private List<ForSpec> _for;

  public static final String SERIALIZED_NAME_IF = "if";
  @SerializedName(SERIALIZED_NAME_IF)
  private List<IfExpression> _if;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private WhenSpec when;

  public static final String SERIALIZED_NAME_HOW = "how";
  @SerializedName(SERIALIZED_NAME_HOW)
  private HowSpec how;

  public static final String SERIALIZED_NAME_TEMPLATE_METADATA = "templateMetadata";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_METADATA)
  private TemplateMetadata templateMetadata;

  public PolicyCreationRequest() {
  }

  public PolicyCreationRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code of the policy being created
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PolicyCreationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of what the policy will be used for
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PolicyCreationRequest applications(List<String> applications) {
    
    this.applications = applications;
    return this;
  }

  public PolicyCreationRequest addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Applications this policy is used with
   * @return applications
  **/
  @jakarta.annotation.Nullable
  public List<String> getApplications() {
    return applications;
  }


  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  public PolicyCreationRequest grant(Grant grant) {
    
    this.grant = grant;
    return this;
  }

   /**
   * Get grant
   * @return grant
  **/
  @jakarta.annotation.Nonnull
  public Grant getGrant() {
    return grant;
  }


  public void setGrant(Grant grant) {
    this.grant = grant;
  }


  public PolicyCreationRequest selectors(List<SelectorDefinition> selectors) {
    
    this.selectors = selectors;
    return this;
  }

  public PolicyCreationRequest addSelectorsItem(SelectorDefinition selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Selectors that identify what resources this policy qualifies for
   * @return selectors
  **/
  @jakarta.annotation.Nonnull
  public List<SelectorDefinition> getSelectors() {
    return selectors;
  }


  public void setSelectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors;
  }


  public PolicyCreationRequest _for(List<ForSpec> _for) {
    
    this._for = _for;
    return this;
  }

  public PolicyCreationRequest addForItem(ForSpec _forItem) {
    if (this._for == null) {
      this._for = new ArrayList<>();
    }
    this._for.add(_forItem);
    return this;
  }

   /**
   * \&quot;For Specification\&quot; for when the policy is to be applied
   * @return _for
  **/
  @jakarta.annotation.Nullable
  public List<ForSpec> getFor() {
    return _for;
  }


  public void setFor(List<ForSpec> _for) {
    this._for = _for;
  }


  public PolicyCreationRequest _if(List<IfExpression> _if) {
    
    this._if = _if;
    return this;
  }

  public PolicyCreationRequest addIfItem(IfExpression _ifItem) {
    if (this._if == null) {
      this._if = new ArrayList<>();
    }
    this._if.add(_ifItem);
    return this;
  }

   /**
   * \&quot;If Specification\&quot; for when the policy is to be applied
   * @return _if
  **/
  @jakarta.annotation.Nullable
  public List<IfExpression> getIf() {
    return _if;
  }


  public void setIf(List<IfExpression> _if) {
    this._if = _if;
  }


  public PolicyCreationRequest when(WhenSpec when) {
    
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @jakarta.annotation.Nonnull
  public WhenSpec getWhen() {
    return when;
  }


  public void setWhen(WhenSpec when) {
    this.when = when;
  }


  public PolicyCreationRequest how(HowSpec how) {
    
    this.how = how;
    return this;
  }

   /**
   * Get how
   * @return how
  **/
  @jakarta.annotation.Nullable
  public HowSpec getHow() {
    return how;
  }


  public void setHow(HowSpec how) {
    this.how = how;
  }


  public PolicyCreationRequest templateMetadata(TemplateMetadata templateMetadata) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyCreationRequest policyCreationRequest = (PolicyCreationRequest) o;
    return Objects.equals(this.code, policyCreationRequest.code) &&
        Objects.equals(this.description, policyCreationRequest.description) &&
        Objects.equals(this.applications, policyCreationRequest.applications) &&
        Objects.equals(this.grant, policyCreationRequest.grant) &&
        Objects.equals(this.selectors, policyCreationRequest.selectors) &&
        Objects.equals(this._for, policyCreationRequest._for) &&
        Objects.equals(this._if, policyCreationRequest._if) &&
        Objects.equals(this.when, policyCreationRequest.when) &&
        Objects.equals(this.how, policyCreationRequest.how) &&
        Objects.equals(this.templateMetadata, policyCreationRequest.templateMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, applications, grant, selectors, _for, _if, when, how, templateMetadata);
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
    sb.append("class PolicyCreationRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    _for: ").append(toIndentedString(_for)).append("\n");
    sb.append("    _if: ").append(toIndentedString(_if)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    how: ").append(toIndentedString(how)).append("\n");
    sb.append("    templateMetadata: ").append(toIndentedString(templateMetadata)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("applications");
    openapiFields.add("grant");
    openapiFields.add("selectors");
    openapiFields.add("for");
    openapiFields.add("if");
    openapiFields.add("when");
    openapiFields.add("how");
    openapiFields.add("templateMetadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("grant");
    openapiRequiredFields.add("selectors");
    openapiRequiredFields.add("when");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PolicyCreationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PolicyCreationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyCreationRequest is not found in the empty JSON string", PolicyCreationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PolicyCreationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("applications") != null && !jsonObj.get("applications").isJsonNull() && !jsonObj.get("applications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applications` to be an array in the JSON string but got `%s`", jsonObj.get("applications").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("selectors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectors` to be an array in the JSON string but got `%s`", jsonObj.get("selectors").toString()));
      }

      JsonArray jsonArrayselectors = jsonObj.getAsJsonArray("selectors");
      // validate the required field `selectors` (array)
      for (int i = 0; i < jsonArrayselectors.size(); i++) {
        SelectorDefinition.validateJsonElement(jsonArrayselectors.get(i));
      };
      if (jsonObj.get("for") != null && !jsonObj.get("for").isJsonNull()) {
        JsonArray jsonArray_for = jsonObj.getAsJsonArray("for");
        if (jsonArray_for != null) {
          // ensure the json data is an array
          if (!jsonObj.get("for").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `for` to be an array in the JSON string but got `%s`", jsonObj.get("for").toString()));
          }

          // validate the optional field `for` (array)
          for (int i = 0; i < jsonArray_for.size(); i++) {
            ForSpec.validateJsonElement(jsonArray_for.get(i));
          };
        }
      }
      if (jsonObj.get("if") != null && !jsonObj.get("if").isJsonNull()) {
        JsonArray jsonArray_if = jsonObj.getAsJsonArray("if");
        if (jsonArray_if != null) {
          // ensure the json data is an array
          if (!jsonObj.get("if").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `if` to be an array in the JSON string but got `%s`", jsonObj.get("if").toString()));
          }

          // validate the optional field `if` (array)
          for (int i = 0; i < jsonArray_if.size(); i++) {
            IfExpression.validateJsonElement(jsonArray_if.get(i));
          };
        }
      }
      // validate the required field `when`
      WhenSpec.validateJsonElement(jsonObj.get("when"));
      // validate the optional field `how`
      if (jsonObj.get("how") != null && !jsonObj.get("how").isJsonNull()) {
        HowSpec.validateJsonElement(jsonObj.get("how"));
      }
      // validate the optional field `templateMetadata`
      if (jsonObj.get("templateMetadata") != null && !jsonObj.get("templateMetadata").isJsonNull()) {
        TemplateMetadata.validateJsonElement(jsonObj.get("templateMetadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyCreationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyCreationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyCreationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyCreationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyCreationRequest>() {
           @Override
           public void write(JsonWriter out, PolicyCreationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PolicyCreationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PolicyCreationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyCreationRequest
  * @throws IOException if the JSON string is invalid with respect to PolicyCreationRequest
  */
  public static PolicyCreationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyCreationRequest.class);
  }

 /**
  * Convert an instance of PolicyCreationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
