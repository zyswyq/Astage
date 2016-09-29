package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.News_duanzi_Bean;

/**
 * Created by dllo on 16/9/29.
 */
public class News_duanzi_Adapter extends BaseAdapter{

    private Context context;
    private News_duanzi_Bean datas;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setDatas(News_duanzi_Bean datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas.get段子()==null?0:datas.get段子().size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get段子()==null?null:datas.get段子().get(position);
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
            convertView= LayoutInflater.from(context).inflate(R.layout.item_news_card,parent,false);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.zan.setText(datas.get段子().get(position).getUpTimes()+"");
        viewHolder.cai.setText(datas.get段子().get(position).getDownTimes()+"");
        viewHolder.tv.setText(datas.get段子().get(position).getDigest());
        if (datas.get段子().get(position).getImg()!=null)
        {
            Picasso.with(context).load(datas.get段子().get(position).getImg()).into(viewHolder.img);
            viewHolder.img.setVisibility(View.VISIBLE);
        }
        viewHolder.ans.setText(datas.get段子().get(position).getReplyCount()+"");
        return convertView;
    }

    private class ViewHolder{
        ImageView img;
        RadioButton zan,cai;
        TextView tv,ans;
        public ViewHolder(View view) {
            img = (ImageView) view.findViewById(R.id.news_duanzi_img);
            zan = (RadioButton) view.findViewById(R.id.news_duanzi_zan);
            cai = (RadioButton) view.findViewById(R.id.news_duanzi_cai);
            tv = (TextView) view.findViewById(R.id.news_duanzi_tv);
            ans = (TextView) view.findViewById(R.id.news_duanzi_anstv);
        }
    }
}
