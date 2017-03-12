package com.hteng.guide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hteng.guide.R;

/**
 * 开发者：jimmyzhang
 * 日期：2017/3/12
 * Copyright (C) 2017 华腾信息科技有限公司
 * 版权所有
 */

public class StepTwoFragment extends Fragment {

    public static StepTwoFragment newInstance() {

        return new StepTwoFragment();
    }


    private void initListeners() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_step_two,
                container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initListeners();
    }
}
