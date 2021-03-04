package com.luoxiao.controller;

import com.luoxiao.entity.UacUserEntity;
import com.luoxiao.service.UacUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import result.Result;

import java.util.Map;

/**
 * @description: uac控制器
 * @author: luox
 * @date： 2021/2/25
 */

@RestController
public class UacUserController {

    @Autowired
    private UacUserService uacUserService;

    @GetMapping("/uac/{id}")
    public Result getUserById(@PathVariable("id")String id){
        UacUserEntity uacUserEntity = uacUserService.getById(id);
        return Result.OK(uacUserEntity);
    }

}
