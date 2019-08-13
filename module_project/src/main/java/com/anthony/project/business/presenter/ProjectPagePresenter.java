package com.anthony.project.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.FormRequestClient;
import com.anthony.common.base.net.common.business.BasePresenter;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.project.business.bean.ProjectListResult;
import com.anthony.project.business.contact.ProjectPageContact;

import java.util.HashMap;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ProjectPagePresenter extends BasePresenter<ProjectPageContact.View> implements ProjectPageContact.Presenter{

    public ProjectPagePresenter(ProjectPageContact.View view) {
        super(view);
    }


    @Override
    public void getProject(int id, int page) {
        HashMap<String,Integer> params = new HashMap<>();
        params.put("cid",id);
        FormRequestClient.getInstance().executeGet(formatUrl(UrlConstant.GET_PROJECT,page+""), params, new AppObserver<ProjectListResult>() {
            @Override
            public void onNext(ProjectListResult treeResult) {
                view.projectList(treeResult.getData().getDatas());
            }
        });
    }
}
