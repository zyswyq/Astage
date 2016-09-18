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
import com.wang.neteasenews.model.bean.Live_class_All_Bean;
import com.wang.neteasenews.utils.ScreenSizeUtil;

/**
 * Created by dllo on 16/9/15.
 * 直播分类 listView的适配器
 */
public class Live_Class_LV_Adapter extends BaseAdapter{

    private Live_class_All_Bean datas;
    private Context context;

    public void setDatas(Live_class_All_Bean datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public Live_Class_LV_Adapter(Context context) {
        this.context = context;
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
        ViewHolder viewHolder=null;
        if (convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.item_live_class,parent,false);

            int height= ScreenSizeUtil.getScreenheight(context);
            ViewGroup.LayoutParams params=convertView.getLayoutParams();
            params.height=height/4;
            convertView.setLayoutParams(params);

            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else
        {
            viewHolder= (ViewHolder) convertView.getTag();
        }


        viewHolder.titleTv.setText(datas.getLive_review().get(position).getRoomName().toLowerCase());
        viewHolder.tagTv.setText(datas.getLive_review().get(position).getUserCount()+"参与");
        Picasso.with(context).load(datas.getLive_review().get(position).getImage()).into(viewHolder.backimg);

        return convertView;
    }

    private class ViewHolder
    {
        ImageView backimg,tagimg;
        TextView titleTv,tagTv;
        public ViewHolder(View view) {
            backimg = (ImageView) view.findViewById(R.id.item_live_class_back);
            tagimg = (ImageView) view.findViewById(R.id.item_live_class_tag);
            titleTv = (TextView) view.findViewById(R.id.item_live_class_title);
            tagTv = (TextView) view.findViewById(R.id.item_live_class_personCount);
        }
    }
}
