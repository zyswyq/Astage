package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Talk_Fragment_vp_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/12.
 */
public class Talker_Fragment extends AbsFragment{
    ViewPager talk;
    TabLayout tabLayout;

    List<String>datas=new ArrayList<>();
    List<Fragment>frag=new ArrayList<>();

    public static Talker_Fragment newInstance() {

        Bundle args = new Bundle();

        Talker_Fragment fragment = new Talker_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk;
    }

    @Override
    protected void initView() {
        talk=byView(R.id.fragment_talk_vp);
        tabLayout=byView(R.id.fragment_talk_tab);


    }

    @Override
    protected void initDatas() {
        Talk_Fragment_vp_Adapter adapter=new Talk_Fragment_vp_Adapter(getChildFragmentManager());
        build();
        adapter.setContext(context);
        adapter.setDatas(datas);
        adapter.setFragments(frag);
        talk.setAdapter(adapter);
        tabLayout.setupWithViewPager(talk);


    }

    private void build() {
        datas.add("问吧");
        datas.add("话题");
        datas.add("关注");

        frag.add(Talker_Ask_Fragment.newInstance());
        frag.add(Talker_Ask_Fragment.newInstance());
        frag.add(Talker_Ask_Fragment.newInstance());


    }
}
