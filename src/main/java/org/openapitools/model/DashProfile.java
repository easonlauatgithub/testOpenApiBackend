package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UserInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DashProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class DashProfile {

  @JsonProperty("accountUser")
  private UserInfo accountUser;

  @JsonProperty("isShopKeeper")
  private Boolean isShopKeeper;

  @JsonProperty("isAgent")
  private Boolean isAgent;

  @JsonProperty("isManager")
  private Boolean isManager;

  @JsonProperty("isAdmin")
  private Boolean isAdmin;

  public DashProfile accountUser(UserInfo accountUser) {
    this.accountUser = accountUser;
    return this;
  }

  /**
   * Get accountUser
   * @return accountUser
  */
  @Valid 
  @Schema(name = "accountUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UserInfo getAccountUser() {
    return accountUser;
  }

  public void setAccountUser(UserInfo accountUser) {
    this.accountUser = accountUser;
  }

  public DashProfile isShopKeeper(Boolean isShopKeeper) {
    this.isShopKeeper = isShopKeeper;
    return this;
  }

  /**
   * Get isShopKeeper
   * @return isShopKeeper
  */
  @NotNull 
  @Schema(name = "isShopKeeper", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsShopKeeper() {
    return isShopKeeper;
  }

  public void setIsShopKeeper(Boolean isShopKeeper) {
    this.isShopKeeper = isShopKeeper;
  }

  public DashProfile isAgent(Boolean isAgent) {
    this.isAgent = isAgent;
    return this;
  }

  /**
   * Get isAgent
   * @return isAgent
  */
  @NotNull 
  @Schema(name = "isAgent", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsAgent() {
    return isAgent;
  }

  public void setIsAgent(Boolean isAgent) {
    this.isAgent = isAgent;
  }

  public DashProfile isManager(Boolean isManager) {
    this.isManager = isManager;
    return this;
  }

  /**
   * Get isManager
   * @return isManager
  */
  @NotNull 
  @Schema(name = "isManager", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsManager() {
    return isManager;
  }

  public void setIsManager(Boolean isManager) {
    this.isManager = isManager;
  }

  public DashProfile isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Get isAdmin
   * @return isAdmin
  */
  @NotNull 
  @Schema(name = "isAdmin", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashProfile dashProfile = (DashProfile) o;
    return Objects.equals(this.accountUser, dashProfile.accountUser) &&
        Objects.equals(this.isShopKeeper, dashProfile.isShopKeeper) &&
        Objects.equals(this.isAgent, dashProfile.isAgent) &&
        Objects.equals(this.isManager, dashProfile.isManager) &&
        Objects.equals(this.isAdmin, dashProfile.isAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUser, isShopKeeper, isAgent, isManager, isAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashProfile {\n");
    sb.append("    accountUser: ").append(toIndentedString(accountUser)).append("\n");
    sb.append("    isShopKeeper: ").append(toIndentedString(isShopKeeper)).append("\n");
    sb.append("    isAgent: ").append(toIndentedString(isAgent)).append("\n");
    sb.append("    isManager: ").append(toIndentedString(isManager)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
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

