package org.openapitools.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.openapitools.hardcode.DataSource;
import org.openapitools.model.MobileViewModel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

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

    /**
     * GET /api/AppServer/Index
     * @return  (status code 200)
     */
    @RequestMapping(
            method = RequestMethod.GET
            ,value = "/api/AppServer/Index"
            ,produces = { "application/json" }
    )
    public ResponseEntity<MobileViewModel> appServerIndex() {
        String exampleString = DataSource.getHomeData();
        Gson g = new Gson();
        MobileViewModel body = g.fromJson(exampleString, MobileViewModel.class);
        return new ResponseEntity<MobileViewModel>(body, HttpStatus.OK);
    }
}
