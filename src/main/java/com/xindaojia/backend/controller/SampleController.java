package com.xindaojia.backend.controller;

import static com.xindaojia.backend.errorcode.ErrorCode.SAMPLE;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright@www.tencent.com.
 *
 * @author:gaiserchen
 * @date:2020/7/23
 * @description:
 */
@RestController
public class SampleController {

    @GetMapping("/sample")
    public String sample() {
        JsonObject result = new JsonObject();
        result.addProperty("code", SAMPLE.code());
        result.addProperty("msg", SAMPLE.msg());
        return new Gson().toJson(result);
    }

}
