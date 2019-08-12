package com.anthony.home.business.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.anthony.common.base.constant.ARouterConstants
import com.anthony.common.base.net.common.business.BasePresenter
import com.anthony.common.base.net.common.business.BaseView
import com.anthony.common.base.view.BaseActivity
import com.anthony.home.R
import com.flyco.tablayout.listener.CustomTabEntity


class MainActivity : BaseActivity<BasePresenter<BaseView>>() {


    private lateinit var fragmentManager: FragmentManager
    private var menuTitles = arrayOf("首页", "消息", "联系人", "更多")
    private var selectIconIds = arrayListOf(R.drawable.tab_home_select, R.drawable.tab_project_sel, R.drawable.tab_category_sel, R.drawable.tab_mine_sel)
    private var unSelectIconIds = arrayListOf(R.drawable.tab_home_unselect, R.drawable.tab_project_unsel, R.drawable.tab_category_unsel, R.drawable.tab_mine_unsel)
    private lateinit var tabEntitys: ArrayList<CustomTabEntity>
    private lateinit var fragments: ArrayList<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentManager = supportFragmentManager
        var homeFragment = getFragment(ARouterConstants.MENU_FRAGMENT_HOME)
        routerGo(ARouterConstants.HOME_TEST_ACTIVITY)
    }

    override fun getLayoutId(): Int = R.layout.activity_main
    override fun initView() {

    }

    override fun initData() {
//        var homeFragment = getFragment(ARouterConstants.MENU_FRAGMENT_HOME)
//        var projectFragment = getFragment(ARouterConstants.MENU_FRAGMENT_PROJECT)
//        var treeFragment = getFragment(ARouterConstants.MENU_FRAGMENT_TREE)
//        var userFragment = getFragment(ARouterConstants.MENU_FRAGMENT_USER)
//        fragments = arrayListOf(homeFragment,
//                projectFragment,
//                treeFragment,
//                userFragment)
//        for (i in 0 until menuTitles.size) {
//            tabEntitys.add(TabEntity(menuTitles[i], selectIconIds[i], unSelectIconIds[i]))
//        }
//        ctl_menu.setTabData(tabEntitys, this, R.id.fl_main_container, fragments)

    }

    override fun getmPresenter(): BasePresenter<BaseView>? = null


}
