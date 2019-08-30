package com.anthony.video.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.video.bean.GetCategoriesResult;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface CategoriesContact {
    interface View extends BaseView{
        void setCategories(List<GetCategoriesResult> dataList);
    }
    interface Presenter {
        void getCategories();
    }
}
