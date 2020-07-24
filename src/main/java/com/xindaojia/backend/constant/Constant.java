package com.xindaojia.backend.constant;

/**
 *
 * @author:gaiserchen
 * @date:2020/7/23
 * @description:
 */
public class Constant {

    private Constant(){}

    /**
     * 用户性别,0:未设置,1:男，2:女
     */
    public static final int INIT = 0;
    public static final int MALE = 1;
    public static final int FEMALE = 2;

    /**
     * 用户状态,0:初始状态,1:正常,2:黑名单,3:注销
     */
    public static final int MEMBER_STATUS_NORMAL = 1;
    public static final int MEMBER_STATUS_BLOCK_LIST = 2;
    public static final int MEMBER_STATUS_CANCEL = 3;

}
