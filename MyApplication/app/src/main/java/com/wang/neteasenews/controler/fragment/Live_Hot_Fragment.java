package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Live_Hot_LV_Adapter;
import com.wang.neteasenews.model.bean.Live_Hot_All_Bean;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.Rotate_Bean;
import com.wang.neteasenews.utils.RotateimgDemo;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/14.
 * 直播热门 界面
 */
public class Live_Hot_Fragment extends AbsFragment{

    private ListView hotllv;
    private Live_Hot_LV_Adapter myadapter;
    private List<Rotate_Bean> datas;
    public static Live_Hot_Fragment newInstance() {
        Bundle args = new Bundle();
        Live_Hot_Fragment fragment = new Live_Hot_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_live_hot;
    }

    @Override
    protected void initView() {
        hotllv=byView(R.id.live_hot_lv);

        myadapter=new Live_Hot_LV_Adapter();
        hotllv.setAdapter(myadapter);

    }

    @Override
    protected void initDatas() {
        myadapter.setContext(context);
        getwebData();
    }

    private void getwebData() {
        RequestQueue queue= Volley.newRequestQueue(context);
        JsonObjectRequest sr=new JsonObjectRequest(NetUrl_Bean.live_hot, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Gson gson=new Gson();
                Live_Hot_All_Bean bean=gson.fromJson(response.toString(),Live_Hot_All_Bean.class);
                myadapter.setDatas(bean);

                RotateimgDemo rotateimgDemo = new RotateimgDemo();
                datas=new ArrayList<>();
                for (int i = 0; i <bean.getTop().size() ; i++) {
                    Rotate_Bean a=new Rotate_Bean(bean.getTop().get(i).getRoomName(),bean.getTop().get(i).getImage(),bean.getTop().get(i).getSource());
                    datas.add(a);
                }
                View view= rotateimgDemo.Rotate(datas,context);
                hotllv.addHeaderView(view);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        queue.add(sr);
    }


}
