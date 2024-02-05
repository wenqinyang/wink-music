package com.wink.music.common.resepons;

import com.wink.music.excetion.BaseErrorInfoInterface;
import lombok.Getter;

/**
 * @author LoneWalker
 */
@Getter
public enum ResultCodeEnum implements BaseErrorInfoInterface {

    SUCCESS("200", "成功"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    SERVER_BUSY("503","服务器正忙，请稍后再试!"),
    /**
     * 未知错误
     */
    FAIL("-1", "操作失败"),
    /**
     * 参数错误：1001-1999
     */
    PARAM_IS_INVALID("1001", "参数无效"),
    PARAM_TYPE_ERROR("1002", "参数类型错误"),
    PARAM_BODY_NOT_MATCH("1003","请求参数数据格式不符!"),

    /**
     * 业务错误 2001-2999
     */
    USER_NOT_EXIST("2000", "用户不存在"),
    USER_USERNAME_OR_PASSWORD_ERROR("2001", "用户名或者密码错误"),
    USER_LOCKED("2002", "用户被锁定"),
    USER_INVALID("2003", "该用户没有权限,请注册或者由管理员授权"),
    USER_TOKEN_EXPIRE("2004", "token过期，请重新登录"),
    USER_LOGIN_FAIL("2005", "用户登陆失败!"),
    USER_SIGNATURE_NOT_MATCH("2006","请求的数字签名不匹配!"),
    ;

    /**
     * 状态码
     */
    private final String code;
    /**
     * 提示信息
     */
    private final String message;

    ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}