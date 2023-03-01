package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Platform;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeviceReg
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class DeviceReg {

  @JsonProperty("platform")
  private Platform platform;

  @JsonProperty("deviceID")
  private String deviceID;

  @JsonProperty("pushToken")
  private String pushToken;

  public DeviceReg platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @NotNull @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.REQUIRED)
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public DeviceReg deviceID(String deviceID) {
    this.deviceID = deviceID;
    return this;
  }

  /**
   * Get deviceID
   * @return deviceID
  */
  
  @Schema(name = "deviceID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDeviceID() {
    return deviceID;
  }

  public void setDeviceID(String deviceID) {
    this.deviceID = deviceID;
  }

  public DeviceReg pushToken(String pushToken) {
    this.pushToken = pushToken;
    return this;
  }

  /**
   * Get pushToken
   * @return pushToken
  */
  
  @Schema(name = "pushToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPushToken() {
    return pushToken;
  }

  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceReg deviceReg = (DeviceReg) o;
    return Objects.equals(this.platform, deviceReg.platform) &&
        Objects.equals(this.deviceID, deviceReg.deviceID) &&
        Objects.equals(this.pushToken, deviceReg.pushToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, deviceID, pushToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceReg {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
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

