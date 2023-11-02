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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PolicyType
 */
@JsonAdapter(PolicyType.Adapter.class)
public enum PolicyType {
  
  UNDEFINED("Undefined"),
  
  ENTITLEMENT("Entitlement"),
  
  LICENCE("Licence");

  private String value;

  PolicyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PolicyType fromValue(String value) {
    for (PolicyType b : PolicyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PolicyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PolicyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PolicyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PolicyType.fromValue(value);
    }
  }
}

