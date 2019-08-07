package com.anthony.mvp.base.view;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anthony.mvp.base.net.common.business.BaseView;
import com.anthony.mvp.util.rxlife.RxLifecycleUtils;
import com.anthony.mvp.util.toast.ToastUtils;
import com.uber.autodispose.AutoDisposeConverter;

/**
 * 创建时间:2019/8/7
 * 创建人：anthony.wang
 * 功能描述：
 */
public class BaseActivity extends AppCompatActivity implements BaseView {
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

    }

    @Override
    public void showToast(String msg) {
        ToastUtils.show(msg);
    }

    @Override
    public void onError(String errorMsg) {
        ToastUtils.show(errorMsg);
    }

    @Override
    public void onLoadIng(String tip) {

    }

    @Override
    public void loadCompleted() {

    }

    @Override
    public void loadError(Object errorMsg) {

    }

    @Override
    public Context getContext() {
        return mContext;
    }

    @Override
    public <T>AutoDisposeConverter<T> bindLifecycle() {
        return RxLifecycleUtils.bindLifecycle(this);
    }
}
