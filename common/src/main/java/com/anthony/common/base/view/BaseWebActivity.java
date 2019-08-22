package com.anthony.common.base.view;

import android.graphics.PixelFormat;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.widgets.webview.X5WebView;

/**
 * 创建时间:2019/8/14
 * 创建人：anthony.wang
 * 功能描述：
 */
public abstract class BaseWebActivity<P extends BasePresenter>  extends BaseActivity<P> {
    protected abstract String getLoadUrl();
    protected abstract X5WebView getX5WebView();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        if(getLoadUrl()!=null&&getX5WebView()!=null){
            getX5WebView().loadUrl(getLoadUrl());
        }
    }
}
