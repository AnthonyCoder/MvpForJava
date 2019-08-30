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
public class GankFormRequestClient extends FormRequestClient {
    protected GankFormRequestClient() {
        super();
    }

    public static GankFormRequestClient getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        public static final GankFormRequestClient instance = new GankFormRequestClient();
    }
    @NotNull
    @Override
    protected String getBaseApiUrl() {
        return Protocols.GANK_BASE_RELEASE_API_URL;
    }

    @Override
    protected Cache getCache() {
        return null;
    }
}
