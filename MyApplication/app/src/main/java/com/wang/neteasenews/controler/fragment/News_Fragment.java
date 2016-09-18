package com.wang.neteasenews.controler.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/9.
 * 新闻主界面
 */
public class News_Fragment extends AbsFragment{
    private ImageView keep_img,news_class;
    private int i=1;

    public static News_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        News_Fragment fragment = new News_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView() {
        keep_img=byView(R.id.fragment_news_keep);
        news_class=byView(R.id.new_title_img);
    }

    @Override
    protected void initDatas() {
        AnimationDrawable animationDrawable = (AnimationDrawable) keep_img.getBackground();
        animationDrawable.start();
        news_class.setOnClickListener(new View.OnClickListener() {

            private PopupWindow popupWindow;
            private View pop;

            @Override
            public void onClick(View v) {

                if(i==1) {
                    pop = LayoutInflater.from(context).inflate(R.layout.popup_news_main, null);
                    popupWindow = new PopupWindow();
                    popupWindow.setContentView(pop);
                    popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                    popupWindow.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
                    popupWindow.showAsDropDown(news_class);
                    i--;
                }
                else
                {
                    popupWindow.dismiss();
                    i++;
                }

            }
        });

    }

    @Override
    public void onPause() {
        super.onPause();
        AnimationDrawable animationDrawable= (AnimationDrawable) keep_img.getBackground();
        animationDrawable.start();
    }
}
