package com.anthony.user.adapter

import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.adapter.base.BaseViewHolder
import com.anthony.user.R
import com.anthony.user.bean.VideoListResult
import com.bumptech.glide.Glide

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
class VideoListAdapter : BaseQuickAdapter<VideoListResult.ItemListBean, BaseViewHolder> {

    constructor(data: List<VideoListResult.ItemListBean>?): super(R.layout.item_video_list,data)

    override fun convert(helper: BaseViewHolder, item: VideoListResult.ItemListBean) {
        Glide.with(mContext)
                .load(item.data.cover.detail)
                .into(helper.getView(R.id.iv_cover))
        helper.setText(R.id.tv_title,item.data.title)
        helper.setText(R.id.tv_dec,item.data.description)
    }

}
