package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.Talk_ask_listView_Bean;

/**
 * Created by dllo on 16/9/18.
 */
public class Talk_Ask_LV_Adapter extends BaseAdapter{


    private Talk_ask_listView_Bean datas;
    private Context context;

    public void setDatas(Talk_ask_listView_Bean datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return datas!=null?datas.getData().getExpertList().size():0;
    }

    @Override
    public Object getItem(int position) {
        return datas!=null?datas.getData().getExpertList().get(position):null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.item_talk_ask_lv,parent,false);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.perTv.setText(datas.getData().getExpertList().get(position).getName()+"/"+datas.getData().getExpertList().get(position).getTitle());
        Picasso.with(context).load(datas.getData().getExpertList().get(position).getHeadpicurl()).into(viewHolder.personimg);
        Picasso.with(context).load(datas.getData().getExpertList().get(position).getPicurl()).into(viewHolder.backimg);
        viewHolder.main_tv.setText(datas.getData().getExpertList().get(position).getDescription());
        viewHolder.class_tv.setText(datas.getData().getExpertList().get(position).getClassification());
        viewHolder.care_tv.setText(datas.getData().getExpertList().get(position).getConcernCount()+"关注");
        viewHolder.answer_tv.setText(datas.getData().getExpertList().get(position).getAnswerCount()+"提问");
        return convertView;
    }



    public  class ViewHolder
    {
        TextView perTv,main_tv,class_tv,care_tv,answer_tv;
        ImageView backimg,personimg;
        public ViewHolder(View view) {
            perTv = (TextView) view.findViewById(R.id.talk_talk_ask_person_tv);
            main_tv = (TextView) view.findViewById(R.id.talk_talk_ask_main_tv);
            care_tv = (TextView) view.findViewById(R.id.talk_ask_care_tv);
            class_tv = (TextView) view.findViewById(R.id.talk_ask_class_tv);
            answer_tv = (TextView) view.findViewById(R.id.talk_ask_answer_tv);
            backimg = (ImageView) view.findViewById(R.id.talk_talk_ask_back_img);
            personimg = (ImageView) view.findViewById(R.id.talk_talk_ask_person_img);
        }
    }
}
