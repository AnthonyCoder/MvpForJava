package com.anthony.home.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.FormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.home.bean.BannerResult;
import com.anthony.home.business.contact.HomeContact;

import java.util.List;

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
        FormRequestClient.getInstance().executeGet(UrlConstant.GET_BANNER_JSON, null, new AppObserver<List<BannerResult>>() {
            @Override
            public void onNext(List<BannerResult> bannerResults) {
                view.onBanner(bannerResults);
            }
        });
    }

    @Override
    public void getWeChatAuthors() {

    }

    @Override
    public void getHomeArticles() {

    }
}
