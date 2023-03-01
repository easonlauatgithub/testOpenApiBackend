package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SortOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class SortOrder {

  @JsonProperty("field")
  private String field;

  @JsonProperty("isAsc")
  private Boolean isAsc;

  public SortOrder field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  
  @Schema(name = "field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SortOrder isAsc(Boolean isAsc) {
    this.isAsc = isAsc;
    return this;
  }

  /**
   * Get isAsc
   * @return isAsc
  */
  @NotNull 
  @Schema(name = "isAsc", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsAsc() {
    return isAsc;
  }

  public void setIsAsc(Boolean isAsc) {
    this.isAsc = isAsc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortOrder sortOrder = (SortOrder) o;
    return Objects.equals(this.field, sortOrder.field) &&
        Objects.equals(this.isAsc, sortOrder.isAsc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, isAsc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortOrder {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    isAsc: ").append(toIndentedString(isAsc)).append("\n");
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
}

