package com.anthony.gank.business.presenter;


import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.GankFormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.gank.bean.GankImageResult;
import com.anthony.gank.business.contact.GankContact;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public class GankPresenter extends BasePresenter<GankContact.View> implements GankContact.Presenter {

    public GankPresenter(GankContact.View view) {
        super(view);
    }

    @Override
    public void getGankData(int page) {
        GankFormRequestClient.getInstance().executeGet(formatUrl(UrlConstant.GET_IMAGE_LIST,"10",page+""), null, new AppObserver<GankImageResult>() {
            @Override
            public void onNext(GankImageResult gankImageResult) {
                view.setGankData(gankImageResult.getResults());
            }

        });
    }
}
