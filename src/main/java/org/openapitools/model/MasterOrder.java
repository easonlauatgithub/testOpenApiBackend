package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CartRecord;
import org.openapitools.model.KeyVal;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MasterOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class MasterOrder {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("domainShopId")
  private Long domainShopId;

  @JsonProperty("createDateUtc")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDateUtc;

  @JsonProperty("userIp")
  private String userIp;

  @JsonProperty("contactId")
  private Long contactId;

  @JsonProperty("userMsgs")
  @Valid
  private List<KeyVal> userMsgs = null;

  @JsonProperty("cartRecords")
  @Valid
  private List<CartRecord> cartRecords = null;

  public MasterOrder id(Long id) {
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

  public MasterOrder domainShopId(Long domainShopId) {
    this.domainShopId = domainShopId;
    return this;
  }

  /**
   * Get domainShopId
   * @return domainShopId
  */
  @NotNull 
  @Schema(name = "domainShopId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getDomainShopId() {
    return domainShopId;
  }

  public void setDomainShopId(Long domainShopId) {
    this.domainShopId = domainShopId;
  }

  public MasterOrder createDateUtc(OffsetDateTime createDateUtc) {
    this.createDateUtc = createDateUtc;
    return this;
  }

  /**
   * Get createDateUtc
   * @return createDateUtc
  */
  @NotNull @Valid 
  @Schema(name = "createDateUtc", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getCreateDateUtc() {
    return createDateUtc;
  }

  public void setCreateDateUtc(OffsetDateTime createDateUtc) {
    this.createDateUtc = createDateUtc;
  }

  public MasterOrder userIp(String userIp) {
    this.userIp = userIp;
    return this;
  }

  /**
   * Get userIp
   * @return userIp
  */
  
  @Schema(name = "userIp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUserIp() {
    return userIp;
  }

  public void setUserIp(String userIp) {
    this.userIp = userIp;
  }

  public MasterOrder contactId(Long contactId) {
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

  public MasterOrder userMsgs(List<KeyVal> userMsgs) {
    this.userMsgs = userMsgs;
    return this;
  }

  public MasterOrder addUserMsgsItem(KeyVal userMsgsItem) {
    if (this.userMsgs == null) {
      this.userMsgs = new ArrayList<>();
    }
    this.userMsgs.add(userMsgsItem);
    return this;
  }

  /**
   * Get userMsgs
   * @return userMsgs
  */
  @Valid 
  @Schema(name = "userMsgs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<KeyVal> getUserMsgs() {
    return userMsgs;
  }

  public void setUserMsgs(List<KeyVal> userMsgs) {
    this.userMsgs = userMsgs;
  }

  public MasterOrder cartRecords(List<CartRecord> cartRecords) {
    this.cartRecords = cartRecords;
    return this;
  }

  public MasterOrder addCartRecordsItem(CartRecord cartRecordsItem) {
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
    MasterOrder masterOrder = (MasterOrder) o;
    return Objects.equals(this.id, masterOrder.id) &&
        Objects.equals(this.domainShopId, masterOrder.domainShopId) &&
        Objects.equals(this.createDateUtc, masterOrder.createDateUtc) &&
        Objects.equals(this.userIp, masterOrder.userIp) &&
        Objects.equals(this.contactId, masterOrder.contactId) &&
        Objects.equals(this.userMsgs, masterOrder.userMsgs) &&
        Objects.equals(this.cartRecords, masterOrder.cartRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domainShopId, createDateUtc, userIp, contactId, userMsgs, cartRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainShopId: ").append(toIndentedString(domainShopId)).append("\n");
    sb.append("    createDateUtc: ").append(toIndentedString(createDateUtc)).append("\n");
    sb.append("    userIp: ").append(toIndentedString(userIp)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    userMsgs: ").append(toIndentedString(userMsgs)).append("\n");
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

