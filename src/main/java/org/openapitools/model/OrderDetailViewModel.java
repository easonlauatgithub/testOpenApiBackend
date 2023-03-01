package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CatGroup;
import org.openapitools.model.OrderDetail;
import org.openapitools.model.PageMetas;
import org.openapitools.model.PaymentAccount;
import org.openapitools.model.ShopInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderDetailViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class OrderDetailViewModel {

  @JsonProperty("item")
  private OrderDetail item;

  @JsonProperty("paypalEnvironment")
  private String paypalEnvironment;

  @JsonProperty("pgMetas")
  private PageMetas pgMetas;

  @JsonProperty("shop")
  private ShopInfo shop;

  @JsonProperty("pageName")
  private String pageName;

  @JsonProperty("listingCatGroups")
  @Valid
  private List<CatGroup> listingCatGroups = null;

  @JsonProperty("itemTagCatGroups")
  @Valid
  private List<CatGroup> itemTagCatGroups = null;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("payAccounts")
  @Valid
  private List<PaymentAccount> payAccounts = null;

  public OrderDetailViewModel item(OrderDetail item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OrderDetail getItem() {
    return item;
  }

  public void setItem(OrderDetail item) {
    this.item = item;
  }

  public OrderDetailViewModel paypalEnvironment(String paypalEnvironment) {
    this.paypalEnvironment = paypalEnvironment;
    return this;
  }

  /**
   * Get paypalEnvironment
   * @return paypalEnvironment
  */
  
  @Schema(name = "paypalEnvironment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPaypalEnvironment() {
    return paypalEnvironment;
  }

  public void setPaypalEnvironment(String paypalEnvironment) {
    this.paypalEnvironment = paypalEnvironment;
  }

  public OrderDetailViewModel pgMetas(PageMetas pgMetas) {
    this.pgMetas = pgMetas;
    return this;
  }

  /**
   * Get pgMetas
   * @return pgMetas
  */
  @Valid 
  @Schema(name = "pgMetas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PageMetas getPgMetas() {
    return pgMetas;
  }

  public void setPgMetas(PageMetas pgMetas) {
    this.pgMetas = pgMetas;
  }

  public OrderDetailViewModel shop(ShopInfo shop) {
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

  public OrderDetailViewModel pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  /**
   * Get pageName
   * @return pageName
  */
  
  @Schema(name = "pageName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public OrderDetailViewModel listingCatGroups(List<CatGroup> listingCatGroups) {
    this.listingCatGroups = listingCatGroups;
    return this;
  }

  public OrderDetailViewModel addListingCatGroupsItem(CatGroup listingCatGroupsItem) {
    if (this.listingCatGroups == null) {
      this.listingCatGroups = new ArrayList<>();
    }
    this.listingCatGroups.add(listingCatGroupsItem);
    return this;
  }

  /**
   * Get listingCatGroups
   * @return listingCatGroups
  */
  @Valid 
  @Schema(name = "listingCatGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CatGroup> getListingCatGroups() {
    return listingCatGroups;
  }

  public void setListingCatGroups(List<CatGroup> listingCatGroups) {
    this.listingCatGroups = listingCatGroups;
  }

  public OrderDetailViewModel itemTagCatGroups(List<CatGroup> itemTagCatGroups) {
    this.itemTagCatGroups = itemTagCatGroups;
    return this;
  }

  public OrderDetailViewModel addItemTagCatGroupsItem(CatGroup itemTagCatGroupsItem) {
    if (this.itemTagCatGroups == null) {
      this.itemTagCatGroups = new ArrayList<>();
    }
    this.itemTagCatGroups.add(itemTagCatGroupsItem);
    return this;
  }

  /**
   * Get itemTagCatGroups
   * @return itemTagCatGroups
  */
  @Valid 
  @Schema(name = "itemTagCatGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CatGroup> getItemTagCatGroups() {
    return itemTagCatGroups;
  }

  public void setItemTagCatGroups(List<CatGroup> itemTagCatGroups) {
    this.itemTagCatGroups = itemTagCatGroups;
  }

  public OrderDetailViewModel currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OrderDetailViewModel payAccounts(List<PaymentAccount> payAccounts) {
    this.payAccounts = payAccounts;
    return this;
  }

  public OrderDetailViewModel addPayAccountsItem(PaymentAccount payAccountsItem) {
    if (this.payAccounts == null) {
      this.payAccounts = new ArrayList<>();
    }
    this.payAccounts.add(payAccountsItem);
    return this;
  }

  /**
   * Get payAccounts
   * @return payAccounts
  */
  @Valid 
  @Schema(name = "payAccounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<PaymentAccount> getPayAccounts() {
    return payAccounts;
  }

  public void setPayAccounts(List<PaymentAccount> payAccounts) {
    this.payAccounts = payAccounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailViewModel orderDetailViewModel = (OrderDetailViewModel) o;
    return Objects.equals(this.item, orderDetailViewModel.item) &&
        Objects.equals(this.paypalEnvironment, orderDetailViewModel.paypalEnvironment) &&
        Objects.equals(this.pgMetas, orderDetailViewModel.pgMetas) &&
        Objects.equals(this.shop, orderDetailViewModel.shop) &&
        Objects.equals(this.pageName, orderDetailViewModel.pageName) &&
        Objects.equals(this.listingCatGroups, orderDetailViewModel.listingCatGroups) &&
        Objects.equals(this.itemTagCatGroups, orderDetailViewModel.itemTagCatGroups) &&
        Objects.equals(this.currency, orderDetailViewModel.currency) &&
        Objects.equals(this.payAccounts, orderDetailViewModel.payAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, paypalEnvironment, pgMetas, shop, pageName, listingCatGroups, itemTagCatGroups, currency, payAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailViewModel {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    paypalEnvironment: ").append(toIndentedString(paypalEnvironment)).append("\n");
    sb.append("    pgMetas: ").append(toIndentedString(pgMetas)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    listingCatGroups: ").append(toIndentedString(listingCatGroups)).append("\n");
    sb.append("    itemTagCatGroups: ").append(toIndentedString(itemTagCatGroups)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payAccounts: ").append(toIndentedString(payAccounts)).append("\n");
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

