package com.test.Enums;

/**
 * 错误码枚举类
 */
public enum ErrorEnum {
    NOT_PALINDROME(101, "不是回文序列"),
    FAIL_TO_MEET_CONDITION_SECOND(102, "不满足条件二"),
    NOT_FIND(103, "未找到满足条件的斐波那契回文序列");

    private Integer errorCode;
    private String msg;

    ErrorEnum(Integer errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
