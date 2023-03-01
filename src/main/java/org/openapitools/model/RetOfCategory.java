package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Category;
import org.openapitools.model.Msg;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RetOfCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class RetOfCategory {

  @JsonProperty("ok")
  private Boolean ok;

  @JsonProperty("value")
  private Category value;

  @JsonProperty("msgs")
  @Valid
  private List<Msg> msgs = null;

  public RetOfCategory ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

  /**
   * Get ok
   * @return ok
  */
  @NotNull 
  @Schema(name = "ok", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }

  public RetOfCategory value(Category value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Category getValue() {
    return value;
  }

  public void setValue(Category value) {
    this.value = value;
  }

  public RetOfCategory msgs(List<Msg> msgs) {
    this.msgs = msgs;
    return this;
  }

  public RetOfCategory addMsgsItem(Msg msgsItem) {
    if (this.msgs == null) {
      this.msgs = new ArrayList<>();
    }
    this.msgs.add(msgsItem);
    return this;
  }

  /**
   * Get msgs
   * @return msgs
  */
  @Valid 
  @Schema(name = "msgs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Msg> getMsgs() {
    return msgs;
  }

  public void setMsgs(List<Msg> msgs) {
    this.msgs = msgs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetOfCategory retOfCategory = (RetOfCategory) o;
    return Objects.equals(this.ok, retOfCategory.ok) &&
        Objects.equals(this.value, retOfCategory.value) &&
        Objects.equals(this.msgs, retOfCategory.msgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, value, msgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetOfCategory {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    msgs: ").append(toIndentedString(msgs)).append("\n");
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

