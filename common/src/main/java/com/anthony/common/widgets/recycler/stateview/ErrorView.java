package com.anthony.common.widgets.recycler.stateview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.anthony.common.R;

/**
 * 创建时间:2019/9/2
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ErrorView extends FrameLayout {
    private View errorView;
    private TextView tvErrorButton;
    public ErrorView(Context context) {
        super(context);
        initView();
    }

    public ErrorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }
    private void initView(){
        errorView = LayoutInflater.from(getContext()).inflate(R.layout.layout_net_error, null);
        addView(errorView);
        tvErrorButton = findViewById(R.id.tv_error_button);
    }
    public void setErrorButtonOnclickListener(OnClickListener clickListener){
        tvErrorButton.setOnClickListener(clickListener);
    }

}
