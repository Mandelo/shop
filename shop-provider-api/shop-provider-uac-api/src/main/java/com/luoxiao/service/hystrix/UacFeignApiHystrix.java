package com.luoxiao.service.hystrix;

import com.luoxiao.service.UacFeignApi;
import org.springframework.stereotype.Component;
import result.Result;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/26
 */

@Component
public class UacFeignApiHystrix implements UacFeignApi {

    public Result getUserById(String id) {
        return null;
    }
}
