package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by dllo on 16/9/14.
 * 直播主界面ViewPager的适配器
 */
public class Live_Fragment_vp_Adapter extends FragmentPagerAdapter{

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
        notifyDataSetChanged();
    }

    public Live_Fragment_vp_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.d("aaa", datas.get(position));
        return datas.get(position);
    }
}
