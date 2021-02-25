package com.luoxiao.provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/25
 */
@Component
@FeignClient(name = "provider-uac")
public interface UacFeignApi {

    @GetMapping("/uac/{id}")
    public Map<String,Object> getUserById(@PathVariable("id")String id);

}
