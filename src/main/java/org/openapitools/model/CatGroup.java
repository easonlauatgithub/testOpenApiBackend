package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Category;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class CatGroup {

  @JsonProperty("parent")
  private Category parent;

  @JsonProperty("childs")
  @Valid
  private List<Category> childs = null;

  public CatGroup parent(Category parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Category getParent() {
    return parent;
  }

  public void setParent(Category parent) {
    this.parent = parent;
  }

  public CatGroup childs(List<Category> childs) {
    this.childs = childs;
    return this;
  }

  public CatGroup addChildsItem(Category childsItem) {
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
  public List<Category> getChilds() {
    return childs;
  }

  public void setChilds(List<Category> childs) {
    this.childs = childs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatGroup catGroup = (CatGroup) o;
    return Objects.equals(this.parent, catGroup.parent) &&
        Objects.equals(this.childs, catGroup.childs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, childs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatGroup {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    childs: ").append(toIndentedString(childs)).append("\n");
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

