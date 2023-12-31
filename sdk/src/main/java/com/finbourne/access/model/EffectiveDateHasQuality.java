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
import com.finbourne.access.model.DateQuality;
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
 * EffectiveDateHasQuality
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EffectiveDateHasQuality {
  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private DateQuality quality;

  public EffectiveDateHasQuality() {
  }

  public EffectiveDateHasQuality quality(DateQuality quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @jakarta.annotation.Nullable
  public DateQuality getQuality() {
    return quality;
  }


  public void setQuality(DateQuality quality) {
    this.quality = quality;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveDateHasQuality effectiveDateHasQuality = (EffectiveDateHasQuality) o;
    return Objects.equals(this.quality, effectiveDateHasQuality.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveDateHasQuality {\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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
    openapiFields.add("quality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EffectiveDateHasQuality
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EffectiveDateHasQuality.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EffectiveDateHasQuality is not found in the empty JSON string", EffectiveDateHasQuality.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EffectiveDateHasQuality.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EffectiveDateHasQuality' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EffectiveDateHasQuality> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EffectiveDateHasQuality.class));

       return (TypeAdapter<T>) new TypeAdapter<EffectiveDateHasQuality>() {
           @Override
           public void write(JsonWriter out, EffectiveDateHasQuality value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EffectiveDateHasQuality read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EffectiveDateHasQuality given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EffectiveDateHasQuality
  * @throws IOException if the JSON string is invalid with respect to EffectiveDateHasQuality
  */
  public static EffectiveDateHasQuality fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EffectiveDateHasQuality.class);
  }

 /**
  * Convert an instance of EffectiveDateHasQuality to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
