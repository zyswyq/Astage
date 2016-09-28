package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dllo on 16/9/10.
 * 新闻界面ViewPAger的适配器
 */
public class News_Fragment_vp_Adapter extends FragmentPagerAdapter{

    private List<Fragment> fragments;
    private List<String> datas;
    private Context context;

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public News_Fragment_vp_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments==null?null:fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments==null?0:fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return datas.get(position);
    }
}
