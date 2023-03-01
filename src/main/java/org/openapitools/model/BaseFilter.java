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
 * BaseFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class BaseFilter {

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("skip")
  private Integer skip;

  public BaseFilter count(Integer count) {
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

  public BaseFilter page(Integer page) {
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

  public BaseFilter pageSize(Integer pageSize) {
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

  public BaseFilter skip(Integer skip) {
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
    BaseFilter baseFilter = (BaseFilter) o;
    return Objects.equals(this.count, baseFilter.count) &&
        Objects.equals(this.page, baseFilter.page) &&
        Objects.equals(this.pageSize, baseFilter.pageSize) &&
        Objects.equals(this.skip, baseFilter.skip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, page, pageSize, skip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseFilter {\n");
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

