package com.anthony.gank.business.view

import androidx.recyclerview.widget.GridLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseActivity
import com.anthony.gank.R
import com.anthony.gank.bean.GankImageResult
import com.anthony.gank.business.adapter.GankAdapter
import com.anthony.gank.business.contact.TestContact
import com.anthony.gank.business.presenter.TestPresenter
import kotlinx.android.synthetic.main.activity_m.*
/**
 *  自己练习的使用mvp+kotlin;
 *  王志强
 *  2019-09-30
 */

@Route(path = ARouterConstants.GANK_MAIN_TESTACTIVITY)
class TestActivity : BaseActivity<TestPresenter>(), TestContact.View {
    private var page = 1
    private var gankAdapter: GankAdapter? = null
    private val dataList = ArrayList<GankImageResult.ResultsBean>()

    override fun setData(resultsBeanList: MutableList<GankImageResult.ResultsBean>) {
        srl_gank.finishLoadMore()
        srl_gank.finishRefresh()
        if (page == 0) {
            dataList.clear()
        }
        dataList.addAll(resultsBeanList)
        gankAdapter!!.setNewData(dataList)
    }

    override fun getLayoutId(): Int = R.layout.activity_m

    override fun initView() {
        rv_gank.layoutManager = GridLayoutManager(this, 2)
        gankAdapter = GankAdapter(dataList)
        rv_gank.adapter = gankAdapter
    }

    override fun initData() {
        mPresenter.getData(page)

        srl_gank.setOnRefreshListener {
            page = 0
            mPresenter.getData(page)
        }
        srl_gank.setOnLoadMoreListener() {
            page++
            mPresenter.getData(page)
        }
    }

    override fun getmPresenter(): TestPresenter = TestPresenter(this)

}
