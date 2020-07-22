package com.alibabacloud.hipstershop.service;

import com.alibabacloud.hipstershop.domain.ProductItem;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.List;

/**
 * 对外提供的Dubbo service实现类
 *
 * @author xiaofeng.gxf
 * @date 2020/6/29
 */

@DubboComponentScan
@RefreshScope
@Service(version = "1.0.0")
public class ProductServiceImpl implements ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public List<ProductItem> confirmInventory(List<ProductItem> checkoutProductItems) {
//        long a = System.nanoTime();
        for (ProductItem item : checkoutProductItems) {
            //@TODO check inventory
            item.setLock(true);
        }
//        long b = System.nanoTime();
//        double c1 = (b - a) / 1000000.0;
//        logger.info("Cost: " + c1);
        return checkoutProductItems;
    }
}
