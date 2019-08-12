package com.anthony.home.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.home.bean.BannerResult;
import com.anthony.home.bean.HomeArticleResult;
import com.anthony.home.bean.WeChatAuthorResult;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface HomeContact {
    interface View extends BaseView{
        void onBanner(List<BannerResult> bannerResults);
        void onWeChatAuthors(List<WeChatAuthorResult> weChatAuthorResults);
        void onHomeArticles(HomeArticleResult result);
    }
    interface Presenter {
        void getBanner();
        void getWeChatAuthors();
        void getHomeArticles();
    }
}
