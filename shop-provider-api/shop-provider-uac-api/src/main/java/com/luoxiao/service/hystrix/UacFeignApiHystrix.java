package com.luoxiao.service.hystrix;

import com.luoxiao.service.UacFeignApi;
import org.springframework.stereotype.Component;
import result.Result;

/**
 * @description: 降级异常处理
 * @author: luox
 * @date： 2021/3/9
 */

@Component
public class UacFeignApiHystrix implements UacFeignApi {

    @Override
    public Result getUserById(Long id) {
        return new Result(233,"[用户服务]连接失败");
    }
}
