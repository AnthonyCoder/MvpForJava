package com.anthony.common.base.net.common.observer;

import android.util.Log;

import com.anthony.common.R;
import com.anthony.common.base.constant.Constant;
import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.base.net.common.exception.ApiException;
import com.anthony.common.base.net.model.BaseResponseModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.logger.Logger;
import com.uber.autodispose.AutoDisposeConverter;

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

    private boolean needBindLifeCycle = true;//标识是否需要绑定view生命周期
    private String loadTips;

    public AppObserver() {
    }

    public AppObserver(BaseView view) {
        this.view = view;
    }

    public AppObserver(BaseView view, String loadTips) {
        this.view = view;
        this.loadTips = loadTips;
    }

    public AppObserver(BaseView view, boolean needBindLifeCycle) {
        this.view = view;
        this.needBindLifeCycle = needBindLifeCycle;
    }

    public AppObserver(BaseView view, String loadTips, boolean needBindLifeCycle) {
        this.view = view;
        this.loadTips = loadTips;
        this.needBindLifeCycle = needBindLifeCycle;
    }


    //获取绑定view层生命周期的 AutoDisposeConverter 实例
    public <R> AutoDisposeConverter<R> getAutoDisposeConverter() {
        if (view != null && needBindLifeCycle && view.bindLifecycle() != null) {
            return view.bindLifecycle();
        }
        return null;
    }

    public BaseView getView() {
        return view;
    }
    public void onDispose(){//被取消订阅后会被调用
        if (view != null) {
            view.loadCompleted();
        }
    }
    @Override
    protected void onError(ApiException ex) {
        Logger.t(Constant.NET_LOG_TAG).e(String.format(Constant.NET_EXCEPTION_STRING, ex.getDisplayMessage()));
        if (view != null) {
            view.loadError(ex);
        }

    }

    @Override
    public void onNext(T t) {//这里可以对业务码做统一的一层过滤处理，而且这里可以持有view层实例，支持某一业务码触发view层更新
        if(t instanceof BaseResponseModel){//如果最终解析出来的数据 属于BaseResponseModel类或者他的子类调用这里
            if(((BaseResponseModel) t).getErrorCode() == 300){
                Log.d("打印", "onNext:code 300 ");
            }
        }
    }

    @Override
    public void onSubscribe(Disposable d) {
        if (loadTips != null && view != null) {
            if(view!=null){
                view.onLoadIng(loadTips == null ? view.getContext().getString(R.string.on_loading) : loadTips);
            }

        }
    }

    @Override
    public void onComplete() {
        if (view != null) {
            view.loadCompleted();
        }

    }

    public T getEntityData(String json) {//这里是处理Json转换成实例对象或者集合的方法
        Gson gson = new Gson();
        T entityData = null;
        ParameterizedType parameterizedType = ((ParameterizedType) getClass().getGenericSuperclass());
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type.toString().startsWith(TYPE_CLASS_ENTITY_HEAD)) {//首先判断是否是对象形式的data
            Class<T> tClass = (Class<T>) type;
            entityData = gson.fromJson(json, tClass);
        } else if (type.toString().startsWith(TYPE_LIST_ENTITY_HEAD) || type.toString().startsWith(TYPE_ARRAY_LIST_ENTITY_HEAD)) {//如果是集合形式的data会走这里的异常 直接转集合就行了
            entityData = gson.fromJson(json, TypeToken.get(type).getType());
        }
        return entityData;
    }
}
