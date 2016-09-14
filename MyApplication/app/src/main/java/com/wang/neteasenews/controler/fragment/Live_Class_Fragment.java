package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/14.
 */
public class Live_Class_Fragment extends AbsFragment{

    public static Live_Class_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Live_Class_Fragment fragment = new Live_Class_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_live_class;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
