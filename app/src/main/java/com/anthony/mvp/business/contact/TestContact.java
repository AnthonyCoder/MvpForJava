package com.anthony.mvp.business.contact;

import com.anthony.mvp.base.net.common.business.BaseView;
import com.anthony.mvp.model.response.CityListResponseModel;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface TestContact {
    interface View extends BaseView{
        String getQueryCityName();
        void showCityList(CityListResponseModel cityListResponseModel);
        void showWeatherTypeList();
    }
    interface Presenter{
        void getCityList();
        void postWeatherType();
        void postQueryWeatherByCity();
    }
}
