package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Live_Fragment_vp_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/12.
 */
public class Live_Fragment extends AbsFragment {
    private List<Fragment> fragments;
    List<String> datas;
    Live_Fragment_vp_Adapter adapter;
    ViewPager vp;
    TabLayout tab;


    public static Live_Fragment newInstance() {
        Bundle args = new Bundle();
        Live_Fragment fragment = new Live_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_live;
    }

    @Override
    protected void initView() {
        tab = byView(R.id.fragment_live_tab);
        vp = byView(R.id.fragment_live_vp);


    }

    @Override
    protected void initDatas() {

        fragments=new ArrayList<>();
        datas=new ArrayList<>();
        adapter=new Live_Fragment_vp_Adapter(getChildFragmentManager());
        adapter.setContext(context);
        adapter.setDatas(datas);
        adapter.setFragments(fragments);
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);
    }

    private void build()
    {
        datas.add("热门");
        datas.add("分类");
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Class_Fragment.newInstance());
    }
}
