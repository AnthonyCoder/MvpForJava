package com.anthony.common.base.view;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.util.StatusBarUtil;
import com.anthony.common.util.rxlife.RxLifecycleUtils;
import com.anthony.common.util.toast.ToastUtils;
import com.anthony.common.widgets.loading.dialog.LoadingDialog;
import com.uber.autodispose.AutoDisposeConverter;

/**
 * 创建时间:2019/8/7
 * 创建人：anthony.wang
 * 功能描述：
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    private Context mContext;
    private LoadingDialog loadingDialog;
    private View rootView;
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setStatusBarColor();
        rootView = LayoutInflater.from(mContext).inflate(getLayoutId(), null);
        setContentView(rootView);
        if (getmPresenter() != null) {
            mPresenter = getmPresenter();
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//黑色
        }
        initView();
        initData();
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
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            loadingDialog = null;
        }
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

    public void routerGo(String path) {
        ARouter.getInstance().build(path).navigation();
    }

    public Fragment getFragment(String path) {
        Fragment routerFragment = (Fragment) ARouter.getInstance().build(path).navigation();
        return routerFragment;
    }

    public void setStatusBarColor() {
        StatusBarUtil.setColor(this, getResources().getColor(android.R.color.white), 0);
    }

    public void setStatusBarTranslucent(int alpha) {
        StatusBarUtil.setTranslucentForImageViewInFragment(this, alpha, null);
    }

    public void setStatusBarTextColor(Window window, boolean lightStatusBar) {
        // 设置状态栏字体颜色 白色与深色
        View decor = window.getDecorView();
        int ui = decor.getSystemUiVisibility();
        ui |= View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (lightStatusBar) {
                ui |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            } else {
                ui &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            }
        }
        decor.setSystemUiVisibility(ui);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract P getmPresenter();
}
