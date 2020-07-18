package com.alibabacloud.hipstershop.dao;

import com.alibabacloud.hipstershop.checkoutserviceapi.domain.Order;
import com.alibabacloud.hipstershop.checkoutserviceapi.service.CheckoutService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
/**
 * @author xiaofeng.gxf
 * @date 2020/6/24
 */
@Service
public class OrderDAO {

    @Reference(version = "0.0.1")
    private CheckoutService checkoutService;

    @Resource
    CheckoutInfoService checkoutInfoService;

    public String checkout(String email, String streetAddress, String zipCode, String city, String state,
                   String creditCardNumber, int creditCardExpirationMonth, String creditCardCvv, String userId){
        return checkoutService.checkout(email,streetAddress, zipCode, city, state, creditCardNumber,
                creditCardExpirationMonth, creditCardCvv, userId);
    }

    public String checkout_test(String userId){
        return checkoutInfoService.checkout(userId);
    }

    public Order getOrder(String orderId, String userId){
        return checkoutService.getOrder(orderId, userId);
    }

    @FeignClient(name = "checkoutservice")
    public interface CheckoutInfoService {
        @PostMapping(value = "/checkout")
        String checkout(@RequestParam("userId") String userId);
    }
}
