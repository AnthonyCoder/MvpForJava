package com.anthony.common.util.toast;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/ToastUtils
 *    time   : 2018/11/03
 *    desc   : Toast 基类
 */
public class BaseToast extends Toast {

    /** 吐司消息 View */
    private TextView mMessageView;

    public BaseToast(Application application) {
        super(application);
    }

    @Override
    public void setView(View view) {
        super.setView(view);
        mMessageView = getMessageView(view);
    }

    @Override
    public void setText(CharSequence s) {
        mMessageView.setText(s);
    }

    /**
     * 智能获取用于显示消息的 TextView
     */
    private static TextView getMessageView(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        } else if (view.findViewById(android.R.id.message) instanceof TextView) {
            return ((TextView) view.findViewById(android.R.id.message));
        } else if (view instanceof ViewGroup) {
            TextView textView = findTextView((ViewGroup) view);
            if (textView != null) {
                return textView;
            }
        }
        // 如果设置的布局没有包含一个 TextView 则抛出异常，必须要包含一个 TextView 作为 MessageView
        throw new IllegalArgumentException("The layout must contain a TextView");
    }

    /**
     * 递归获取 ViewGroup 中的 TextView 对象
     */
    private static TextView findTextView(ViewGroup group) {
        for (int i = 0; i < group.getChildCount(); i++) {
            View view = group.getChildAt(i);
            if ((view instanceof TextView)) {
                return (TextView) view;
            } else if (view instanceof ViewGroup) {
                TextView textView = findTextView((ViewGroup) view);
                if (textView != null) {
                    return textView;
                }
            }
        }
        return null;
    }
}