package com.anthony.project.adapter


import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import com.anthony.project.business.view.data.ProjectPageItem

class ProjectPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var projectPageItems: List<ProjectPageItem>? = null

    fun setPages(pageItemList: List<ProjectPageItem>) {
        this.projectPageItems = pageItemList
        notifyDataSetChanged()
    }

    override fun getItem(i: Int): Fragment {
        return projectPageItems!![i].fragment
    }

    override fun getCount(): Int {
        return if (projectPageItems == null) 0 else projectPageItems!!.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return projectPageItems!![position].name
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {}
}
