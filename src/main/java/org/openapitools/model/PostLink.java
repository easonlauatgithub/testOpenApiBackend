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
 * PostLink
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PostLink {

  @JsonProperty("seq")
  private Integer seq;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("linkUrl")
  private String linkUrl;

  @JsonProperty("linkTitle")
  private String linkTitle;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("linkImg")
  private String linkImg;

  @JsonProperty("linkType")
  private Integer linkType;

  @JsonProperty("linkText")
  private String linkText;

  @JsonProperty("imgThumb")
  private String imgThumb;

  public PostLink seq(Integer seq) {
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

  public PostLink id(Long id) {
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

  public PostLink linkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
    return this;
  }

  /**
   * Get linkUrl
   * @return linkUrl
  */
  
  @Schema(name = "linkUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public PostLink linkTitle(String linkTitle) {
    this.linkTitle = linkTitle;
    return this;
  }

  /**
   * Get linkTitle
   * @return linkTitle
  */
  
  @Schema(name = "linkTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLinkTitle() {
    return linkTitle;
  }

  public void setLinkTitle(String linkTitle) {
    this.linkTitle = linkTitle;
  }

  public PostLink postId(String postId) {
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

  public PostLink linkImg(String linkImg) {
    this.linkImg = linkImg;
    return this;
  }

  /**
   * Get linkImg
   * @return linkImg
  */
  
  @Schema(name = "linkImg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLinkImg() {
    return linkImg;
  }

  public void setLinkImg(String linkImg) {
    this.linkImg = linkImg;
  }

  public PostLink linkType(Integer linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
  */
  @NotNull 
  @Schema(name = "linkType", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getLinkType() {
    return linkType;
  }

  public void setLinkType(Integer linkType) {
    this.linkType = linkType;
  }

  public PostLink linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

  /**
   * Get linkText
   * @return linkText
  */
  
  @Schema(name = "linkText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public PostLink imgThumb(String imgThumb) {
    this.imgThumb = imgThumb;
    return this;
  }

  /**
   * Get imgThumb
   * @return imgThumb
  */
  
  @Schema(name = "imgThumb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getImgThumb() {
    return imgThumb;
  }

  public void setImgThumb(String imgThumb) {
    this.imgThumb = imgThumb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLink postLink = (PostLink) o;
    return Objects.equals(this.seq, postLink.seq) &&
        Objects.equals(this.id, postLink.id) &&
        Objects.equals(this.linkUrl, postLink.linkUrl) &&
        Objects.equals(this.linkTitle, postLink.linkTitle) &&
        Objects.equals(this.postId, postLink.postId) &&
        Objects.equals(this.linkImg, postLink.linkImg) &&
        Objects.equals(this.linkType, postLink.linkType) &&
        Objects.equals(this.linkText, postLink.linkText) &&
        Objects.equals(this.imgThumb, postLink.imgThumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seq, id, linkUrl, linkTitle, postId, linkImg, linkType, linkText, imgThumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLink {\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    linkTitle: ").append(toIndentedString(linkTitle)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    linkImg: ").append(toIndentedString(linkImg)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    imgThumb: ").append(toIndentedString(imgThumb)).append("\n");
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

