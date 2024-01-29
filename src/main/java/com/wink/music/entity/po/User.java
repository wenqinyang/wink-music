package com.wink.music.entity.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import lombok.Data;

/**
 * (User)表实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "User", description = "")
@TableName("user")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -62069726659170134L;

    /**
     * 用户账号
     */
    @Schema(title = "username", description = "用户账号")
    private String username;

    /**
     * 用户密码
     */
    @Schema(title = "password", description = "用户密码")
    private String password;

    /**
     * QQ号码
     */
    @Schema(title = "qq", description = "QQ号码")
    private String qq;

    /**
     * 邮箱地址
     */
    @Schema(title = "email", description = "邮箱地址")
    private String email;

    /**
     * 状态 1:启用 0:禁用
     */
    @Schema(title = "status", description = "状态 1:启用 0:禁用")
    private boolean status;

    /**
     * 创建时ip
     */
    @Schema(title = "createIp", description = "创建时ip")
    private String createIp;

    /**
     * 上次登录时间
     */
    @Schema(title = "lastLoginTime", description = "上次登录时间")
    private Date lastLoginTime;

}

