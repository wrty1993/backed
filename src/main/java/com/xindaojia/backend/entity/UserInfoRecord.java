package com.xindaojia.backend.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表(UserInfoRecord)实体类
 *
 * @author makejava
 * @since 2020-07-23 14:39:40
 */
public class UserInfoRecord implements Serializable {

    private static final long serialVersionUID = -55681401477881107L;
    /**
     * 自增id
     */
    private Long id;
    /**
     * user_id
     */
    private Long userId;
    /**
     * 手机号是否验证
     */
    private Integer phoneVerify;
    /**
     * 用户手机号
     */
    private String phoneNum;
    /**
     * 用户默认地址
     */
    private String address0;
    /**
     * 用户常用地址1
     */
    private String address1;
    /**
     * 用户常用地址2
     */
    private String address2;
    /**
     * 用户常用地址3
     */
    private String address3;
    /**
     * 用户常用地址4
     */
    private String address4;
    /**
     * 性别,0:未设置,1:男,2:女
     */
    private Integer sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 身份证号
     */
    private String cardNum;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String nick;
    /**
     * 用户会员类型
     */
    private Integer memberType;
    /**
     * 用户注册时间
     */
    private Date createTime;
    /**
     * 头像url
     */
    private String photoUrl;
    /**
     * 用户状态,0:已激活,1:已注销,2:黑名单
     */
    private Integer userStatus;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 扩展信息
     */
    private String extInfo;
    /**
     * 扩展字段
     */
    private Integer extInt1;
    /**
     * 扩展字段
     */
    private Integer extInt2;
    /**
     * 扩展字段
     */
    private Integer extInt3;

    private Date date1;

    private Date date2;

    private Date date3;
    /**
     * 扩展字段
     */
    private String char1;
    /**
     * 扩展字段
     */
    private String char2;
    /**
     * 扩展字段
     */
    private String char3;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPhoneVerify() {
        return phoneVerify;
    }

    public void setPhoneVerify(Integer phoneVerify) {
        this.phoneVerify = phoneVerify;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress0() {
        return address0;
    }

    public void setAddress0(String address0) {
        this.address0 = address0;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Integer getExtInt1() {
        return extInt1;
    }

    public void setExtInt1(Integer extInt1) {
        this.extInt1 = extInt1;
    }

    public Integer getExtInt2() {
        return extInt2;
    }

    public void setExtInt2(Integer extInt2) {
        this.extInt2 = extInt2;
    }

    public Integer getExtInt3() {
        return extInt3;
    }

    public void setExtInt3(Integer extInt3) {
        this.extInt3 = extInt3;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public String getChar3() {
        return char3;
    }

    public void setChar3(String char3) {
        this.char3 = char3;
    }

}