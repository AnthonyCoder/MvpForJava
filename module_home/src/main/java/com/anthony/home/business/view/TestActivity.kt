package com.anthony.home.business.view

import android.app.Activity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.net.UrlConstant
import com.anthony.common.base.net.client.raw.TestRawRequestClient
import com.anthony.common.base.net.common.observer.AppObserver
import com.anthony.home.R
import com.anthony.home.bean.MessageLogResult
import com.anthony.home.bean.request.TestLogRequestBean
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_test.*

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.HOME_TEST_ACTIVITY)
class TestActivity: Activity() {
    private lateinit var testLogRequestBean: TestLogRequestBean
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        var deviceData: TestLogRequestBean.DeviceKeyModel = TestLogRequestBean.DeviceKeyModel().apply {
            deviceUnique = "00000000-0dbb-cb12-0000-00007a6589c0"
            platformName = "Xiaomi"
            systemName = "Android"
            systemVersion = "8.0.0"
        }
        testLogRequestBean = TestLogRequestBean().apply {
            accessToken = "8ig+PInAx/iQAcFt8HP35wwzFUd8XMYjvva8SH0ZchR+Y+X9rSjKZYi+0Adonk9k1mrsp8LjUxliGkO7hGnVcvrZV5tpZS0OxKtPjtuZhsc="
            appName = "JiboHealth"
            cultureCode = "zh-cn"
            device = deviceData
        }
        bt_test_get.setOnClickListener {
            doGetRequest()
        }
        bt_test_post.setOnClickListener {
            doPostRequest()
        }
    }
    private fun doGetRequest(){

    }
    private fun doPostRequest(){
        TestRawRequestClient.getInstance().executePost(UrlConstant.POST_MESSAGE_LOG,testLogRequestBean,object :AppObserver<MessageLogResult>(){
            override fun onNext(t: MessageLogResult) {
                tv_response_msg.text = "响应参数：\n${Gson().toJson(t)}"
            }

        })
    }
}