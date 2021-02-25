package com.luoxiao.controller;

import com.luoxiao.entity.UacUserEntity;
import com.luoxiao.service.UacUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/25
 */

@RestController
public class UacUserController {

    @Autowired
    private UacUserService uacUserService;

    @GetMapping("/uac/{id}")
    public Map<String,Object> getUserById(@PathVariable("id")String id){
        ModelMap map = new ModelMap();
        UacUserEntity uacUserEntity = uacUserService.getById(id);
        map.put("data",uacUserEntity);
        return map;
    }

}
