package com.anthony.user.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.user.bean.VideoListResult;

import java.util.List;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface VideoListContact {
    interface View extends BaseView{
        void setVideoList(List<VideoListResult.ItemListBean> dataList);
    }
    interface Presenter {
        void getVideoList(int id);
    }
}
