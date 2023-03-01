package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CartItemDetail;
import org.openapitools.model.CartRecord;
import org.openapitools.model.CatLabelGroup;
import org.openapitools.model.Contact;
import org.openapitools.model.Payment;
import org.openapitools.model.ShopInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class OrderDetail {

  @JsonProperty("shop")
  private ShopInfo shop;

  @JsonProperty("payments")
  @Valid
  private List<Payment> payments = null;

  @JsonProperty("items")
  @Valid
  private List<CartItemDetail> items = null;

  @JsonProperty("orderExtras")
  @Valid
  private List<CatLabelGroup> orderExtras = null;

  @JsonProperty("contact")
  private Contact contact;

  @JsonProperty("orderTotal")
  private BigDecimal orderTotal;

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

  public OrderDetail shop(ShopInfo shop) {
    this.shop = shop;
    return this;
  }

  /**
   * Get shop
   * @return shop
  */
  @Valid 
  @Schema(name = "shop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ShopInfo getShop() {
    return shop;
  }

  public void setShop(ShopInfo shop) {
    this.shop = shop;
  }

  public OrderDetail payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public OrderDetail addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @Valid 
  @Schema(name = "payments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public OrderDetail items(List<CartItemDetail> items) {
    this.items = items;
    return this;
  }

  public OrderDetail addItemsItem(CartItemDetail itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CartItemDetail> getItems() {
    return items;
  }

  public void setItems(List<CartItemDetail> items) {
    this.items = items;
  }

  public OrderDetail orderExtras(List<CatLabelGroup> orderExtras) {
    this.orderExtras = orderExtras;
    return this;
  }

  public OrderDetail addOrderExtrasItem(CatLabelGroup orderExtrasItem) {
    if (this.orderExtras == null) {
      this.orderExtras = new ArrayList<>();
    }
    this.orderExtras.add(orderExtrasItem);
    return this;
  }

  /**
   * Get orderExtras
   * @return orderExtras
  */
  @Valid 
  @Schema(name = "orderExtras", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CatLabelGroup> getOrderExtras() {
    return orderExtras;
  }

  public void setOrderExtras(List<CatLabelGroup> orderExtras) {
    this.orderExtras = orderExtras;
  }

  public OrderDetail contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public OrderDetail orderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

  /**
   * Get orderTotal
   * @return orderTotal
  */
  @NotNull @Valid 
  @Schema(name = "orderTotal", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
  }

  public OrderDetail shopMsg(String shopMsg) {
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

  public OrderDetail userId(String userId) {
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

  public OrderDetail shopUserId(String shopUserId) {
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

  public OrderDetail createUtc(OffsetDateTime createUtc) {
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

  public OrderDetail id(Long id) {
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

  public OrderDetail contactId(Long contactId) {
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

  public OrderDetail userMsg(String userMsg) {
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

  public OrderDetail stateCode(Integer stateCode) {
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

  public OrderDetail orderType(Integer orderType) {
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

  public OrderDetail stateText(String stateText) {
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

  public OrderDetail localCreateDate(OffsetDateTime localCreateDate) {
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

  public OrderDetail cartRecords(List<CartRecord> cartRecords) {
    this.cartRecords = cartRecords;
    return this;
  }

  public OrderDetail addCartRecordsItem(CartRecord cartRecordsItem) {
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
    OrderDetail orderDetail = (OrderDetail) o;
    return Objects.equals(this.shop, orderDetail.shop) &&
        Objects.equals(this.payments, orderDetail.payments) &&
        Objects.equals(this.items, orderDetail.items) &&
        Objects.equals(this.orderExtras, orderDetail.orderExtras) &&
        Objects.equals(this.contact, orderDetail.contact) &&
        Objects.equals(this.orderTotal, orderDetail.orderTotal) &&
        Objects.equals(this.shopMsg, orderDetail.shopMsg) &&
        Objects.equals(this.userId, orderDetail.userId) &&
        Objects.equals(this.shopUserId, orderDetail.shopUserId) &&
        Objects.equals(this.createUtc, orderDetail.createUtc) &&
        Objects.equals(this.id, orderDetail.id) &&
        Objects.equals(this.contactId, orderDetail.contactId) &&
        Objects.equals(this.userMsg, orderDetail.userMsg) &&
        Objects.equals(this.stateCode, orderDetail.stateCode) &&
        Objects.equals(this.orderType, orderDetail.orderType) &&
        Objects.equals(this.stateText, orderDetail.stateText) &&
        Objects.equals(this.localCreateDate, orderDetail.localCreateDate) &&
        Objects.equals(this.cartRecords, orderDetail.cartRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shop, payments, items, orderExtras, contact, orderTotal, shopMsg, userId, shopUserId, createUtc, id, contactId, userMsg, stateCode, orderType, stateText, localCreateDate, cartRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetail {\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    orderExtras: ").append(toIndentedString(orderExtras)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
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

