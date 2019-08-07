package com.anthony.mvp.base.net.client;


import com.anthony.mvp.base.BaseApplication;
import com.anthony.mvp.base.constant.Constant;
import com.anthony.mvp.base.net.Protocols;
import com.anthony.mvp.base.net.api.ApiService;
import com.anthony.mvp.base.net.client.intercept.NetLogInterceptor;
import com.anthony.mvp.base.net.client.ssl.SSLFactory;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：网络请求顶层抽象类 做约束和规范
 */
public abstract class BaseNetClient{
    @NotNull
    protected abstract String getBaseApiUrl();//服务器地址

    protected abstract Cache getCache();//缓存对象
    protected Cache defaultCahe;
    protected String defaultBaseUrl = Protocols.JUHE_BASE_RELEASE_API_URL;
    private static final int HTTP_TIMEOUT_SECONDS = 90;//超时时间（s）
    private static final int READ_TIMEOUT_SECONDS = 90;//超时时间（s）
    protected static final long DEFAULT_HTTP_CACHE_LONG_SIZE = 1024 * 1024 * 100;//最大缓存大小
    private Retrofit mRetrofit;
    protected ApiService apiService;

    protected BaseNetClient() {
        defaultCahe = new Cache(new File(BaseApplication.getApplication().getCacheDir(), Constant.HTTP_CACHE),DEFAULT_HTTP_CACHE_LONG_SIZE);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().cache(getCache()==null?defaultCahe:getCache())
                .sslSocketFactory(SSLFactory.getDefaultSSLSocketFactory(),SSLFactory.getX509TrustManager())
                .hostnameVerifier((hostname, session) -> true)//直接设置证书验证结果 若证书验证不通过 设置true即可通过
                .retryOnConnectionFailure(true)//设置失败重连
                .addInterceptor(new NetLogInterceptor())//设置网络日志
                .connectTimeout(HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .readTimeout(READ_TIMEOUT_SECONDS,TimeUnit.SECONDS)
                .proxy(Proxy.NO_PROXY)//禁用代理使用
                .build();
        mRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(getBaseApiUrl())
                .build();
        //通过反射获得 T.class
        apiService = mRetrofit.create(ApiService.class);
    }
    public enum RequestType {
        GET, POST
    }

}
