package com.anthony.project.business.view

import androidx.recyclerview.widget.GridLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.user.R
import com.anthony.user.adapter.CategoriesAdapter
import com.anthony.user.bean.GetCategoriesResult
import com.anthony.user.business.contact.CategoriesContact
import com.anthony.user.business.presenter.CategoriesPresenter
import kotlinx.android.synthetic.main.fragment_categories.*

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.USER_MAIN_FRAGMENT)
class CategoriesFragment: BaseFragment<CategoriesPresenter>(), CategoriesContact.View{

    private var categoriesAdapter: CategoriesAdapter? =null

    override fun getmPresenter(): CategoriesPresenter = CategoriesPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_categories

    override fun initView() {
        rv_categories.layoutManager = GridLayoutManager(mActivity, 2)
    }

    override fun initData() {
        mPresenter.getCategories()
    }

    override fun setCategories(dataList: MutableList<GetCategoriesResult>?) {
        categoriesAdapter = CategoriesAdapter(dataList)
        rv_categories.adapter = categoriesAdapter
    }

}
