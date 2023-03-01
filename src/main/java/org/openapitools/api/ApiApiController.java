package org.openapitools.api;

import org.openapitools.model.CartRecord;
import org.openapitools.model.CatConfigLabel;
import org.openapitools.model.CatGroup;
import org.openapitools.model.CatGroupedLabels;
import org.openapitools.model.CatLabelGroup;
import org.openapitools.model.Category;
import org.openapitools.model.CategoryPair;
import org.openapitools.model.Contact;
import org.openapitools.model.DeviceReg;
import org.openapitools.model.FileRecord;
import org.openapitools.model.FilterResultOfCartItemDetailGroup;
import org.openapitools.model.FilterResultOfContact;
import org.openapitools.model.FilterResultOfOrderDetail;
import org.openapitools.model.FilterResultOfPostRecord;
import org.openapitools.model.FilterResultOfQa;
import java.util.List;
import org.openapitools.model.LoginInfo;
import org.openapitools.model.MasterOrder;
import org.openapitools.model.MessageViewModel;
import org.openapitools.model.MobileViewModel;
import org.openapitools.model.OrderCatLabel;
import org.openapitools.model.OrderDetail;
import org.openapitools.model.OrderDetailViewModel;
import org.openapitools.model.OrderInfo;
import org.openapitools.model.Payment;
import org.openapitools.model.PostBase;
import org.openapitools.model.PostLink;
import org.openapitools.model.PostProp;
import org.openapitools.model.PostRecord;
import org.openapitools.model.PriceInfo;
import org.openapitools.model.PsCatId;
import org.openapitools.model.PsCatLabel;
import org.openapitools.model.Qa;
import org.openapitools.model.Register;
import org.openapitools.model.RetOfCartRecord;
import org.openapitools.model.RetOfCatConfigLabel;
import org.openapitools.model.RetOfCategory;
import org.openapitools.model.RetOfContact;
import org.openapitools.model.RetOfDashProfile;
import org.openapitools.model.RetOfFilterResultOfFileRecord;
import org.openapitools.model.RetOfFilterResultOfShopInfo;
import org.openapitools.model.RetOfFrontendCatLabel;
import org.openapitools.model.RetOfInt64;
import org.openapitools.model.RetOfListOfFileRecord;
import org.openapitools.model.RetOfListOfPostProp;
import org.openapitools.model.RetOfListOfPriceInfo;
import org.openapitools.model.RetOfObject;
import org.openapitools.model.RetOfOrderCatLabel;
import org.openapitools.model.RetOfOrderInfo;
import org.openapitools.model.RetOfPostLink;
import org.openapitools.model.RetOfPostRecord;
import org.openapitools.model.RetOfRoleInfo;
import org.openapitools.model.RetOfShopCatLabel;
import org.openapitools.model.RetOfShopInfo;
import org.openapitools.model.RetOfUserInfo;
import org.openapitools.model.RetOfUserRoleInfo;
import org.openapitools.model.RoleInfo;
import org.openapitools.model.ShopBase;
import org.openapitools.model.ShopCatLabel;
import org.openapitools.model.ShopCatTag;
import org.openapitools.model.UserInfo;
import org.openapitools.model.UserRoleInfo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-01T11:30:19.933872+08:00[Asia/Hong_Kong]")
@Controller
@RequestMapping("${openapi.myTitle.base-path:}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
