package com.alibabacloud.hipstershop.controller;

import com.alibabacloud.hipstershop.cartserviceinterface.domain.Product;
import com.alibabacloud.hipstershop.entity.ProductInfo;
import com.alibabacloud.hipstershop.service.ProductServiceApi;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class ProductController {

    @Resource
    ProductServiceApi productServiceApi;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable(name = "id") String id) {
        return productServiceApi.getProduct(id).getProduct();
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        return productServiceApi.getAllProduct().stream().map(ProductInfo::getProduct).collect(Collectors.toList());
    }
}
