package com.alibabacloud.hipstershop.service;

import com.alibabacloud.hipstershop.domain.ProductItem;
import com.alibabacloud.hipstershop.entity.ProductInfo;

import java.util.List;

/**
 * 对内的 product service 接口。
 * @author xiaofeng.gxf
 * @date 2020/7/8
 */
public interface ProductServiceApi {
    /**
     * 根据商品Id查询商品
     * @param id 商品Id
     * @return 对应的商品
     */
    ProductInfo getProduct(String id);

    /**
     * 获取所有商品
     * @return 所有商品列表
     */
    List<ProductInfo> getAllProduct();

    /**
     * 确认库存
     * @param checkoutProductItems 待确认商品列表
     * @return 返回商品确认列表
     */
    List<ProductItem> confirmInventory(String checkoutProductItems);
}
