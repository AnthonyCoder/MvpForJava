package com.anthony.common.base.net.client.request.raw;


import com.anthony.common.base.net.client.base.BaseNetClient;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.common.base.net.common.observer.SubscribeObserver;
import com.anthony.common.base.net.model.BaseRequesModel;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：raw方式的json提交的请求类
 */
public abstract class RawRequestClient<T,M extends BaseRequesModel> extends BaseNetClient {

    public Observable executeGet(String url, M requestModel, AppObserver<T> observer){
        return requestData(RequestType.GET,null,url,requestModel,observer);
    }
    public Observable executePost(String url,M requestModel, AppObserver<T> observer){
        return requestData(RequestType.POST,null,url,requestModel,observer);
    }
    public Observable executeGetWithHeader(Map<String,String> headerMap,String url,M requestModel, AppObserver<T> observer){
        return requestData(RequestType.GET,headerMap,url,requestModel,observer);
    }
    public Observable executePostWithHeader(Map<String,String> headerMap,String url,M requestModel, AppObserver<T> observer){
        return requestData(RequestType.POST,headerMap,url,requestModel,observer);
    }

    private Observable requestData(RequestType requestType,Map<String,String> headerMap, String url,M requestModel, AppObserver<T> observer) {
        if (requestType == null) {
            requestType = RequestType.GET;
        }
        RequestBody requestBody = null;
        if(requestModel != null){
            requestBody = getRequestBodyFromObject(requestModel);
        }
        Observable<ResponseBody> requestObservable = null;
        switch (requestType) {
            case GET:
                if(headerMap!=null){
                    requestObservable = apiService.executeGetWithHeader(headerMap,url, requestBody);
                }else{
                    requestObservable = apiService.executeGet(url, requestBody);
                }

                break;
            case POST:
                if(headerMap!=null) {
                    requestObservable = apiService.executePostWithHeader(headerMap,url, requestBody);
                }else{
                    requestObservable = apiService.executePost(url, requestBody);

                }
                break;
        }
        if (requestObservable != null) {
            if(observer.getAutoDisposeConverter()!=null){
                requestObservable
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnDispose(() -> observer.onDispose())
                        .as(observer.getAutoDisposeConverter())
                        .subscribe(new SubscribeObserver(observer));
            }else{
                requestObservable
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new SubscribeObserver(observer));
            }
        }
        return requestObservable;
    }
}
