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
 * PsCatLabel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PsCatLabel {

  @JsonProperty("postId")
  private String postId;

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

  public PsCatLabel postId(String postId) {
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

  public PsCatLabel id(Long id) {
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

  public PsCatLabel catId(Integer catId) {
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

  public PsCatLabel label(String label) {
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

  public PsCatLabel text0(String text0) {
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

  public PsCatLabel text1(String text1) {
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

  public PsCatLabel userId(String userId) {
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

  public PsCatLabel code(String code) {
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

  public PsCatLabel seq(Integer seq) {
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

  public PsCatLabel stateCode(Integer stateCode) {
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
    PsCatLabel psCatLabel = (PsCatLabel) o;
    return Objects.equals(this.postId, psCatLabel.postId) &&
        Objects.equals(this.id, psCatLabel.id) &&
        Objects.equals(this.catId, psCatLabel.catId) &&
        Objects.equals(this.label, psCatLabel.label) &&
        Objects.equals(this.text0, psCatLabel.text0) &&
        Objects.equals(this.text1, psCatLabel.text1) &&
        Objects.equals(this.userId, psCatLabel.userId) &&
        Objects.equals(this.code, psCatLabel.code) &&
        Objects.equals(this.seq, psCatLabel.seq) &&
        Objects.equals(this.stateCode, psCatLabel.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postId, id, catId, label, text0, text1, userId, code, seq, stateCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsCatLabel {\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
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

