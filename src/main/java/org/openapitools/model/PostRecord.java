package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatLabelGroup;
import org.openapitools.model.Category;
import org.openapitools.model.CategoryPair;
import org.openapitools.model.FileRecord;
import org.openapitools.model.PostLink;
import org.openapitools.model.PriceInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PostRecord {

  @JsonProperty("parentCategory")
  private Category parentCategory;

  @JsonProperty("category")
  private Category category;

  @JsonProperty("prices")
  @Valid
  private List<PriceInfo> prices = null;

  @JsonProperty("images")
  @Valid
  private List<FileRecord> images = null;

  @JsonProperty("videos")
  @Valid
  private List<FileRecord> videos = null;

  @JsonProperty("thumbPath")
  private String thumbPath;

  @JsonProperty("itemPath")
  private String itemPath;

  @JsonProperty("tags")
  @Valid
  private List<CategoryPair> tags = null;

  @JsonProperty("labels")
  @Valid
  private List<CatLabelGroup> labels = null;

  @JsonProperty("links")
  @Valid
  private List<PostLink> links = null;

  @JsonProperty("childs")
  @Valid
  private List<PostRecord> childs = null;

  @JsonProperty("zoneEditDatetime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime zoneEditDatetime;

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

  public PostRecord parentCategory(Category parentCategory) {
    this.parentCategory = parentCategory;
    return this;
  }

  /**
   * Get parentCategory
   * @return parentCategory
  */
  @Valid 
  @Schema(name = "parentCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Category getParentCategory() {
    return parentCategory;
  }

  public void setParentCategory(Category parentCategory) {
    this.parentCategory = parentCategory;
  }

  public PostRecord category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public PostRecord prices(List<PriceInfo> prices) {
    this.prices = prices;
    return this;
  }

  public PostRecord addPricesItem(PriceInfo pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Get prices
   * @return prices
  */
  @Valid 
  @Schema(name = "prices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PriceInfo> getPrices() {
    return prices;
  }

  public void setPrices(List<PriceInfo> prices) {
    this.prices = prices;
  }

  public PostRecord images(List<FileRecord> images) {
    this.images = images;
    return this;
  }

  public PostRecord addImagesItem(FileRecord imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<FileRecord> getImages() {
    return images;
  }

  public void setImages(List<FileRecord> images) {
    this.images = images;
  }

  public PostRecord videos(List<FileRecord> videos) {
    this.videos = videos;
    return this;
  }

  public PostRecord addVideosItem(FileRecord videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

  /**
   * Get videos
   * @return videos
  */
  @Valid 
  @Schema(name = "videos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<FileRecord> getVideos() {
    return videos;
  }

  public void setVideos(List<FileRecord> videos) {
    this.videos = videos;
  }

  public PostRecord thumbPath(String thumbPath) {
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

  public PostRecord itemPath(String itemPath) {
    this.itemPath = itemPath;
    return this;
  }

  /**
   * Get itemPath
   * @return itemPath
  */
  
  @Schema(name = "itemPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getItemPath() {
    return itemPath;
  }

  public void setItemPath(String itemPath) {
    this.itemPath = itemPath;
  }

  public PostRecord tags(List<CategoryPair> tags) {
    this.tags = tags;
    return this;
  }

  public PostRecord addTagsItem(CategoryPair tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CategoryPair> getTags() {
    return tags;
  }

  public void setTags(List<CategoryPair> tags) {
    this.tags = tags;
  }

  public PostRecord labels(List<CatLabelGroup> labels) {
    this.labels = labels;
    return this;
  }

  public PostRecord addLabelsItem(CatLabelGroup labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @Valid 
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CatLabelGroup> getLabels() {
    return labels;
  }

  public void setLabels(List<CatLabelGroup> labels) {
    this.labels = labels;
  }

  public PostRecord links(List<PostLink> links) {
    this.links = links;
    return this;
  }

  public PostRecord addLinksItem(PostLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PostLink> getLinks() {
    return links;
  }

  public void setLinks(List<PostLink> links) {
    this.links = links;
  }

  public PostRecord childs(List<PostRecord> childs) {
    this.childs = childs;
    return this;
  }

  public PostRecord addChildsItem(PostRecord childsItem) {
    if (this.childs == null) {
      this.childs = new ArrayList<>();
    }
    this.childs.add(childsItem);
    return this;
  }

  /**
   * Get childs
   * @return childs
  */
  @Valid 
  @Schema(name = "childs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PostRecord> getChilds() {
    return childs;
  }

  public void setChilds(List<PostRecord> childs) {
    this.childs = childs;
  }

  public PostRecord zoneEditDatetime(OffsetDateTime zoneEditDatetime) {
    this.zoneEditDatetime = zoneEditDatetime;
    return this;
  }

  /**
   * Get zoneEditDatetime
   * @return zoneEditDatetime
  */
  @NotNull @Valid 
  @Schema(name = "zoneEditDatetime", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getZoneEditDatetime() {
    return zoneEditDatetime;
  }

  public void setZoneEditDatetime(OffsetDateTime zoneEditDatetime) {
    this.zoneEditDatetime = zoneEditDatetime;
  }

  public PostRecord userId(String userId) {
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

  public PostRecord postId(String postId) {
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

  public PostRecord title(String title) {
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

  public PostRecord textMsg(String textMsg) {
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

  public PostRecord catId(Integer catId) {
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

  public PostRecord stateCode(Integer stateCode) {
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

  public PostRecord parentId(String parentId) {
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

  public PostRecord seq(Integer seq) {
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

  public PostRecord extRef(String extRef) {
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
    PostRecord postRecord = (PostRecord) o;
    return Objects.equals(this.parentCategory, postRecord.parentCategory) &&
        Objects.equals(this.category, postRecord.category) &&
        Objects.equals(this.prices, postRecord.prices) &&
        Objects.equals(this.images, postRecord.images) &&
        Objects.equals(this.videos, postRecord.videos) &&
        Objects.equals(this.thumbPath, postRecord.thumbPath) &&
        Objects.equals(this.itemPath, postRecord.itemPath) &&
        Objects.equals(this.tags, postRecord.tags) &&
        Objects.equals(this.labels, postRecord.labels) &&
        Objects.equals(this.links, postRecord.links) &&
        Objects.equals(this.childs, postRecord.childs) &&
        Objects.equals(this.zoneEditDatetime, postRecord.zoneEditDatetime) &&
        Objects.equals(this.userId, postRecord.userId) &&
        Objects.equals(this.postId, postRecord.postId) &&
        Objects.equals(this.title, postRecord.title) &&
        Objects.equals(this.textMsg, postRecord.textMsg) &&
        Objects.equals(this.catId, postRecord.catId) &&
        Objects.equals(this.stateCode, postRecord.stateCode) &&
        Objects.equals(this.parentId, postRecord.parentId) &&
        Objects.equals(this.seq, postRecord.seq) &&
        Objects.equals(this.extRef, postRecord.extRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentCategory, category, prices, images, videos, thumbPath, itemPath, tags, labels, links, childs, zoneEditDatetime, userId, postId, title, textMsg, catId, stateCode, parentId, seq, extRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecord {\n");
    sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    thumbPath: ").append(toIndentedString(thumbPath)).append("\n");
    sb.append("    itemPath: ").append(toIndentedString(itemPath)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    childs: ").append(toIndentedString(childs)).append("\n");
    sb.append("    zoneEditDatetime: ").append(toIndentedString(zoneEditDatetime)).append("\n");
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

