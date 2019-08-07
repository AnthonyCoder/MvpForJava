package com.anthony.mvp.widgets.loading.dialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.anthony.mvp.R;
import com.anthony.mvp.widgets.loading.dialog.iml.DialogInterface;
import com.anthony.mvp.widgets.loading.style.view.LVGhost;

/**
 * 创建时间:2019/8/7
 * 创建人：anthony.wang
 * 功能描述：
 */
public class LoadingDialog implements DialogInterface {
    private LVGhost lvGhost;
    private AlertDialog loadingDialog;
    private View rootView;
    public LoadingDialog(@NonNull Context context) {
        loadingDialog = new AlertDialog.Builder(context).create();
        Window window = loadingDialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        rootView = LayoutInflater.from(context).inflate(R.layout.dialog_loading,null);
        loadingDialog.setView(rootView);
        lvGhost = rootView.findViewById(R.id.lv_ghost);
        lvGhost.setViewColor(Color.WHITE);
        lvGhost.setHandColor(Color.BLACK);
    }

    public AlertDialog getLoadingDialog() {
        return loadingDialog;
    }

    public void setLoadingTips(String loadingTips) {
    }

    @Override
    public void show() {
        lvGhost.startAnim();
        loadingDialog.show();
    }

    @Override
    public void dismiss() {
        lvGhost.stopAnim();
        loadingDialog.dismiss();

    }

    @Override
    public void cancel() {
        lvGhost.stopAnim();
        loadingDialog.cancel();

    }

    @Override
    public boolean isShowing() {
        return loadingDialog.isShowing();
    }
}
