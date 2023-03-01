package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.PostProp;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PriceInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PriceInfo {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("cost")
  private BigDecimal cost;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("propId")
  private Long propId;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("prop")
  private PostProp prop;

  @JsonProperty("propCode")
  private String propCode;

  public PriceInfo id(Long id) {
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

  public PriceInfo cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  */
  @NotNull @Valid 
  @Schema(name = "cost", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public PriceInfo price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public PriceInfo propId(Long propId) {
    this.propId = propId;
    return this;
  }

  /**
   * Get propId
   * @return propId
  */
  
  @Schema(name = "propId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getPropId() {
    return propId;
  }

  public void setPropId(Long propId) {
    this.propId = propId;
  }

  public PriceInfo postId(String postId) {
    this.postId = postId;
    return this;
  }

  /**
   * Get postId
   * @return postId
  */
  
  @Schema(name = "postId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public PriceInfo prop(PostProp prop) {
    this.prop = prop;
    return this;
  }

  /**
   * Get prop
   * @return prop
  */
  @Valid 
  @Schema(name = "prop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PostProp getProp() {
    return prop;
  }

  public void setProp(PostProp prop) {
    this.prop = prop;
  }

  public PriceInfo propCode(String propCode) {
    this.propCode = propCode;
    return this;
  }

  /**
   * Get propCode
   * @return propCode
  */
  
  @Schema(name = "propCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPropCode() {
    return propCode;
  }

  public void setPropCode(String propCode) {
    this.propCode = propCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfo priceInfo = (PriceInfo) o;
    return Objects.equals(this.id, priceInfo.id) &&
        Objects.equals(this.cost, priceInfo.cost) &&
        Objects.equals(this.price, priceInfo.price) &&
        Objects.equals(this.propId, priceInfo.propId) &&
        Objects.equals(this.postId, priceInfo.postId) &&
        Objects.equals(this.prop, priceInfo.prop) &&
        Objects.equals(this.propCode, priceInfo.propCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cost, price, propId, postId, prop, propCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    propId: ").append(toIndentedString(propId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    prop: ").append(toIndentedString(prop)).append("\n");
    sb.append("    propCode: ").append(toIndentedString(propCode)).append("\n");
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

