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
 * Category
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class Category {

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("parentId")
  private Integer parentId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("catId")
  private Integer catId;

  @JsonProperty("typeCode")
  private Integer typeCode;

  @JsonProperty("stateCode")
  private Integer stateCode;

  @JsonProperty("subTypeCode")
  private Integer subTypeCode;

  @JsonProperty("seq")
  private Integer seq;

  public Category userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Category parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  @NotNull 
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Category name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Category catId(Integer catId) {
    this.catId = catId;
    return this;
  }

  /**
   * Get catId
   * @return catId
  */
  @NotNull 
  @Schema(name = "catId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getCatId() {
    return catId;
  }

  public void setCatId(Integer catId) {
    this.catId = catId;
  }

  public Category typeCode(Integer typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Get typeCode
   * @return typeCode
  */
  @NotNull 
  @Schema(name = "typeCode", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(Integer typeCode) {
    this.typeCode = typeCode;
  }

  public Category stateCode(Integer stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
  */
  @NotNull 
  @Schema(name = "stateCode", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getStateCode() {
    return stateCode;
  }

  public void setStateCode(Integer stateCode) {
    this.stateCode = stateCode;
  }

  public Category subTypeCode(Integer subTypeCode) {
    this.subTypeCode = subTypeCode;
    return this;
  }

  /**
   * Get subTypeCode
   * @return subTypeCode
  */
  @NotNull 
  @Schema(name = "subTypeCode", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getSubTypeCode() {
    return subTypeCode;
  }

  public void setSubTypeCode(Integer subTypeCode) {
    this.subTypeCode = subTypeCode;
  }

  public Category seq(Integer seq) {
    this.seq = seq;
    return this;
  }

  /**
   * Get seq
   * @return seq
  */
  @NotNull 
  @Schema(name = "seq", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getSeq() {
    return seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.userId, category.userId) &&
        Objects.equals(this.parentId, category.parentId) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.catId, category.catId) &&
        Objects.equals(this.typeCode, category.typeCode) &&
        Objects.equals(this.stateCode, category.stateCode) &&
        Objects.equals(this.subTypeCode, category.subTypeCode) &&
        Objects.equals(this.seq, category.seq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, parentId, name, catId, typeCode, stateCode, subTypeCode, seq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    catId: ").append(toIndentedString(catId)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    subTypeCode: ").append(toIndentedString(subTypeCode)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
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

