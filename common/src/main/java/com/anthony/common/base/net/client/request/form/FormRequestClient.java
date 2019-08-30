package com.anthony.common.base.net.client.request.form;

import com.anthony.common.base.net.client.base.BaseNetClient;
import com.anthony.common.base.net.common.observer.AppObserver;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：表单提交的请求类
 */
public abstract class FormRequestClient extends BaseNetClient {


    public <T>Observable executeGet(String url,Map<String,Object> params, AppObserver<T> observer){
        return requestData(RequestType.GET,null,url,params,observer);
    }
    public <T>Observable executePost(String url,Map<String,Object> params, AppObserver<T> observer){
        return requestData(RequestType.POST,null,url,params,observer);
    }
    public <T>Observable executeGetWithHeader(Map<String,String> headerMap,String url,Map<String,Object> params, AppObserver<T> observer){
        return requestData(RequestType.GET,headerMap,url,params,observer);
    }
    public <T>Observable executePostWithHeader(Map<String,String> headerMap,String url,Map<String,Object> params, AppObserver<T> observer){
        return requestData(RequestType.POST,headerMap,url,params,observer);
    }

    private <T>Observable requestData(RequestType requestType,Map<String,String> headerMap, String url, Map<String, Object> params, AppObserver<T> observer) {
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
                    String json = responseBody.string();
                    observer.onNext(observer.getEntityData(json));
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
                    requestObservable = apiService.executeGetWithHeader(headerMap,url, params);
                }else{
                    requestObservable = apiService.executeGet(url, params);
                }

                break;
            case POST:
                if(headerMap!=null) {
                    requestObservable = apiService.executePostWithHeader(headerMap,url, params);
                }else{
                    requestObservable = apiService.executePost(url, params);

                }
                break;
        }
        if (requestObservable != null) {
            requestObservable
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(responseBodyObserver);
        }
        return requestObservable;
    }

}
