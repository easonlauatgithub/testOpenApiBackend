package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.UserRoleInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class UserInfo {

  @JsonProperty("domainRootId")
  private Long domainRootId;

  @JsonProperty("emailConfirmed")
  private Boolean emailConfirmed;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("accessToken")
  private String accessToken;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("createDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  @JsonProperty("roles")
  @Valid
  private List<UserRoleInfo> roles = null;

  public UserInfo domainRootId(Long domainRootId) {
    this.domainRootId = domainRootId;
    return this;
  }

  /**
   * Get domainRootId
   * @return domainRootId
  */
  @NotNull 
  @Schema(name = "domainRootId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getDomainRootId() {
    return domainRootId;
  }

  public void setDomainRootId(Long domainRootId) {
    this.domainRootId = domainRootId;
  }

  public UserInfo emailConfirmed(Boolean emailConfirmed) {
    this.emailConfirmed = emailConfirmed;
    return this;
  }

  /**
   * Get emailConfirmed
   * @return emailConfirmed
  */
  @NotNull 
  @Schema(name = "emailConfirmed", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getEmailConfirmed() {
    return emailConfirmed;
  }

  public void setEmailConfirmed(Boolean emailConfirmed) {
    this.emailConfirmed = emailConfirmed;
  }

  public UserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserInfo givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  
  @Schema(name = "givenName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public UserInfo surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  
  @Schema(name = "surname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserInfo gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UserInfo accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  
  @Schema(name = "accessToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public UserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserInfo createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "createDate", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public UserInfo roles(List<UserRoleInfo> roles) {
    this.roles = roles;
    return this;
  }

  public UserInfo addRolesItem(UserRoleInfo rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @Valid 
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<UserRoleInfo> getRoles() {
    return roles;
  }

  public void setRoles(List<UserRoleInfo> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.domainRootId, userInfo.domainRootId) &&
        Objects.equals(this.emailConfirmed, userInfo.emailConfirmed) &&
        Objects.equals(this.userId, userInfo.userId) &&
        Objects.equals(this.givenName, userInfo.givenName) &&
        Objects.equals(this.surname, userInfo.surname) &&
        Objects.equals(this.displayName, userInfo.displayName) &&
        Objects.equals(this.gender, userInfo.gender) &&
        Objects.equals(this.accessToken, userInfo.accessToken) &&
        Objects.equals(this.email, userInfo.email) &&
        Objects.equals(this.phone, userInfo.phone) &&
        Objects.equals(this.createDate, userInfo.createDate) &&
        Objects.equals(this.roles, userInfo.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainRootId, emailConfirmed, userId, givenName, surname, displayName, gender, accessToken, email, phone, createDate, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("    domainRootId: ").append(toIndentedString(domainRootId)).append("\n");
    sb.append("    emailConfirmed: ").append(toIndentedString(emailConfirmed)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

