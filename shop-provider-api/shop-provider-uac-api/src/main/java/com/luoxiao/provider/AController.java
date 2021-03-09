package com.luoxiao.provider;

import com.luoxiao.service.UacFeignApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import result.CustomException;
import result.Result;

import javax.annotation.Resource;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/26
 */

@RestController
public class AController {

    @Autowired
    private UacFeignApi uacFeignApi;

    @GetMapping("/api/uac/{id}")
    public Result getUserById(@PathVariable("id")Long id){
        return uacFeignApi.getUserById(id);
    }

}
