package com.anthony.project.business.view

import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.mvp.tree.R
import com.anthony.mvp.tree.business.contact.TreeContact
import com.anthony.mvp.tree.business.presenter.TreePresenter

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.MENU_FRAGMENT_TREE)
class TreeFragment: BaseFragment<TreePresenter>(), TreeContact.View{
    override fun getmPresenter(): TreePresenter = TreePresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_tree

    override fun initView() {
    }

    override fun initData() {
    }


}
