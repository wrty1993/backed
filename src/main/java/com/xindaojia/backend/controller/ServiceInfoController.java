package com.xindaojia.backend.controller;

import static com.xindaojia.backend.errorcode.ErrorCode.PARAM_NOT_SET;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xindaojia.backend.service.ServiceInfoRecordService;

/**
 * 服务控制类
 * @author yuhuanran
 *
 */
@RestController
@RequestMapping("/service")
public class ServiceInfoController {
	
	@Autowired
	ServiceInfoRecordService serviceInfoRecordService;
	
	/**
	 * 首页展示，不同图标就是不同分类，根据不同分类，去展示不同服务（上门维修，上门按摩）
	 * @param requestMap
	 * @return
	 */
	 @PostMapping("/homePage")
	    public String homePageShow(@RequestBody HashMap<Object, Object> requestMap) {
	        JsonObject result = new JsonObject();
	        if (requestMap == null) {
	            result.addProperty("code", PARAM_NOT_SET.code());
	            result.addProperty("msg", PARAM_NOT_SET.msg());
	            return new Gson().toJson(result);
	        }
	        return serviceInfoRecordService.homePageShow(requestMap);
	    }
}
