package com.wang.neteasenews.controler.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wang.neteasenews.controler.activity.AbsActivity;

/**
 * Created by dllo on 16/9/8.
 */
public abstract class AbsFragment extends Fragment{

    protected Context context;
    protected abstract int setLayout();
    protected abstract void initView();
    protected abstract void initDatas();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(setLayout(),container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDatas();
    }

    protected <T extends View>T byView(int resID)
    {
        return (T)getView().findViewById(resID);
    }

    protected void go(Class<? extends AbsActivity> to)
    {
        context.startActivity(new Intent(context,to));
    }

    protected void go(Class<? extends AbsActivity> to,Bundle bundle)
    {
        Intent intent=new Intent(context,to);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
