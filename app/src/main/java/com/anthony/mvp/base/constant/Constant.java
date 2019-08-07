package com.anthony.mvp.base.constant;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：常量池
 */
public class Constant {
    //网络交互Logger子Tag
    public final static String NET_LOG_TAG = "网络请求日志";
    public static final String NET_REQUEST_STRING = "网络请求： 请求方法 = %s\n请求url = %s\n请求体 = %s";
    public static final String NET_RESPONSE_SUCESS_STRING = "响应成功： 对应请求url = %s\n响应体 = %s";
    public static final String NET_RESPONSE_FAIL_STRING = "响应失败： 对应请求url = %s\n异常信息 = %s";
    public static final String HTTP_CACHE = "HttpCache";
}
