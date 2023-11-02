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
 * The possible results of an evaluation
 */
@JsonAdapter(EvaluationResult.Adapter.class)
public enum EvaluationResult {
  
  DENIED("Denied"),
  
  GRANTED("Granted"),
  
  DENIEDASLICENCEREQUIRED("DeniedAsLicenceRequired");

  private String value;

  EvaluationResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EvaluationResult fromValue(String value) {
    for (EvaluationResult b : EvaluationResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EvaluationResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final EvaluationResult enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EvaluationResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EvaluationResult.fromValue(value);
    }
  }
}

