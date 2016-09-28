package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.News_army_Bean;

/**
 * Created by dllo on 16/9/28.
 */
public class News_army_Adapter extends BaseAdapter{

    private Context context;
    private News_army_Bean bean;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setBean(News_army_Bean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bean==null?0:bean.getT1368497029546().size();
    }

    @Override
    public Object getItem(int position) {
        return bean==null?null:bean.getT1368497029546().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        if (bean.getT1368497029546().get(position).getHasAD()==1)
        {
            return 1;
            //头布局
        }
        else if (bean.getT1368497029546().get(position).getSkipType()=="photoset")
        {
            //有三张图片
            return 2;
        }
        else if (bean.getT1368497029546().get(position).getUrl_3w()!=null)
        {
            //出现最多的布局
            return 3;
        }
        else
        {
            return 4;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HeadVIewHolder vIewHolder=null;
        NopicViewHolder viewHolder1=null;
        OneViewHolder viewHolder2=null;
        ThreeViewHolder viewHolder3=null;
        int i=getItemViewType(position);
        if (convertView==null)
        {
            switch (i)
            {
                case 1:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lv1,parent,false);
                    vIewHolder=new HeadVIewHolder(convertView);
                    convertView.setTag(vIewHolder);
                    break;
                case 2:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lv1,parent,false);
                    viewHolder1=new NopicViewHolder(convertView);
                    convertView.setTag(viewHolder1);
                    break;
                case 3:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lv1,parent,false);
                    viewHolder2=new OneViewHolder(convertView);
                    convertView.setTag(viewHolder2);
                    break;
                case 4:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lv1,parent,false);
                    viewHolder3=new ThreeViewHolder(convertView);
                    convertView.setTag(viewHolder3);
                    break;
            }
        }
        else {
            switch (i)
            {
                case 1:
                    vIewHolder= (HeadVIewHolder) convertView.getTag();
                    break;
                case 2:
                    viewHolder1= (NopicViewHolder) convertView.getTag();
                    break;
                case 3:
                    viewHolder2= (OneViewHolder) convertView.getTag();
                    break;
                case 4:
                    viewHolder3= (ThreeViewHolder) convertView.getTag();
                    break;
            }

        }

        return convertView;
    }

    private class HeadVIewHolder{
        public HeadVIewHolder(View view) {
        }
    }
    private class NopicViewHolder{
        public NopicViewHolder(View view) {
        }
    }
    private class OneViewHolder{
        public OneViewHolder(View view) {
        }
    }
    private class ThreeViewHolder{
        public ThreeViewHolder(View view) {
        }
    }


}
