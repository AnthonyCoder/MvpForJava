package com.anthony.gank.business.contact;


import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.gank.bean.GankImageResult;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface GankContact {
    interface View extends BaseView {
        void setGankData(List<GankImageResult.ResultsBean> resultsBeanList);
    }
    interface Presenter {
        void getGankData(int page);
    }
}
