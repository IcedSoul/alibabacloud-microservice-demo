package com.alibabacloud.hipstershop.cartservice2api.service;

import com.alibabacloud.hipstershop.cartservice2api.domain.CartItem;

import java.util.List;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/19
 */
public interface CartService {
    List<CartItem> viewCart(String userID);

    boolean addItemToCart(String userID, String productID, int quantity);

    List<CartItem> cleanCartItems(String userID);

    String setExceptionByIp(String ip);

    String getProviderIp(String name, int age);
}
