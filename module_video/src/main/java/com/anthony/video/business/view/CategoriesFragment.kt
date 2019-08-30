package com.anthony.project.business.view

import androidx.recyclerview.widget.GridLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.video.R
import com.anthony.video.adapter.CategoriesAdapter
import com.anthony.video.bean.GetCategoriesResult
import com.anthony.video.business.contact.CategoriesContact
import com.anthony.video.business.presenter.CategoriesPresenter
import kotlinx.android.synthetic.main.fragment_categories.*
import java.util.*

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.USER_MAIN_FRAGMENT)
class CategoriesFragment : BaseFragment<CategoriesPresenter>(), CategoriesContact.View {

    private var categoriesAdapter: CategoriesAdapter? = null
    private val dataList = ArrayList<GetCategoriesResult>()

    override fun getmPresenter(): CategoriesPresenter = CategoriesPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_categories

    override fun initView() {
        rv_categories.layoutManager = GridLayoutManager(mActivity, 2)
    }

    override fun initData() {
        mPresenter.getCategories()
    }

    override fun setCategories(list: MutableList<GetCategoriesResult>) {
        dataList.clear()
        dataList.addAll(list)
        categoriesAdapter = CategoriesAdapter(dataList)
        categoriesAdapter!!.onItemClickListener = BaseQuickAdapter.OnItemClickListener { adapter, view, position ->
            ARouter.getInstance().build(ARouterConstants.KAIYAN_VIDEOLIST_ACTIVITY).withInt("id", dataList[position].id).navigation()
        }
        rv_categories.adapter = categoriesAdapter
    }

}
