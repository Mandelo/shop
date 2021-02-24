package com.luoxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/24
 */

@EnableEurekaServer
@SpringBootApplication
public class ShopRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopRegistryApplication.class, args);
    }

}
