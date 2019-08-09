package com.anthony.common.base.view;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.util.rxlife.RxLifecycleUtils;
import com.anthony.common.util.toast.ToastUtils;
import com.anthony.common.widgets.loading.dialog.LoadingDialog;
import com.uber.autodispose.AutoDisposeConverter;

/**
 * 创建时间:2019/8/7
 * 创建人：anthony.wang
 * 功能描述：
 */
public class BaseActivity extends AppCompatActivity implements BaseView {
    private Context mContext;
    private LoadingDialog loadingDialog;

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
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog(mContext);
        }
        loadingDialog.setLoadingTips(tip);
        if (!loadingDialog.isShowing()) {
            loadingDialog.show();
        }

    }

    @Override
    public void loadCompleted() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            loadingDialog = null;
        }
    }

    @Override
    public void loadError(Object errorMsg) {
        ToastUtils.show("请求出错");
    }

    @Override
    public Context getContext() {
        return mContext;
    }

    @Override
    public <T> AutoDisposeConverter<T> bindLifecycle() {
        return RxLifecycleUtils.bindLifecycle(this);
    }
}
