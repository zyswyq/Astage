package com.wang.neteasenews.controler.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wang.neteasenews.R;
import com.wang.neteasenews.model.bean.Rotate_Bean;

import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class Rotate_vp_Adapter extends PagerAdapter{
    private List<Rotate_Bean> datas;
    private Context context;
    private LayoutInflater inflater;

    public Rotate_vp_Adapter(List<Rotate_Bean> datas, Context context) {
        this.datas = datas;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public Rotate_vp_Adapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setDatas(List<Rotate_Bean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        // 为了让ViewPager到最后一页不会像翻书一样回到第一页
        // 设置页数为int最大值,这样向下滑动永远都是下一页
        return datas == null ? 0 : Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // position是int最大值所以这里可能是几百甚至上千,因此取余避免数组越界
        int newPosition = position % datas.size();
        View convertView = inflater.inflate(R.layout.item_rotate, container, false);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.romate_item_iv);
        TextView textView = (TextView) convertView.findViewById(R.id.romate_item_tv);
        textView.setText(datas.get(newPosition).getText());
//        imageView.setImageResource(datas.get(newPosition).getImgId());
        Picasso.with(context).load(datas.get(newPosition).getImgurl()).into(imageView);

        container.addView(convertView);
        return convertView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}
