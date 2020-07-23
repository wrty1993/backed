package com.xindaojia.backend.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 购物车记录表(CartInfoRecord)实体类
 *
 * @author makejava
 * @since 2020-07-22 18:35:18
 */
public class CartInfoRecord implements Serializable {

    private static final long serialVersionUID = -57204728567442027L;
    /**
     * 自增id
     */
    private Long id;
    /**
     * service_id
     */
    private Long cartId;
    /**
     * user_id
     */
    private Long userId;
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
     * 服务描述
     */
    private Date addTime;
    /**
     * VIP价格
     */
    private Date modifiedTime;
    /**
     * 服务状态
     */
    private Object serviceStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Object getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Object serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

}