package com.anthony.gank.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.request.form.child.GankFormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.gank.bean.GankImageResult;
import com.anthony.gank.business.contact.TestContact;

/**
 * <p>作者：wzq<p>
 * <p>创建时间：2019-09-30<p>
 * <p>文件描述：<p>
 */
public class TestPresenter extends BasePresenter<TestContact.View> implements TestContact.Presenter{
  public TestPresenter(TestContact.View view) {
    super(view);
  }


  @Override
  public void getData(int page) {
    GankFormRequestClient.getInstance().executeGet(
        formatUrl(UrlConstant.GET_IMAGE_LIST, "16", page + ""),
        null,
        new AppObserver<GankImageResult>(view) {
          @Override
          public void onNext(GankImageResult gankImageResult) {
            super.onNext(gankImageResult);
            if (gankImageResult.getResults().size()>0) {
              for (GankImageResult.ResultsBean bean : gankImageResult.getResults()) {
                bean.setWith(550);
                bean.setHeight((int)(Math.random()*101)+600);
              }
            }
            view.setData(gankImageResult.getResults());
          }
        }
    );
  }
}

