package com.anthony.project.business.view

import android.graphics.Color
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseLazyFragment
import com.anthony.common.widgets.LinearItemDecoration
import com.anthony.project.R
import com.anthony.project.business.adapter.ProjectRecyclerAdapter
import com.anthony.project.business.bean.ProjectListResult
import com.anthony.project.business.contact.ProjectPageContact
import com.anthony.project.business.presenter.ProjectPagePresenter
import kotlinx.android.synthetic.main.fragment_project_page.*
import java.util.*

/**
 * 创建时间:2019/8/13
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.PROJECT_PAGE_FRAGMENT)
class ProjectPageFragment: BaseLazyFragment<ProjectPagePresenter>(),ProjectPageContact.View {
    var page =0
    private var projectRecyclerAdapter:ProjectRecyclerAdapter? =null
    private val dataList = ArrayList<ProjectListResult.DataBean.DatasBean>()

    @JvmField
    @Autowired(name = "pageId",required = true)
    var pageId = 0

    override fun lazyLoadData() {
        mPresenter.getProject(pageId,page)
        println(".......pageID:$pageId+ ${this@ProjectPageFragment}")
    }
    override fun getLayoutId() = R.layout.fragment_project_page

    override fun initView() {
        srl_project.setOnRefreshListener {
            page = 0
            mPresenter.getProject(pageId,page)
        }
        srl_project.setOnLoadMoreListener {
            page++
            mPresenter.getProject(pageId,page)
        }
        rv_home_page.addItemDecoration(LinearItemDecoration(mActivity)
                .height(0.8f)    // 0.5dp
                .color(Color.parseColor("#aacccccc"))  // color 的 int 值，不是 R.color 中的值
                .margin(12, 12))
        rv_home_page.layoutManager = LinearLayoutManager(mActivity,RecyclerView.VERTICAL,false)
    }

    override fun initData() {
        ARouter.getInstance().inject(this)
    }
    override fun projectList(modelList: MutableList<ProjectListResult.DataBean.DatasBean>) {
        srl_project.finishRefresh()
        srl_project.finishLoadMore()
        if(page == 0){
            dataList.clear()
        }
        dataList.addAll(modelList)
        if (projectRecyclerAdapter == null) {
            projectRecyclerAdapter = ProjectRecyclerAdapter(dataList)
            projectRecyclerAdapter!!.onItemClickListener = BaseQuickAdapter.OnItemClickListener { _, _, position ->
                gotoWebViewActivity(dataList[position])
            }
            rv_home_page.adapter = projectRecyclerAdapter
        } else {
            projectRecyclerAdapter!!.setNewData(dataList)
        }
    }
    override fun getmPresenter():ProjectPagePresenter = ProjectPagePresenter(this)
    /**
     * 跳转到 WebViewActivity
     */
    private fun gotoWebViewActivity(datasBean: ProjectListResult.DataBean.DatasBean) {
        ARouter.getInstance().build(ARouterConstants.COMMON_X5WEB_ACTIVITY).withString("loadUrl", datasBean.link).withString("webTitle", datasBean.title).navigation()
    }
}