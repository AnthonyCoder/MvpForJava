package com.anthony.common.base.net.common.observer;


import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;

/**
 * 创建时间:2019/9/27
 * 创建人：anthony.wang
 * 功能描述：
 */
public class SubscribeObserver implements Observer<ResponseBody> {
    private AppObserver appObserver;
    public SubscribeObserver(AppObserver appObserver){
        this.appObserver = appObserver;
    }
    @Override
    public void onSubscribe(Disposable d) {
        appObserver.onSubscribe(d);
    }

    @Override
    public void onNext(ResponseBody responseBody) {
        try {
            String json = responseBody.string();
            appObserver.onNext(appObserver.getEntityData(json));
        } catch (Exception e) {
            appObserver.onError(e);
        }
    }

    @Override
    public void onError(Throwable e) {
        appObserver.onError(e);
    }

    @Override
    public void onComplete() {
        appObserver.onComplete();
    }
}
