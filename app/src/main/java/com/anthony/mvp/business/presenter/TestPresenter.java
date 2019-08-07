package com.anthony.mvp.business.presenter;

import androidx.annotation.NonNull;

import com.anthony.mvp.base.net.UrlConstant;
import com.anthony.mvp.base.net.client.FormRequestClient;
import com.anthony.mvp.base.net.common.observer.AppObserver;
import com.anthony.mvp.business.contact.TestContact;
import com.anthony.mvp.model.response.CityListResponseModel;
import com.anthony.mvp.util.toast.ToastUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

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
        FormRequestClient.getInstance().executeGet(UrlConstant.WEATHER_CITY_LIST,uploadMap, new AppObserver<CityListResponseModel>(view) {
            @Override
            public void onNext(CityListResponseModel cityListResponseModel) {
                view.showCityList(cityListResponseModel);
            }

        });
        // 每隔1s执行一次事件
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(view.bindLifecycle())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Long aLong) {
                        ToastUtils.show("计数："+aLong);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

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
