package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/10.
 */
public class Person_Fragment extends AbsFragment{

    public static Person_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Person_Fragment fragment = new Person_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_person;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
