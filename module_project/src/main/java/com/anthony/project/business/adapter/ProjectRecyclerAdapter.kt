package com.anthony.project.business.adapter

import android.text.TextUtils
import android.view.View
import android.widget.ImageView

import com.anthony.common.adapter.base.BaseQuickAdapter
import com.anthony.common.adapter.base.BaseViewHolder
import com.anthony.project.R
import com.anthony.project.business.bean.ProjectListResult
import com.bumptech.glide.Glide


class ProjectRecyclerAdapter : BaseQuickAdapter<ProjectListResult.DataBean.DatasBean, BaseViewHolder> {

    constructor(data: List<ProjectListResult.DataBean.DatasBean>?) : super(R.layout.item_recycler_project, data)

    override fun convert(helper: BaseViewHolder, item: ProjectListResult.DataBean.DatasBean) {
        helper.setText(R.id.tv_project_title, item.title)
        helper.setText(R.id.tv_project_author, item.author + "\t\t" + item.niceDate)
        val envelopePic = item.envelopePic
        if (TextUtils.isEmpty(envelopePic)) {
            helper.setGone(R.id.iv_project_img, false)  // 隐藏图片占位
        } else {
            Glide.with(mContext)
                    .load(envelopePic)
                    .centerCrop()
                    .into(helper.getView<View>(R.id.iv_project_img) as ImageView)
        }
    }
}
