package com.luoxiao.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import result.Result;

import java.util.Map;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/25
 */
@Component
public interface UacFeignApi {

    @GetMapping("/uac/{id}")
    public Result getUserById(@PathVariable("id")String id);

}
