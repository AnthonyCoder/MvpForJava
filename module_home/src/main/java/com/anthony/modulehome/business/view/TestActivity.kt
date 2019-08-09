package com.anthony.modulehome.business.view

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.view.BaseActivity
import com.anthony.common.model.response.CityListResponseModel
import com.anthony.common.util.toast.ToastUtils
import com.anthony.modulehome.R
import com.anthony.modulehome.business.contact.TestContact
import com.anthony.modulehome.business.presenter.TestPresenter
import kotlinx.android.synthetic.main.activity_test.*

@Route(path = ARouterConstants.HOME_TEST_ACTIVITY)
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
