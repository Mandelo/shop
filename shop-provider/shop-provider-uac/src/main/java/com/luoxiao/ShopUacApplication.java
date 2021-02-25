package com.luoxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 用户服务中心
 * @author: luox
 * @date： 2021/2/25
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ShopUacApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUacApplication.class, args);
    }

}
