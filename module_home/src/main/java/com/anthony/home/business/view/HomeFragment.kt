package com.anthony.home.business.view

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseFragment
import com.anthony.common.widgets.LinearItemDecoration
import com.anthony.home.R
import com.anthony.home.bean.BannerResult
import com.anthony.home.bean.HomeArticleResult
import com.anthony.home.bean.WeChatAuthorResult
import com.anthony.home.business.contact.HomeContact
import com.anthony.home.business.presenter.HomePresenter
import com.anthony.home.imageloader.GlideImageLoader
import com.youth.banner.Banner
import com.youth.banner.listener.OnBannerListener
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.MENU_FRAGMENT_HOME)
class HomeFragment: BaseFragment<HomePresenter>(),HomeContact.View{

    private lateinit var headerView: View
    private lateinit var banner:Banner

    override fun getLayoutId(): Int = R.layout.fragment_home


    override fun initView() {
        headerView = LayoutInflater.from(mContext).inflate(R.layout.layout_home_header,null)
        banner = headerView.findViewById(R.id.banner_home)
    }
    override fun initData() {
        rv_home.layoutManager = LinearLayoutManager(mContext,RecyclerView.VERTICAL,false)
        rv_home.addItemDecoration(LinearItemDecoration(mContext).height(8f).color(Color.parseColor("66dddddd")))
        banner.setImageLoader(GlideImageLoader())
        mPresenter.getBanner()
    }


    override fun getmPresenter(): HomePresenter = HomePresenter(this)

    override fun onBanner(bannerResults: MutableList<BannerResult>?) {
        bannerResults?.let {
            if(it.size>0){
                val images = getImages(bannerResults)
                //设置图片集合
                banner.setImages(images)
                banner.setOnBannerListener(OnBannerListener { position ->
                    val bannerResult = bannerResults[position]
                    gotoWebViewActivityFromBanner(bannerResult)
                })
                //banner设置方法全部调用完毕时最后调用
                banner.start()
            }
        }
    }
    private fun gotoWebViewActivityFromBanner(bannerResult: BannerResult?) {
//        if (bannerResult == null) {
//            return
//        }
//        val bundle = Bundle()
//        bundle.putString(SyncStateContract.Constants.URL, bannerResult.url)
//        bundle.putInt(SyncStateContract.Constants.ID, bannerResult.id)
//        bundle.putString(SyncStateContract.Constants.AUTHOR, null)
//        bundle.putString(Constants.TITLE, bannerResult.title)
//        ARouter.getInstance()
//                .build("/web/WebViewActivity")
//                .with(bundle)
//                .navigation()
//        activity.overridePendingTransition(R.anim.anim_web_enter, R.anim.anim_alpha)

    }
    private fun getImages(bannerResults: List<BannerResult>?): List<String> {
        val list = ArrayList<String>()
        if (bannerResults != null) {
            for (bannerResult in bannerResults) {
                list.add(bannerResult.imagePath)
            }
        }
        return list
    }

    override fun onWeChatAuthors(weChatAuthorResults: MutableList<WeChatAuthorResult>?) {
    }

    override fun onHomeArticles(result: HomeArticleResult?) {
    }

}