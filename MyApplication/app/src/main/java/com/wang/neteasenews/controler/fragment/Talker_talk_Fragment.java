package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Talk_Talk_LV_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.Talk_Talk_lv_Bean;
import com.wang.neteasenews.model.bean.Talk_talk_head_Bean;

/**
 * Created by dllo on 16/9/14.
 * 话题 话题界面
 */
public class Talker_talk_Fragment extends AbsFragment{

    private ListView listView;
    private View view;
    private ImageView img1,img2,img3,img4,img5;
    private TextView tv1,tv2,tv3,tv4,tv5;
    private Talk_Talk_LV_Adapter adapter;
    private Talk_Talk_lv_Bean lv_bean;
    private Talk_talk_head_Bean head_bean;
    private String MyUrl;
    private NetUrl_Bean bean;
    private RequestQueue queue;

    public static Talker_talk_Fragment newInstance() {
        Bundle args = new Bundle();
        Talker_talk_Fragment fragment = new Talker_talk_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk_talk;
    }

    @Override

    protected void initView() {
        queue= Volley.newRequestQueue(context);

        adapter=new Talk_Talk_LV_Adapter();
        listView=byView(R.id.talk_talk_lv);

        view= LayoutInflater.from(context).inflate(R.layout.head_item_talk_talk,null);
        img1= (ImageView) view.findViewById(R.id.talk_talk_head_img1);
        img2= (ImageView) view.findViewById(R.id.talk_talk_head_img2);
        img3= (ImageView) view.findViewById(R.id.talk_talk_head_img3);
        img4= (ImageView) view.findViewById(R.id.talk_talk_head_img4);
        img5= (ImageView) view.findViewById(R.id.talk_talk_head_img5);
        tv1= (TextView) view.findViewById(R.id.talk_talk_head_tv1);
        tv2= (TextView) view.findViewById(R.id.talk_talk_head_tv2);
        tv3= (TextView) view.findViewById(R.id.talk_talk_head_tv3);
        tv4= (TextView) view.findViewById(R.id.talk_talk_head_tv4);
        tv5= (TextView) view.findViewById(R.id.talk_talk_head_tv5);
    }

    @Override
    protected void initDatas() {
        adapter.setContext(context);
        MyUrl=bean.talk_talkmain;
        getdatas(MyUrl);
        listView.setAdapter(adapter);
        listView.addHeaderView(view);
        MyUrl=bean.talk_talkhead;
        getheadDatas(MyUrl);



    }

    private void getheadDatas(String myUrl) {

        StringRequest sr=new StringRequest(myUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                head_bean=gson.fromJson(response,Talk_talk_head_Bean.class);
                Log.d("rrrrr", String.valueOf(head_bean.get话题().size()));
                Log.d("rrrrr", "进入了解析");

                Picasso.with(context).load(head_bean.get话题().get(0).getPicUrl()).into(img1);
                Picasso.with(context).load(head_bean.get话题().get(1).getPicUrl()).into(img2);
                Picasso.with(context).load(head_bean.get话题().get(2).getPicUrl()).into(img3);
                Picasso.with(context).load(head_bean.get话题().get(3).getPicUrl()).into(img4);
                Picasso.with(context).load(head_bean.get话题().get(4).getPicUrl()).into(img5);

                tv1.setText("#"+head_bean.get话题().get(0).getTopicName()+"#");
                tv2.setText("#"+head_bean.get话题().get(1).getTopicName()+"#");
                tv3.setText("#"+head_bean.get话题().get(2).getTopicName()+"#");
                tv4.setText("#"+head_bean.get话题().get(3).getTopicName()+"#");
                tv5.setText("#"+head_bean.get话题().get(4).getTopicName()+"#");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "失败了", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(sr);
    }

    //解析传入的网址
    private void getdatas(String myUrl) {

        StringRequest sr=new StringRequest(myUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                lv_bean=gson.fromJson(response,Talk_Talk_lv_Bean.class);
                adapter.setDatas(lv_bean);
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
