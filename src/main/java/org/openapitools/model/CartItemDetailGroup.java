package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CartItemDetail;
import org.openapitools.model.ShopInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CartItemDetailGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class CartItemDetailGroup {

  @JsonProperty("shop")
  private ShopInfo shop;

  @JsonProperty("items")
  @Valid
  private List<CartItemDetail> items = null;

  public CartItemDetailGroup shop(ShopInfo shop) {
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

  public CartItemDetailGroup items(List<CartItemDetail> items) {
    this.items = items;
    return this;
  }

  public CartItemDetailGroup addItemsItem(CartItemDetail itemsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemDetailGroup cartItemDetailGroup = (CartItemDetailGroup) o;
    return Objects.equals(this.shop, cartItemDetailGroup.shop) &&
        Objects.equals(this.items, cartItemDetailGroup.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shop, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemDetailGroup {\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

