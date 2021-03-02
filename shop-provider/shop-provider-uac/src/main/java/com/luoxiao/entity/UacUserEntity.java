package com.luoxiao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号
     */
    private String account;

    /**
     * 手机号
     */
    private String mobile;

}
