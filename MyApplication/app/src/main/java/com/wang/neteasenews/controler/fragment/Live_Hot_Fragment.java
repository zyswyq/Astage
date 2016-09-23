package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.widget.ListView;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Live_Hot_LV_Adapter;

/**
 * Created by dllo on 16/9/14.
 * 直播热门 界面
 */
public class Live_Hot_Fragment extends AbsFragment{

    private ListView hotllv;
    private Live_Hot_LV_Adapter myadapter;
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
        hotllv=byView(R.id.live_hot_lv);
        myadapter=new Live_Hot_LV_Adapter();
        hotllv.setAdapter(myadapter);
    }

    @Override
    protected void initDatas() {
        myadapter.setContext(context);
    }

    
}
