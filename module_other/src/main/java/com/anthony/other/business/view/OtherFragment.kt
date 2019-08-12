package com.anthony.other.business.view

import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.other.R
import com.anthony.other.business.contact.OtherContact
import com.anthony.other.business.presenter.OtherPresenter

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.OTHER_MAIN_FRAGMENT)
class OtherFragment : BaseFragment<OtherPresenter>(), OtherContact.View {
    override fun getmPresenter(): OtherPresenter = OtherPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_other

    override fun initView() {
    }

    override fun initData() {
    }


}