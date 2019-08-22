package com.anthony.user.business.view

import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseActivity
import com.anthony.user.R
import com.anthony.user.adapter.VideoListAdapter
import com.anthony.user.bean.VideoListResult
import com.anthony.user.business.contact.VideoListContact
import com.anthony.user.business.presenter.VideoListPresenter
import kotlinx.android.synthetic.main.activity_video_list.*

/**
 * 创建时间:2019/8/22
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.KAIYAN_VIDEOLIST_ACTIVITY)
class VideoListActivity: BaseActivity<VideoListPresenter>(),VideoListContact.View {

    @JvmField
    @Autowired(name = "id",required = true)
    var id =0
    private var videAdapter: VideoListAdapter? =null

    override fun getLayoutId() = R.layout.activity_video_list

    override fun initView() {
        rv_video_list.layoutManager = LinearLayoutManager(this)
    }

    override fun initData() {
        ARouter.getInstance().inject(this)
        mPresenter.getVideoList(id)
    }

    override fun setVideoList(dataList: MutableList<VideoListResult.ItemListBean>?) {
        videAdapter = VideoListAdapter(dataList)
        videAdapter!!.onItemClickListener = BaseQuickAdapter.OnItemClickListener { adapter, view, position ->
            dataList?.get(position)?.let {
                ARouter.getInstance().build(ARouterConstants.COMMON_X5WEB_ACTIVITY).withString("loadUrl", it.data.webUrl.raw).withString("webTitle", it.data.title).navigation()
            }

        }
        rv_video_list.adapter = videAdapter
    }
    override fun getmPresenter() = VideoListPresenter(this)
}