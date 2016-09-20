package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Talk_Ask_LV_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.Talk_ask_listView_Bean;

/**
 * Created by dllo on 16/9/12.
 * 话题 问吧界面
 */
public class Talker_Ask_Fragment extends AbsFragment{

    private ListView listView;
    private Talk_Ask_LV_Adapter adapter;
    private Talk_ask_listView_Bean datas;
    private NetUrl_Bean bean;
    private RequestQueue queue;
    private String MyUrl;

    public static Talker_Ask_Fragment newInstance() {

        Bundle args = new Bundle();

        Talker_Ask_Fragment fragment = new Talker_Ask_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk_ask;
    }

    @Override
    protected void initView() {
        listView=byView(R.id.talk_ask_lv);

        adapter=new Talk_Ask_LV_Adapter();
        listView.setAdapter(adapter);
        MyUrl=bean.talk_askmain;

    }

    @Override
    protected void initDatas() {
        adapter.setContext(context);
        getdatas(MyUrl);
    }

    //解析传入的网址
    private void getdatas(String myUrl) {
        queue= Volley.newRequestQueue(context);
        StringRequest sr=new StringRequest(MyUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                Talk_ask_listView_Bean Mybean=gson.fromJson(response,Talk_ask_listView_Bean.class);
                adapter.setDatas(Mybean);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "失败了", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(sr);
    }
}
