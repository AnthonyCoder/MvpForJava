package com.anthony.common.base.net.common.observer;

import com.anthony.common.R;
import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.base.net.common.exception.ApiException;

import java.lang.reflect.ParameterizedType;

import io.reactivex.disposables.Disposable;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：用来处理订阅者生命周期中的一些公共逻辑
 */
public abstract class AppObserver<T> extends BaseObserver<T> {
    private BaseView view = null;

    public AppObserver() {
    }

    public <V extends BaseView>AppObserver(V view) {
        this.view = view;
        onload(null);
    }
    public <V extends BaseView>AppObserver(V view,String loadTips) {
        this.view = view;
        onload(loadTips);
    }
    private void onload(String loadTips){
        if(view!=null){
            view.onLoadIng(loadTips==null?view.getContext().getString(R.string.on_loading):loadTips);
        }
    }

    @Override
    protected void onError(ApiException ex) {
        if(view!=null){
            view.loadError(ex);
        }

    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onComplete() {
        if(view!=null){
            view.loadCompleted();
        }

    }

    public Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
