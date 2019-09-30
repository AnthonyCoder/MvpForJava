package com.anthony.video.adapter

import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.adapter.base.BaseViewHolder
import com.anthony.video.R
import com.anthony.video.bean.GetCategoriesResult
import com.bumptech.glide.Glide

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
class CategoriesAdapter : BaseQuickAdapter<GetCategoriesResult, BaseViewHolder> {

    constructor(data: List<GetCategoriesResult>?): super(R.layout.item_categories,data)

    override fun convert(helper: BaseViewHolder, item: GetCategoriesResult) {
        Glide.with(mContext)
                .load(item.bgPicture)
                .into(helper.getView(R.id.iv_photo))
        helper.setText(R.id.tv_title,item.name)
    }

}
