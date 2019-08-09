package com.anthony.common.base.net.common.observer;

import com.anthony.common.base.net.common.exception.ApiException;
import com.anthony.common.base.net.common.exception.ExceptionEngine;

import io.reactivex.Observer;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public abstract class BaseObserver<T> implements Observer<T> {
    @Override
    public void onError(Throwable e) {
        if(e instanceof ApiException){
            onError((ApiException)e);
        }else{
            onError(new ApiException(e, ExceptionEngine.ERROR.UNKNOWN));
        }
    }
    protected abstract void onError(ApiException ex);
}
