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
 * CartRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class CartRecord {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("priceId")
  private Long priceId;

  @JsonProperty("quant")
  private Integer quant;

  public CartRecord id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CartRecord priceId(Long priceId) {
    this.priceId = priceId;
    return this;
  }

  /**
   * Get priceId
   * @return priceId
  */
  @NotNull 
  @Schema(name = "priceId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getPriceId() {
    return priceId;
  }

  public void setPriceId(Long priceId) {
    this.priceId = priceId;
  }

  public CartRecord quant(Integer quant) {
    this.quant = quant;
    return this;
  }

  /**
   * Get quant
   * @return quant
  */
  @NotNull 
  @Schema(name = "quant", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getQuant() {
    return quant;
  }

  public void setQuant(Integer quant) {
    this.quant = quant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartRecord cartRecord = (CartRecord) o;
    return Objects.equals(this.id, cartRecord.id) &&
        Objects.equals(this.priceId, cartRecord.priceId) &&
        Objects.equals(this.quant, cartRecord.quant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, priceId, quant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
    sb.append("    quant: ").append(toIndentedString(quant)).append("\n");
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

