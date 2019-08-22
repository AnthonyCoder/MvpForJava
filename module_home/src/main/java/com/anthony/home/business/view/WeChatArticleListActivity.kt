package com.anthony.home.business.view

import android.graphics.Color
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseActivity
import com.anthony.common.widgets.LinearItemDecoration
import com.anthony.home.R
import com.anthony.home.adapter.WeChatArticleAdapter
import com.anthony.home.bean.WxArticleListResult
import com.anthony.home.business.contact.WeChatArticleListContact
import com.anthony.home.business.presenter.WeChatArticleListPresenter
import kotlinx.android.synthetic.main.activity_wechat_article_list.*
import java.util.*

/**
 * 创建时间:2019/8/15
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.HOME_WECHAT_ACTICLELIST_ACTIVITY)
class WeChatArticleListActivity:BaseActivity<WeChatArticleListPresenter>(),WeChatArticleListContact.View {


    private var page =0
    @JvmField
    @Autowired(name = "id",required = true)
    var id = 0

    @JvmField
    @Autowired(name = "title",required = true)
    var title:String? = null

    private var weChatArticleAdapter:WeChatArticleAdapter? =null
    private val dataList = ArrayList<WxArticleListResult.DataBean.DatasBean>()

    override fun getLayoutId() = R.layout.activity_wechat_article_list

    override fun initView() {
        iv_back.setOnClickListener {
            finish()
        }
        srl_wechat.setOnRefreshListener {
            page = 0
            mPresenter.getWeChatArticle(id,page)
        }
        srl_wechat.setOnLoadMoreListener {
            page++
            mPresenter.getWeChatArticle(id,page)
        }
        rv_wechat_article.addItemDecoration(LinearItemDecoration(this)
                .height(0.8f)    // 0.5dp
                .color(Color.parseColor("#aacccccc"))  // color 的 int 值，不是 R.color 中的值
                .margin(12, 12))
        rv_wechat_article.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
    }

    override fun initData() {
        ARouter.getInstance().inject(this)
        title?.let {
            tv_title.text = title
        }
        mPresenter.getWeChatArticle(id, page)
    }

    override fun getmPresenter(): WeChatArticleListPresenter = WeChatArticleListPresenter(this)

    override fun onWeChatArticleList(dataBeanList: MutableList<WxArticleListResult.DataBean.DatasBean>) {
        srl_wechat.finishRefresh()
        srl_wechat.finishLoadMore()
        if(page == 0){
            dataList.clear()
        }
        dataList.addAll(dataBeanList)
        if (weChatArticleAdapter == null) {
            weChatArticleAdapter = WeChatArticleAdapter(dataList)
            weChatArticleAdapter!!.onItemClickListener = BaseQuickAdapter.OnItemClickListener { _, _, position ->
                ARouter.getInstance().build(ARouterConstants.COMMON_X5WEB_ACTIVITY).withString("loadUrl", dataList[position].link).withString("webTitle", dataList[position].title).navigation()
            }
            rv_wechat_article.adapter = weChatArticleAdapter
        } else {
            weChatArticleAdapter!!.setNewData(dataList)
        }
    }
}