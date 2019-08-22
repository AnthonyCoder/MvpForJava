package com.anthony.gank.business.view

import androidx.recyclerview.widget.GridLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.gank.R
import com.anthony.gank.bean.GankImageResult
import com.anthony.gank.business.adapter.GankAdapter
import com.anthony.gank.business.contact.GankContact
import com.anthony.gank.business.presenter.GankPresenter
import kotlinx.android.synthetic.main.fragment_gank.*
import java.util.*

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.GANK_MAIN_FRAGMENT)
class GankFragment : BaseFragment<GankPresenter>(), GankContact.View {
    private var page = 1

    private var gankAdapter:GankAdapter? =null
    private val dataList = ArrayList<GankImageResult.ResultsBean>()


    override fun getmPresenter(): GankPresenter = GankPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_gank

    override fun initView() {
        rv_gank.layoutManager = GridLayoutManager(mActivity, 2)
        srl_gank.setOnLoadMoreListener {
            page++
            mPresenter.getGankData(page)
        }
        srl_gank.setOnRefreshListener {
            page = 0
            mPresenter.getGankData(page)
        }
    }

    override fun initData() {
        mPresenter.getGankData(page)
    }

    override fun setGankData(resultsBeanList: MutableList<GankImageResult.ResultsBean>) {
        srl_gank.finishRefresh()//http://ww1.sinaimg.cn/large/0065oQSqly1g2pquqlp0nj30n00yiq8u.jpg
        srl_gank.finishLoadMore()
        if(page == 0){
            dataList.clear()
        }
        dataList.addAll(resultsBeanList)
        if (gankAdapter == null) {
            gankAdapter = GankAdapter(dataList)
            rv_gank.adapter = gankAdapter
        } else {
            gankAdapter!!.setNewData(dataList)
        }
    }

}