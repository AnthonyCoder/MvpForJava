package com.anthony.common.base.constant;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：常量池
 */
public class Constant {
    //网络交互Logger子Tag
    public final static String NET_LOG_TAG = "网络日志";
    public static final String NET_REQUEST_HEADER = "请求头信息------------->%s";
    public static final String NET_REQUEST_STRING = "发起请求： 请求方式 = %s\n请求url = %s\n请求体 = %s";
    public static final String NET_RESPONSE_HEADER = "响应头信息------------->%s";
    public static final String NET_RESPONSE_SUCESS_STRING = "{\"响应状态\":\"成功\", \"对应请求\":\"%s\",\"响应体\" : %s}";
    public static final String NET_RESPONSE_FAIL_STRING = "响应失败： 对应请求url = %s\n异常信息 = %s";
    public static final String NET_EXCEPTION_STRING = "响应异常：异常信息 = %s";
    public static final String HTTP_CACHE = "HttpCache";
}
