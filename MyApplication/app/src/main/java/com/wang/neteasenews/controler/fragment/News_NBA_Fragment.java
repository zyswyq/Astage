package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.News_NBA_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.News_NBA_Bean;
import com.wang.neteasenews.model.net.VolleyInstance;
import com.wang.neteasenews.model.net.VolleyResult;

/**
 * Created by dllo on 16/9/29.
 */
public class News_NBA_Fragment extends AbsFragment{
    private News_NBA_Bean bean;
    private ListView listView;
    private News_NBA_Adapter adapter;

    public static News_NBA_Fragment newInstance() {
        Bundle args = new Bundle();
        News_NBA_Fragment fragment = new News_NBA_Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_news_his_shehui_nba;
    }

    @Override
    protected void initView() {
        bean=new News_NBA_Bean();
        listView=byView(R.id.news_fuyong_his_lv);
        adapter=new News_NBA_Adapter();
        adapter.setContext(context);

    }

    @Override
    protected void initDatas() {
        getData();
    }

    public void getData() {
        VolleyInstance.getInstance().startRequest(NetUrl_Bean.news_NBA, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson=new Gson();
                bean=gson.fromJson(resultStr,News_NBA_Bean.class);
                adapter.setBean(bean);
                listView.setAdapter(adapter);
            }

            @Override
            public void failture() {

            }
        });
    }
}
