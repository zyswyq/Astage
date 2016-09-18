package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/12.
 * 话题 问吧界面
 */
public class Talker_Ask_Fragment extends AbsFragment{

    public static Talker_Ask_Fragment newInstance() {

        Bundle args = new Bundle();

        Talker_Ask_Fragment fragment = new Talker_Ask_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk_ask;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
