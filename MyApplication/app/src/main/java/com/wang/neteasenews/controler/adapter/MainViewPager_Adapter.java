package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.MainTabItem_Bean;

import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class MainViewPager_Adapter extends FragmentPagerAdapter{

    private List<MainTabItem_Bean> datas;
    private Context context;
    private List<Fragment> fragments;

    public void setDatas(List<MainTabItem_Bean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public MainViewPager_Adapter(FragmentManager fm) {
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

    public View getTabView(int position)
    {
        Log.d("MainViewPager_Adapter", "8");
        View v= LayoutInflater.from(context).inflate(R.layout.maintab_item,null);
        Log.d("MainViewPager_Adapter", "9");
        TextView tv = (TextView) v.findViewById(R.id.main_tab_tv);

        ImageView img = (ImageView) v.findViewById(R.id.main_tab_img);
//
        img.setImageResource(datas.get(position).getImgID());
        Log.d("MainViewPager_Adapter", "10");
        tv.setText(datas.get(position).getTitile()+"");
        Log.d("MainViewPager_Adapter", "11");
        return v;
    }


}
