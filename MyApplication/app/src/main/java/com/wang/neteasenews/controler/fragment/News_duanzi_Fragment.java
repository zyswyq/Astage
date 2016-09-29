package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.News_duanzi_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.News_duanzi_Bean;
import com.wang.neteasenews.model.net.VolleyInstance;
import com.wang.neteasenews.model.net.VolleyResult;

/**
 * Created by dllo on 16/9/29.
 */
public class News_duanzi_Fragment extends AbsFragment{
    private ListView listView;
    private News_duanzi_Bean bean;
    private News_duanzi_Adapter adapter;

    public static News_duanzi_Fragment newInstance() {

        Bundle args = new Bundle();

        News_duanzi_Fragment fragment = new News_duanzi_Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_news_his_shehui_nba;
    }

    @Override
    protected void initView() {
        listView=byView(R.id.news_fuyong_his_lv);
        adapter=new News_duanzi_Adapter();
        bean=new News_duanzi_Bean();
        adapter.setContext(context);
        adapter.setDatas(bean);
    }

    @Override
    protected void initDatas() {
        getData();
    }

    public void getData() {
        VolleyInstance.getInstance().startRequest(NetUrl_Bean.news_duanzi, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson=new Gson();
                bean=gson.fromJson(resultStr,News_duanzi_Bean.class);
                adapter.setDatas(bean);
                listView.setAdapter(adapter);
            }

            @Override
            public void failture() {

            }
        });
    }
}
