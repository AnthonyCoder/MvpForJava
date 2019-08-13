package com.anthony.project.business.view.data;

import androidx.fragment.app.Fragment;

/**
 * 创建时间:2019/8/13
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ProjectPageItem {
    private int id;
    private String name;
    private Fragment fragment;

    public ProjectPageItem() {
    }

    public ProjectPageItem(int id, String name, Fragment fragment) {
        this.id = id;
        this.name = name;
        this.fragment = fragment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
