package com.alibabacloud.hipstershop.checkoutservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class CheckoutserviceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheckoutserviceProviderApplication.class, args);
    }

}
