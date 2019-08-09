package com.anthony.common.base.net.common.exception;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ApiException extends Exception {
    private int code;
    //用于展示的异常信息
    private String displayMessage;

    public ApiException(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
        if(code == ExceptionEngine.ERROR.UNKNOWN){
            displayMessage = throwable.getMessage();
        }

    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public int getCode() {
        return code;
    }
}
