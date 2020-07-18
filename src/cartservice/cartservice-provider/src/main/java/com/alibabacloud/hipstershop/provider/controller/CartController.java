package com.alibabacloud.hipstershop.provider.controller;

import com.alibabacloud.hipstershop.CartItem;
import com.alibabacloud.hipstershop.provider.service.CartServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/15
 */
@RestController
public class CartController {

    @Resource
    CartServiceImpl cartService;


    @PostMapping("/cart/products")
    public List<CartItem> cleanCartItems(@RequestParam(name = "userId") String userId) {
        return cartService.cleanCartItems(userId);
    }

}
