package com.alibabacloud.hipstershop.checkoutserviceapi.service;

import com.alibabacloud.hipstershop.checkoutserviceapi.domain.Order;

/**
 * @author xiaofeng.gxf
 * @date 2020/6/24
 */
public interface CheckoutService {
    Order checkout(String email, String streetAddress, String zipCode, String city, String state,
                   String creditCardNumber, int creditCardExpirationMonth, String creditCardCvv, String userId);
}
