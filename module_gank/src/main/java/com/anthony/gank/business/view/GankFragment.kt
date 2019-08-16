package com.anthony.gank.business.view

import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.gank.R
import com.anthony.gank.bean.GankImageResult
import com.anthony.gank.business.contact.GankContact
import com.anthony.gank.business.presenter.GankPresenter
import kotlinx.android.synthetic.main.fragment_gank.*

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.GANK_MAIN_FRAGMENT)
class GankFragment : BaseFragment<GankPresenter>(), GankContact.View {
    var page =0
    override fun setGankData(resultsBeanList: MutableList<GankImageResult.ResultsBean>?) {
    }

    override fun getmPresenter(): GankPresenter = GankPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_gank

    override fun initView() {
        rv_gank.setHasFixedSize(true)
        rv_gank.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

    }

    override fun initData() {
        mPresenter.getGankData(page)
    }


}