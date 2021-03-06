package com.luoxiao.service;

import com.luoxiao.service.hystrix.UacFeignApiHystrix;
import org.mapstruct.Mapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
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
@FeignClient(value = "PROVIDER-UAC",fallback = UacFeignApiHystrix.class)
public interface UacFeignApi {

    @GetMapping("/uac/{id}")
    public Result getUserById(@PathVariable("id")Long id);

}
