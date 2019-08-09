package com.anthony.common.base.net.client;


import org.jetbrains.annotations.NotNull;

import okhttp3.Cache;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：json提交的请求类
 */
public class JsonRequestClient extends BaseNetClient{
    private JsonRequestClient() {
        super();
    }
    public static JsonRequestClient getInstance() {
        return JsonRequestClient.SingleHolder.instance;
    }

    private static class SingleHolder {
        public static final JsonRequestClient instance = new JsonRequestClient();
    }
    @NotNull
    @Override
    protected String getBaseApiUrl() {
        return defaultBaseUrl;
    }

    @Override
    protected Cache getCache() {
        return null;
    }
}
