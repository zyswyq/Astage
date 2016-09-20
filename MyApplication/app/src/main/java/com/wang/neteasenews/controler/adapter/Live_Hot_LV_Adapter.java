package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.wang.neteasenews.model.bean.Live_Hot_All_Bean;

/**
 * Created by dllo on 16/9/18.
 */
public class Live_Hot_LV_Adapter extends BaseAdapter{

    private Context context;
    private Live_Hot_All_Bean datas;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setDatas(Live_Hot_All_Bean datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas==null?0:datas.getLive_review().size();
    }

    @Override
    public Object getItem(int position) {
        return datas==null?null:datas.getLive_review().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView;
    }

    private class ViewHolder
    {

        public ViewHolder(View view) {
        }
    }
}
