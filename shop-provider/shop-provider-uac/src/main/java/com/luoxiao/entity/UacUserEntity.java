package com.luoxiao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("uac_user")
public class UacUserEntity {
    @TableId
    private Integer id;
    private String nickname;
    private String password;
    private String account;
    private String mobile;

}
