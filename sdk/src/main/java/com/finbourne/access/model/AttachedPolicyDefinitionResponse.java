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
import com.finbourne.access.model.PolicyId;
import com.finbourne.access.model.PolicyType;
import com.finbourne.access.model.RoleId;
import com.finbourne.access.model.SelectorDefinition;
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
 * AttachedPolicyDefinitionResponse
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttachedPolicyDefinitionResponse {
  public static final String SERIALIZED_NAME_SOURCE_ROLE = "sourceRole";
  @SerializedName(SERIALIZED_NAME_SOURCE_ROLE)
  private RoleId sourceRole;

  public static final String SERIALIZED_NAME_ROLE_HIERARCHY_INDEX = "roleHierarchyIndex";
  @SerializedName(SERIALIZED_NAME_ROLE_HIERARCHY_INDEX)
  private Integer roleHierarchyIndex;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<String> applications;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policyType";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private PolicyType policyType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private PolicyId id;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Grant grant;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<SelectorDefinition> selectors;

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

  public AttachedPolicyDefinitionResponse() {
  }

  public AttachedPolicyDefinitionResponse sourceRole(RoleId sourceRole) {
    
    this.sourceRole = sourceRole;
    return this;
  }

   /**
   * Get sourceRole
   * @return sourceRole
  **/
  @jakarta.annotation.Nullable
  public RoleId getSourceRole() {
    return sourceRole;
  }


  public void setSourceRole(RoleId sourceRole) {
    this.sourceRole = sourceRole;
  }


  public AttachedPolicyDefinitionResponse roleHierarchyIndex(Integer roleHierarchyIndex) {
    
    this.roleHierarchyIndex = roleHierarchyIndex;
    return this;
  }

   /**
   * Get roleHierarchyIndex
   * @return roleHierarchyIndex
  **/
  @jakarta.annotation.Nullable
  public Integer getRoleHierarchyIndex() {
    return roleHierarchyIndex;
  }


  public void setRoleHierarchyIndex(Integer roleHierarchyIndex) {
    this.roleHierarchyIndex = roleHierarchyIndex;
  }


  public AttachedPolicyDefinitionResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AttachedPolicyDefinitionResponse applications(List<String> applications) {
    
    this.applications = applications;
    return this;
  }

  public AttachedPolicyDefinitionResponse addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @jakarta.annotation.Nullable
  public List<String> getApplications() {
    return applications;
  }


  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  public AttachedPolicyDefinitionResponse policyType(PolicyType policyType) {
    
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @jakarta.annotation.Nullable
  public PolicyType getPolicyType() {
    return policyType;
  }


  public void setPolicyType(PolicyType policyType) {
    this.policyType = policyType;
  }


  public AttachedPolicyDefinitionResponse id(PolicyId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  public PolicyId getId() {
    return id;
  }


  public void setId(PolicyId id) {
    this.id = id;
  }


  public AttachedPolicyDefinitionResponse grant(Grant grant) {
    
    this.grant = grant;
    return this;
  }

   /**
   * Get grant
   * @return grant
  **/
  @jakarta.annotation.Nullable
  public Grant getGrant() {
    return grant;
  }


  public void setGrant(Grant grant) {
    this.grant = grant;
  }


  public AttachedPolicyDefinitionResponse selectors(List<SelectorDefinition> selectors) {
    
    this.selectors = selectors;
    return this;
  }

  public AttachedPolicyDefinitionResponse addSelectorsItem(SelectorDefinition selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Get selectors
   * @return selectors
  **/
  @jakarta.annotation.Nullable
  public List<SelectorDefinition> getSelectors() {
    return selectors;
  }


  public void setSelectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors;
  }


  public AttachedPolicyDefinitionResponse _for(List<ForSpec> _for) {
    
    this._for = _for;
    return this;
  }

  public AttachedPolicyDefinitionResponse addForItem(ForSpec _forItem) {
    if (this._for == null) {
      this._for = new ArrayList<>();
    }
    this._for.add(_forItem);
    return this;
  }

   /**
   * Get _for
   * @return _for
  **/
  @jakarta.annotation.Nullable
  public List<ForSpec> getFor() {
    return _for;
  }


  public void setFor(List<ForSpec> _for) {
    this._for = _for;
  }


  public AttachedPolicyDefinitionResponse _if(List<IfExpression> _if) {
    
    this._if = _if;
    return this;
  }

  public AttachedPolicyDefinitionResponse addIfItem(IfExpression _ifItem) {
    if (this._if == null) {
      this._if = new ArrayList<>();
    }
    this._if.add(_ifItem);
    return this;
  }

   /**
   * Get _if
   * @return _if
  **/
  @jakarta.annotation.Nullable
  public List<IfExpression> getIf() {
    return _if;
  }


  public void setIf(List<IfExpression> _if) {
    this._if = _if;
  }


  public AttachedPolicyDefinitionResponse when(WhenSpec when) {
    
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @jakarta.annotation.Nullable
  public WhenSpec getWhen() {
    return when;
  }


  public void setWhen(WhenSpec when) {
    this.when = when;
  }


  public AttachedPolicyDefinitionResponse how(HowSpec how) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedPolicyDefinitionResponse attachedPolicyDefinitionResponse = (AttachedPolicyDefinitionResponse) o;
    return Objects.equals(this.sourceRole, attachedPolicyDefinitionResponse.sourceRole) &&
        Objects.equals(this.roleHierarchyIndex, attachedPolicyDefinitionResponse.roleHierarchyIndex) &&
        Objects.equals(this.description, attachedPolicyDefinitionResponse.description) &&
        Objects.equals(this.applications, attachedPolicyDefinitionResponse.applications) &&
        Objects.equals(this.policyType, attachedPolicyDefinitionResponse.policyType) &&
        Objects.equals(this.id, attachedPolicyDefinitionResponse.id) &&
        Objects.equals(this.grant, attachedPolicyDefinitionResponse.grant) &&
        Objects.equals(this.selectors, attachedPolicyDefinitionResponse.selectors) &&
        Objects.equals(this._for, attachedPolicyDefinitionResponse._for) &&
        Objects.equals(this._if, attachedPolicyDefinitionResponse._if) &&
        Objects.equals(this.when, attachedPolicyDefinitionResponse.when) &&
        Objects.equals(this.how, attachedPolicyDefinitionResponse.how);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceRole, roleHierarchyIndex, description, applications, policyType, id, grant, selectors, _for, _if, when, how);
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
    sb.append("class AttachedPolicyDefinitionResponse {\n");
    sb.append("    sourceRole: ").append(toIndentedString(sourceRole)).append("\n");
    sb.append("    roleHierarchyIndex: ").append(toIndentedString(roleHierarchyIndex)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    _for: ").append(toIndentedString(_for)).append("\n");
    sb.append("    _if: ").append(toIndentedString(_if)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    how: ").append(toIndentedString(how)).append("\n");
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
    openapiFields.add("sourceRole");
    openapiFields.add("roleHierarchyIndex");
    openapiFields.add("description");
    openapiFields.add("applications");
    openapiFields.add("policyType");
    openapiFields.add("id");
    openapiFields.add("grant");
    openapiFields.add("selectors");
    openapiFields.add("for");
    openapiFields.add("if");
    openapiFields.add("when");
    openapiFields.add("how");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AttachedPolicyDefinitionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachedPolicyDefinitionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachedPolicyDefinitionResponse is not found in the empty JSON string", AttachedPolicyDefinitionResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `sourceRole`
      if (jsonObj.get("sourceRole") != null && !jsonObj.get("sourceRole").isJsonNull()) {
        RoleId.validateJsonElement(jsonObj.get("sourceRole"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("applications") != null && !jsonObj.get("applications").isJsonNull() && !jsonObj.get("applications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applications` to be an array in the JSON string but got `%s`", jsonObj.get("applications").toString()));
      }
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        PolicyId.validateJsonElement(jsonObj.get("id"));
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
      // validate the optional field `when`
      if (jsonObj.get("when") != null && !jsonObj.get("when").isJsonNull()) {
        WhenSpec.validateJsonElement(jsonObj.get("when"));
      }
      // validate the optional field `how`
      if (jsonObj.get("how") != null && !jsonObj.get("how").isJsonNull()) {
        HowSpec.validateJsonElement(jsonObj.get("how"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachedPolicyDefinitionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachedPolicyDefinitionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachedPolicyDefinitionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachedPolicyDefinitionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachedPolicyDefinitionResponse>() {
           @Override
           public void write(JsonWriter out, AttachedPolicyDefinitionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachedPolicyDefinitionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachedPolicyDefinitionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachedPolicyDefinitionResponse
  * @throws IOException if the JSON string is invalid with respect to AttachedPolicyDefinitionResponse
  */
  public static AttachedPolicyDefinitionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachedPolicyDefinitionResponse.class);
  }

 /**
  * Convert an instance of AttachedPolicyDefinitionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
