package com.anthony.home.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.request.form.child.WanAndroidFormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.home.bean.BannerResult;
import com.anthony.home.bean.HomeArticleResult;
import com.anthony.home.bean.WeChatAuthorResult;
import com.anthony.home.business.contact.HomeContact;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public class HomePresenter extends BasePresenter<HomeContact.View> implements HomeContact.Presenter  {
    public HomePresenter(HomeContact.View view) {
        super(view);
    }

    @Override
    public void getBanner() {
        WanAndroidFormRequestClient.getInstance().executeGet(UrlConstant.GET_BANNER_JSON, null, new AppObserver<BannerResult>(view) {
            @Override
            public void onNext(BannerResult bannerResults) {
                super.onNext(bannerResults);
                view.onBanner(bannerResults.getData());
            }

        });
    }

    @Override
    public void getWeChatAuthors() {
        WanAndroidFormRequestClient.getInstance().executeGet(UrlConstant.GET_WXARTICLE_CHAPTERS_JSON, null, new AppObserver<WeChatAuthorResult>(view) {
            @Override
            public void onNext(WeChatAuthorResult weChatAuthorResult) {
                super.onNext(weChatAuthorResult);
                view.onWeChatAuthors(weChatAuthorResult.getData());
            }

        });
    }

    @Override
    public void getHomeArticles(int page) {
        WanAndroidFormRequestClient.getInstance().executeGet(formatUrl(UrlConstant.GET_ARTICLE_LIST_JSON,page+""), null, new AppObserver<HomeArticleResult>(view,"获取文章") {
            @Override
            public void onNext(HomeArticleResult homeArticleResult) {
                super.onNext(homeArticleResult);
                view.onHomeArticles(homeArticleResult);
            }
        });
    }
}
