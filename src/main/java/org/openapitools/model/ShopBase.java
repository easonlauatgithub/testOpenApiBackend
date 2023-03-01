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
 * ShopBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class ShopBase {

  @JsonProperty("shopId")
  private Long shopId;

  @JsonProperty("stateCode")
  private Integer stateCode;

  @JsonProperty("shopUserId")
  private String shopUserId;

  @JsonProperty("shopName")
  private String shopName;

  @JsonProperty("catId")
  private Integer catId;

  @JsonProperty("viewCatId")
  private Integer viewCatId;

  @JsonProperty("intro")
  private String intro;

  @JsonProperty("shopCode")
  private String shopCode;

  @JsonProperty("domainName")
  private String domainName;

  @JsonProperty("repShopId")
  private Long repShopId;

  @JsonProperty("uiTheme")
  private String uiTheme;

  @JsonProperty("uiBody")
  private String uiBody;

  @JsonProperty("uiListing")
  private String uiListing;

  @JsonProperty("uiLogo")
  private String uiLogo;

  @JsonProperty("pickupEnabled")
  private Boolean pickupEnabled;

  @JsonProperty("ownPickupEnabled")
  private Boolean ownPickupEnabled;

  @JsonProperty("tagFilterable")
  private Boolean tagFilterable;

  @JsonProperty("payCashEnabled")
  private Boolean payCashEnabled;

  @JsonProperty("payFpsEnabled")
  private Boolean payFpsEnabled;

  @JsonProperty("payAtmEnabled")
  private Boolean payAtmEnabled;

  @JsonProperty("payPalEnabled")
  private Boolean payPalEnabled;

  @JsonProperty("payMeEnabled")
  private Boolean payMeEnabled;

  @JsonProperty("payAliEnabled")
  private Boolean payAliEnabled;

  @JsonProperty("payWechatEnabled")
  private Boolean payWechatEnabled;

  public ShopBase shopId(Long shopId) {
    this.shopId = shopId;
    return this;
  }

  /**
   * Get shopId
   * @return shopId
  */
  @NotNull 
  @Schema(name = "shopId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getShopId() {
    return shopId;
  }

  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }

  public ShopBase stateCode(Integer stateCode) {
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

  public ShopBase shopUserId(String shopUserId) {
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

  public ShopBase shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

  /**
   * Get shopName
   * @return shopName
  */
  
  @Schema(name = "shopName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public ShopBase catId(Integer catId) {
    this.catId = catId;
    return this;
  }

  /**
   * Get catId
   * @return catId
  */
  @NotNull 
  @Schema(name = "catId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getCatId() {
    return catId;
  }

  public void setCatId(Integer catId) {
    this.catId = catId;
  }

  public ShopBase viewCatId(Integer viewCatId) {
    this.viewCatId = viewCatId;
    return this;
  }

  /**
   * Get viewCatId
   * @return viewCatId
  */
  @NotNull 
  @Schema(name = "viewCatId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getViewCatId() {
    return viewCatId;
  }

  public void setViewCatId(Integer viewCatId) {
    this.viewCatId = viewCatId;
  }

  public ShopBase intro(String intro) {
    this.intro = intro;
    return this;
  }

  /**
   * Get intro
   * @return intro
  */
  
  @Schema(name = "intro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public ShopBase shopCode(String shopCode) {
    this.shopCode = shopCode;
    return this;
  }

  /**
   * Get shopCode
   * @return shopCode
  */
  
  @Schema(name = "shopCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShopCode() {
    return shopCode;
  }

  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }

  public ShopBase domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
  */
  
  @Schema(name = "domainName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public ShopBase repShopId(Long repShopId) {
    this.repShopId = repShopId;
    return this;
  }

  /**
   * Get repShopId
   * @return repShopId
  */
  @NotNull 
  @Schema(name = "repShopId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getRepShopId() {
    return repShopId;
  }

  public void setRepShopId(Long repShopId) {
    this.repShopId = repShopId;
  }

  public ShopBase uiTheme(String uiTheme) {
    this.uiTheme = uiTheme;
    return this;
  }

  /**
   * Get uiTheme
   * @return uiTheme
  */
  
  @Schema(name = "uiTheme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUiTheme() {
    return uiTheme;
  }

  public void setUiTheme(String uiTheme) {
    this.uiTheme = uiTheme;
  }

  public ShopBase uiBody(String uiBody) {
    this.uiBody = uiBody;
    return this;
  }

  /**
   * Get uiBody
   * @return uiBody
  */
  
  @Schema(name = "uiBody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUiBody() {
    return uiBody;
  }

  public void setUiBody(String uiBody) {
    this.uiBody = uiBody;
  }

  public ShopBase uiListing(String uiListing) {
    this.uiListing = uiListing;
    return this;
  }

  /**
   * Get uiListing
   * @return uiListing
  */
  
  @Schema(name = "uiListing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUiListing() {
    return uiListing;
  }

  public void setUiListing(String uiListing) {
    this.uiListing = uiListing;
  }

  public ShopBase uiLogo(String uiLogo) {
    this.uiLogo = uiLogo;
    return this;
  }

  /**
   * Get uiLogo
   * @return uiLogo
  */
  
  @Schema(name = "uiLogo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUiLogo() {
    return uiLogo;
  }

  public void setUiLogo(String uiLogo) {
    this.uiLogo = uiLogo;
  }

  public ShopBase pickupEnabled(Boolean pickupEnabled) {
    this.pickupEnabled = pickupEnabled;
    return this;
  }

  /**
   * Get pickupEnabled
   * @return pickupEnabled
  */
  @NotNull 
  @Schema(name = "pickupEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPickupEnabled() {
    return pickupEnabled;
  }

  public void setPickupEnabled(Boolean pickupEnabled) {
    this.pickupEnabled = pickupEnabled;
  }

  public ShopBase ownPickupEnabled(Boolean ownPickupEnabled) {
    this.ownPickupEnabled = ownPickupEnabled;
    return this;
  }

  /**
   * Get ownPickupEnabled
   * @return ownPickupEnabled
  */
  @NotNull 
  @Schema(name = "ownPickupEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getOwnPickupEnabled() {
    return ownPickupEnabled;
  }

  public void setOwnPickupEnabled(Boolean ownPickupEnabled) {
    this.ownPickupEnabled = ownPickupEnabled;
  }

  public ShopBase tagFilterable(Boolean tagFilterable) {
    this.tagFilterable = tagFilterable;
    return this;
  }

  /**
   * Get tagFilterable
   * @return tagFilterable
  */
  @NotNull 
  @Schema(name = "tagFilterable", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getTagFilterable() {
    return tagFilterable;
  }

  public void setTagFilterable(Boolean tagFilterable) {
    this.tagFilterable = tagFilterable;
  }

  public ShopBase payCashEnabled(Boolean payCashEnabled) {
    this.payCashEnabled = payCashEnabled;
    return this;
  }

  /**
   * Get payCashEnabled
   * @return payCashEnabled
  */
  @NotNull 
  @Schema(name = "payCashEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayCashEnabled() {
    return payCashEnabled;
  }

  public void setPayCashEnabled(Boolean payCashEnabled) {
    this.payCashEnabled = payCashEnabled;
  }

  public ShopBase payFpsEnabled(Boolean payFpsEnabled) {
    this.payFpsEnabled = payFpsEnabled;
    return this;
  }

  /**
   * Get payFpsEnabled
   * @return payFpsEnabled
  */
  @NotNull 
  @Schema(name = "payFpsEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayFpsEnabled() {
    return payFpsEnabled;
  }

  public void setPayFpsEnabled(Boolean payFpsEnabled) {
    this.payFpsEnabled = payFpsEnabled;
  }

  public ShopBase payAtmEnabled(Boolean payAtmEnabled) {
    this.payAtmEnabled = payAtmEnabled;
    return this;
  }

  /**
   * Get payAtmEnabled
   * @return payAtmEnabled
  */
  @NotNull 
  @Schema(name = "payAtmEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayAtmEnabled() {
    return payAtmEnabled;
  }

  public void setPayAtmEnabled(Boolean payAtmEnabled) {
    this.payAtmEnabled = payAtmEnabled;
  }

  public ShopBase payPalEnabled(Boolean payPalEnabled) {
    this.payPalEnabled = payPalEnabled;
    return this;
  }

  /**
   * Get payPalEnabled
   * @return payPalEnabled
  */
  @NotNull 
  @Schema(name = "payPalEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayPalEnabled() {
    return payPalEnabled;
  }

  public void setPayPalEnabled(Boolean payPalEnabled) {
    this.payPalEnabled = payPalEnabled;
  }

  public ShopBase payMeEnabled(Boolean payMeEnabled) {
    this.payMeEnabled = payMeEnabled;
    return this;
  }

  /**
   * Get payMeEnabled
   * @return payMeEnabled
  */
  @NotNull 
  @Schema(name = "payMeEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayMeEnabled() {
    return payMeEnabled;
  }

  public void setPayMeEnabled(Boolean payMeEnabled) {
    this.payMeEnabled = payMeEnabled;
  }

  public ShopBase payAliEnabled(Boolean payAliEnabled) {
    this.payAliEnabled = payAliEnabled;
    return this;
  }

  /**
   * Get payAliEnabled
   * @return payAliEnabled
  */
  @NotNull 
  @Schema(name = "payAliEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayAliEnabled() {
    return payAliEnabled;
  }

  public void setPayAliEnabled(Boolean payAliEnabled) {
    this.payAliEnabled = payAliEnabled;
  }

  public ShopBase payWechatEnabled(Boolean payWechatEnabled) {
    this.payWechatEnabled = payWechatEnabled;
    return this;
  }

  /**
   * Get payWechatEnabled
   * @return payWechatEnabled
  */
  @NotNull 
  @Schema(name = "payWechatEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getPayWechatEnabled() {
    return payWechatEnabled;
  }

  public void setPayWechatEnabled(Boolean payWechatEnabled) {
    this.payWechatEnabled = payWechatEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopBase shopBase = (ShopBase) o;
    return Objects.equals(this.shopId, shopBase.shopId) &&
        Objects.equals(this.stateCode, shopBase.stateCode) &&
        Objects.equals(this.shopUserId, shopBase.shopUserId) &&
        Objects.equals(this.shopName, shopBase.shopName) &&
        Objects.equals(this.catId, shopBase.catId) &&
        Objects.equals(this.viewCatId, shopBase.viewCatId) &&
        Objects.equals(this.intro, shopBase.intro) &&
        Objects.equals(this.shopCode, shopBase.shopCode) &&
        Objects.equals(this.domainName, shopBase.domainName) &&
        Objects.equals(this.repShopId, shopBase.repShopId) &&
        Objects.equals(this.uiTheme, shopBase.uiTheme) &&
        Objects.equals(this.uiBody, shopBase.uiBody) &&
        Objects.equals(this.uiListing, shopBase.uiListing) &&
        Objects.equals(this.uiLogo, shopBase.uiLogo) &&
        Objects.equals(this.pickupEnabled, shopBase.pickupEnabled) &&
        Objects.equals(this.ownPickupEnabled, shopBase.ownPickupEnabled) &&
        Objects.equals(this.tagFilterable, shopBase.tagFilterable) &&
        Objects.equals(this.payCashEnabled, shopBase.payCashEnabled) &&
        Objects.equals(this.payFpsEnabled, shopBase.payFpsEnabled) &&
        Objects.equals(this.payAtmEnabled, shopBase.payAtmEnabled) &&
        Objects.equals(this.payPalEnabled, shopBase.payPalEnabled) &&
        Objects.equals(this.payMeEnabled, shopBase.payMeEnabled) &&
        Objects.equals(this.payAliEnabled, shopBase.payAliEnabled) &&
        Objects.equals(this.payWechatEnabled, shopBase.payWechatEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, stateCode, shopUserId, shopName, catId, viewCatId, intro, shopCode, domainName, repShopId, uiTheme, uiBody, uiListing, uiLogo, pickupEnabled, ownPickupEnabled, tagFilterable, payCashEnabled, payFpsEnabled, payAtmEnabled, payPalEnabled, payMeEnabled, payAliEnabled, payWechatEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopBase {\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    shopUserId: ").append(toIndentedString(shopUserId)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    catId: ").append(toIndentedString(catId)).append("\n");
    sb.append("    viewCatId: ").append(toIndentedString(viewCatId)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    shopCode: ").append(toIndentedString(shopCode)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    repShopId: ").append(toIndentedString(repShopId)).append("\n");
    sb.append("    uiTheme: ").append(toIndentedString(uiTheme)).append("\n");
    sb.append("    uiBody: ").append(toIndentedString(uiBody)).append("\n");
    sb.append("    uiListing: ").append(toIndentedString(uiListing)).append("\n");
    sb.append("    uiLogo: ").append(toIndentedString(uiLogo)).append("\n");
    sb.append("    pickupEnabled: ").append(toIndentedString(pickupEnabled)).append("\n");
    sb.append("    ownPickupEnabled: ").append(toIndentedString(ownPickupEnabled)).append("\n");
    sb.append("    tagFilterable: ").append(toIndentedString(tagFilterable)).append("\n");
    sb.append("    payCashEnabled: ").append(toIndentedString(payCashEnabled)).append("\n");
    sb.append("    payFpsEnabled: ").append(toIndentedString(payFpsEnabled)).append("\n");
    sb.append("    payAtmEnabled: ").append(toIndentedString(payAtmEnabled)).append("\n");
    sb.append("    payPalEnabled: ").append(toIndentedString(payPalEnabled)).append("\n");
    sb.append("    payMeEnabled: ").append(toIndentedString(payMeEnabled)).append("\n");
    sb.append("    payAliEnabled: ").append(toIndentedString(payAliEnabled)).append("\n");
    sb.append("    payWechatEnabled: ").append(toIndentedString(payWechatEnabled)).append("\n");
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

