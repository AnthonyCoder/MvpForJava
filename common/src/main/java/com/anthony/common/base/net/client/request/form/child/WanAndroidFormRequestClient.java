package com.anthony.common.base.net.client.request.form.child;

import com.anthony.common.base.net.Protocols;
import com.anthony.common.base.net.client.request.form.FormRequestClient;

import org.jetbrains.annotations.NotNull;

import okhttp3.Cache;

/**
 * 创建时间:2019/8/16
 * 创建人：anthony.wang
 * 功能描述：
 */
public class WanAndroidFormRequestClient extends FormRequestClient {
    protected WanAndroidFormRequestClient() {
        super();
    }

    public static WanAndroidFormRequestClient getInstance() {
        return WanAndroidFormRequestClient.SingleHolder.instance;
    }

    private static class SingleHolder {
        public static final WanAndroidFormRequestClient instance = new WanAndroidFormRequestClient();
    }
    @NotNull
    @Override
    protected String getBaseApiUrl() {
        return Protocols.WAN_ANDROID_BASE_RELEASE_API_URL;
    }

    @Override
    protected Cache getCache() {
        return null;
    }
}
