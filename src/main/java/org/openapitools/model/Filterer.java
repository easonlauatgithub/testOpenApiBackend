package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SortOrder;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Filterer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class Filterer {

  @JsonProperty("shopCode")
  private String shopCode;

  @JsonProperty("shopId")
  private Long shopId;

  @JsonProperty("shopUserId")
  private String shopUserId;

  @JsonProperty("parentIds")
  @Valid
  private List<String> parentIds = null;

  @JsonProperty("postIds")
  @Valid
  private List<String> postIds = null;

  @JsonProperty("cats")
  @Valid
  private List<Integer> cats = null;

  @JsonProperty("catSubTypes")
  @Valid
  private List<Integer> catSubTypes = null;

  @JsonProperty("tags")
  @Valid
  private List<Integer> tags = null;

  @JsonProperty("states")
  @Valid
  private List<Integer> states = null;

  @JsonProperty("catStates")
  @Valid
  private List<Integer> catStates = null;

  @JsonProperty("sorts")
  @Valid
  private List<SortOrder> sorts = null;

  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("hasCatStates")
  private Boolean hasCatStates;

  @JsonProperty("hasStates")
  private Boolean hasStates;

  @JsonProperty("hasCats")
  private Boolean hasCats;

  @JsonProperty("hasTags")
  private Boolean hasTags;

  @JsonProperty("hasPostIds")
  private Boolean hasPostIds;

  @JsonProperty("hasParentIds")
  private Boolean hasParentIds;

  @JsonProperty("hasCatSubTypes")
  private Boolean hasCatSubTypes;

  @JsonProperty("hasSorts")
  private Boolean hasSorts;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("skip")
  private Integer skip;

  public Filterer shopCode(String shopCode) {
    this.shopCode = shopCode;
    return this;
  }

  /**
   * Get shopCode
   * @return shopCode
  */
  
  @Schema(name = "shopCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShopCode() {
    return shopCode;
  }

  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }

  public Filterer shopId(Long shopId) {
    this.shopId = shopId;
    return this;
  }

  /**
   * Get shopId
   * @return shopId
  */
  @NotNull 
  @Schema(name = "shopId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getShopId() {
    return shopId;
  }

  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }

  public Filterer shopUserId(String shopUserId) {
    this.shopUserId = shopUserId;
    return this;
  }

  /**
   * Get shopUserId
   * @return shopUserId
  */
  
  @Schema(name = "shopUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShopUserId() {
    return shopUserId;
  }

  public void setShopUserId(String shopUserId) {
    this.shopUserId = shopUserId;
  }

  public Filterer parentIds(List<String> parentIds) {
    this.parentIds = parentIds;
    return this;
  }

  public Filterer addParentIdsItem(String parentIdsItem) {
    if (this.parentIds == null) {
      this.parentIds = new ArrayList<>();
    }
    this.parentIds.add(parentIdsItem);
    return this;
  }

  /**
   * Get parentIds
   * @return parentIds
  */
  
  @Schema(name = "parentIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getParentIds() {
    return parentIds;
  }

  public void setParentIds(List<String> parentIds) {
    this.parentIds = parentIds;
  }

  public Filterer postIds(List<String> postIds) {
    this.postIds = postIds;
    return this;
  }

  public Filterer addPostIdsItem(String postIdsItem) {
    if (this.postIds == null) {
      this.postIds = new ArrayList<>();
    }
    this.postIds.add(postIdsItem);
    return this;
  }

  /**
   * Get postIds
   * @return postIds
  */
  
  @Schema(name = "postIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getPostIds() {
    return postIds;
  }

  public void setPostIds(List<String> postIds) {
    this.postIds = postIds;
  }

  public Filterer cats(List<Integer> cats) {
    this.cats = cats;
    return this;
  }

  public Filterer addCatsItem(Integer catsItem) {
    if (this.cats == null) {
      this.cats = new ArrayList<>();
    }
    this.cats.add(catsItem);
    return this;
  }

  /**
   * Get cats
   * @return cats
  */
  
  @Schema(name = "cats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Integer> getCats() {
    return cats;
  }

  public void setCats(List<Integer> cats) {
    this.cats = cats;
  }

  public Filterer catSubTypes(List<Integer> catSubTypes) {
    this.catSubTypes = catSubTypes;
    return this;
  }

  public Filterer addCatSubTypesItem(Integer catSubTypesItem) {
    if (this.catSubTypes == null) {
      this.catSubTypes = new ArrayList<>();
    }
    this.catSubTypes.add(catSubTypesItem);
    return this;
  }

  /**
   * Get catSubTypes
   * @return catSubTypes
  */
  
  @Schema(name = "catSubTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Integer> getCatSubTypes() {
    return catSubTypes;
  }

  public void setCatSubTypes(List<Integer> catSubTypes) {
    this.catSubTypes = catSubTypes;
  }

  public Filterer tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public Filterer addTagsItem(Integer tagsItem) {
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
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }

  public Filterer states(List<Integer> states) {
    this.states = states;
    return this;
  }

  public Filterer addStatesItem(Integer statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
  */
  
  @Schema(name = "states", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Integer> getStates() {
    return states;
  }

  public void setStates(List<Integer> states) {
    this.states = states;
  }

  public Filterer catStates(List<Integer> catStates) {
    this.catStates = catStates;
    return this;
  }

  public Filterer addCatStatesItem(Integer catStatesItem) {
    if (this.catStates == null) {
      this.catStates = new ArrayList<>();
    }
    this.catStates.add(catStatesItem);
    return this;
  }

  /**
   * Get catStates
   * @return catStates
  */
  
  @Schema(name = "catStates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Integer> getCatStates() {
    return catStates;
  }

  public void setCatStates(List<Integer> catStates) {
    this.catStates = catStates;
  }

  public Filterer sorts(List<SortOrder> sorts) {
    this.sorts = sorts;
    return this;
  }

  public Filterer addSortsItem(SortOrder sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

  /**
   * Get sorts
   * @return sorts
  */
  @Valid 
  @Schema(name = "sorts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<SortOrder> getSorts() {
    return sorts;
  }

  public void setSorts(List<SortOrder> sorts) {
    this.sorts = sorts;
  }

  public Filterer keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  
  @Schema(name = "keyword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public Filterer hasCatStates(Boolean hasCatStates) {
    this.hasCatStates = hasCatStates;
    return this;
  }

  /**
   * Get hasCatStates
   * @return hasCatStates
  */
  @NotNull 
  @Schema(name = "hasCatStates", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasCatStates() {
    return hasCatStates;
  }

  public void setHasCatStates(Boolean hasCatStates) {
    this.hasCatStates = hasCatStates;
  }

  public Filterer hasStates(Boolean hasStates) {
    this.hasStates = hasStates;
    return this;
  }

  /**
   * Get hasStates
   * @return hasStates
  */
  @NotNull 
  @Schema(name = "hasStates", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasStates() {
    return hasStates;
  }

  public void setHasStates(Boolean hasStates) {
    this.hasStates = hasStates;
  }

  public Filterer hasCats(Boolean hasCats) {
    this.hasCats = hasCats;
    return this;
  }

  /**
   * Get hasCats
   * @return hasCats
  */
  @NotNull 
  @Schema(name = "hasCats", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasCats() {
    return hasCats;
  }

  public void setHasCats(Boolean hasCats) {
    this.hasCats = hasCats;
  }

  public Filterer hasTags(Boolean hasTags) {
    this.hasTags = hasTags;
    return this;
  }

  /**
   * Get hasTags
   * @return hasTags
  */
  @NotNull 
  @Schema(name = "hasTags", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasTags() {
    return hasTags;
  }

  public void setHasTags(Boolean hasTags) {
    this.hasTags = hasTags;
  }

  public Filterer hasPostIds(Boolean hasPostIds) {
    this.hasPostIds = hasPostIds;
    return this;
  }

  /**
   * Get hasPostIds
   * @return hasPostIds
  */
  @NotNull 
  @Schema(name = "hasPostIds", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasPostIds() {
    return hasPostIds;
  }

  public void setHasPostIds(Boolean hasPostIds) {
    this.hasPostIds = hasPostIds;
  }

  public Filterer hasParentIds(Boolean hasParentIds) {
    this.hasParentIds = hasParentIds;
    return this;
  }

  /**
   * Get hasParentIds
   * @return hasParentIds
  */
  @NotNull 
  @Schema(name = "hasParentIds", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasParentIds() {
    return hasParentIds;
  }

  public void setHasParentIds(Boolean hasParentIds) {
    this.hasParentIds = hasParentIds;
  }

  public Filterer hasCatSubTypes(Boolean hasCatSubTypes) {
    this.hasCatSubTypes = hasCatSubTypes;
    return this;
  }

  /**
   * Get hasCatSubTypes
   * @return hasCatSubTypes
  */
  @NotNull 
  @Schema(name = "hasCatSubTypes", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasCatSubTypes() {
    return hasCatSubTypes;
  }

  public void setHasCatSubTypes(Boolean hasCatSubTypes) {
    this.hasCatSubTypes = hasCatSubTypes;
  }

  public Filterer hasSorts(Boolean hasSorts) {
    this.hasSorts = hasSorts;
    return this;
  }

  /**
   * Get hasSorts
   * @return hasSorts
  */
  @NotNull 
  @Schema(name = "hasSorts", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getHasSorts() {
    return hasSorts;
  }

  public void setHasSorts(Boolean hasSorts) {
    this.hasSorts = hasSorts;
  }

  public Filterer count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @NotNull 
  @Schema(name = "count", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Filterer page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  @NotNull 
  @Schema(name = "page", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Filterer pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  @NotNull 
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Filterer skip(Integer skip) {
    this.skip = skip;
    return this;
  }

  /**
   * Get skip
   * @return skip
  */
  @NotNull 
  @Schema(name = "skip", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getSkip() {
    return skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filterer filterer = (Filterer) o;
    return Objects.equals(this.shopCode, filterer.shopCode) &&
        Objects.equals(this.shopId, filterer.shopId) &&
        Objects.equals(this.shopUserId, filterer.shopUserId) &&
        Objects.equals(this.parentIds, filterer.parentIds) &&
        Objects.equals(this.postIds, filterer.postIds) &&
        Objects.equals(this.cats, filterer.cats) &&
        Objects.equals(this.catSubTypes, filterer.catSubTypes) &&
        Objects.equals(this.tags, filterer.tags) &&
        Objects.equals(this.states, filterer.states) &&
        Objects.equals(this.catStates, filterer.catStates) &&
        Objects.equals(this.sorts, filterer.sorts) &&
        Objects.equals(this.keyword, filterer.keyword) &&
        Objects.equals(this.hasCatStates, filterer.hasCatStates) &&
        Objects.equals(this.hasStates, filterer.hasStates) &&
        Objects.equals(this.hasCats, filterer.hasCats) &&
        Objects.equals(this.hasTags, filterer.hasTags) &&
        Objects.equals(this.hasPostIds, filterer.hasPostIds) &&
        Objects.equals(this.hasParentIds, filterer.hasParentIds) &&
        Objects.equals(this.hasCatSubTypes, filterer.hasCatSubTypes) &&
        Objects.equals(this.hasSorts, filterer.hasSorts) &&
        Objects.equals(this.count, filterer.count) &&
        Objects.equals(this.page, filterer.page) &&
        Objects.equals(this.pageSize, filterer.pageSize) &&
        Objects.equals(this.skip, filterer.skip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopCode, shopId, shopUserId, parentIds, postIds, cats, catSubTypes, tags, states, catStates, sorts, keyword, hasCatStates, hasStates, hasCats, hasTags, hasPostIds, hasParentIds, hasCatSubTypes, hasSorts, count, page, pageSize, skip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filterer {\n");
    sb.append("    shopCode: ").append(toIndentedString(shopCode)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    shopUserId: ").append(toIndentedString(shopUserId)).append("\n");
    sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
    sb.append("    postIds: ").append(toIndentedString(postIds)).append("\n");
    sb.append("    cats: ").append(toIndentedString(cats)).append("\n");
    sb.append("    catSubTypes: ").append(toIndentedString(catSubTypes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    catStates: ").append(toIndentedString(catStates)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    hasCatStates: ").append(toIndentedString(hasCatStates)).append("\n");
    sb.append("    hasStates: ").append(toIndentedString(hasStates)).append("\n");
    sb.append("    hasCats: ").append(toIndentedString(hasCats)).append("\n");
    sb.append("    hasTags: ").append(toIndentedString(hasTags)).append("\n");
    sb.append("    hasPostIds: ").append(toIndentedString(hasPostIds)).append("\n");
    sb.append("    hasParentIds: ").append(toIndentedString(hasParentIds)).append("\n");
    sb.append("    hasCatSubTypes: ").append(toIndentedString(hasCatSubTypes)).append("\n");
    sb.append("    hasSorts: ").append(toIndentedString(hasSorts)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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

