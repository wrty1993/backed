package com.xindaojia.backend.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 商户信息表(StoreInfoRecord)实体类
 *
 * @author makejava
 * @since 2020-07-22 18:46:11
 */
public class StoreInfoRecord implements Serializable {

    private static final long serialVersionUID = -25943452206841131L;
    /**
     * 自增id
     */
    private Long id;
    /**
     * store_id
     */
    private Long storeId;
    /**
     * 商户名称
     */
    private String storeName;
    /**
     * 商户类型
     */
    private Object storeType;
    /**
     * 商户价格
     */
    private Double storePrice;
    /**
     * 商户单位
     */
    private String storeUnit;
    /**
     * 商家描述
     */
    private String storeDesc;
    /**
     * 商家折扣
     */
    private String storeDiscount;
    /**
     * 商家活动
     */
    private String storeActivity;
    /**
     * 商家项目
     */
    private String storeProject;
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
    private Integer int1;
    /**
     * 扩展字段
     */
    private Integer int2;
    /**
     * 扩展字段
     */
    private Integer int3;

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

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Object getStoreType() {
        return storeType;
    }

    public void setStoreType(Object storeType) {
        this.storeType = storeType;
    }

    public Double getStorePrice() {
        return storePrice;
    }

    public void setStorePrice(Double storePrice) {
        this.storePrice = storePrice;
    }

    public String getStoreUnit() {
        return storeUnit;
    }

    public void setStoreUnit(String storeUnit) {
        this.storeUnit = storeUnit;
    }

    public String getStoreDesc() {
        return storeDesc;
    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public String getStoreDiscount() {
        return storeDiscount;
    }

    public void setStoreDiscount(String storeDiscount) {
        this.storeDiscount = storeDiscount;
    }

    public String getStoreActivity() {
        return storeActivity;
    }

    public void setStoreActivity(String storeActivity) {
        this.storeActivity = storeActivity;
    }

    public String getStoreProject() {
        return storeProject;
    }

    public void setStoreProject(String storeProject) {
        this.storeProject = storeProject;
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

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    public Integer getInt2() {
        return int2;
    }

    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

    public Integer getInt3() {
        return int3;
    }

    public void setInt3(Integer int3) {
        this.int3 = int3;
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