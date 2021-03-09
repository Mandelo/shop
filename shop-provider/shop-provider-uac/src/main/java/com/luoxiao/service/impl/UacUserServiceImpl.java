package com.luoxiao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luoxiao.dao.UacUserMapper;
import com.luoxiao.entity.UacUserEntity;
import com.luoxiao.service.UacUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @description:用户中心
 * @author: luox
 * @date： 2021/2/25
 */

@Service
public class UacUserServiceImpl extends ServiceImpl<UacUserMapper, UacUserEntity> implements UacUserService {

    @Override
    public UacUserEntity getById(Serializable id) {
        return baseMapper.selectById(id);
    }

}
