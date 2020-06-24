package com.alibabacloud.hipstershop.dao;

import com.alibabacloud.hipstershop.checkoutserviceapi.domain.Order;
import com.alibabacloud.hipstershop.checkoutserviceapi.service.CheckoutService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author xiaofeng.gxf
 * @date 2020/6/24
 */
@Service
public class OrderDAO {

    @Reference
    private CheckoutService checkoutService;

    public Order checkout(String email, String streetAddress, String zipCode, String city, String state,
                   String creditCardNumber, int creditCardExpirationMonth, String creditCardCvv, String userId){
        return checkoutService.checkout(email,streetAddress, zipCode, city, state, creditCardNumber,
                creditCardExpirationMonth, creditCardCvv, userId);
    }

}
