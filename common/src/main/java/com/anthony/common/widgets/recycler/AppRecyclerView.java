package com.anthony.common.widgets.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anthony.common.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/**
 * 创建时间:2019/9/2
 * 创建人：anthony.wang
 * 功能描述：
 */
public class AppRecyclerView extends BaseStateLayout {
    private View appRecyclerView ;
    private SmartRefreshLayout refreshLayout;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    public AppRecyclerView(Context context) {
        super(context);
    }

    public AppRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initView() {
        appRecyclerView = LayoutInflater.from(getContext()).inflate(R.layout.layout_app_recyclerview, null);
        refreshLayout = appRecyclerView.findViewById(R.id.srl_refresh);
        recyclerView = appRecyclerView.findViewById(R.id.rv_app_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }




    @Override
    protected View getNormalView() {
        return appRecyclerView;
    }


    /**
     * -----------------------------代理方法------------------------------
     */
    public void loadOver(){
        refreshLayout.finishRefresh();
        refreshLayout.finishLoadMore();
    }
    public void setOnRefreshListener(OnRefreshListener refreshListener){
        refreshLayout.setOnRefreshListener(refreshListener);
    }

    public void setOnLoadMoreListener(OnLoadMoreListener loadMoreListener){
        refreshLayout.setOnLoadMoreListener(loadMoreListener);
    }
    public void addItemDecoration(RecyclerView.ItemDecoration itemDecoration){
        recyclerView.addItemDecoration(itemDecoration);
    }

    public void setEnableLoadMore(boolean isEnableLoadMore){
        refreshLayout.setEnableLoadMore(isEnableLoadMore);
    }
    public void setAdapter(RecyclerView.Adapter adapter){
        this.adapter = adapter;
        recyclerView.setAdapter(adapter);
        adapter.registerAdapterDataObserver(observer);
        observer.onChanged();
    }
    private RecyclerView.AdapterDataObserver observer = new RecyclerView.AdapterDataObserver() {
        @Override
        public void onChanged() {//设置空view原理都一样，没有数据显示空view，有数据隐藏空view
            if(adapter==null){
                return;
            }
            if (adapter.getItemCount() == 0) {
                setStateType(StateType.EMPTY);
                setEmptyType(emptyType);
            } else {
                setStateType(StateType.NORMAL);
            }
        }

        @Override
        public void onItemRangeChanged(int positionStart, int itemCount) {
            onChanged();
        }

        @Override
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            onChanged();
        }

        @Override
        public void onItemRangeInserted(int positionStart, int itemCount) {
            onChanged();
        }

        @Override
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            onChanged();
        }

        @Override
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            onChanged();
        }
    };
}
