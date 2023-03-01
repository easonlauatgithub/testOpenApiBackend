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
 * CatLabelBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class CatLabelBase {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("catId")
  private Integer catId;

  @JsonProperty("label")
  private String label;

  @JsonProperty("text0")
  private String text0;

  @JsonProperty("text1")
  private String text1;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("code")
  private String code;

  @JsonProperty("seq")
  private Integer seq;

  @JsonProperty("stateCode")
  private Integer stateCode;

  public CatLabelBase id(Long id) {
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

  public CatLabelBase catId(Integer catId) {
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

  public CatLabelBase label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CatLabelBase text0(String text0) {
    this.text0 = text0;
    return this;
  }

  /**
   * Get text0
   * @return text0
  */
  
  @Schema(name = "text0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getText0() {
    return text0;
  }

  public void setText0(String text0) {
    this.text0 = text0;
  }

  public CatLabelBase text1(String text1) {
    this.text1 = text1;
    return this;
  }

  /**
   * Get text1
   * @return text1
  */
  
  @Schema(name = "text1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getText1() {
    return text1;
  }

  public void setText1(String text1) {
    this.text1 = text1;
  }

  public CatLabelBase userId(String userId) {
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

  public CatLabelBase code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CatLabelBase seq(Integer seq) {
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

  public CatLabelBase stateCode(Integer stateCode) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatLabelBase catLabelBase = (CatLabelBase) o;
    return Objects.equals(this.id, catLabelBase.id) &&
        Objects.equals(this.catId, catLabelBase.catId) &&
        Objects.equals(this.label, catLabelBase.label) &&
        Objects.equals(this.text0, catLabelBase.text0) &&
        Objects.equals(this.text1, catLabelBase.text1) &&
        Objects.equals(this.userId, catLabelBase.userId) &&
        Objects.equals(this.code, catLabelBase.code) &&
        Objects.equals(this.seq, catLabelBase.seq) &&
        Objects.equals(this.stateCode, catLabelBase.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, catId, label, text0, text1, userId, code, seq, stateCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatLabelBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catId: ").append(toIndentedString(catId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    text0: ").append(toIndentedString(text0)).append("\n");
    sb.append("    text1: ").append(toIndentedString(text1)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

