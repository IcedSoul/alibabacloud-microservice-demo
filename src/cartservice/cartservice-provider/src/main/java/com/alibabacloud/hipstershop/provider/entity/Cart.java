package com.alibabacloud.hipstershop.provider.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/7
 */
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private String cartId;
    private String productId;
    private int quantity;
    private String productName;
    private String productPicture;
    private int price;
}
