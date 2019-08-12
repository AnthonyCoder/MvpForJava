package com.anthony.project.business.view

import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.project.R
import com.anthony.project.business.contact.ProjectContact
import com.anthony.project.business.presenter.ProjectPresenter

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */

@Route(path = ARouterConstants.MENU_FRAGMENT_PROJECT)
class ProjectFragment: BaseFragment<ProjectPresenter>(),ProjectContact.View{
    override fun getmPresenter(): ProjectPresenter = ProjectPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_project

    override fun initView() {
    }

    override fun initData() {
    }


}
