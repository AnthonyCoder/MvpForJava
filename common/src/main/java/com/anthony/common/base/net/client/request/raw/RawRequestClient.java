package com.anthony.common.base.net.client.request.raw;


import com.anthony.common.base.net.client.base.BaseNetClient;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.common.base.net.model.BaseRequesModel;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：raw方式的json提交的请求类
 */
public abstract class RawRequestClient<M,T extends BaseRequesModel> extends BaseNetClient {

    public Observable executeGet(String url, T requestModel, AppObserver<M> observer){
        return requestData(RequestType.GET,null,url,requestModel,observer);
    }
    public Observable executePost(String url,T requestModel, AppObserver<M> observer){
        return requestData(RequestType.POST,null,url,requestModel,observer);
    }
    public Observable executeGetWithHeader(Map<String,String> headerMap,String url,T requestModel, AppObserver<M> observer){
        return requestData(RequestType.GET,headerMap,url,requestModel,observer);
    }
    public Observable executePostWithHeader(Map<String,String> headerMap,String url,T requestModel, AppObserver<M> observer){
        return requestData(RequestType.POST,headerMap,url,requestModel,observer);
    }

    private Observable requestData(RequestType requestType,Map<String,String> headerMap, String url,T requestModel, AppObserver<M> observer) {
        if (requestType == null) {
            requestType = RequestType.GET;
        }
        RequestBody requestBody = null;
        if(requestModel != null){
            requestBody = getRequestBodyFromObject(requestModel);
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
                    requestObservable = apiService.executeGetWithHeader(headerMap,url, requestBody)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }else{
                    requestObservable = apiService.executeGet(url, requestBody)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }

                break;
            case POST:
                if(headerMap!=null) {
                    requestObservable = apiService.executePostWithHeader(headerMap,url, requestBody)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }else{
                    requestObservable = apiService.executePost(url, requestBody)
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
}
