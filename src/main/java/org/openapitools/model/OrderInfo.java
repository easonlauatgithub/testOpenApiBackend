package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CartRecord;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class OrderInfo {

  @JsonProperty("shopMsg")
  private String shopMsg;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("shopUserId")
  private String shopUserId;

  @JsonProperty("createUtc")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createUtc;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("contactId")
  private Long contactId;

  @JsonProperty("userMsg")
  private String userMsg;

  @JsonProperty("stateCode")
  private Integer stateCode;

  @JsonProperty("orderType")
  private Integer orderType;

  @JsonProperty("stateText")
  private String stateText;

  @JsonProperty("localCreateDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime localCreateDate;

  @JsonProperty("cartRecords")
  @Valid
  private List<CartRecord> cartRecords = null;

  public OrderInfo shopMsg(String shopMsg) {
    this.shopMsg = shopMsg;
    return this;
  }

  /**
   * Get shopMsg
   * @return shopMsg
  */
  
  @Schema(name = "shopMsg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShopMsg() {
    return shopMsg;
  }

  public void setShopMsg(String shopMsg) {
    this.shopMsg = shopMsg;
  }

  public OrderInfo userId(String userId) {
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

  public OrderInfo shopUserId(String shopUserId) {
    this.shopUserId = shopUserId;
    return this;
  }

  /**
   * Get shopUserId
   * @return shopUserId
  */
  
  @Schema(name = "shopUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShopUserId() {
    return shopUserId;
  }

  public void setShopUserId(String shopUserId) {
    this.shopUserId = shopUserId;
  }

  public OrderInfo createUtc(OffsetDateTime createUtc) {
    this.createUtc = createUtc;
    return this;
  }

  /**
   * Get createUtc
   * @return createUtc
  */
  @NotNull @Valid 
  @Schema(name = "createUtc", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getCreateUtc() {
    return createUtc;
  }

  public void setCreateUtc(OffsetDateTime createUtc) {
    this.createUtc = createUtc;
  }

  public OrderInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderInfo contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Get contactId
   * @return contactId
  */
  @NotNull 
  @Schema(name = "contactId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public OrderInfo userMsg(String userMsg) {
    this.userMsg = userMsg;
    return this;
  }

  /**
   * Get userMsg
   * @return userMsg
  */
  
  @Schema(name = "userMsg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUserMsg() {
    return userMsg;
  }

  public void setUserMsg(String userMsg) {
    this.userMsg = userMsg;
  }

  public OrderInfo stateCode(Integer stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
  */
  @NotNull 
  @Schema(name = "stateCode", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getStateCode() {
    return stateCode;
  }

  public void setStateCode(Integer stateCode) {
    this.stateCode = stateCode;
  }

  public OrderInfo orderType(Integer orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * Get orderType
   * @return orderType
  */
  @NotNull 
  @Schema(name = "orderType", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getOrderType() {
    return orderType;
  }

  public void setOrderType(Integer orderType) {
    this.orderType = orderType;
  }

  public OrderInfo stateText(String stateText) {
    this.stateText = stateText;
    return this;
  }

  /**
   * Get stateText
   * @return stateText
  */
  
  @Schema(name = "stateText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStateText() {
    return stateText;
  }

  public void setStateText(String stateText) {
    this.stateText = stateText;
  }

  public OrderInfo localCreateDate(OffsetDateTime localCreateDate) {
    this.localCreateDate = localCreateDate;
    return this;
  }

  /**
   * Get localCreateDate
   * @return localCreateDate
  */
  @NotNull @Valid 
  @Schema(name = "localCreateDate", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getLocalCreateDate() {
    return localCreateDate;
  }

  public void setLocalCreateDate(OffsetDateTime localCreateDate) {
    this.localCreateDate = localCreateDate;
  }

  public OrderInfo cartRecords(List<CartRecord> cartRecords) {
    this.cartRecords = cartRecords;
    return this;
  }

  public OrderInfo addCartRecordsItem(CartRecord cartRecordsItem) {
    if (this.cartRecords == null) {
      this.cartRecords = new ArrayList<>();
    }
    this.cartRecords.add(cartRecordsItem);
    return this;
  }

  /**
   * Get cartRecords
   * @return cartRecords
  */
  @Valid 
  @Schema(name = "cartRecords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CartRecord> getCartRecords() {
    return cartRecords;
  }

  public void setCartRecords(List<CartRecord> cartRecords) {
    this.cartRecords = cartRecords;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInfo orderInfo = (OrderInfo) o;
    return Objects.equals(this.shopMsg, orderInfo.shopMsg) &&
        Objects.equals(this.userId, orderInfo.userId) &&
        Objects.equals(this.shopUserId, orderInfo.shopUserId) &&
        Objects.equals(this.createUtc, orderInfo.createUtc) &&
        Objects.equals(this.id, orderInfo.id) &&
        Objects.equals(this.contactId, orderInfo.contactId) &&
        Objects.equals(this.userMsg, orderInfo.userMsg) &&
        Objects.equals(this.stateCode, orderInfo.stateCode) &&
        Objects.equals(this.orderType, orderInfo.orderType) &&
        Objects.equals(this.stateText, orderInfo.stateText) &&
        Objects.equals(this.localCreateDate, orderInfo.localCreateDate) &&
        Objects.equals(this.cartRecords, orderInfo.cartRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopMsg, userId, shopUserId, createUtc, id, contactId, userMsg, stateCode, orderType, stateText, localCreateDate, cartRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInfo {\n");
    sb.append("    shopMsg: ").append(toIndentedString(shopMsg)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    shopUserId: ").append(toIndentedString(shopUserId)).append("\n");
    sb.append("    createUtc: ").append(toIndentedString(createUtc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    userMsg: ").append(toIndentedString(userMsg)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    localCreateDate: ").append(toIndentedString(localCreateDate)).append("\n");
    sb.append("    cartRecords: ").append(toIndentedString(cartRecords)).append("\n");
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

