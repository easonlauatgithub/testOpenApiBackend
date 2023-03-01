package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Msg;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RetOfInt64
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class RetOfInt64 {

  @JsonProperty("ok")
  private Boolean ok;

  @JsonProperty("value")
  private Long value;

  @JsonProperty("msgs")
  @Valid
  private List<Msg> msgs = null;

  public RetOfInt64 ok(Boolean ok) {
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

  public RetOfInt64 value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public RetOfInt64 msgs(List<Msg> msgs) {
    this.msgs = msgs;
    return this;
  }

  public RetOfInt64 addMsgsItem(Msg msgsItem) {
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
    RetOfInt64 retOfInt64 = (RetOfInt64) o;
    return Objects.equals(this.ok, retOfInt64.ok) &&
        Objects.equals(this.value, retOfInt64.value) &&
        Objects.equals(this.msgs, retOfInt64.msgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, value, msgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetOfInt64 {\n");
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

