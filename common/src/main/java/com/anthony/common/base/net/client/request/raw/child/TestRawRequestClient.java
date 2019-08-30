package com.anthony.common.base.net.client.request.raw.child;

import com.anthony.common.base.net.Protocols;
import com.anthony.common.base.net.client.request.raw.RawRequestClient;

import org.jetbrains.annotations.NotNull;

import okhttp3.Cache;

/**
 * 创建时间:2019/8/26
 * 创建人：anthony.wang
 * 功能描述：
 */
public class TestRawRequestClient extends RawRequestClient {
    protected TestRawRequestClient() {
        super();
    }

    public static TestRawRequestClient getInstance() {
        return TestRawRequestClient.SingleHolder.instance;
    }

    private static class SingleHolder {
        public static final TestRawRequestClient instance = new TestRawRequestClient();
    }
    @NotNull
    @Override
    protected String getBaseApiUrl() {
        return Protocols.JIBO_TEST_API_URL;
    }

    @Override
    protected Cache getCache() {
        return null;
    }
}
