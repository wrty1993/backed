package com.xindaojia.backend.controller;

import static com.xindaojia.backend.errorcode.ErrorCode.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xindaojia.backend.entity.UserInfoRecord;
import com.xindaojia.backend.service.UserInfoRecordService;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    /**
     * 登录验证
     * @param userName
     * @param password
     * @param verifyCode
     * @return
     */
    @PostMapping(value = "/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        @RequestParam("verifyCode") String verifyCode,
                        HttpSession session) {
    	JsonObject result = new JsonObject();
        if (StringUtils.isEmpty(verifyCode)) {
//            session.setAttribute("errorMsg", "验证码不能为空");
        	 result.addProperty("code", VERIFY_NOT_NULL.code());
             result.addProperty("msg", VERIFY_NOT_NULL.msg());
            return new Gson().toJson(result);
        }
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
        	 result.addProperty("code", LOGIN_NOT_NULL.code());
             result.addProperty("msg", LOGIN_NOT_NULL.msg());
            return new Gson().toJson(result);
        }
        String kaptchaCode = session.getAttribute("verifyCode") + "";
        if (StringUtils.isEmpty(kaptchaCode) || !verifyCode.equals(kaptchaCode)) {
        	result.addProperty("code", VERIFY_NOT_ERROR.code());
            result.addProperty("msg", VERIFY_NOT_ERROR.msg());
            return new Gson().toJson(result);
        }
        UserInfoRecord userInfo = userInfoRecordService.login(userName, password);
        if (userInfo != null) {
            session.setAttribute("loginUserName", userInfo.getUserName());
            session.setAttribute("loginUserId", userInfo.getUserId());
            session.setAttribute("nick", userInfo.getNick());
            //session过期时间设置两小时
            //session.setMaxInactiveInterval(60 * 60 * 2);
            result.addProperty("code",SUCCESS.code());
            result.addProperty("msg",SUCCESS.msg());
            return new Gson().toJson(result);
        } else {
        	 result.addProperty("code",LOGIN_ERROR.code());
             result.addProperty("msg",LOGIN_ERROR.msg());
            return new Gson().toJson(result);
        }
    }
   
	/**
	 * 请求有session，session可以设置时间，
	 * 可通过session里面的loginUserId来验证是否是此用户
	 * @param request
	 * @return
	 */
    @GetMapping("/profile")
    public String profile(HttpServletRequest request) {
    	JsonObject result = new JsonObject(); 
    	Long loginUserId =Long.valueOf(request.getSession().getAttribute("loginUserId").toString());
    	 //userId为主键，直接通过查询主键id查询
    	 UserInfoRecord userInfo = userInfoRecordService.queryById(loginUserId);
    	 if(userInfo==null) {
    		 result.addProperty("code",LOGIN_PROFILE_ERROR.code());
             result.addProperty("msg",LOGIN_PROFILE_ERROR.msg()); 
             return result.toString();
    	 }else {
    		 //确认此用户登录，更新登录userName和昵称
    		 request.setAttribute("loginUserName", userInfo.getUserName());
    		 request.setAttribute("nick", userInfo.getNick());
    		 result.addProperty("code",SUCCESS.code());
             result.addProperty("msg",SUCCESS.msg()); 
             return result.toString();
    	 }
    }
    
    @PostMapping("/profile/password")
    @ResponseBody
    public String passwordUpdate(HttpServletRequest request,@RequestBody HashMap<Object, Object> requestMap) {
    	JsonObject result = new JsonObject();  
    	if (requestMap == null) {
             result.addProperty("code", PARAM_NOT_SET.code());
             result.addProperty("msg", PARAM_NOT_SET.msg());
             return new Gson().toJson(result);
         }
    	/*刚哥确认这里是否要用session，用session的话可以前后端用session来校验
    	*修改了账户或密码，可以更新session的值，不用session就可以直接把loginUserId在requestMap里面传过来
    	*v1.0：用session
    	*/
    	Long loginUserId =Long.valueOf(request.getSession().getAttribute("loginUserId").toString());
         return userInfoRecordService.passwordUpdate(requestMap,loginUserId);
    }
    
    @PostMapping("/profile/name")
    @ResponseBody
    public String passwordName(HttpServletRequest request,@RequestBody HashMap<Object, Object> requestMap) {
    	JsonObject result = new JsonObject();  
    	if (requestMap == null) {
            result.addProperty("code", PARAM_NOT_SET.code());
            result.addProperty("msg", PARAM_NOT_SET.msg());
            return new Gson().toJson(result);
        }
    	Long loginUserId =Long.valueOf(request.getSession().getAttribute("loginUserId").toString());
    	return userInfoRecordService.nameUpdate(requestMap,loginUserId);
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
    	JsonObject result = new JsonObject();
        request.getSession().removeAttribute("loginUserId");
        request.getSession().removeAttribute("loginUserName");
        result.addProperty("code",SUCCESS.code());
        result.addProperty("msg",SUCCESS.msg());
        return new Gson().toJson(result);
    }
}
