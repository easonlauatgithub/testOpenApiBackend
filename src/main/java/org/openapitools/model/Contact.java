package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatLabelGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
public class Contact {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("pickContactId")
  private Long pickContactId;

  @JsonProperty("pickContact")
  private Contact pickContact;

  @JsonProperty("contactType")
  private Integer contactType;

  @JsonProperty("title")
  private String title;

  @JsonProperty("name")
  private String name;

  @JsonProperty("phoneAreaNo")
  private Integer phoneAreaNo;

  @JsonProperty("phone")
  private Long phone;

  @JsonProperty("cityNo")
  private Integer cityNo;

  @JsonProperty("address")
  private String address;

  @JsonProperty("phoneDetail")
  private CatLabelGroup phoneDetail;

  @JsonProperty("cityDetail")
  private CatLabelGroup cityDetail;

  public Contact id(Long id) {
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

  public Contact pickContactId(Long pickContactId) {
    this.pickContactId = pickContactId;
    return this;
  }

  /**
   * Get pickContactId
   * @return pickContactId
  */
  @NotNull 
  @Schema(name = "pickContactId", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getPickContactId() {
    return pickContactId;
  }

  public void setPickContactId(Long pickContactId) {
    this.pickContactId = pickContactId;
  }

  public Contact pickContact(Contact pickContact) {
    this.pickContact = pickContact;
    return this;
  }

  /**
   * Get pickContact
   * @return pickContact
  */
  @Valid 
  @Schema(name = "pickContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Contact getPickContact() {
    return pickContact;
  }

  public void setPickContact(Contact pickContact) {
    this.pickContact = pickContact;
  }

  public Contact contactType(Integer contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Get contactType
   * @return contactType
  */
  @NotNull 
  @Schema(name = "contactType", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getContactType() {
    return contactType;
  }

  public void setContactType(Integer contactType) {
    this.contactType = contactType;
  }

  public Contact title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Contact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contact phoneAreaNo(Integer phoneAreaNo) {
    this.phoneAreaNo = phoneAreaNo;
    return this;
  }

  /**
   * Get phoneAreaNo
   * @return phoneAreaNo
  */
  @NotNull 
  @Schema(name = "phoneAreaNo", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getPhoneAreaNo() {
    return phoneAreaNo;
  }

  public void setPhoneAreaNo(Integer phoneAreaNo) {
    this.phoneAreaNo = phoneAreaNo;
  }

  public Contact phone(Long phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @NotNull 
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public Contact cityNo(Integer cityNo) {
    this.cityNo = cityNo;
    return this;
  }

  /**
   * Get cityNo
   * @return cityNo
  */
  @NotNull 
  @Schema(name = "cityNo", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getCityNo() {
    return cityNo;
  }

  public void setCityNo(Integer cityNo) {
    this.cityNo = cityNo;
  }

  public Contact address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Contact phoneDetail(CatLabelGroup phoneDetail) {
    this.phoneDetail = phoneDetail;
    return this;
  }

  /**
   * Get phoneDetail
   * @return phoneDetail
  */
  @Valid 
  @Schema(name = "phoneDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CatLabelGroup getPhoneDetail() {
    return phoneDetail;
  }

  public void setPhoneDetail(CatLabelGroup phoneDetail) {
    this.phoneDetail = phoneDetail;
  }

  public Contact cityDetail(CatLabelGroup cityDetail) {
    this.cityDetail = cityDetail;
    return this;
  }

  /**
   * Get cityDetail
   * @return cityDetail
  */
  @Valid 
  @Schema(name = "cityDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CatLabelGroup getCityDetail() {
    return cityDetail;
  }

  public void setCityDetail(CatLabelGroup cityDetail) {
    this.cityDetail = cityDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.pickContactId, contact.pickContactId) &&
        Objects.equals(this.pickContact, contact.pickContact) &&
        Objects.equals(this.contactType, contact.contactType) &&
        Objects.equals(this.title, contact.title) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.phoneAreaNo, contact.phoneAreaNo) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.cityNo, contact.cityNo) &&
        Objects.equals(this.address, contact.address) &&
        Objects.equals(this.phoneDetail, contact.phoneDetail) &&
        Objects.equals(this.cityDetail, contact.cityDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pickContactId, pickContact, contactType, title, name, phoneAreaNo, phone, cityNo, address, phoneDetail, cityDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pickContactId: ").append(toIndentedString(pickContactId)).append("\n");
    sb.append("    pickContact: ").append(toIndentedString(pickContact)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneAreaNo: ").append(toIndentedString(phoneAreaNo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    cityNo: ").append(toIndentedString(cityNo)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneDetail: ").append(toIndentedString(phoneDetail)).append("\n");
    sb.append("    cityDetail: ").append(toIndentedString(cityDetail)).append("\n");
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

