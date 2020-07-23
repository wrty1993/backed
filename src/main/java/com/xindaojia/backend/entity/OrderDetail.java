package com.xindaojia.backend.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单详情表(OrderDetail)实体类
 *
 * @author makejava
 * @since 2020-07-22 18:42:48
 */
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = -86197078860565880L;
    /**
     * 自增id
     */
    private Long id;
    /**
     * order_detail_id
     */
    private Long orderDetailId;
    /**
     * order_id
     */
    private String orderId;
    /**
     * service_id
     */
    private Object serviceId;
    /**
     * 加入购物车服务数量
     */
    private Integer serviceAmount;
    /**
     * 服务价格
     */
    private Double servicePrice;
    /**
     * 购买服务数量
     */
    private Integer serviceCnt;
    /**
     * 是否支付，0:未支付，1:已支付
     */
    private Object isPay;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 订单状态
     */
    private Object status;
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

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Object getServiceId() {
        return serviceId;
    }

    public void setServiceId(Object serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(Integer serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Integer getServiceCnt() {
        return serviceCnt;
    }

    public void setServiceCnt(Integer serviceCnt) {
        this.serviceCnt = serviceCnt;
    }

    public Object getIsPay() {
        return isPay;
    }

    public void setIsPay(Object isPay) {
        this.isPay = isPay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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