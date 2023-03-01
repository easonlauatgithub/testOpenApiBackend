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
 * Register
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class Register {

  @JsonProperty("domainRootId")
  private Long domainRootId;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phoneDistrictNum")
  private String phoneDistrictNum;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("password")
  private String password;

  public Register domainRootId(Long domainRootId) {
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

  public Register surname(String surname) {
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

  public Register givenName(String givenName) {
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

  public Register gender(String gender) {
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

  public Register email(String email) {
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

  public Register phoneDistrictNum(String phoneDistrictNum) {
    this.phoneDistrictNum = phoneDistrictNum;
    return this;
  }

  /**
   * Get phoneDistrictNum
   * @return phoneDistrictNum
  */
  
  @Schema(name = "phoneDistrictNum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoneDistrictNum() {
    return phoneDistrictNum;
  }

  public void setPhoneDistrictNum(String phoneDistrictNum) {
    this.phoneDistrictNum = phoneDistrictNum;
  }

  public Register phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  
  @Schema(name = "phoneNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Register password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Register register = (Register) o;
    return Objects.equals(this.domainRootId, register.domainRootId) &&
        Objects.equals(this.surname, register.surname) &&
        Objects.equals(this.givenName, register.givenName) &&
        Objects.equals(this.gender, register.gender) &&
        Objects.equals(this.email, register.email) &&
        Objects.equals(this.phoneDistrictNum, register.phoneDistrictNum) &&
        Objects.equals(this.phoneNumber, register.phoneNumber) &&
        Objects.equals(this.password, register.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainRootId, surname, givenName, gender, email, phoneDistrictNum, phoneNumber, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Register {\n");
    sb.append("    domainRootId: ").append(toIndentedString(domainRootId)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneDistrictNum: ").append(toIndentedString(phoneDistrictNum)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

