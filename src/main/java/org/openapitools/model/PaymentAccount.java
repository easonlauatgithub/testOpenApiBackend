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
 * PaymentAccount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class PaymentAccount {

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("info")
  private String info;

  @JsonProperty("accountNo")
  private String accountNo;

  public PaymentAccount accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  
  @Schema(name = "accountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public PaymentAccount info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  */
  
  @Schema(name = "info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public PaymentAccount accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  /**
   * Get accountNo
   * @return accountNo
  */
  
  @Schema(name = "accountNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAccount paymentAccount = (PaymentAccount) o;
    return Objects.equals(this.accountType, paymentAccount.accountType) &&
        Objects.equals(this.info, paymentAccount.info) &&
        Objects.equals(this.accountNo, paymentAccount.accountNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, info, accountNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAccount {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
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

