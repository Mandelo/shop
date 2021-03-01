package com.luoxiao.provider;

import com.luoxiao.service.UacFeignApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import result.Result;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/26
 */

@RestController
public class AController {

    @Autowired
    private UacFeignApi uacFeignApi;

    @HystrixCommand(fallbackMethod = "getErroInfo")
    @GetMapping("/api/uac/{id}")
    public Object getUserById(@PathVariable("id")String id){
        return uacFeignApi.getUserById(id);
    }

    public Result getErroInfo(String id){
        return new Result(500, "服务器内部出现错误");
    }

}
