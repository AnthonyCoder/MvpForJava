package com.anthony.home.adapter

import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.adapter.base.BaseViewHolder
import com.anthony.home.R
import com.anthony.home.bean.WxArticleListResult

/**
 * 创建时间:2019/8/12
 * 创建人：anthony.wang
 * 功能描述：
 */
class WeChatArticleAdapter : BaseQuickAdapter<WxArticleListResult.DataBean.DatasBean, BaseViewHolder> {

    constructor(data: List<WxArticleListResult.DataBean.DatasBean>?): super(R.layout.item_home_article,data)

    override fun convert(helper: BaseViewHolder, item: WxArticleListResult.DataBean.DatasBean) {
        helper.setText(R.id.tv_article_title, item.title)
                .setText(R.id.tv_article_author, item.author)
                .setText(R.id.tv_article_time, item.niceDate)
    }

}
