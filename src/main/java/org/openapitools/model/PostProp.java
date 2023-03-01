package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CategoryPair;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostProp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PostProp {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("catIds")
  @Valid
  private List<Integer> catIds = null;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("catPairs")
  @Valid
  private List<CategoryPair> catPairs = null;

  public PostProp id(Long id) {
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

  public PostProp catIds(List<Integer> catIds) {
    this.catIds = catIds;
    return this;
  }

  public PostProp addCatIdsItem(Integer catIdsItem) {
    if (this.catIds == null) {
      this.catIds = new ArrayList<>();
    }
    this.catIds.add(catIdsItem);
    return this;
  }

  /**
   * Get catIds
   * @return catIds
  */
  
  @Schema(name = "catIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Integer> getCatIds() {
    return catIds;
  }

  public void setCatIds(List<Integer> catIds) {
    this.catIds = catIds;
  }

  public PostProp postId(String postId) {
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

  public PostProp catPairs(List<CategoryPair> catPairs) {
    this.catPairs = catPairs;
    return this;
  }

  public PostProp addCatPairsItem(CategoryPair catPairsItem) {
    if (this.catPairs == null) {
      this.catPairs = new ArrayList<>();
    }
    this.catPairs.add(catPairsItem);
    return this;
  }

  /**
   * Get catPairs
   * @return catPairs
  */
  @Valid 
  @Schema(name = "catPairs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CategoryPair> getCatPairs() {
    return catPairs;
  }

  public void setCatPairs(List<CategoryPair> catPairs) {
    this.catPairs = catPairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProp postProp = (PostProp) o;
    return Objects.equals(this.id, postProp.id) &&
        Objects.equals(this.catIds, postProp.catIds) &&
        Objects.equals(this.postId, postProp.postId) &&
        Objects.equals(this.catPairs, postProp.catPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, catIds, postId, catPairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catIds: ").append(toIndentedString(catIds)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    catPairs: ").append(toIndentedString(catPairs)).append("\n");
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

