package com.alibabacloud.hipstershop.checkoutservice.controller;

import com.alibabacloud.hipstershop.checkoutservice.service.CheckoutServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/15
 */

@RestController
public class CheckoutController {

    @Resource
    CheckoutServiceImpl checkoutService;

    @PostMapping(value = "/checkout")
    public String checkout(@RequestParam("userId") String userId){
        return checkoutService.checkout_http(userId);
    }
}
