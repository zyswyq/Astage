package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/14.
 * 话题 话题界面
 */
public class Talker_talk_Fragment extends AbsFragment{


    public static Talker_talk_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Talker_talk_Fragment fragment = new Talker_talk_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk_talk;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
