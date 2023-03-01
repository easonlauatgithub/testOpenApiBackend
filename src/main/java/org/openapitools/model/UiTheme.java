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
 * UiTheme
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class UiTheme {

  @JsonProperty("theme")
  private String theme;

  @JsonProperty("body")
  private String body;

  @JsonProperty("listing")
  private String listing;

  public UiTheme theme(String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
  */
  
  @Schema(name = "theme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public UiTheme body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  
  @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public UiTheme listing(String listing) {
    this.listing = listing;
    return this;
  }

  /**
   * Get listing
   * @return listing
  */
  
  @Schema(name = "listing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getListing() {
    return listing;
  }

  public void setListing(String listing) {
    this.listing = listing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiTheme uiTheme = (UiTheme) o;
    return Objects.equals(this.theme, uiTheme.theme) &&
        Objects.equals(this.body, uiTheme.body) &&
        Objects.equals(this.listing, uiTheme.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, body, listing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiTheme {\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
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

