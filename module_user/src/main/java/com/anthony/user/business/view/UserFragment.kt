package com.anthony.project.business.view

import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.user.R
import com.anthony.user.business.contact.UserContact
import com.anthony.user.business.presenter.UserPresenter

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.USER_MAIN_FRAGMENT)
class UserFragment: BaseFragment<UserPresenter>(), UserContact.View{
    override fun getmPresenter(): UserPresenter = UserPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_user

    override fun initView() {
    }

    override fun initData() {
    }


}
