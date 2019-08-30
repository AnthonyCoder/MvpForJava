package com.anthony.project.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.project.bean.ProjectTreeResult;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface ProjectContact {
    interface View extends BaseView{
        void onProjectTabs(List<ProjectTreeResult .DataBean> itemList);
    }
    interface Presenter {
        void getProjectTabs();
    }
}
