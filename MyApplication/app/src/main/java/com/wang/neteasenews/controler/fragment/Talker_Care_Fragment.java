package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/14.
 */
public class Talker_Care_Fragment extends AbsFragment{


    public static Talker_Care_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Talker_Care_Fragment fragment = new Talker_Care_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk_care;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
