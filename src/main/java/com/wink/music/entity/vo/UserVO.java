package com.wink.music.entity.vo;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import lombok.Data;

/**
 * (User)VO实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "UserVO", description = "渲染对象")
public class UserVO implements Serializable {

    private static final long serialVersionUID = 866469696478650883L;

    @Schema(title = "id", description = "${column.comment}")
    private Long id;

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
    private Integer status;

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

    /**
     * 记录创建时间
     */
    @Schema(title = "createTime", description = "记录创建时间")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @Schema(title = "updateTime", description = "记录更新时间")
    private Date updateTime;

    /**
     * 记录创建者
     */
    @Schema(title = "createBy", description = "记录创建者")
    private Long createBy;

    /**
     * 记录更新者
     */
    @Schema(title = "updateBy", description = "记录更新者")
    private Long updateBy;


}

