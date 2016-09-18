package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.activity.SignInActivity;


/**
 * Created by dllo on 16/9/10.
 * 个人主界面
 */
public class Person_Fragment extends AbsFragment implements View.OnClickListener {
    private Button signBtn;


    public static Person_Fragment newInstance() {
        Bundle args = new Bundle();
        Person_Fragment fragment = new Person_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_person;
    }

    @Override
    protected void initView() {
        signBtn=byView(R.id.person_signin_btn);
        signBtn.setOnClickListener(this);
    }

    @Override
    protected void initDatas() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.person_signin_btn:
                go(SignInActivity.class);
                break;
        }
    }
}
