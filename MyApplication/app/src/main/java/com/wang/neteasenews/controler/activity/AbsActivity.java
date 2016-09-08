package com.wang.neteasenews.controler.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dllo on 16/9/8.
 * Activity的基类
 *
 */
public abstract class AbsActivity extends AppCompatActivity{



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initView();
        initdatas();
    }

    protected abstract int setLayout();
    protected abstract void initView();
    protected abstract void initdatas();

    protected void go(Context from,Class<? extends AbsActivity> to)
    {
        startActivity(new Intent(from,to));
    }
    protected void go(Context from,Class<? extends AbsActivity> to,Bundle bundle)
    {
        Intent intent=new Intent(from,to);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    protected <T extends View>T byview(int resID)
    {
        return (T)findViewById(resID);
    }

}
