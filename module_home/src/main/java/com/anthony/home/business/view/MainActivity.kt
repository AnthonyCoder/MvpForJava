package com.anthony.home.business.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.net.common.business.BasePresenter
import com.anthony.common.base.net.common.business.BaseView
import com.anthony.common.base.view.BaseActivity
import com.anthony.home.R
import com.anthony.home.entity.TabEntity
import com.flyco.tablayout.listener.CustomTabEntity
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = ARouterConstants.HOME_MAIN_ACTIVITY)
class MainActivity : BaseActivity<BasePresenter<BaseView>>() {


    private lateinit var fragmentManager: FragmentManager
    private var menuTitles = arrayOf("首页", "消息", "联系人", "更多")
    private var selectIconIds = arrayListOf(R.drawable.tab_home_select, R.drawable.tab_project_sel, R.drawable.tab_category_sel, R.drawable.tab_mine_sel)
    private var unSelectIconIds = arrayListOf(R.drawable.tab_home_unselect, R.drawable.tab_project_unsel, R.drawable.tab_category_unsel, R.drawable.tab_mine_unsel)
    private var tabEntitys = ArrayList<CustomTabEntity>()
    private lateinit var fragments: ArrayList<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentManager = supportFragmentManager
    }

    override fun getLayoutId(): Int = R.layout.activity_main
    override fun initView() {

    }

    override fun initData() {
        var homeFragment = getFragment(ARouterConstants.HOME_MAIN_FRAGMENT)
        var projectFragment = getFragment(ARouterConstants.PROJECT_MAIN_FRAGMENT)
        var treeFragment = getFragment(ARouterConstants.OTHER_MAIN_FRAGMENT)
        var userFragment = getFragment(ARouterConstants.USER_MAIN_FRAGMENT)
        fragments = arrayListOf(homeFragment,
                projectFragment,
                treeFragment,
                userFragment)
        for (i in 0 until menuTitles.size) {
            tabEntitys.add(TabEntity(menuTitles[i], selectIconIds[i], unSelectIconIds[i]))
        }
        ctl_menu.setTabData(tabEntitys, this, R.id.fl_main_container, fragments)

    }

    override fun getmPresenter(): BasePresenter<BaseView>? = null


}
