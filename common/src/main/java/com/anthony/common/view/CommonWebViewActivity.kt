package com.anthony.common.view

import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.anthony.common.R
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.net.common.business.BasePresenter
import com.anthony.common.base.net.common.business.BaseView
import com.anthony.common.base.view.BaseWebActivity
import com.anthony.common.widgets.webview.X5WebView
import kotlinx.android.synthetic.main.activity_common_webpage.*

/**
 * 创建时间:2019/8/14
 * 创建人：anthony.wang
 * 功能描述：
 */
@Route(path = ARouterConstants.COMMON_X5WEB_ACTIVITY)
class CommonWebViewActivity : BaseWebActivity<BasePresenter<BaseView>>() {

    @JvmField
    @Autowired(name = "url",required = true)
    var url:String? = null

    @JvmField
    @Autowired(name = "webTitle",required = false)
    var webTitle:String? = null

    override fun getLoadUrl(): String? = url

    override fun getX5WebView(): X5WebView = xv_web

    override fun getLayoutId(): Int = R.layout.activity_common_webpage

    override fun initView() {
        iv_back.setOnClickListener {
            finish()
        }
    }

    override fun initData() {
        ARouter.getInstance().inject(this)
        webTitle?.let {
            tv_title.text = webTitle
        }
    }

    override fun getmPresenter():BasePresenter<BaseView> = BasePresenter(this)

}
