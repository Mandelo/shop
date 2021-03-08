package com.luoxiao.provider;

import com.luoxiao.service.UacFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    public Object getUserById(@PathVariable("id")String id){
        return uacFeignApi.getUserById(id);
    }


}
