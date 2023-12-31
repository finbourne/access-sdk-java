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
import com.finbourne.access.model.AsAtRangeForSpec;
import com.finbourne.access.model.AsAtRelative;
import com.finbourne.access.model.EffectiveDateHasQuality;
import com.finbourne.access.model.EffectiveDateRelative;
import com.finbourne.access.model.EffectiveRange;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * ForSpec
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ForSpec {
  public static final String SERIALIZED_NAME_AS_AT_RANGE_FOR_SPEC = "asAtRangeForSpec";
  @SerializedName(SERIALIZED_NAME_AS_AT_RANGE_FOR_SPEC)
  private AsAtRangeForSpec asAtRangeForSpec;

  public static final String SERIALIZED_NAME_AS_AT_RELATIVE = "asAtRelative";
  @SerializedName(SERIALIZED_NAME_AS_AT_RELATIVE)
  private AsAtRelative asAtRelative;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE_HAS_QUALITY = "effectiveDateHasQuality";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE_HAS_QUALITY)
  private EffectiveDateHasQuality effectiveDateHasQuality;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE_RELATIVE = "effectiveDateRelative";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE_RELATIVE)
  private EffectiveDateRelative effectiveDateRelative;

  public static final String SERIALIZED_NAME_EFFECTIVE_RANGE = "effectiveRange";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_RANGE)
  private EffectiveRange effectiveRange;

  public ForSpec() {
  }

  public ForSpec asAtRangeForSpec(AsAtRangeForSpec asAtRangeForSpec) {
    
    this.asAtRangeForSpec = asAtRangeForSpec;
    return this;
  }

   /**
   * Get asAtRangeForSpec
   * @return asAtRangeForSpec
  **/
  @jakarta.annotation.Nullable
  public AsAtRangeForSpec getAsAtRangeForSpec() {
    return asAtRangeForSpec;
  }


  public void setAsAtRangeForSpec(AsAtRangeForSpec asAtRangeForSpec) {
    this.asAtRangeForSpec = asAtRangeForSpec;
  }


  public ForSpec asAtRelative(AsAtRelative asAtRelative) {
    
    this.asAtRelative = asAtRelative;
    return this;
  }

   /**
   * Get asAtRelative
   * @return asAtRelative
  **/
  @jakarta.annotation.Nullable
  public AsAtRelative getAsAtRelative() {
    return asAtRelative;
  }


  public void setAsAtRelative(AsAtRelative asAtRelative) {
    this.asAtRelative = asAtRelative;
  }


  public ForSpec effectiveDateHasQuality(EffectiveDateHasQuality effectiveDateHasQuality) {
    
    this.effectiveDateHasQuality = effectiveDateHasQuality;
    return this;
  }

   /**
   * Get effectiveDateHasQuality
   * @return effectiveDateHasQuality
  **/
  @jakarta.annotation.Nullable
  public EffectiveDateHasQuality getEffectiveDateHasQuality() {
    return effectiveDateHasQuality;
  }


  public void setEffectiveDateHasQuality(EffectiveDateHasQuality effectiveDateHasQuality) {
    this.effectiveDateHasQuality = effectiveDateHasQuality;
  }


  public ForSpec effectiveDateRelative(EffectiveDateRelative effectiveDateRelative) {
    
    this.effectiveDateRelative = effectiveDateRelative;
    return this;
  }

   /**
   * Get effectiveDateRelative
   * @return effectiveDateRelative
  **/
  @jakarta.annotation.Nullable
  public EffectiveDateRelative getEffectiveDateRelative() {
    return effectiveDateRelative;
  }


  public void setEffectiveDateRelative(EffectiveDateRelative effectiveDateRelative) {
    this.effectiveDateRelative = effectiveDateRelative;
  }


  public ForSpec effectiveRange(EffectiveRange effectiveRange) {
    
    this.effectiveRange = effectiveRange;
    return this;
  }

   /**
   * Get effectiveRange
   * @return effectiveRange
  **/
  @jakarta.annotation.Nullable
  public EffectiveRange getEffectiveRange() {
    return effectiveRange;
  }


  public void setEffectiveRange(EffectiveRange effectiveRange) {
    this.effectiveRange = effectiveRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForSpec forSpec = (ForSpec) o;
    return Objects.equals(this.asAtRangeForSpec, forSpec.asAtRangeForSpec) &&
        Objects.equals(this.asAtRelative, forSpec.asAtRelative) &&
        Objects.equals(this.effectiveDateHasQuality, forSpec.effectiveDateHasQuality) &&
        Objects.equals(this.effectiveDateRelative, forSpec.effectiveDateRelative) &&
        Objects.equals(this.effectiveRange, forSpec.effectiveRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asAtRangeForSpec, asAtRelative, effectiveDateHasQuality, effectiveDateRelative, effectiveRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForSpec {\n");
    sb.append("    asAtRangeForSpec: ").append(toIndentedString(asAtRangeForSpec)).append("\n");
    sb.append("    asAtRelative: ").append(toIndentedString(asAtRelative)).append("\n");
    sb.append("    effectiveDateHasQuality: ").append(toIndentedString(effectiveDateHasQuality)).append("\n");
    sb.append("    effectiveDateRelative: ").append(toIndentedString(effectiveDateRelative)).append("\n");
    sb.append("    effectiveRange: ").append(toIndentedString(effectiveRange)).append("\n");
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
    openapiFields.add("asAtRangeForSpec");
    openapiFields.add("asAtRelative");
    openapiFields.add("effectiveDateHasQuality");
    openapiFields.add("effectiveDateRelative");
    openapiFields.add("effectiveRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ForSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ForSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForSpec is not found in the empty JSON string", ForSpec.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `asAtRangeForSpec`
      if (jsonObj.get("asAtRangeForSpec") != null && !jsonObj.get("asAtRangeForSpec").isJsonNull()) {
        AsAtRangeForSpec.validateJsonElement(jsonObj.get("asAtRangeForSpec"));
      }
      // validate the optional field `asAtRelative`
      if (jsonObj.get("asAtRelative") != null && !jsonObj.get("asAtRelative").isJsonNull()) {
        AsAtRelative.validateJsonElement(jsonObj.get("asAtRelative"));
      }
      // validate the optional field `effectiveDateHasQuality`
      if (jsonObj.get("effectiveDateHasQuality") != null && !jsonObj.get("effectiveDateHasQuality").isJsonNull()) {
        EffectiveDateHasQuality.validateJsonElement(jsonObj.get("effectiveDateHasQuality"));
      }
      // validate the optional field `effectiveDateRelative`
      if (jsonObj.get("effectiveDateRelative") != null && !jsonObj.get("effectiveDateRelative").isJsonNull()) {
        EffectiveDateRelative.validateJsonElement(jsonObj.get("effectiveDateRelative"));
      }
      // validate the optional field `effectiveRange`
      if (jsonObj.get("effectiveRange") != null && !jsonObj.get("effectiveRange").isJsonNull()) {
        EffectiveRange.validateJsonElement(jsonObj.get("effectiveRange"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ForSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ForSpec>() {
           @Override
           public void write(JsonWriter out, ForSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ForSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ForSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ForSpec
  * @throws IOException if the JSON string is invalid with respect to ForSpec
  */
  public static ForSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ForSpec.class);
  }

 /**
  * Convert an instance of ForSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
