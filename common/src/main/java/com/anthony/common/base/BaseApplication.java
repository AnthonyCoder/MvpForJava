package com.anthony.common.base;


import androidx.multidex.MultiDexApplication;

import com.alibaba.android.arouter.launcher.ARouter;
import com.anthony.common.R;
import com.anthony.common.util.toast.ToastUtils;
import com.anthony.common.util.toast.style.ToastBlackStyle;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

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
    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((context, layout) -> {
            layout.setPrimaryColorsId(R.color.colorPrimary, android.R.color.white);//全局设置主题颜色
            return new ClassicsHeader(context);//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
        });
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator((context, layout) -> {
            //指定为经典Footer，默认是 BallPulseFooter
            return new ClassicsFooter(context).setDrawableSize(20);
        });
    }
    @Override
    public void onCreate() {
        super.onCreate();
        initToast();
        initARouter();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
    private void initARouter(){
//        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
//        }
        ARouter.init(baseApplication); // 尽可能早，推荐在Application中初始化
    }

    private void initToast(){
        ToastUtils.init(baseApplication, new ToastBlackStyle(this));
    }
}
