package com.xindaojia.backend.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单记录表(OrderInfoRecord)实体类
 *
 * @author makejava
 * @since 2020-07-22 18:45:22
 */
public class OrderInfoRecord implements Serializable {

    private static final long serialVersionUID = 493478047839964067L;
    /**
     * 自增id
     */
    private Long id;
    /**
     * order_id
     */
    private Long orderId;
    /**
     * 订单编号
     */
    private String orderNb;
    /**
     * 下单人id
     */
    private String customerId;
    /**
     * 收货人姓名
     */
    private String shippingUser;
    /**
     * 收货人地址
     */
    private String address;
    /**
     * 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    private Object paymentMethod;
    /**
     * 订单金额
     */
    private Double orderMoney;
    /**
     * 优惠金额
     */
    private Double districtMoney;
    /**
     * 支付金额
     */
    private Double paymentMoney;
    /**
     * 下单时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifiedTime;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 订单状态：0初始，1进行中，2已完成，3待评价，4待支付
     */
    private Object orderStatus;
    /**
     * 订单积分
     */
    private Integer orderPoint;
    /**
     * 收货时间
     */
    private Date invoiceTime;
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNb() {
        return orderNb;
    }

    public void setOrderNb(String orderNb) {
        this.orderNb = orderNb;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShippingUser() {
        return shippingUser;
    }

    public void setShippingUser(String shippingUser) {
        this.shippingUser = shippingUser;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Object paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Double getDistrictMoney() {
        return districtMoney;
    }

    public void setDistrictMoney(Double districtMoney) {
        this.districtMoney = districtMoney;
    }

    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Object getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Object orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(Integer orderPoint) {
        this.orderPoint = orderPoint;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
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