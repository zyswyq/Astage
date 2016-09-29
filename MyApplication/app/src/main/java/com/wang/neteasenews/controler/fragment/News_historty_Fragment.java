package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.News_history_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.News_history_Bean;
import com.wang.neteasenews.model.net.VolleyInstance;
import com.wang.neteasenews.model.net.VolleyResult;

/**
 * Created by dllo on 16/9/28.
 */
public class News_historty_Fragment extends AbsFragment{
    private News_history_Bean bean;
    private ListView listView;
    private News_history_Adapter adapter;

    public static News_historty_Fragment newInstance() {

        Bundle args = new Bundle();

        News_historty_Fragment fragment = new News_historty_Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_news_his_shehui_nba;
    }

    @Override
    protected void initView() {
        bean=new News_history_Bean();
        listView=byView(R.id.news_fuyong_his_lv);
        adapter=new News_history_Adapter();
        adapter.setContext(context);
        adapter.setBean(bean);
    }

    @Override
    protected void initDatas() {
        getData();

    }

    public void getData() {
        VolleyInstance.getInstance().startRequest(NetUrl_Bean.news_his, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson=new Gson();
                bean=gson.fromJson(resultStr,News_history_Bean.class);
                adapter.setBean(bean);

                listView.setAdapter(adapter);
            }

            @Override
            public void failture() {

            }
        });
    }
}
