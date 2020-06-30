package com.alibabacloud.hipstershop.checkoutserviceapi.domain;

import java.io.Serializable;

/**
 * @author xiaofeng.gxf
 * @date 2020/6/24
 */
public class Order implements Serializable {
    private String orderId;
    private String shipId;
    private Double shipCost;
    private Double productCost;
    private Double totalCost;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public Double getShipCost() {
        return shipCost;
    }

    public void setShipCost(Double shipCost) {
        this.shipCost = shipCost;
    }

    public Double getProductCost() {
        return productCost;
    }

    public void setProductCost(Double productCost) {
        this.productCost = productCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Order() {
    }

    public Order(String orderId, String shipId, Double shipCost, Double productCost, Double totalCost) {
        this.orderId = orderId;
        this.shipId = shipId;
        this.shipCost = shipCost;
        this.productCost = productCost;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", shipId='" + shipId + '\'' +
                ", shipCost=" + shipCost +
                ", productCost=" + productCost +
                ", totalCost=" + totalCost +
                '}';
    }
}
