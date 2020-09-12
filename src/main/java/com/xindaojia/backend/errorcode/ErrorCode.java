package com.xindaojia.backend.errorcode;

/**
 * Copyright@www.tencent.com.
 *
 * @author:gaiserchen
 * @date:2020/7/23
 * @description:
 */
public enum ErrorCode {
    /**
     * ekyc error code.
     */
    SUCCESS(100000, "success"),
    ERROR(100001,"error"),
    SAMPLE(0,"you know, for sample test."),
    PARAM_NOT_SET(100004,"param is not set!"),
    //空校验code统一为10003
    VERIFY_NOT_ERROR(100003,"验证码错误"),
    VERIFY_NOT_NULL(100003,"验证码不能为空"),
    LOGIN_NOT_NULL(100003,"用户或密码不能为空"),
    
    LOGIN_PROFILE_ERROR(100003,"请重新登录"),
    LOGIN_ERROR(100003,"登录失败，请注册"),
    UPDATE_DB_FAILED(100002,"update db failed");
    private final int code;
    private final String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return this.code;
    }

    public String msg() {
        return this.msg;
    }

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
    
}
