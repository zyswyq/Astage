package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/14.
 */
public class Live_Hot_Fragment extends AbsFragment{


    public static Live_Hot_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Live_Hot_Fragment fragment = new Live_Hot_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_live_hot;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
