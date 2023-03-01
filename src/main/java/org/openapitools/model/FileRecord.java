package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FileRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class FileRecord {

  @JsonProperty("postFileId")
  private Long postFileId;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("fileID")
  private Long fileID;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("fileType")
  private String fileType;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("fileSize")
  private Long fileSize;

  @JsonProperty("category")
  private String category;

  @JsonProperty("fileMsg")
  private String fileMsg;

  @JsonProperty("recordDateUtc")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime recordDateUtc;

  @JsonProperty("path")
  private String path;

  @JsonProperty("thumbPath")
  private String thumbPath;

  @JsonProperty("textContent")
  private String textContent;

  @JsonProperty("stateCode")
  private Integer stateCode;

  @JsonProperty("seq")
  private Integer seq;

  public FileRecord postFileId(Long postFileId) {
    this.postFileId = postFileId;
    return this;
  }

  /**
   * Get postFileId
   * @return postFileId
  */
  @NotNull 
  @Schema(name = "postFileId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getPostFileId() {
    return postFileId;
  }

  public void setPostFileId(Long postFileId) {
    this.postFileId = postFileId;
  }

  public FileRecord postId(String postId) {
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

  public FileRecord fileID(Long fileID) {
    this.fileID = fileID;
    return this;
  }

  /**
   * Get fileID
   * @return fileID
  */
  @NotNull 
  @Schema(name = "fileID", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getFileID() {
    return fileID;
  }

  public void setFileID(Long fileID) {
    this.fileID = fileID;
  }

  public FileRecord userId(String userId) {
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

  public FileRecord fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * Get fileType
   * @return fileType
  */
  
  @Schema(name = "fileType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public FileRecord fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  
  @Schema(name = "fileName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileRecord fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
  */
  @NotNull 
  @Schema(name = "fileSize", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public FileRecord category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public FileRecord fileMsg(String fileMsg) {
    this.fileMsg = fileMsg;
    return this;
  }

  /**
   * Get fileMsg
   * @return fileMsg
  */
  
  @Schema(name = "fileMsg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFileMsg() {
    return fileMsg;
  }

  public void setFileMsg(String fileMsg) {
    this.fileMsg = fileMsg;
  }

  public FileRecord recordDateUtc(OffsetDateTime recordDateUtc) {
    this.recordDateUtc = recordDateUtc;
    return this;
  }

  /**
   * Get recordDateUtc
   * @return recordDateUtc
  */
  @Valid 
  @Schema(name = "recordDateUtc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getRecordDateUtc() {
    return recordDateUtc;
  }

  public void setRecordDateUtc(OffsetDateTime recordDateUtc) {
    this.recordDateUtc = recordDateUtc;
  }

  public FileRecord path(String path) {
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

  public FileRecord thumbPath(String thumbPath) {
    this.thumbPath = thumbPath;
    return this;
  }

  /**
   * Get thumbPath
   * @return thumbPath
  */
  
  @Schema(name = "thumbPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getThumbPath() {
    return thumbPath;
  }

  public void setThumbPath(String thumbPath) {
    this.thumbPath = thumbPath;
  }

  public FileRecord textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

  /**
   * Get textContent
   * @return textContent
  */
  
  @Schema(name = "textContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public FileRecord stateCode(Integer stateCode) {
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

  public FileRecord seq(Integer seq) {
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
    FileRecord fileRecord = (FileRecord) o;
    return Objects.equals(this.postFileId, fileRecord.postFileId) &&
        Objects.equals(this.postId, fileRecord.postId) &&
        Objects.equals(this.fileID, fileRecord.fileID) &&
        Objects.equals(this.userId, fileRecord.userId) &&
        Objects.equals(this.fileType, fileRecord.fileType) &&
        Objects.equals(this.fileName, fileRecord.fileName) &&
        Objects.equals(this.fileSize, fileRecord.fileSize) &&
        Objects.equals(this.category, fileRecord.category) &&
        Objects.equals(this.fileMsg, fileRecord.fileMsg) &&
        Objects.equals(this.recordDateUtc, fileRecord.recordDateUtc) &&
        Objects.equals(this.path, fileRecord.path) &&
        Objects.equals(this.thumbPath, fileRecord.thumbPath) &&
        Objects.equals(this.textContent, fileRecord.textContent) &&
        Objects.equals(this.stateCode, fileRecord.stateCode) &&
        Objects.equals(this.seq, fileRecord.seq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postFileId, postId, fileID, userId, fileType, fileName, fileSize, category, fileMsg, recordDateUtc, path, thumbPath, textContent, stateCode, seq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRecord {\n");
    sb.append("    postFileId: ").append(toIndentedString(postFileId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    fileID: ").append(toIndentedString(fileID)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    fileMsg: ").append(toIndentedString(fileMsg)).append("\n");
    sb.append("    recordDateUtc: ").append(toIndentedString(recordDateUtc)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    thumbPath: ").append(toIndentedString(thumbPath)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

