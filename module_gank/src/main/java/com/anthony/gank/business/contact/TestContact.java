package com.anthony.gank.business.contact;


import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.gank.bean.GankImageResult;

import java.util.List;

/**
 * <p>作者：wzq<p>
 * <p>创建时间：2019-09-30<p>
 * <p>文件描述：<p>
 */
public interface TestContact {

  interface View extends BaseView {
    void setData(List<GankImageResult.ResultsBean> resultsBeanList);
  }

  interface Presenter {
    void getData(int page);
  }
}
