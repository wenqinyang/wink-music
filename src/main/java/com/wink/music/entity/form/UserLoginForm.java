package com.wink.music.entity.form;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/5 14:25
 **/
@Data
@Schema(title = "UserLoginDTO", description = "传输对象")
public class UserLoginForm implements Serializable {

    private static final long serialVersionUID = -31415438730096761L;

    /**
     * 用户账号
     */
    @NotNull
    @Schema(title = "username", description = "用户账号")
    private String username;

    /**
     * 用户密码
     */
    @NotNull
    @Schema(title = "password", description = "用户密码")
    private String password;

}