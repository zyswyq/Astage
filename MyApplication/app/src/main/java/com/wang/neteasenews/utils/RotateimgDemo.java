package com.wang.neteasenews.utils;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.adapter.Rotate_vp_Adapter;
import com.wang.neteasenews.controler.netnews.Netnews;
import com.wang.neteasenews.model.bean.Rotate_Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class RotateimgDemo {

    private static final int TIME = 3000;

    private ViewPager viewPager;
    private LinearLayout pointLl;// 轮播状态改变的小圆点容器
    private List<Rotate_Bean> datas;
    private Rotate_vp_Adapter vpAdapter;
    private Context context1;

    public View Rotate(List<Rotate_Bean> bean, Context context)
    {
        context1=context;
        View view= LayoutInflater.from(Netnews.getContext()).inflate(R.layout.head_rotatrimgdemo,null);
        viewPager = (ViewPager) view.findViewById(R.id.rotate_vp);
        pointLl = (LinearLayout) view.findViewById(R.id.rotate_point_container);

        // 构造数据
        datas=new ArrayList<>();
        datas=bean;
        vpAdapter = new Rotate_vp_Adapter(datas, context1);
        viewPager.setAdapter(vpAdapter);
        // ViewPager的页数为int最大值,设置当前页多一些,可以上来就向前滑动
        // 为了保证第一页始终为数据的第0条 取余要为0,因此设置数据集合大小的倍数
        viewPager.setCurrentItem(datas.size() * 100);

        // 开始轮播
        handler = new Handler();
        startRotate();
        // 添加轮播小点
        addPoints();
        // 随着轮播改变小点
        changePoints();
        return view;
    }
    private void changePoints() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                    for (int i = 0; i < datas.size(); i++) {
                        ImageView pointIv = (ImageView) pointLl.getChildAt(i);
                        pointIv.setImageResource(R.mipmap.point_white);
                    }
                    // 设置当前位置小点为灰色
                    ImageView iv = (ImageView) pointLl.getChildAt(position % datas.size());
                    iv.setImageResource(R.mipmap.point_grey);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    /**
     * 添加轮播切换小点
     */
    private void addPoints() {
        // 有多少张图加载多少个小点
        for (int i = 0; i < datas.size(); i++) {
            ImageView pointIv = new ImageView(context1);
            pointIv.setPadding(5,5,5,5);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(20,20);
            pointIv.setLayoutParams(params);

            // 设置第0页小点的为灰色
            if (i == 0) {
                pointIv.setImageResource(R.mipmap.point_grey);
            } else {
                pointIv.setImageResource(R.mipmap.point_white);
            }
            pointLl.addView(pointIv);
        }
    }


    private Handler handler;
//    private boolean isRotate = false;
    private Runnable rotateRunnable;

    /**
     * 开始轮播
     */
    private void startRotate() {
        rotateRunnable = new Runnable() {
            @Override
            public void run() {
                int nowIndex = viewPager.getCurrentItem();
                viewPager.setCurrentItem(++nowIndex);

                    handler.postDelayed(rotateRunnable, TIME);

            }
        };
        handler.postDelayed(rotateRunnable, TIME);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        isRotate = true;
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        isRotate = false;
//    }


}
