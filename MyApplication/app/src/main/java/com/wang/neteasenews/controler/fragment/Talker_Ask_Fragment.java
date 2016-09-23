package com.wang.neteasenews.controler.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.wang.neteasenews.controler.adapter.Talk_Ask_LV_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.Talk_ask_listView_Bean;
import com.wang.neteasenews.model.bean.Talk_ask_title_btn_Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/12.
 * 话题 问吧界面
 */
public class Talker_Ask_Fragment extends AbsFragment implements View.OnClickListener {

    private ListView listView;
    private RecyclerView title_rec;
    private Talk_Ask_LV_Adapter adapter;
    private Talk_ask_listView_Bean datas;
    private NetUrl_Bean bean;
    private RequestQueue queue;
    private String MyUrl;
    private ImageView cliimg;
    private Boolean clickornot=false;
    private Talk_ask_title_btn_Bean Titke_beans;
    private Talk_Ask_RV_Adapter rvAdapter;
    private View view;

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
        view = LayoutInflater.from(context).inflate(R.layout.talk_ask_head_view,null);

//        cliimg= (ImageView) view.findViewById(R.id.talk_ask_tlt_img);
        listView.addHeaderView(view);
        MyUrl=bean.talk_askmain;
    }

    @Override
    protected void initDatas() {
        adapter.setContext(context);
        getdatas(MyUrl);
//        rvAdapter.setContext(context);

//        setTitleDatas();
        setTitle();
    }

    //在这里设置最上方卡片中的数据
    private void setTitleDatas() {
        queue= Volley.newRequestQueue(context);
        StringRequest sr1=new StringRequest(bean.talk_askBtn, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                Titke_beans=gson.fromJson(response,Talk_ask_title_btn_Bean.class);
                if (clickornot)
                {
                    rvAdapter.setDatas(Titke_beans);
                }
                else {
                   List<Talk_ask_title_btn_Bean.DataBean> a=new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        a.add(Titke_beans.getData().get(i));
                    }
                    Talk_ask_title_btn_Bean b=new Talk_ask_title_btn_Bean();
                    b.setData(a);
                    rvAdapter.setDatas(b);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "失败了", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(sr1);
    }

    private void setTitle() {
//        if (clickornot==false)
//        {
//
//            cliimg.setImageResource(R.mipmap.downbtn);
//        }
//        else {
//
//            cliimg.setImageResource(R.mipmap.upbtn);
//        }
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

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
//            case R.id.talk_ask_tlt_img:
//
//                if (clickornot)
//                {
//                    clickornot=false;
//                }
//                else {
//                    clickornot=true;
//                }
//                setTitle();
////                setTitleDatas();
//                break;
        }
    }


    public class Talk_Ask_RV_Adapter extends RecyclerView.Adapter<Talk_Ask_RV_Adapter.ViewHolder>{

        private Talk_ask_title_btn_Bean datas;
        private Context context;

        public void setDatas(Talk_ask_title_btn_Bean datas) {
            this.datas = datas;
            notifyDataSetChanged();
        }

        public void setContext(Context context) {
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            ViewHolder viewHolder=new ViewHolder(view);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.tv.setText(datas.getData().get(position).getName());
            Picasso.with(context).load(datas.getData().get(position).getIcon()).into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return datas!=null?datas.getData().size():0;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView tv;
            ImageView imageView;
            public ViewHolder(View itemView) {
                super(itemView);
                tv = (TextView) itemView.findViewById(R.id.talk_talk_ask_rv_tv);
                imageView = (ImageView) itemView.findViewById(R.id.talk_talk_ask_rv_img);
            }
        }
    }

}
