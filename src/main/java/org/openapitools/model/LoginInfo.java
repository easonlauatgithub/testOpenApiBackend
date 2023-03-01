package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DeviceReg;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LoginInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class LoginInfo {

  @JsonProperty("domainRootId")
  private Long domainRootId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("password")
  private String password;

  @JsonProperty("deviceReg")
  private DeviceReg deviceReg;

  public LoginInfo domainRootId(Long domainRootId) {
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

  public LoginInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoginInfo password(String password) {
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

  public LoginInfo deviceReg(DeviceReg deviceReg) {
    this.deviceReg = deviceReg;
    return this;
  }

  /**
   * Get deviceReg
   * @return deviceReg
  */
  @Valid 
  @Schema(name = "deviceReg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DeviceReg getDeviceReg() {
    return deviceReg;
  }

  public void setDeviceReg(DeviceReg deviceReg) {
    this.deviceReg = deviceReg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInfo loginInfo = (LoginInfo) o;
    return Objects.equals(this.domainRootId, loginInfo.domainRootId) &&
        Objects.equals(this.id, loginInfo.id) &&
        Objects.equals(this.password, loginInfo.password) &&
        Objects.equals(this.deviceReg, loginInfo.deviceReg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainRootId, id, password, deviceReg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInfo {\n");
    sb.append("    domainRootId: ").append(toIndentedString(domainRootId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    deviceReg: ").append(toIndentedString(deviceReg)).append("\n");
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

