package yzm.example.vue.admin.service.base.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * @author yzm
 * @date 2022/2/22 - 21:04
 */
public class BaseException extends NestedRuntimeException {

    /**
     * 响应的HTTP状态码； 为了兼容客户端某些工具无法获取HTTP状态码；
     */
    private final int httpStatusCode = 500;

    /**
     * 错误码，可以用于获取此错误的相关信息；
     */
    private String errCode;

    public BaseException(String errCode, String message) {
        this(errCode, message, null);
    }

    public BaseException(String errCode, String message, Throwable cause) {
        super(message, cause);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return this.errCode;
    }
}
