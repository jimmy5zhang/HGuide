package com.hteng.guide.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hteng.guide.R;
import com.hteng.guide.activity.MainActivity;

/**
 * 开发者：jimmyzhang
 * 日期：2017/3/12
 * Copyright (C) 2017 华腾信息科技有限公司
 * 版权所有
 */

public class StepThreeFragment extends Fragment {

    private TextView mGoHomeTv;

    public static StepThreeFragment newInstance() {

        return new StepThreeFragment();
    }

    private void initView(View view) {

        mGoHomeTv = (TextView) view.findViewById(R.id.guide_go_home_tv);
    }

    private void initData() {

    }

    private void initListeners() {

        mGoHomeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoHome();
            }
        });
    }

    private void gotoHome() {

        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_step_three,
                container, false);
        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        initListeners();
    }
}
