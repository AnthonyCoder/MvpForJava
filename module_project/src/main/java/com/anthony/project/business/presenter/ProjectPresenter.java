package com.anthony.project.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.request.form.child.WanAndroidFormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.project.bean.ProjectTreeResult;
import com.anthony.project.business.contact.ProjectContact;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ProjectPresenter extends BasePresenter<ProjectContact.View> implements ProjectContact.Presenter{

    public ProjectPresenter(ProjectContact.View view) {
        super(view);
    }

    @Override
    public void getProjectTabs() {
        WanAndroidFormRequestClient.getInstance().executeGet(UrlConstant.GET_PROJECT_TREE, null, new AppObserver<ProjectTreeResult>() {
            @Override
            public void onNext(ProjectTreeResult treeResult) {
                view.onProjectTabs(treeResult.getData());
            }

        });
    }

}
