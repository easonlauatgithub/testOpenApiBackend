package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CategoryPair;
import org.openapitools.model.PostRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CartItemDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class CartItemDetail {

  @JsonProperty("postSnapShotId")
  private Long postSnapShotId;

  @JsonProperty("valid")
  private Boolean valid;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("propCats")
  @Valid
  private List<CategoryPair> propCats = null;

  @JsonProperty("post")
  private PostRecord post;

  @JsonProperty("subTotal")
  private BigDecimal subTotal;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("priceId")
  private Long priceId;

  @JsonProperty("quant")
  private Integer quant;

  public CartItemDetail postSnapShotId(Long postSnapShotId) {
    this.postSnapShotId = postSnapShotId;
    return this;
  }

  /**
   * Get postSnapShotId
   * @return postSnapShotId
  */
  @NotNull 
  @Schema(name = "postSnapShotId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getPostSnapShotId() {
    return postSnapShotId;
  }

  public void setPostSnapShotId(Long postSnapShotId) {
    this.postSnapShotId = postSnapShotId;
  }

  public CartItemDetail valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  */
  @NotNull 
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public CartItemDetail postId(String postId) {
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

  public CartItemDetail title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CartItemDetail price(BigDecimal price) {
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

  public CartItemDetail propCats(List<CategoryPair> propCats) {
    this.propCats = propCats;
    return this;
  }

  public CartItemDetail addPropCatsItem(CategoryPair propCatsItem) {
    if (this.propCats == null) {
      this.propCats = new ArrayList<>();
    }
    this.propCats.add(propCatsItem);
    return this;
  }

  /**
   * Get propCats
   * @return propCats
  */
  @Valid 
  @Schema(name = "propCats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CategoryPair> getPropCats() {
    return propCats;
  }

  public void setPropCats(List<CategoryPair> propCats) {
    this.propCats = propCats;
  }

  public CartItemDetail post(PostRecord post) {
    this.post = post;
    return this;
  }

  /**
   * Get post
   * @return post
  */
  @Valid 
  @Schema(name = "post", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PostRecord getPost() {
    return post;
  }

  public void setPost(PostRecord post) {
    this.post = post;
  }

  public CartItemDetail subTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
  */
  @NotNull @Valid 
  @Schema(name = "subTotal", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }

  public CartItemDetail id(Long id) {
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

  public CartItemDetail priceId(Long priceId) {
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

  public CartItemDetail quant(Integer quant) {
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
    CartItemDetail cartItemDetail = (CartItemDetail) o;
    return Objects.equals(this.postSnapShotId, cartItemDetail.postSnapShotId) &&
        Objects.equals(this.valid, cartItemDetail.valid) &&
        Objects.equals(this.postId, cartItemDetail.postId) &&
        Objects.equals(this.title, cartItemDetail.title) &&
        Objects.equals(this.price, cartItemDetail.price) &&
        Objects.equals(this.propCats, cartItemDetail.propCats) &&
        Objects.equals(this.post, cartItemDetail.post) &&
        Objects.equals(this.subTotal, cartItemDetail.subTotal) &&
        Objects.equals(this.id, cartItemDetail.id) &&
        Objects.equals(this.priceId, cartItemDetail.priceId) &&
        Objects.equals(this.quant, cartItemDetail.quant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postSnapShotId, valid, postId, title, price, propCats, post, subTotal, id, priceId, quant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemDetail {\n");
    sb.append("    postSnapShotId: ").append(toIndentedString(postSnapShotId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    propCats: ").append(toIndentedString(propCats)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
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

