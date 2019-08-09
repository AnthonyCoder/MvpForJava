package com.anthony.modulehome.business.view

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.base.constant.ARouterConstants.HOME_TEST_ACTIVITY
import com.anthony.common.base.view.BaseActivity
import com.anthony.modulehome.R

//@Route(path = "home/activity/main")
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().build(HOME_TEST_ACTIVITY).navigation()
    }


}
