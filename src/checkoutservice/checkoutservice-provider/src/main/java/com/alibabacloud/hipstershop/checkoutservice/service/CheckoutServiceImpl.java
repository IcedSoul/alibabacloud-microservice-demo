package com.alibabacloud.hipstershop.checkoutservice.service;

import com.alibabacloud.hipstershop.checkoutserviceapi.domain.Order;
import com.alibabacloud.hipstershop.checkoutserviceapi.service.CheckoutService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xiaofeng.gxf
 * @date 2020/6/24
 */
@RefreshScope
@Service(version = "1.0.0")
public class CheckoutServiceImpl implements CheckoutService {
    @Override
    public Order checkout(String email, String streetAddress, String zipCode, String city, String state,
                          String creditCardNumber, int creditCardExpirationMonth, String creditCardCvv, String userId) {
        //@TODO continue
        return null;
    }
}
