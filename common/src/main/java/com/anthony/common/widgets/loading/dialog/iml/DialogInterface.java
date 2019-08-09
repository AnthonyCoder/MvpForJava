package com.anthony.common.widgets.loading.dialog.iml;

/**
 * 创建时间:2019/8/7
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface DialogInterface {
    void show();
    void dismiss();
    void cancel();
    boolean isShowing();
}
