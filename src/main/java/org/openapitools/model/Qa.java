package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.UserInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Qa
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class Qa {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("toId")
  private Long toId;

  @JsonProperty("domainName")
  private String domainName;

  @JsonProperty("domainId")
  private Long domainId;

  @JsonProperty("toUserId")
  private String toUserId;

  @JsonProperty("byUserId")
  private String byUserId;

  @JsonProperty("path")
  private String path;

  @JsonProperty("query")
  private String query;

  @JsonProperty("msg")
  private String msg;

  @JsonProperty("stateCode")
  private Integer stateCode;

  @JsonProperty("createDateUtc")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateUtc;

  @JsonProperty("replies")
  @Valid
  private List<Qa> replies = null;

  @JsonProperty("asker")
  private UserInfo asker;

  public Qa id(Long id) {
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

  public Qa toId(Long toId) {
    this.toId = toId;
    return this;
  }

  /**
   * Get toId
   * @return toId
  */
  
  @Schema(name = "toId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getToId() {
    return toId;
  }

  public void setToId(Long toId) {
    this.toId = toId;
  }

  public Qa domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
  */
  
  @Schema(name = "domainName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public Qa domainId(Long domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
  */
  @NotNull 
  @Schema(name = "domainId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getDomainId() {
    return domainId;
  }

  public void setDomainId(Long domainId) {
    this.domainId = domainId;
  }

  public Qa toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

  /**
   * Get toUserId
   * @return toUserId
  */
  
  @Schema(name = "toUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public Qa byUserId(String byUserId) {
    this.byUserId = byUserId;
    return this;
  }

  /**
   * Get byUserId
   * @return byUserId
  */
  
  @Schema(name = "byUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getByUserId() {
    return byUserId;
  }

  public void setByUserId(String byUserId) {
    this.byUserId = byUserId;
  }

  public Qa path(String path) {
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

  public Qa query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
  
  @Schema(name = "query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Qa msg(String msg) {
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

  public Qa stateCode(Integer stateCode) {
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

  public Qa createDateUtc(OffsetDateTime createDateUtc) {
    this.createDateUtc = createDateUtc;
    return this;
  }

  /**
   * Get createDateUtc
   * @return createDateUtc
  */
  @NotNull @Valid 
  @Schema(name = "createDateUtc", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getCreateDateUtc() {
    return createDateUtc;
  }

  public void setCreateDateUtc(OffsetDateTime createDateUtc) {
    this.createDateUtc = createDateUtc;
  }

  public Qa replies(List<Qa> replies) {
    this.replies = replies;
    return this;
  }

  public Qa addRepliesItem(Qa repliesItem) {
    if (this.replies == null) {
      this.replies = new ArrayList<>();
    }
    this.replies.add(repliesItem);
    return this;
  }

  /**
   * Get replies
   * @return replies
  */
  @Valid 
  @Schema(name = "replies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Qa> getReplies() {
    return replies;
  }

  public void setReplies(List<Qa> replies) {
    this.replies = replies;
  }

  public Qa asker(UserInfo asker) {
    this.asker = asker;
    return this;
  }

  /**
   * Get asker
   * @return asker
  */
  @Valid 
  @Schema(name = "asker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UserInfo getAsker() {
    return asker;
  }

  public void setAsker(UserInfo asker) {
    this.asker = asker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qa qa = (Qa) o;
    return Objects.equals(this.id, qa.id) &&
        Objects.equals(this.toId, qa.toId) &&
        Objects.equals(this.domainName, qa.domainName) &&
        Objects.equals(this.domainId, qa.domainId) &&
        Objects.equals(this.toUserId, qa.toUserId) &&
        Objects.equals(this.byUserId, qa.byUserId) &&
        Objects.equals(this.path, qa.path) &&
        Objects.equals(this.query, qa.query) &&
        Objects.equals(this.msg, qa.msg) &&
        Objects.equals(this.stateCode, qa.stateCode) &&
        Objects.equals(this.createDateUtc, qa.createDateUtc) &&
        Objects.equals(this.replies, qa.replies) &&
        Objects.equals(this.asker, qa.asker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, toId, domainName, domainId, toUserId, byUserId, path, query, msg, stateCode, createDateUtc, replies, asker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qa {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    byUserId: ").append(toIndentedString(byUserId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    createDateUtc: ").append(toIndentedString(createDateUtc)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
    sb.append("    asker: ").append(toIndentedString(asker)).append("\n");
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

