package com.test.exception;

import com.test.Enums.ErrorEnum;

/**
 * 业务异常类
 */
public class BusinessException extends Exception {
    private Integer code;
    private String msg;

    public BusinessException(Integer errorCode, String message) {
        this.code = errorCode;
        this.msg = message;
    }

    public BusinessException(ErrorEnum errorEnum) {
        this.code = errorEnum.getErrorCode();
        this.msg = errorEnum.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
