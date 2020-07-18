package com.alibabacloud.hipstershop.checkoutservice.dao;

import com.alibabacloud.hipstershop.domain.ProductItem;
import com.alibabacloud.hipstershop.service.ProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/18
 */
@Service
public class ProductDao {
    @Reference(version = "1.0.0")
    private ProductService productService;

    public List<ProductItem> confirmInventory(List<ProductItem> productItems){
        return productService.confirmInventory(productItems);
    }
}
