package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.NetUrl_Bean;
import com.wang.neteasenews.model.bean.Talk_Talk_lv_Bean;
import com.wang.neteasenews.model.bean.Talk_ask_listView_Bean;

/**
 * Created by dllo on 16/9/14.
 * 话题 关注界面
 */
public class Talker_Care_Fragment extends AbsFragment{

    ImageView cardimg1,cardimg2,cardimg3,cardimg4,cardimg5,cardimg6,cardimg7,cardimg8;
    TextView card1tv1,card1tv2,card1tv3,card2tv1,card2tv2,card2tv3,card3tv1,card3tv2,card3tv3,card4tv1,card4tv2,card4tv3,card5tv1,card5tv2,card5tv3,card6tv1,card6tv2,card6tv3,card7tv1,card7tv2,card7tv3,card8tv1,card8tv2,card8tv3;
    private NetUrl_Bean url;
    private RequestQueue queue;

    public static Talker_Care_Fragment newInstance() {
        
        Bundle args = new Bundle();
        Talker_Care_Fragment fragment = new Talker_Care_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_talk_care;
    }

    @Override
    protected void initView() {
        cardimg1=byView(R.id.talk_care_card1_img1);
        cardimg2=byView(R.id.talk_care_card2_img1);
        cardimg3=byView(R.id.talk_care_card3_img1);
        cardimg4=byView(R.id.talk_care_card4_img1);
        cardimg5=byView(R.id.talk_care_card5_img1);
        cardimg6=byView(R.id.talk_care_card6_img1);
        cardimg7=byView(R.id.talk_care_card7_img1);
        cardimg8=byView(R.id.talk_care_card8_img1);

        card1tv1=byView(R.id.talk_care_card1_tv);
        card1tv2=byView(R.id.talk_care_card1_tv2);
        card1tv3=byView(R.id.talk_care_card1_tv3);
        card2tv1=byView(R.id.talk_care_card2_tv);
        card2tv2=byView(R.id.talk_care_card2_tv2);
        card2tv3=byView(R.id.talk_care_card2_tv3);
        card3tv1=byView(R.id.talk_care_card3_tv);
        card3tv2=byView(R.id.talk_care_card3_tv2);
        card3tv3=byView(R.id.talk_care_card3_tv3);
        card4tv1=byView(R.id.talk_care_card4_tv);
        card4tv2=byView(R.id.talk_care_card4_tv2);
        card4tv3=byView(R.id.talk_care_card4_tv3);
        card5tv1=byView(R.id.talk_care_card5_tv);
        card5tv2=byView(R.id.talk_care_card5_tv2);
        card5tv3=byView(R.id.talk_care_card5_tv3);
        card6tv1=byView(R.id.talk_care_card6_tv);
        card6tv2=byView(R.id.talk_care_card6_tv2);
        card6tv3=byView(R.id.talk_care_card6_tv3);
        card7tv1=byView(R.id.talk_care_card7_tv);
        card7tv2=byView(R.id.talk_care_card7_tv2);
        card7tv3=byView(R.id.talk_care_card7_tv3);
        card8tv1=byView(R.id.talk_care_card8_tv);
        card8tv2=byView(R.id.talk_care_card8_tv2);
        card8tv3=byView(R.id.talk_care_card8_tv3);

    }

    @Override
    protected void initDatas() {
        setDAtas();
    }

    private void setDAtas() {
        queue= Volley.newRequestQueue(context);
        StringRequest sr=new StringRequest(url.talk_askmain, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                Talk_ask_listView_Bean bean=gson.fromJson(response,Talk_ask_listView_Bean.class);
                Picasso.with(context).load(bean.getData().getExpertList().get(0).getHeadpicurl()).into(cardimg5);
                Picasso.with(context).load(bean.getData().getExpertList().get(1).getHeadpicurl()).into(cardimg6);
                Picasso.with(context).load(bean.getData().getExpertList().get(2).getHeadpicurl()).into(cardimg7);
                Picasso.with(context).load(bean.getData().getExpertList().get(3).getHeadpicurl()).into(cardimg8);
                card5tv1.setText(bean.getData().getExpertList().get(0).getName());
                card6tv1.setText(bean.getData().getExpertList().get(1).getName());
                card7tv1.setText(bean.getData().getExpertList().get(2).getName());
                card8tv1.setText(bean.getData().getExpertList().get(3).getName());
                card5tv2.setText(bean.getData().getExpertList().get(0).getConcernCount()+"关注");
                card6tv2.setText(bean.getData().getExpertList().get(1).getConcernCount()+"关注");
                card7tv2.setText(bean.getData().getExpertList().get(2).getConcernCount()+"关注");
                card8tv2.setText(bean.getData().getExpertList().get(3).getConcernCount()+"关注");
                card5tv3.setText(bean.getData().getExpertList().get(0).getAnswerCount()+"提问");
                card6tv3.setText(bean.getData().getExpertList().get(1).getAnswerCount()+"提问");
                card7tv3.setText(bean.getData().getExpertList().get(2).getAnswerCount()+"提问");
                card8tv3.setText(bean.getData().getExpertList().get(3).getAnswerCount()+"提问");

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        StringRequest sr1=new StringRequest(url.talk_talkmain, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                Talk_Talk_lv_Bean bean=gson.fromJson(response,Talk_Talk_lv_Bean.class);
                Picasso.with(context).load(bean.getData().getSubjectList().get(0).getPicurl()).into(cardimg1);
                Picasso.with(context).load(bean.getData().getSubjectList().get(1).getPicurl()).into(cardimg2);
                Picasso.with(context).load(bean.getData().getSubjectList().get(2).getPicurl()).into(cardimg3);
                Picasso.with(context).load(bean.getData().getSubjectList().get(3).getPicurl()).into(cardimg4);
                card1tv1.setText(bean.getData().getSubjectList().get(0).getName());
                card2tv1.setText(bean.getData().getSubjectList().get(1).getName());
                card3tv1.setText(bean.getData().getSubjectList().get(2).getName());
                card4tv1.setText(bean.getData().getSubjectList().get(3).getName());
                card1tv2.setText(bean.getData().getSubjectList().get(0).getConcernCount()+"关注");
                card2tv2.setText(bean.getData().getSubjectList().get(1).getConcernCount()+"关注");
                card3tv2.setText(bean.getData().getSubjectList().get(2).getConcernCount()+"关注");
                card4tv2.setText(bean.getData().getSubjectList().get(3).getConcernCount()+"关注");
                card1tv3.setText(bean.getData().getSubjectList().get(0).getTalkCount()+"提问");
                card2tv3.setText(bean.getData().getSubjectList().get(1).getTalkCount()+"提问");
                card3tv3.setText(bean.getData().getSubjectList().get(2).getTalkCount()+"提问");
                card4tv3.setText(bean.getData().getSubjectList().get(3).getTalkCount()+"提问");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(sr);
        queue.add(sr1);

    }
}
