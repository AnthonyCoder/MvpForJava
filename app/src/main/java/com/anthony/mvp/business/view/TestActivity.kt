package com.anthony.mvp.business.view

import android.os.Bundle
import com.anthony.mvp.R
import com.anthony.mvp.base.view.BaseActivity
import com.anthony.mvp.business.contact.TestContact
import com.anthony.mvp.business.presenter.TestPresenter
import com.anthony.mvp.model.response.CityListResponseModel
import com.anthony.mvp.util.toast.ToastUtils
import kotlinx.android.synthetic.main.activity_test.*


class TestActivity : BaseActivity(),TestContact.View {
    private lateinit var testPresenter: TestPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        testPresenter = TestPresenter(this)
        bt_city_list.setOnClickListener{
            testPresenter.getCityList()
        }
    }

    override fun getQueryCityName(): String {
        return "北京"
    }

    override fun showCityList(cityListResponseModel: CityListResponseModel?) {
        cityListResponseModel?.let {
            ToastUtils.show("有${cityListResponseModel.result.size}个城市天气的数据")
        }

    }

    override fun showWeatherTypeList() {
    }

}
