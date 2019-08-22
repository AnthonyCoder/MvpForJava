package com.anthony.common.base.net.client;

import com.anthony.common.base.net.Protocols;
import com.anthony.common.base.net.client.base.FormRequestClient;

import org.jetbrains.annotations.NotNull;

import okhttp3.Cache;

/**
 * 创建时间:2019/8/16
 * 创建人：anthony.wang
 * 功能描述：
 */
public class BaobabFormRequestClient extends FormRequestClient {
    protected BaobabFormRequestClient() {
        super();
    }

    public static BaobabFormRequestClient getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        public static final BaobabFormRequestClient instance = new BaobabFormRequestClient();
    }
    @NotNull
    @Override
    protected String getBaseApiUrl() {
        return Protocols.BAOBAB_BASE_RELEASE_API_URL;
    }

    @Override
    protected Cache getCache() {
        return null;
    }
}
