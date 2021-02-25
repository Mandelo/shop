package com.luoxiao;

import com.luoxiao.entity.UacUserEntity;
import com.luoxiao.service.UacUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/25
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceTest {

    @Autowired
    private UacUserService uacUserService;

    @Test
    public void testSelectById(){
        UacUserEntity userEntity = uacUserService.getById("123");
        System.out.println(userEntity);
    }

}
