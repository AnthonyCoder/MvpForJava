package com.anthony.modulehome.business.presenter;

import com.anthony.common.base.net.UrlConstant;
import com.anthony.common.base.net.client.FormRequestClient;
import com.anthony.common.base.net.common.observer.AppObserver;
import com.anthony.modulehome.business.contact.TestContact;
import com.anthony.common.model.response.CityListResponseModel;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public class TestPresenter implements TestContact.Presenter{
    private TestContact.View view;
    public TestPresenter(TestContact.View view){
        this.view = view;
    }
    @Override
    public void getCityList() {
        Map<String,Object> uploadMap = new HashMap<>();
        uploadMap.put("key","94fd29942308ae8b7d1f9b95460c1e56");
        Map<String,String> headerMap = new HashMap<>();
        headerMap.put("msg","zengcen-is-sb");
        FormRequestClient.getInstance().executeGetWithHeader(headerMap,UrlConstant.WEATHER_CITY_LIST,uploadMap, new AppObserver<CityListResponseModel>(view) {
            @Override
            public void onNext(CityListResponseModel cityListResponseModel) {
                view.showCityList(cityListResponseModel);
            }

        });
    }

    @Override
    public void postWeatherType() {

    }

    @Override
    public void postQueryWeatherByCity() {

    }
}
