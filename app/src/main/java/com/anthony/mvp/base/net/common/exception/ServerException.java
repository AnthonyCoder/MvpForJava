package com.anthony.mvp.base.net.common.exception;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ServerException extends Exception {

    /**
     * 错误的请求KEY
     */
    public final int SERVER_ERROR_ERROR_KEY = 10001;

    /**
     * 	该KEY无请求权限
     */
    public final int SERVER_ERROR_KEY_NO_PERMISSION = 10002;

    /**
     * 	KEY过期
     */
    public final int SERVER_ERROR_KEY_OUT_TIME = 10003;

    private int errCode = 0;

    /**
     *
     * @param errCode  错误码
     * @param msg    错误信息
     */
    public ServerException(int errCode, String msg) {
        super(msg);
        this.errCode = errCode;
    }

    public int getErrCode() {
        return errCode;
    }
}
