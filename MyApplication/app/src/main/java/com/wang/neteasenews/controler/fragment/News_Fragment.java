package com.wang.neteasenews.controler.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/9.
 */
public class News_Fragment extends AbsFragment{
    ImageView keep_img;
    @Override
    protected int setLayout() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView() {

        keep_img=byView(R.id.fragment_news_keep);
    }

    @Override
    protected void initDatas() {
        AnimationDrawable animationDrawable= (AnimationDrawable) keep_img.getBackground();
        animationDrawable.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        AnimationDrawable animationDrawable= (AnimationDrawable) keep_img.getBackground();
        animationDrawable.start();
    }
}
