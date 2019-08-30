package com.anthony.common.base.net.common.observer;

import com.anthony.common.R;
import com.anthony.common.base.constant.Constant;
import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.base.net.common.exception.ApiException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.logger.Logger;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import io.reactivex.disposables.Disposable;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：用来处理订阅者生命周期中的一些公共逻辑
 */
public abstract class AppObserver<T> extends BaseObserver<T> {
    private BaseView view = null;
    private final String TYPE_CLASS_ENTITY_HEAD = "class";
    private final String TYPE_LIST_ENTITY_HEAD = "java.util.List";
    private final String TYPE_ARRAY_LIST_ENTITY_HEAD = "java.util.ArrayList";

    public AppObserver() {
    }

    public AppObserver(BaseView view) {
        this.view = view;
        onload(null);
    }
    public AppObserver(BaseView view,String loadTips) {
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
        Logger.t(Constant.NET_LOG_TAG).e(String.format(Constant.NET_EXCEPTION_STRING, ex.getDisplayMessage()));
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
    public T getEntityData(String json){//这里是处理Json转换成实例对象或者集合的方法
        Gson gson = new Gson();
        T entityData = null;
        ParameterizedType parameterizedType = ((ParameterizedType) getClass().getGenericSuperclass());
        Type type = parameterizedType.getActualTypeArguments()[0];
        if(type.toString().startsWith(TYPE_CLASS_ENTITY_HEAD)){//首先判断是否是对象形式的data
            Class<T> tClass = (Class<T>) type;
            entityData = gson.fromJson(json, tClass);
        }else if(type.toString().startsWith(TYPE_LIST_ENTITY_HEAD)||type.toString().startsWith(TYPE_ARRAY_LIST_ENTITY_HEAD)){//如果是集合形式的data会走这里的异常 直接转集合就行了
            entityData = gson.fromJson(json, TypeToken.get(type).getType());
        }
        return entityData;
    }
}
