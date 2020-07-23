package com.xindaojia.backend.controller;

import static com.xindaojia.backend.errorcode.ErrorCode.PARAM_NOT_SET;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xindaojia.backend.service.UserInfoRecordService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright@www.tencent.com.
 *
 * @author:gaiserchen
 * @date:2020/7/23
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {


    @Autowired
    UserInfoRecordService userInfoRecordService;

    @PostMapping("/register")
    public String register(@RequestBody HashMap<Object, Object> requestMap) {
        JsonObject result = new JsonObject();
        if (requestMap == null) {
            result.addProperty("code", PARAM_NOT_SET.code());
            result.addProperty("msg", PARAM_NOT_SET.msg());
            return new Gson().toJson(result);
        }
        return userInfoRecordService.userRegister(requestMap);
    }
}
