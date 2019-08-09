package com.anthony.modulehome.business.contact;

import com.anthony.common.base.net.common.business.BaseView;
import com.anthony.common.model.response.CityListResponseModel;

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
