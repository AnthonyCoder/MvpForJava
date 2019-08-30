package com.anthony.gank.business.adapter

import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.adapter.base.BaseViewHolder
import com.anthony.gank.R
import com.anthony.gank.bean.GankImageResult
import com.bumptech.glide.Glide

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
class GankAdapter : BaseQuickAdapter<GankImageResult.ResultsBean, BaseViewHolder> {

    constructor(data: List<GankImageResult.ResultsBean>?): super(R.layout.item_image,data)

    override fun convert(helper: BaseViewHolder, item: GankImageResult.ResultsBean) {
        Glide.with(mContext)
                .load(item.url)
                .into(helper.getView(R.id.iv_image))
    }

}
