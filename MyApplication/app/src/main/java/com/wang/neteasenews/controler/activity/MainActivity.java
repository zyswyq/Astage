package com.wang.neteasenews.controler.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.MainViewPager_Adapter;
import com.wang.neteasenews.controler.fragment.News_Fragment;
import com.wang.neteasenews.model.bean.MainTabItem_Bean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AbsActivity {

    private ViewPager main_vp;
    private TabLayout main_tab;
    private List<MainTabItem_Bean> datas;
    private List<Fragment> fragments=new ArrayList<>();


    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        main_vp=byview(R.id.main_vp);
        main_tab=byview(R.id.main_tab);
        Log.d("MainActivity", "1");


    }

    @Override
    protected void initdatas() {
        Log.d("MainActivity", "2");
        fragments.add(new News_Fragment());
        fragments.add(new News_Fragment());
        fragments.add(new News_Fragment());
        fragments.add(new News_Fragment());
        Log.d("MainActivity", "3");
        datas=new ArrayList<>();
        datas.add(new MainTabItem_Bean("新闻",R.drawable.news));
        datas.add(new MainTabItem_Bean("直播",R.drawable.keep));
        datas.add(new MainTabItem_Bean("话题",R.drawable.talk));
        datas.add(new MainTabItem_Bean("我",R.drawable.person));
        Log.d("MainActivity", "4");
        MainViewPager_Adapter adapter=new MainViewPager_Adapter(getSupportFragmentManager());
        adapter.setContext(MainActivity.this);
        adapter.setFragments(fragments);
        adapter.setDatas(datas);
        Log.d("MainActivity", "5");
        main_vp.setAdapter(adapter);
        main_tab.setupWithViewPager(main_vp);
        for (int i=0;i<main_tab.getTabCount();i++)
        {
            Log.d("MainActivity", "7");
//            main_tab.getTabAt(i).setCustomView(adapter.getTabView(i));

//            main_tab.getTabAt(i).setCustomView(adapter.getTabView(i));
            TabLayout.Tab tab=main_tab.getTabAt(i);
            tab.setCustomView(adapter.getTabView(i));
        }
        Log.d("MainActivity", "6");
    }
}
