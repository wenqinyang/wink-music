package com.wink.music.common.resepons;

import com.wink.music.excetion.BaseErrorInfoInterface;
import lombok.Getter;

/**
 * @author LoneWalker
 */
@Getter
public enum ResultCodeEnum implements BaseErrorInfoInterface {

    SUCCESS("200", "成功"),
    BODY_NOT_MATCH("400","请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
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

    /**
     * 业务错误 2001-2999
     */
    INVALID_USER("2001", "该用户没有权限,请注册或者由管理员授权!")
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