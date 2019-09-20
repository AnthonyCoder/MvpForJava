package com.anthony.home.business.view

import com.anthony.common.base.net.common.business.BasePresenter
import com.anthony.common.base.net.common.business.BaseView
import com.anthony.common.base.view.BaseActivity
import com.anthony.home.R

/**
 * 创建时间:2019/9/20
 * 创建人：anthony.wang
 * 功能描述：
 */
class AloneActivity : BaseActivity<BasePresenter<BaseView>>() {
    override fun getLayoutId(): Int  = R.layout.activity_alone

    override fun initView() {
    }

    override fun initData() {
    }

    override fun getmPresenter(): BasePresenter<BaseView> = BasePresenter(this)
}
