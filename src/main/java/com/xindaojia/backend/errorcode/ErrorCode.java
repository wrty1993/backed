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
    SUCCESS(0, "success"),
    SAMPLE(0,"you know, for sample test."),
    PARAM_NOT_SET(100001,"param is not set!"),
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
}
