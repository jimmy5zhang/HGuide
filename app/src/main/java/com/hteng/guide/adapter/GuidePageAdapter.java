package com.hteng.guide.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * 开发者：jimmyzhang
 * 日期：2017/3/12
 * Copyright (C) 2017 华腾信息科技有限公司
 * 版权所有
 */

public class GuidePageAdapter extends FragmentStatePagerAdapter {

    // 界面列表
    private List<Fragment> fragments;

    public GuidePageAdapter(FragmentManager manager, List<Fragment> fragments) {

        super(manager);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }
}
