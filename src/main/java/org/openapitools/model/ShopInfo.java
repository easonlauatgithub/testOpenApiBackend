package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatGroupedLabels;
import org.openapitools.model.CategoryPair;
import org.openapitools.model.ImgInfo;
import org.openapitools.model.Lang;
import org.openapitools.model.UiTheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ShopInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class ShopInfo {

  @JsonProperty("tags")
  @Valid
  private List<CategoryPair> tags = null;

  @JsonProperty("mainCat")
  private CategoryPair mainCat;

  @JsonProperty("agentInfo")
  private ShopInfo agentInfo;

  @JsonProperty("lang")
  private Lang lang;

  @JsonProperty("logoPath")
  private String logoPath;

  @JsonProperty("isCartAllowed")
  private Boolean isCartAllowed;

  @JsonProperty("images")
  @Valid
  private List<ImgInfo> images = null;

  @JsonProperty("infoLabels")
  @Valid
  private List<CatGroupedLabels> infoLabels = null;

  @JsonProperty("ui")
  private UiTheme ui;

  @JsonProperty("itemSpaPath")
  private String itemSpaPath;

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

  public ShopInfo tags(List<CategoryPair> tags) {
    this.tags = tags;
    return this;
  }

  public ShopInfo addTagsItem(CategoryPair tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CategoryPair> getTags() {
    return tags;
  }

  public void setTags(List<CategoryPair> tags) {
    this.tags = tags;
  }

  public ShopInfo mainCat(CategoryPair mainCat) {
    this.mainCat = mainCat;
    return this;
  }

  /**
   * Get mainCat
   * @return mainCat
  */
  @Valid 
  @Schema(name = "mainCat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CategoryPair getMainCat() {
    return mainCat;
  }

  public void setMainCat(CategoryPair mainCat) {
    this.mainCat = mainCat;
  }

  public ShopInfo agentInfo(ShopInfo agentInfo) {
    this.agentInfo = agentInfo;
    return this;
  }

  /**
   * Get agentInfo
   * @return agentInfo
  */
  @Valid 
  @Schema(name = "agentInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ShopInfo getAgentInfo() {
    return agentInfo;
  }

  public void setAgentInfo(ShopInfo agentInfo) {
    this.agentInfo = agentInfo;
  }

  public ShopInfo lang(Lang lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @NotNull @Valid 
  @Schema(name = "lang", requiredMode = Schema.RequiredMode.REQUIRED)
  public Lang getLang() {
    return lang;
  }

  public void setLang(Lang lang) {
    this.lang = lang;
  }

  public ShopInfo logoPath(String logoPath) {
    this.logoPath = logoPath;
    return this;
  }

  /**
   * Get logoPath
   * @return logoPath
  */
  
  @Schema(name = "logoPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLogoPath() {
    return logoPath;
  }

  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }

  public ShopInfo isCartAllowed(Boolean isCartAllowed) {
    this.isCartAllowed = isCartAllowed;
    return this;
  }

  /**
   * Get isCartAllowed
   * @return isCartAllowed
  */
  @NotNull 
  @Schema(name = "isCartAllowed", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsCartAllowed() {
    return isCartAllowed;
  }

  public void setIsCartAllowed(Boolean isCartAllowed) {
    this.isCartAllowed = isCartAllowed;
  }

  public ShopInfo images(List<ImgInfo> images) {
    this.images = images;
    return this;
  }

  public ShopInfo addImagesItem(ImgInfo imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<ImgInfo> getImages() {
    return images;
  }

  public void setImages(List<ImgInfo> images) {
    this.images = images;
  }

  public ShopInfo infoLabels(List<CatGroupedLabels> infoLabels) {
    this.infoLabels = infoLabels;
    return this;
  }

  public ShopInfo addInfoLabelsItem(CatGroupedLabels infoLabelsItem) {
    if (this.infoLabels == null) {
      this.infoLabels = new ArrayList<>();
    }
    this.infoLabels.add(infoLabelsItem);
    return this;
  }

  /**
   * Get infoLabels
   * @return infoLabels
  */
  @Valid 
  @Schema(name = "infoLabels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CatGroupedLabels> getInfoLabels() {
    return infoLabels;
  }

  public void setInfoLabels(List<CatGroupedLabels> infoLabels) {
    this.infoLabels = infoLabels;
  }

  public ShopInfo ui(UiTheme ui) {
    this.ui = ui;
    return this;
  }

  /**
   * Get ui
   * @return ui
  */
  @Valid 
  @Schema(name = "ui", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UiTheme getUi() {
    return ui;
  }

  public void setUi(UiTheme ui) {
    this.ui = ui;
  }

  public ShopInfo itemSpaPath(String itemSpaPath) {
    this.itemSpaPath = itemSpaPath;
    return this;
  }

  /**
   * Get itemSpaPath
   * @return itemSpaPath
  */
  
  @Schema(name = "itemSpaPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getItemSpaPath() {
    return itemSpaPath;
  }

  public void setItemSpaPath(String itemSpaPath) {
    this.itemSpaPath = itemSpaPath;
  }

  public ShopInfo shopId(Long shopId) {
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

  public ShopInfo stateCode(Integer stateCode) {
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

  public ShopInfo shopUserId(String shopUserId) {
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

  public ShopInfo shopName(String shopName) {
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

  public ShopInfo catId(Integer catId) {
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

  public ShopInfo viewCatId(Integer viewCatId) {
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

  public ShopInfo intro(String intro) {
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

  public ShopInfo shopCode(String shopCode) {
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

  public ShopInfo domainName(String domainName) {
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

  public ShopInfo repShopId(Long repShopId) {
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

  public ShopInfo uiTheme(String uiTheme) {
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

  public ShopInfo uiBody(String uiBody) {
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

  public ShopInfo uiListing(String uiListing) {
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

  public ShopInfo uiLogo(String uiLogo) {
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

  public ShopInfo pickupEnabled(Boolean pickupEnabled) {
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

  public ShopInfo ownPickupEnabled(Boolean ownPickupEnabled) {
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

  public ShopInfo tagFilterable(Boolean tagFilterable) {
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

  public ShopInfo payCashEnabled(Boolean payCashEnabled) {
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

  public ShopInfo payFpsEnabled(Boolean payFpsEnabled) {
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

  public ShopInfo payAtmEnabled(Boolean payAtmEnabled) {
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

  public ShopInfo payPalEnabled(Boolean payPalEnabled) {
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

  public ShopInfo payMeEnabled(Boolean payMeEnabled) {
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

  public ShopInfo payAliEnabled(Boolean payAliEnabled) {
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

  public ShopInfo payWechatEnabled(Boolean payWechatEnabled) {
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
    ShopInfo shopInfo = (ShopInfo) o;
    return Objects.equals(this.tags, shopInfo.tags) &&
        Objects.equals(this.mainCat, shopInfo.mainCat) &&
        Objects.equals(this.agentInfo, shopInfo.agentInfo) &&
        Objects.equals(this.lang, shopInfo.lang) &&
        Objects.equals(this.logoPath, shopInfo.logoPath) &&
        Objects.equals(this.isCartAllowed, shopInfo.isCartAllowed) &&
        Objects.equals(this.images, shopInfo.images) &&
        Objects.equals(this.infoLabels, shopInfo.infoLabels) &&
        Objects.equals(this.ui, shopInfo.ui) &&
        Objects.equals(this.itemSpaPath, shopInfo.itemSpaPath) &&
        Objects.equals(this.shopId, shopInfo.shopId) &&
        Objects.equals(this.stateCode, shopInfo.stateCode) &&
        Objects.equals(this.shopUserId, shopInfo.shopUserId) &&
        Objects.equals(this.shopName, shopInfo.shopName) &&
        Objects.equals(this.catId, shopInfo.catId) &&
        Objects.equals(this.viewCatId, shopInfo.viewCatId) &&
        Objects.equals(this.intro, shopInfo.intro) &&
        Objects.equals(this.shopCode, shopInfo.shopCode) &&
        Objects.equals(this.domainName, shopInfo.domainName) &&
        Objects.equals(this.repShopId, shopInfo.repShopId) &&
        Objects.equals(this.uiTheme, shopInfo.uiTheme) &&
        Objects.equals(this.uiBody, shopInfo.uiBody) &&
        Objects.equals(this.uiListing, shopInfo.uiListing) &&
        Objects.equals(this.uiLogo, shopInfo.uiLogo) &&
        Objects.equals(this.pickupEnabled, shopInfo.pickupEnabled) &&
        Objects.equals(this.ownPickupEnabled, shopInfo.ownPickupEnabled) &&
        Objects.equals(this.tagFilterable, shopInfo.tagFilterable) &&
        Objects.equals(this.payCashEnabled, shopInfo.payCashEnabled) &&
        Objects.equals(this.payFpsEnabled, shopInfo.payFpsEnabled) &&
        Objects.equals(this.payAtmEnabled, shopInfo.payAtmEnabled) &&
        Objects.equals(this.payPalEnabled, shopInfo.payPalEnabled) &&
        Objects.equals(this.payMeEnabled, shopInfo.payMeEnabled) &&
        Objects.equals(this.payAliEnabled, shopInfo.payAliEnabled) &&
        Objects.equals(this.payWechatEnabled, shopInfo.payWechatEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, mainCat, agentInfo, lang, logoPath, isCartAllowed, images, infoLabels, ui, itemSpaPath, shopId, stateCode, shopUserId, shopName, catId, viewCatId, intro, shopCode, domainName, repShopId, uiTheme, uiBody, uiListing, uiLogo, pickupEnabled, ownPickupEnabled, tagFilterable, payCashEnabled, payFpsEnabled, payAtmEnabled, payPalEnabled, payMeEnabled, payAliEnabled, payWechatEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopInfo {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    mainCat: ").append(toIndentedString(mainCat)).append("\n");
    sb.append("    agentInfo: ").append(toIndentedString(agentInfo)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    isCartAllowed: ").append(toIndentedString(isCartAllowed)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    infoLabels: ").append(toIndentedString(infoLabels)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
    sb.append("    itemSpaPath: ").append(toIndentedString(itemSpaPath)).append("\n");
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

