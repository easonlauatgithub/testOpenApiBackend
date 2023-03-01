package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BaseFilter;
import org.openapitools.model.PostRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FilterResultOfPostRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class FilterResultOfPostRecord {

  @JsonProperty("items")
  @Valid
  private List<PostRecord> items = null;

  @JsonProperty("filter")
  private BaseFilter filter;

  public FilterResultOfPostRecord items(List<PostRecord> items) {
    this.items = items;
    return this;
  }

  public FilterResultOfPostRecord addItemsItem(PostRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PostRecord> getItems() {
    return items;
  }

  public void setItems(List<PostRecord> items) {
    this.items = items;
  }

  public FilterResultOfPostRecord filter(BaseFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  */
  @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BaseFilter getFilter() {
    return filter;
  }

  public void setFilter(BaseFilter filter) {
    this.filter = filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterResultOfPostRecord filterResultOfPostRecord = (FilterResultOfPostRecord) o;
    return Objects.equals(this.items, filterResultOfPostRecord.items) &&
        Objects.equals(this.filter, filterResultOfPostRecord.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterResultOfPostRecord {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

