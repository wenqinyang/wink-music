package com.wink.music.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * (User)VO实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "UserLoginDTO", description = "传输对象")
public class UserLoginDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -31415438730096761L;

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

}

