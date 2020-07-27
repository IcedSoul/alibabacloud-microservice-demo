package com.alibabacloud.hipstershop.productservice.controller;

import com.alibabacloud.hipstershop.productservice.entity.ProductInfo;
import com.alibabacloud.hipstershop.productservice.service.ProductServiceApi;
import com.alibabacloud.hipstershop.productserviceapi.domain.Product;
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

    @PostMapping("/config")
    public void setConfig(@RequestParam("dataId") String dataId, @RequestParam("group") String group, @RequestParam("content")String content) {
        productServiceApi.setConfig(dataId, group, content);
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        return productServiceApi.getAllProduct().stream().map(ProductInfo::getProduct).collect(Collectors.toList());
    }
}
