package com.anthony.home.business.view

import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.adapter.grid.GridRecyclerAdapter
import com.anthony.common.adapter.grid.GridViewPager
import com.anthony.common.adapter.grid.GridViewPagerAdapter
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.common.util.StatusBarUtil
import com.anthony.common.widgets.LinearItemDecoration
import com.anthony.home.R
import com.anthony.home.adapter.HomeArticleAdapter
import com.anthony.home.bean.BannerResult
import com.anthony.home.bean.HomeArticleResult
import com.anthony.home.bean.WeChatAuthorResult
import com.anthony.home.business.contact.HomeContact
import com.anthony.home.business.presenter.HomePresenter
import com.anthony.home.imageloader.GlideImageLoader
import com.youth.banner.Banner
import com.youth.banner.transformer.ZoomOutSlideTransformer
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.HOME_MAIN_FRAGMENT)
class HomeFragment : BaseFragment<HomePresenter>(), HomeContact.View {

    private lateinit var headerView: View
    private lateinit var banner: Banner
    private lateinit var gridViewPager: GridViewPager
    private val colors = intArrayOf(-0x13bf86, -0x54b844, -0xd6490a, -0x81a83e, -0x1dbf8d, -0x117ca0, -0xd95966, -0x10acb0, -0xd450d5, -0x58da)
    private var page = 0
    private var searchLayoutHeight = 0
    private var bannerHeight = 0
    override fun getLayoutId(): Int = R.layout.fragment_home
    private val dataList = ArrayList<HomeArticleResult.DataBean.DatasBean>()
    private var homeArticleAdapter: HomeArticleAdapter? = null


    override fun initView() {
        headerView = LayoutInflater.from(mActivity).inflate(R.layout.layout_home_header, null)
        banner = headerView.findViewById(R.id.banner_home)
        banner.setPageTransformer(false,ZoomOutSlideTransformer())
        setStatusBarTranslucent(0)
        val lp = rl_search_header.layoutParams as RelativeLayout.LayoutParams
        lp.topMargin = StatusBarUtil.getStatusBarHeight(mActivity)
        gridViewPager = headerView.findViewById(R.id.gvp_viewpager)
        srl_home.setOnRefreshListener {
            page = 0
            mPresenter.getHomeArticles(page)
        }
        srl_home.setOnLoadMoreListener {
            page++
            mPresenter.getHomeArticles(page)
        }
        rv_home.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val scrollOffset = recyclerView.computeVerticalScrollOffset()
                if (searchLayoutHeight == 0) {
                    searchLayoutHeight = rl_search_header.measuredHeight
                }
                if (bannerHeight == 0) {
                    bannerHeight = banner.measuredHeight
                }
                val maxOffset = bannerHeight - StatusBarUtil.getStatusBarHeight(mActivity) - searchLayoutHeight
                if (scrollOffset <= maxOffset) {
                    val percent = scrollOffset * 1.0f / maxOffset
                    rl_search_header.background.mutate().alpha = (255 * percent).toInt()
                    tv_home_login.setTextColor(resources.getColor(android.R.color.white))
                    iv_home_logo.setImageResource(R.drawable.ic_home_logo_white)
                    tv_home_search.background = resources.getDrawable(R.drawable.shape_home_input)
                    setStatusBarTranslucent((255 * percent).toInt())
                } else {
                    tv_home_login.setTextColor(resources.getColor(R.color.colorAccent))
                    iv_home_logo.setImageResource(R.drawable.ic_home_logo_black)
                    tv_home_search.background = resources.getDrawable(R.drawable.shape_home_input_dark)
                }
            }
        })
    }

    override fun initData() {
        rv_home.layoutManager = LinearLayoutManager(mActivity, RecyclerView.VERTICAL, false)
        rv_home.addItemDecoration(LinearItemDecoration(mActivity).height(8f).color(Color.parseColor("#66dddddd")))
        banner.setImageLoader(GlideImageLoader())
        mPresenter.getBanner()
        mPresenter.getWeChatAuthors()
        mPresenter.getHomeArticles(page)
    }


    override fun getmPresenter(): HomePresenter = HomePresenter(this)

    override fun onBanner(bannerResults: MutableList<BannerResult.DataBean>?) {
        bannerResults?.let {
            if (it.size > 0) {
                val images = getImages(bannerResults)
                //设置图片集合
                banner.setImages(images)
                banner.setOnBannerListener { position ->
                    val bannerResult = bannerResults[position]
                    gotoWebViewActivityFromBanner(bannerResult)
                }
                //banner设置方法全部调用完毕时最后调用
                banner.start()
            }
        }
    }


    private fun getImages(bannerResults: List<BannerResult.DataBean>?): List<String> {
        val list = ArrayList<String>()
        if (bannerResults != null) {
            for (bannerResult in bannerResults) {
                list.add(bannerResult.imagePath)
            }
        }
        return list
    }

    override fun onWeChatAuthors(weChatAuthorResults: MutableList<WeChatAuthorResult.DataBean>?) {
        if (weChatAuthorResults == null) {
            return
        }
        gridViewPager.setOnGridItemClickListener { position, view ->
            gotoWeChatArticleListActivity(weChatAuthorResults[position])
        }
        gridViewPager.setAdapter(object : GridViewPagerAdapter<WeChatAuthorResult.DataBean>(weChatAuthorResults) {
            override fun bindData(viewHolder: GridRecyclerAdapter<*>.ViewHolder, t: WeChatAuthorResult.DataBean?, position: Int) {
                t?.let {
                    val shapeDrawable = ShapeDrawable()
                    shapeDrawable.shape = OvalShape()
                    shapeDrawable.paint.color = colors[position % colors.size]
                    viewHolder.setText(R.id.tv_home_author_icon, it.name[0].toString())
                            .setText(R.id.tv_home_author_name, it.name)
                            .setBackground(R.id.tv_home_author_icon, shapeDrawable)
                }

            }

        })
    }

    override fun onHomeArticles(result: HomeArticleResult?) {
        srl_home.finishRefresh()
        srl_home.finishLoadMore()
        result?.let {
            val datas = it.data.datas
            if (datas != null) {
                if (page == 0) {
                    dataList.clear()
                }
                dataList.addAll(datas)
                if (homeArticleAdapter == null) {
                    homeArticleAdapter = HomeArticleAdapter(dataList)
                    homeArticleAdapter!!.onItemClickListener = BaseQuickAdapter.OnItemClickListener { _, _, position ->
                        gotoWebViewActivity(dataList[position])
                        mPresenter.getHomeArticles(page)
                    }
                    homeArticleAdapter!!.addHeaderView(headerView)
                    rv_home.adapter = homeArticleAdapter
                } else {
                    homeArticleAdapter!!.setNewData(dataList)
                }
            } else {
                srl_home.setNoMoreData(true)
            }
        }
    }

    private fun gotoWebViewActivityFromBanner(bannerResult: BannerResult.DataBean?) {
        if (bannerResult == null) {
            return
        }
        ARouter.getInstance().build(ARouterConstants.COMMON_X5WEB_ACTIVITY).withString("url", bannerResult.url).withString("webTitle", bannerResult.title).navigation()

    }

    /**
     * 跳转至微信公众号文章列表页面
     *
     * @param weChatAuthorResult
     */
    private fun gotoWeChatArticleListActivity(weChatAuthorResult: WeChatAuthorResult.DataBean) {
        ARouter.getInstance().build(ARouterConstants.HOME_WECHAT_ACTICLELIST_ACTIVITY).withInt("id", weChatAuthorResult.id).withString("title", weChatAuthorResult.name).navigation()
    }

    private fun gotoWebViewActivity(datasBean: HomeArticleResult.DataBean.DatasBean) {
        ARouter.getInstance().build(ARouterConstants.COMMON_X5WEB_ACTIVITY).withString("url", datasBean.link).withString("webTitle", datasBean.title).navigation()
    }

}