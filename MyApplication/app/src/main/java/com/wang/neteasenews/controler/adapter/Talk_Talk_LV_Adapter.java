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
import com.wang.neteasenews.model.bean.Talk_Talk_lv_Bean;

/**
 * Created by dllo on 16/9/21.
 * 话题_话题listview适配器
 *
 */
public class Talk_Talk_LV_Adapter extends BaseAdapter {


    private int type1 = 0;
    private int type2 = 1;
    private Context context;
    private Talk_Talk_lv_Bean datas;

    public void setDatas(Talk_Talk_lv_Bean datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (datas.getData().getSubjectList().get(position).getType() != 0) {
            return type2;
        } else {
            return type1;
        }
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.getData().getSubjectList().size();
    }

    @Override
    public Object getItem(int position) {
        return datas == null ? null : datas.getData().getSubjectList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder viewHolder = null;
        MyViewHolder1 viewHolder1 = null;
        int type = getItemViewType(position);


        if (convertView == null) {
            switch (type) {
                case 0:
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_talk_talk_lv, parent, false);
                    viewHolder = new MyViewHolder(convertView);
                    convertView.setTag(viewHolder);
                    break;
                case 1:
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_talk_talk_lv2, parent, false);
                    viewHolder1 = new MyViewHolder1(convertView);
                    convertView.setTag(viewHolder1);
            }

        } else {
            switch (type) {
                case 0:
                    viewHolder = (MyViewHolder) convertView.getTag();
                    break;
                case 1:
                    viewHolder1 = (MyViewHolder1) convertView.getTag();
                    break;
            }

        }
        switch (type) {
            case 0:
                viewHolder.care.setText(datas.getData().getSubjectList().get(position).getConcernCount()+"");
                viewHolder.answer.setText(datas.getData().getSubjectList().get(position).getTalkCount()+"");
                viewHolder.fclass.setText(datas.getData().getSubjectList().get(position).getClassification());
                viewHolder.title.setText("#"+datas.getData().getSubjectList().get(position).getName()+"#");
                if (!datas.getData().getSubjectList().get(position).getTalkContent().get(0).getUserHeadPicUrl().isEmpty() && datas.getData().getSubjectList().get(position).getTalkContent().get(0).getUserHeadPicUrl() != null) {
                    Picasso.with(context).load(datas.getData().getSubjectList().get(position).getTalkContent().get(0).getUserHeadPicUrl()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).resize(90,90).into(viewHolder.ans1img);
                } else {
                    viewHolder.ans1img.setImageResource(R.mipmap.morenperson);
                }

                if (!datas.getData().getSubjectList().get(position).getTalkContent().get(1).getUserHeadPicUrl().isEmpty() && datas.getData().getSubjectList().get(position).getTalkContent().get(1).getUserHeadPicUrl() != null) {
                    Picasso.with(context).load(datas.getData().getSubjectList().get(position).getTalkContent().get(1).getUserHeadPicUrl()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).resize(90,90).into(viewHolder.ans2img);
                } else {
                    viewHolder.ans2img.setImageResource(R.mipmap.morenperson);
                }
                viewHolder.ans1.setText(datas.getData().getSubjectList().get(position).getTalkContent().get(0).getContent());
                viewHolder.ans2.setText(datas.getData().getSubjectList().get(position).getTalkContent().get(1).getContent());
                break;
            case 1:
                viewHolder1.title1.setText("#"+datas.getData().getSubjectList().get(position).getName()+"#");
                viewHolder1.ans1.setText(datas.getData().getSubjectList().get(position).getTalkCount()+"");
                viewHolder1.fclass1.setText(datas.getData().getSubjectList().get(position).getClassification());
                viewHolder1.care1.setText(datas.getData().getSubjectList().get(position).getConcernCount()+"");

                Picasso.with(context).load(datas.getData().getSubjectList().get(position).getTalkPicture().get(0)).error(R.mipmap.ic_launcher).into(viewHolder1.showimg1);
                Picasso.with(context).load(datas.getData().getSubjectList().get(position).getTalkPicture().get(1)).error(R.mipmap.ic_launcher).into(viewHolder1.showimg2);
                Picasso.with(context).load(datas.getData().getSubjectList().get(position).getTalkPicture().get(2)).error(R.mipmap.ic_launcher).into(viewHolder1.showimg3);

                break;
        }
        return convertView;

    }

    private class MyViewHolder {
        private TextView title, ans1, ans2, fclass, care, answer;
        private ImageView ans1img, ans2img;

        public MyViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.item_talk_talk_title);
            ans1 = (TextView) view.findViewById(R.id.item_talk_talk_person_tv);
            ans2 = (TextView) view.findViewById(R.id.item_talk_talk_person_tv2);
            fclass = (TextView) view.findViewById(R.id.item_talk_talk_class_tv);
            care = (TextView) view.findViewById(R.id.item_talk_talk_care_tv);
            answer = (TextView) view.findViewById(R.id.item_talk_talk_answer_tv);

            ans1img = (ImageView) view.findViewById(R.id.item_talk_talk_person_img);
            ans2img = (ImageView) view.findViewById(R.id.item_talk_talk_person_img2);
        }
    }

    private class MyViewHolder1 {
        private ImageView showimg1,showimg2,showimg3;
        private TextView title1,care1,ans1,fclass1;
        public MyViewHolder1(View convertView) {
            showimg1 = (ImageView) convertView.findViewById(R.id.item_talk_talk_show1);
            showimg2 = (ImageView) convertView.findViewById(R.id.item_talk_talk_show2);
            showimg3 = (ImageView) convertView.findViewById(R.id.item_talk_talk_show3);

            title1 = (TextView) convertView.findViewById(R.id.item_talk_talk_title1);
            fclass1 = (TextView) convertView.findViewById(R.id.item_talk_talk_class_tv1);
            care1 = (TextView) convertView.findViewById(R.id.item_talk_talk_care_tv1);
            ans1 = (TextView) convertView.findViewById(R.id.item_talk_talk_answer_tv1);
        }
    }

}
