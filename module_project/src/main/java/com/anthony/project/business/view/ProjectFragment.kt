package com.anthony.project.business.view

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.project.R
import com.anthony.project.business.adapter.ProjectPagerAdapter
import com.anthony.project.business.bean.ProjectTreeResult
import com.anthony.project.business.contact.ProjectContact
import com.anthony.project.business.presenter.ProjectPresenter
import com.anthony.project.business.view.data.ProjectPageItem
import kotlinx.android.synthetic.main.fragment_project.*
import java.util.*

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */

@Route(path = ARouterConstants.PROJECT_MAIN_FRAGMENT)
class ProjectFragment : BaseFragment<ProjectPresenter>(), ProjectContact.View {


    override fun getmPresenter(): ProjectPresenter = ProjectPresenter(this)

    override fun getLayoutId(): Int = R.layout.fragment_project

    override fun initView() {
    }

    override fun initData() {
        mPresenter.getProjectTabs()
    }

    override fun onProjectTabs(itemList: MutableList<ProjectTreeResult.DataBean>?) {
        val pagerAdapter = ProjectPagerAdapter(childFragmentManager)
        pagerAdapter.setPages( createProjectPages(itemList))
        vp_project_page.adapter = pagerAdapter
        tl_tab.setViewPager(vp_project_page)

    }

    private fun createProjectPages(projectItems: List<ProjectTreeResult.DataBean>?): List<ProjectPageItem> {
        if (projectItems == null || projectItems.isEmpty()) {
            return ArrayList()
        }
        val projectPageItemList = ArrayList<ProjectPageItem>()
        for (projectItem in projectItems) {
            val projectPageItem = ProjectPageItem(projectItem.id,
                    projectItem.name, ARouter.getInstance().build(ARouterConstants.PROJECT_PAGE_FRAGMENT).withInt("pageId", projectItem.id).navigation() as Fragment)
            projectPageItemList.add(projectPageItem)
        }
        return projectPageItemList
    }

}
