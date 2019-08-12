package com.anthony.common.base.net.client;

import com.anthony.common.base.net.common.observer.AppObserver;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.ResponseBody;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：表单提交的请求类
 */
public class FormRequestClient<M> extends BaseNetClient {

    private FormRequestClient() {
        super();
    }

    public static FormRequestClient getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        public static final FormRequestClient instance = new FormRequestClient();
    }
    public Observable executeGet(String url,Map<String,Object> params, AppObserver<M> observer){
        return requestData(RequestType.GET,null,url,params,observer);
    }
    public Observable executePost(String url,Map<String,Object> params, AppObserver<M> observer){
        return requestData(RequestType.POST,null,url,params,observer);
    }
    public Observable executeGetWithHeader(Map<String,String> headerMap,String url,Map<String,Object> params, AppObserver<M> observer){
        return requestData(RequestType.GET,headerMap,url,params,observer);
    }
    public Observable executePostWithHeader(Map<String,String> headerMap,String url,Map<String,Object> params, AppObserver<M> observer){
        return requestData(RequestType.POST,headerMap,url,params,observer);
    }

    private Observable requestData(RequestType requestType,Map<String,String> headerMap, String url, Map<String, Object> params, AppObserver<M> observer) {
        if (requestType == null) {
            requestType = RequestType.GET;
        }
        if(params == null){
            params = new HashMap<>();
        }
        Observable requestObservable = null;
        Observer<ResponseBody> responseBodyObserver = new Observer<ResponseBody>() {
            @Override
            public void onSubscribe(Disposable d) {
                observer.onSubscribe(d);
            }

            @Override
            public void onNext(ResponseBody responseBody) {
                try {
                    String s = responseBody.string();
                    Gson gson = new Gson();
                    observer.onNext(gson.fromJson(s, observer.getEntityClass()));
                } catch (Exception e) {
                    observer.onError(e);
                }
            }

            @Override
            public void onError(Throwable e) {
                observer.onError(e);
            }

            @Override
            public void onComplete() {
                observer.onComplete();
            }
        };
        switch (requestType) {
            case GET:
                if(headerMap!=null){
                    requestObservable = apiService.executeGetWithHeader(headerMap,url, params)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }else{
                    requestObservable = apiService.executeGet(url, params)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }

                break;
            case POST:
                if(headerMap!=null) {
                    requestObservable = apiService.executePostWithHeader(headerMap,url, params)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }else{
                    requestObservable = apiService.executePost(url, params)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());

                }
                break;
        }
        if (requestObservable != null) {
            requestObservable.subscribe(responseBodyObserver);
        }
        return requestObservable;
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
