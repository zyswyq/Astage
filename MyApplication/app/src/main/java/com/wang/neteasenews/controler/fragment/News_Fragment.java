package com.wang.neteasenews.controler.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.News_Fragment_vp_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 新闻主界面
 */
public class News_Fragment extends AbsFragment{
    private ImageView keep_img,news_class;
    private int i=1;
    private List<String>datas;
    private List<Fragment> fragments;
    private TabLayout tab;
    private ViewPager vp;
    private News_Fragment_vp_Adapter adapter;

    public static News_Fragment newInstance() {
        Bundle args = new Bundle();
        News_Fragment fragment = new News_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView() {
        keep_img=byView(R.id.fragment_news_keep);
        news_class=byView(R.id.new_title_img);
        tab=byView(R.id.news_tab);
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);
        vp=byView(R.id.news_vp);
        adapter=new News_Fragment_vp_Adapter(getChildFragmentManager());
        datas=new ArrayList<>();
        fragments=new ArrayList<>();
    }

    @Override
    protected void initDatas() {
        String[] a=getResources().getStringArray(R.array.news_tab);
        for (int i = 0; i <a.length; i++) {
            datas.add(a[i]);
        }


        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        fragments.add(Live_Hot_Fragment.newInstance());
        adapter.setDatas(datas);
        adapter.setFragments(fragments);
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);

        AnimationDrawable animationDrawable = (AnimationDrawable) keep_img.getBackground();
        animationDrawable.start();
        news_class.setOnClickListener(new View.OnClickListener() {

            private PopupWindow popupWindow;
            private View pop;

            @Override
            public void onClick(View v) {

                if(i==1) {
                    pop = LayoutInflater.from(context).inflate(R.layout.popup_news_main, null);
                    popupWindow = new PopupWindow();
                    popupWindow.setContentView(pop);
                    popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    popupWindow.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    popupWindow.showAsDropDown(news_class);
                    i--;
                }
                else
                {
                    popupWindow.dismiss();
                    i++;
                }

            }
        });

    }

    @Override
    public void onPause() {
        super.onPause();
        AnimationDrawable animationDrawable= (AnimationDrawable) keep_img.getBackground();
        animationDrawable.start();
    }
}
