package com.alibabacloud.hipstershop.checkoutservice.init;

import com.alibabacloud.hipstershop.checkoutservice.repository.OrderFormRepository;
import com.alibabacloud.hipstershop.checkoutservice.service.CheckoutServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 *
 * 应用启动第一次访问数据库操作时较慢，所以此处预热一次避免出现超时问题。
 *
 * @author xiaofeng.gxf
 * @date 2020/7/21
 */
@Component
public class WarmUp implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(WarmUp.class);

    @Resource
    OrderFormRepository orderFormRepository;

    /**
     * 打印数据库记录数量，清空购买记录（避免数据太多，危险操作，Demo测试专用。）
     * @param args 启动参数
     * @throws Exception 异常
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Record Count: " + orderFormRepository.count());
        orderFormRepository.deleteAll();;
        logger.info("Clear.");
    }
}
