package com.alibabacloud.hipstershop.cartservice2.utils;


import com.alibabacloud.hipstershop.cartservice2.domain.RedisKey;

/**
 * @author xiaofeng.gxf
 * @date 2020/7/7
 */
public class Common {
    public static RedisKey getRedisKey(String userId) {
        return new RedisKey(Constant.REDIS_CART, userId);
    }
}
