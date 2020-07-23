package com.xindaojia.backend.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务信息表(ServiceInfoRecord)实体类
 *
 * @author makejava
 * @since 2020-07-22 18:45:52
 */
public class ServiceInfoRecord implements Serializable {

    private static final long serialVersionUID = 818604873641990796L;
    /**
     * 自增id
     */
    private Long id;
    /**
     * service_id
     */
    private Long serviceId;
    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 服务类型
     */
    private Object serviceType;
    /**
     * 服务价格
     */
    private Double price;
    /**
     * 服务单位
     */
    private String serviceUnit;
    /**
     * 服务描述
     */
    private String serviceDesc;
    /**
     * VIP价格
     */
    private String priceVip;
    /**
     * 保障类型
     */
    private String promise;
    /**
     * 服务时间
     */
    private Date serviceTime;
    /**
     * 评价类型
     */
    private Object evaluationType;
    /**
     * 评价详情
     */
    private String evaluationDesc;
    /**
     * 评价用户id
     */
    private String evaluationUser;
    /**
     * 评价时间
     */
    private Date evaluationTine;
    /**
     * 评价图片路径1
     */
    private String evaluationImgurl1;
    /**
     * 评价图片路径2
     */
    private String evaluationImgurl2;
    /**
     * 评价图片路径3
     */
    private String evaluationImgurl3;
    /**
     * 评价图片路径4
     */
    private String evaluationImgurl4;
    /**
     * 评价图片路径5
     */
    private String evaluationImgurl5;
    /**
     * 评价图片路径6
     */
    private String evaluationImgurl6;
    /**
     * 服务联系人
     */
    private String serviceLink;
    /**
     * 服务电话
     */
    private String servicePhone;
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

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Object getServiceType() {
        return serviceType;
    }

    public void setServiceType(Object serviceType) {
        this.serviceType = serviceType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getServiceUnit() {
        return serviceUnit;
    }

    public void setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public String getPriceVip() {
        return priceVip;
    }

    public void setPriceVip(String priceVip) {
        this.priceVip = priceVip;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    public Object getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(Object evaluationType) {
        this.evaluationType = evaluationType;
    }

    public String getEvaluationDesc() {
        return evaluationDesc;
    }

    public void setEvaluationDesc(String evaluationDesc) {
        this.evaluationDesc = evaluationDesc;
    }

    public String getEvaluationUser() {
        return evaluationUser;
    }

    public void setEvaluationUser(String evaluationUser) {
        this.evaluationUser = evaluationUser;
    }

    public Date getEvaluationTine() {
        return evaluationTine;
    }

    public void setEvaluationTine(Date evaluationTine) {
        this.evaluationTine = evaluationTine;
    }

    public String getEvaluationImgurl1() {
        return evaluationImgurl1;
    }

    public void setEvaluationImgurl1(String evaluationImgurl1) {
        this.evaluationImgurl1 = evaluationImgurl1;
    }

    public String getEvaluationImgurl2() {
        return evaluationImgurl2;
    }

    public void setEvaluationImgurl2(String evaluationImgurl2) {
        this.evaluationImgurl2 = evaluationImgurl2;
    }

    public String getEvaluationImgurl3() {
        return evaluationImgurl3;
    }

    public void setEvaluationImgurl3(String evaluationImgurl3) {
        this.evaluationImgurl3 = evaluationImgurl3;
    }

    public String getEvaluationImgurl4() {
        return evaluationImgurl4;
    }

    public void setEvaluationImgurl4(String evaluationImgurl4) {
        this.evaluationImgurl4 = evaluationImgurl4;
    }

    public String getEvaluationImgurl5() {
        return evaluationImgurl5;
    }

    public void setEvaluationImgurl5(String evaluationImgurl5) {
        this.evaluationImgurl5 = evaluationImgurl5;
    }

    public String getEvaluationImgurl6() {
        return evaluationImgurl6;
    }

    public void setEvaluationImgurl6(String evaluationImgurl6) {
        this.evaluationImgurl6 = evaluationImgurl6;
    }

    public String getServiceLink() {
        return serviceLink;
    }

    public void setServiceLink(String serviceLink) {
        this.serviceLink = serviceLink;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
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