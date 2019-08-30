package com.anthony.project.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.project.bean.ProjectListResult;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface ProjectPageContact {
    interface View extends BaseView{
        void projectList(List<ProjectListResult.DataBean.DatasBean> modelList);
    }
    interface Presenter {
        void getProject(int id,int page);
    }
}
