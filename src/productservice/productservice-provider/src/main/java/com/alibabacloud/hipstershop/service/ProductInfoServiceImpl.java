package com.alibabacloud.hipstershop.service;

import com.alibabacloud.hipstershop.domain.ProductItem;
import com.alibabacloud.hipstershop.entity.ProductInfo;
import com.alibabacloud.hipstershop.repository.ProductInfoRepository;
import com.alibabacloud.hipstershop.utils.JsonUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * 对内的product service实现类。
 * @author xiaofeng.gxf
 * @date 2020/7/8
 */
@Service
public class ProductInfoServiceImpl implements ProductServiceApi{

    @Resource
    ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo getProduct(String id) {
        Optional<ProductInfo> productInfo = productInfoRepository.findById(id);
        return productInfo.orElse(null);
    }

    @Override
    public List<ProductInfo> getAllProduct() {
        return productInfoRepository.findAll();
    }

    @Override
    public List<ProductItem> confirmInventory(String checkoutProductItemsString) {
        List<ProductItem> checkoutProductItems = JsonUtils.getObjectList(checkoutProductItemsString);

        for(ProductItem item: checkoutProductItems){
            Optional<ProductInfo> productInfo = productInfoRepository.findById(item.getProductId());
            productInfo.ifPresent(productInfo1 -> item.setLock(true));
        }
        return checkoutProductItems;
    }
}
