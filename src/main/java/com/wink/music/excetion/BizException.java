package com.wink.music.excetion;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/1/28 00:15
 **/
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    protected String errorCode;
    /**
     * 错误信息
     */
    protected String errorMessage;

    public BizException() {
        super();
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface.getCode());
        this.errorCode = errorInfoInterface.getCode();
        this.errorMessage = errorInfoInterface.getMessage();
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getCode(), cause);
        this.errorCode = errorInfoInterface.getCode();
        this.errorMessage = errorInfoInterface.getMessage();
    }

    public BizException(String errorMsg) {
        super(errorMsg);
        this.errorMessage = errorMsg;
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMessage = errorMsg;
    }

    public BizException(String errorCode, String errorMsg, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMsg;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMessage;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMessage = errorMsg;
    }

    public String getMessage() {
        return errorMessage;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}

