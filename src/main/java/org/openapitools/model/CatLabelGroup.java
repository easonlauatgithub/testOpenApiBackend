package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatLabelBase;
import org.openapitools.model.Category;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatLabelGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class CatLabelGroup {

  @JsonProperty("label")
  private CatLabelBase label;

  @JsonProperty("parent")
  private Category parent;

  @JsonProperty("child")
  private Category child;

  public CatLabelGroup label(CatLabelBase label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  @Valid 
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CatLabelBase getLabel() {
    return label;
  }

  public void setLabel(CatLabelBase label) {
    this.label = label;
  }

  public CatLabelGroup parent(Category parent) {
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

  public CatLabelGroup child(Category child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @Valid 
  @Schema(name = "child", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Category getChild() {
    return child;
  }

  public void setChild(Category child) {
    this.child = child;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatLabelGroup catLabelGroup = (CatLabelGroup) o;
    return Objects.equals(this.label, catLabelGroup.label) &&
        Objects.equals(this.parent, catLabelGroup.parent) &&
        Objects.equals(this.child, catLabelGroup.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, parent, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatLabelGroup {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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

