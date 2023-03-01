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
 * ImgInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class ImgInfo {

  @JsonProperty("path")
  private String path;

  @JsonProperty("thumb")
  private String thumb;

  @JsonProperty("msg")
  private String msg;

  @JsonProperty("link")
  private String link;

  public ImgInfo path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ImgInfo thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  /**
   * Get thumb
   * @return thumb
  */
  
  @Schema(name = "thumb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public ImgInfo msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
  */
  
  @Schema(name = "msg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public ImgInfo link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
  */
  
  @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImgInfo imgInfo = (ImgInfo) o;
    return Objects.equals(this.path, imgInfo.path) &&
        Objects.equals(this.thumb, imgInfo.thumb) &&
        Objects.equals(this.msg, imgInfo.msg) &&
        Objects.equals(this.link, imgInfo.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, thumb, msg, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImgInfo {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

