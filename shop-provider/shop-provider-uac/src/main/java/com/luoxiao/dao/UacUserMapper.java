package com.luoxiao.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luoxiao.entity.UacUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @description: 用户中心
 * @author: luox
 * @date： 2021/2/25
 */

@Mapper
@Component
public interface UacUserMapper extends BaseMapper<UacUserEntity> {

}
