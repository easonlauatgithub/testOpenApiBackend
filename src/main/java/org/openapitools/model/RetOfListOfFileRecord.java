package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FileRecord;
import org.openapitools.model.Msg;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RetOfListOfFileRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class RetOfListOfFileRecord {

  @JsonProperty("ok")
  private Boolean ok;

  @JsonProperty("value")
  @Valid
  private List<FileRecord> value = null;

  @JsonProperty("msgs")
  @Valid
  private List<Msg> msgs = null;

  public RetOfListOfFileRecord ok(Boolean ok) {
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

  public RetOfListOfFileRecord value(List<FileRecord> value) {
    this.value = value;
    return this;
  }

  public RetOfListOfFileRecord addValueItem(FileRecord valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<FileRecord> getValue() {
    return value;
  }

  public void setValue(List<FileRecord> value) {
    this.value = value;
  }

  public RetOfListOfFileRecord msgs(List<Msg> msgs) {
    this.msgs = msgs;
    return this;
  }

  public RetOfListOfFileRecord addMsgsItem(Msg msgsItem) {
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
    RetOfListOfFileRecord retOfListOfFileRecord = (RetOfListOfFileRecord) o;
    return Objects.equals(this.ok, retOfListOfFileRecord.ok) &&
        Objects.equals(this.value, retOfListOfFileRecord.value) &&
        Objects.equals(this.msgs, retOfListOfFileRecord.msgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, value, msgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetOfListOfFileRecord {\n");
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

