package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.News_NBA_Bean;

/**
 * Created by dllo on 16/9/29.
 */
public class News_NBA_Adapter extends BaseAdapter{

    private Context context;
    private News_NBA_Bean bean;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setBean(News_NBA_Bean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bean.getT1348649145984()==null?0:bean.getT1348649145984().size();
    }

    @Override
    public Object getItem(int position) {
        return bean.getT1348649145984()==null?null:bean.getT1348649145984().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0)
        {
            return 0;
            //头布局
        }
        else if ("sports2_bbs".equals(bean.getT1348649145984().get(position).getBoardid())||bean.getT1348649145984().get(position).getImgextra()==null)
        {
            //出现最多的布局
            return 1;
        }
        else
        {
            Log.d("News_army_Adapter", "3");
            //有三张图片
            return 2;
        }

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HeadVIewHolder headvIewHolder=null;
        NopicViewHolder nomalviewHolder1=null;
        ThreeViewHolder threeviewHolder2=null;

        if (convertView==null)
        {
            switch (getItemViewType(position))
            {
                case 0:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lvhead,parent,false);
                    headvIewHolder=new HeadVIewHolder(convertView);
                    convertView.setTag(headvIewHolder);
                    break;
                case 1:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lvnomal,parent,false);
                    nomalviewHolder1=new NopicViewHolder(convertView);
                    convertView.setTag(nomalviewHolder1);
                    break;
                case 2:
                    convertView= LayoutInflater.from(context).inflate(R.layout.item_news_lvthree,parent,false);
                    threeviewHolder2= new ThreeViewHolder(convertView);
                    convertView.setTag(threeviewHolder2);
                    break;

            }
        }
        else {
            switch (getItemViewType(position))
            {
                case 0:
                    headvIewHolder= (HeadVIewHolder) convertView.getTag();
                    break;
                case 1:
                    nomalviewHolder1= (NopicViewHolder) convertView.getTag();
                    break;
                case 2:
                    threeviewHolder2= (ThreeViewHolder) convertView.getTag();
                    break;

            }

            switch (getItemViewType(position))
            {
                case 0:
                    headvIewHolder.lvheadtv.setText(bean.getT1348649145984().get(position).getTitle());
                    Picasso.with(context).load(bean.getT1348649145984().get(position).getImgsrc()).into(headvIewHolder.lvheadimg);
                    Log.d("News_army_Adapter", "54");
                    break;
                case 1:
                    nomalviewHolder1.lvnomaltit.setText(bean.getT1348649145984().get(position).getTitle());
                    Picasso.with(context).load(bean.getT1348649145984().get(position).getImgsrc()).into(nomalviewHolder1.lvnomalimg);
                    nomalviewHolder1.lvnomalfrom.setText(bean.getT1348649145984().get(position).getSource());
                    nomalviewHolder1.lvnomalans.setText(bean.getT1348649145984().get(position).getReplyCount()+"跟帖");
                    Log.d("News_army_Adapter", "53");
                    break;
                case 2:
                    Picasso.with(context).load(bean.getT1348649145984().get(position).getImgsrc()).into(threeviewHolder2.lvthreeimg1);
                    Picasso.with(context).load(bean.getT1348649145984().get(position).getImgextra().get(0).getImgsrc()).into(threeviewHolder2.lvthreeimg2);
                    Picasso.with(context).load(bean.getT1348649145984().get(position).getImgextra().get(1).getImgsrc()).into(threeviewHolder2.lvthreeimg3);
                    threeviewHolder2.lvthreetit.setText(bean.getT1348649145984().get(position).getTitle());
                    threeviewHolder2.lvthreefrom.setText(bean.getT1348649145984().get(position).getSource());
                    threeviewHolder2.lvthreeans.setText(bean.getT1348649145984().get(position).getReplyCount()+"跟帖");
                    Log.d("News_army_Adapter", "52");
                    break;
            }

        }

        return convertView;
    }

    private class HeadVIewHolder{
        private ImageView lvheadimg;
        private TextView lvheadtv;
        public HeadVIewHolder(View view) {
            lvheadimg = (ImageView) view.findViewById(R.id.news_lvhead_img);
            lvheadtv = (TextView) view.findViewById(R.id.news_lvhead_tv);
        }
    }
    private class NopicViewHolder{
        private ImageView lvnomalimg;
        private TextView lvnomaltit,lvnomalfrom,lvnomalans;
        public NopicViewHolder(View view) {
            lvnomalimg = (ImageView) view.findViewById(R.id.news_lvnomal_img);
            lvnomaltit = (TextView) view.findViewById(R.id.news_lvnomal_title);
            lvnomalfrom = (TextView) view.findViewById(R.id.news_lvnomal_from);
            lvnomalans = (TextView) view.findViewById(R.id.news_lvnomal_ans);
        }
    }
    private class ThreeViewHolder{
        private ImageView lvthreeimg1,lvthreeimg2,lvthreeimg3;
        private TextView lvthreetit,lvthreefrom,lvthreeans;
        public ThreeViewHolder(View view) {
            lvthreeimg1 = (ImageView) view.findViewById(R.id.news_lvthree_img1);
            lvthreeimg2 = (ImageView) view.findViewById(R.id.news_lvthree_img2);
            lvthreeimg3 = (ImageView) view.findViewById(R.id.news_lvthree_img3);
            lvthreetit = (TextView) view.findViewById(R.id.news_lvthree_title);
            lvthreefrom = (TextView) view.findViewById(R.id.news_lvthree_from);
            lvthreeans = (TextView) view.findViewById(R.id.news_lvthree_ans);
        }
    }

}
