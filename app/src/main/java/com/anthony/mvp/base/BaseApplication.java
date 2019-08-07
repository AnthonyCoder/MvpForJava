package com.anthony.mvp.base;


import androidx.multidex.MultiDexApplication;

import com.anthony.mvp.util.toast.ToastUtils;
import com.anthony.mvp.util.toast.style.ToastBlackStyle;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public class BaseApplication extends MultiDexApplication {
    private static  BaseApplication baseApplication;
    public BaseApplication(){
        baseApplication = this;
    }
    public static BaseApplication getApplication(){
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initToast();
    }

    private void initToast(){
        ToastUtils.init(baseApplication, new ToastBlackStyle(this));
    }
}
