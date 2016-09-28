package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.gson.Gson;
import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Talk_Ask_LV_Adapter;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.Talk_ask_listView_Bean;
import com.wang.neteasenews.model.bean.Talk_ask_title_btn_Bean;
import com.wang.neteasenews.model.net.VolleyInstance;
import com.wang.neteasenews.model.net.VolleyResult;

/**
 * Created by dllo on 16/9/12.
 * 话题 问吧界面
 */
public class Talker_Ask_Fragment extends AbsFragment implements View.OnClickListener {

    private ListView listView;
    private Talk_Ask_LV_Adapter adapter;
    private Talk_ask_listView_Bean datas;
    private NetUrl_Bean bean;
    private String MyUrl;
    private ImageView cliimg;
    private Boolean clickornot=false;
    private Talk_ask_title_btn_Bean Titke_beans;
    private View view;
    private LinearLayout line1,line2;

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
        view = LayoutInflater.from(context).inflate(R.layout.head_talk_ask_view,null);
        cliimg= (ImageView) view.findViewById(R.id.talk_ask_tlt_img);
        MyUrl=bean.talk_askmain;
        line1= (LinearLayout) view.findViewById(R.id.head_talk_ask_line1);
        line2= (LinearLayout) view.findViewById(R.id.head_talk_ask_line2);
    }

    @Override
    protected void initDatas() {
        adapter.setContext(context);
        listView.addHeaderView(view);
        getdatas(MyUrl);
        setTitle();

        cliimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickornot)
                {
                    clickornot=false;
                }
                else {
                    clickornot=true;
                }
                setTitle();
            }
        });
    }


    private void setTitle() {
        if (clickornot==false)
        {
            cliimg.setImageResource(R.mipmap.downbtn);
            line1.setVisibility(View.GONE);
            line2.setVisibility(View.GONE);

        }
        else {

            cliimg.setImageResource(R.mipmap.upbtn);
            line1.setVisibility(View.VISIBLE);
            line2.setVisibility(View.VISIBLE);
        }
    }

    //解析传入的网址
    private void getdatas(String myUrl) {
        VolleyInstance.getInstance().startRequest(bean.talk_askmain, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Log.d("MainActivity", resultStr);
                Gson gson=new Gson();
                Talk_ask_listView_Bean Mybean=gson.fromJson(resultStr,Talk_ask_listView_Bean.class);
                adapter.setDatas(Mybean);
            }

            @Override
            public void failture() {

            }
        });

    }

    @Override
    public void onClick(View v) {
    }







//    public class Talk_Ask_RV_Adapter extends RecyclerView.Adapter<Talk_Ask_RV_Adapter.ViewHolder>{
//
//        private Talk_ask_title_btn_Bean datas;
//        private Context context;
//
//        public void setDatas(Talk_ask_title_btn_Bean datas) {
//            this.datas = datas;
//            notifyDataSetChanged();
//        }
//
//        public void setContext(Context context) {
//            this.context = context;
//        }
//
//        @Override
//        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            ViewHolder viewHolder=new ViewHolder(view);
//            return viewHolder;
//        }
//
//        @Override
//        public void onBindViewHolder(ViewHolder holder, int position) {
//            holder.tv.setText(datas.getData().get(position).getName());
//            Picasso.with(context).load(datas.getData().get(position).getIcon()).into(holder.imageView);
//        }
//
//        @Override
//        public int getItemCount() {
//            return datas!=null?datas.getData().size():0;
//        }
//
//        public class ViewHolder extends RecyclerView.ViewHolder {
//            TextView tv;
//            ImageView imageView;
//            public ViewHolder(View itemView) {
//                super(itemView);
//                tv = (TextView) itemView.findViewById(R.id.talk_talk_ask_rv_tv);
//                imageView = (ImageView) itemView.findViewById(R.id.talk_talk_ask_rv_img);
//            }
//        }
//    }

}
