package com.luoxiao.service.hystrix;

import com.luoxiao.service.UacFeignApi;
import org.springframework.stereotype.Component;
import result.CustomException;
import result.Result;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/9
 */

@Component
public class UacFeignApiHystrix implements UacFeignApi {

    @Override
    public Result getUserById(Long id) {
        System.out.println("2333333333333333333333333");
        return new Result(233,"用户服务连接失败");
    }
}
