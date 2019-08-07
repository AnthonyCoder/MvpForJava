package com.anthony.mvp.base.net.common.business;

import android.content.Context;

import com.uber.autodispose.AutoDisposeConverter;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface BaseView {
    void showToast(String msg);
    void onError(String errorMsg);
    void onLoadIng(String tip);
    void loadCompleted();
    void loadError(Object errorMsg);
    Context getContext();
    <T>AutoDisposeConverter<T> bindLifecycle();
}
