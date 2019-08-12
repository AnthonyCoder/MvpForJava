package com.anthony.common.base.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.util.rxlife.RxLifecycleUtils;
import com.anthony.common.util.toast.ToastUtils;
import com.anthony.common.widgets.loading.dialog.LoadingDialog;
import com.uber.autodispose.AutoDisposeConverter;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment  implements BaseView {
    protected Context mContext;
    private LoadingDialog loadingDialog;
    private View rootView;
    protected P mPresenter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        rootView = getView();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getmPresenter()!=null){
            mPresenter = getmPresenter();
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
    public void setStatusBarTranslucent(int alpha) {
        if(mContext instanceof BaseActivity){
            ((BaseActivity)mContext).setStatusBarTranslucent(alpha);
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

    public void routerGo(String path) {
        ARouter.getInstance().build(path).navigation();
    }

    public Fragment getFragment(String path) {
        Fragment routerFragment = (Fragment) ARouter.getInstance().build(path).navigation();
        return routerFragment;
    }

    protected abstract int getLayoutId();

    protected abstract void initView();
    protected abstract void initData();

    protected abstract P getmPresenter();
}
