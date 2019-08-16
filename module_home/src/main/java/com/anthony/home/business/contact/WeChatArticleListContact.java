package com.anthony.home.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.home.bean.WxArticleListResult;

import java.util.List;

/**
 * 创建时间:2019/8/15
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface WeChatArticleListContact {
    interface View extends BaseView{
        void onWeChatArticleList(List<WxArticleListResult.DataBean.DatasBean> dataBeanList);
    }
    interface Presenter{
        void getWeChatArticle(int id,int page);
    }
}
