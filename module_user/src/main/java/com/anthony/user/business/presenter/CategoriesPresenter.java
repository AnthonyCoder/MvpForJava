package com.anthony.user.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.BaobabFormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.user.bean.GetCategoriesResult;
import com.anthony.user.business.contact.CategoriesContact;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public class CategoriesPresenter extends BasePresenter<CategoriesContact.View> implements CategoriesContact.Presenter{

    public CategoriesPresenter(CategoriesContact.View view) {
        super(view);
    }

    @Override
    public void getCategories() {
        BaobabFormRequestClient.getInstance().executeGet(UrlConstant.GET_CATEGORIES, null, new AppObserver<List<GetCategoriesResult>>() {
            @Override
            public void onNext(List<GetCategoriesResult> getCategoriesResults) {
                view.setCategories(getCategoriesResults);
            }
        });
    }
}
