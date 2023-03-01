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
 * PostBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PostBase {

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("textMsg")
  private String textMsg;

  @JsonProperty("catId")
  private Integer catId;

  @JsonProperty("stateCode")
  private Integer stateCode;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("seq")
  private Integer seq;

  @JsonProperty("extRef")
  private String extRef;

  public PostBase userId(String userId) {
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

  public PostBase postId(String postId) {
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

  public PostBase title(String title) {
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

  public PostBase textMsg(String textMsg) {
    this.textMsg = textMsg;
    return this;
  }

  /**
   * Get textMsg
   * @return textMsg
  */
  
  @Schema(name = "textMsg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTextMsg() {
    return textMsg;
  }

  public void setTextMsg(String textMsg) {
    this.textMsg = textMsg;
  }

  public PostBase catId(Integer catId) {
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

  public PostBase stateCode(Integer stateCode) {
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

  public PostBase parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public PostBase seq(Integer seq) {
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

  public PostBase extRef(String extRef) {
    this.extRef = extRef;
    return this;
  }

  /**
   * Get extRef
   * @return extRef
  */
  
  @Schema(name = "extRef", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getExtRef() {
    return extRef;
  }

  public void setExtRef(String extRef) {
    this.extRef = extRef;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBase postBase = (PostBase) o;
    return Objects.equals(this.userId, postBase.userId) &&
        Objects.equals(this.postId, postBase.postId) &&
        Objects.equals(this.title, postBase.title) &&
        Objects.equals(this.textMsg, postBase.textMsg) &&
        Objects.equals(this.catId, postBase.catId) &&
        Objects.equals(this.stateCode, postBase.stateCode) &&
        Objects.equals(this.parentId, postBase.parentId) &&
        Objects.equals(this.seq, postBase.seq) &&
        Objects.equals(this.extRef, postBase.extRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, postId, title, textMsg, catId, stateCode, parentId, seq, extRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBase {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    textMsg: ").append(toIndentedString(textMsg)).append("\n");
    sb.append("    catId: ").append(toIndentedString(catId)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    extRef: ").append(toIndentedString(extRef)).append("\n");
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

