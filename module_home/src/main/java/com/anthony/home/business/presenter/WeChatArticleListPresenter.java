package com.anthony.home.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.request.form.child.WanAndroidFormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.home.bean.WxArticleListResult;
import com.anthony.home.business.contact.WeChatArticleListContact;

/**
 * 创建时间:2019/8/15
 * 创建人：anthony.wang
 * 功能描述：
 */
public class WeChatArticleListPresenter extends BasePresenter<WeChatArticleListContact.View> implements WeChatArticleListContact.Presenter {
    public WeChatArticleListPresenter(WeChatArticleListContact.View view) {
        super(view);
    }

    @Override
    public void getWeChatArticle(int id, int page) {
        WanAndroidFormRequestClient.getInstance().executeGet(formatUrl(UrlConstant.GET_WXARTICLE_LIST_JSON,id+"",page+""), null, new AppObserver<WxArticleListResult>() {
            @Override
            public void onNext(WxArticleListResult wxArticleListResult) {
                view.onWeChatArticleList(wxArticleListResult.getData().getDatas());
            }

        });
    }
}
