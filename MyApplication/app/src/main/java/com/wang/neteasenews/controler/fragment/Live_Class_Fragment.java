package com.wang.neteasenews.controler.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wang.neteasenews.R;

/**
 * Created by dllo on 16/9/14.
 */
public class Live_Class_Fragment extends AbsFragment implements View.OnClickListener{

    private RadioGroup RG1,RG2,RG3;
    private RadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5,rbtn6,rbtn7,rbtn8,rbtn9,rbtn10,rbtn11,rbtn12,rbtn13,rbtn14;


    public static Live_Class_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Live_Class_Fragment fragment = new Live_Class_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_live_class;
    }

    @Override
    protected void initView() {
        RG1=byView(R.id.live_RG1);
        RG2=byView(R.id.live_RG2);
        RG3=byView(R.id.live_RG3);

        rbtn1=byView(R.id.live_rbtn1);
        rbtn2=byView(R.id.live_rbtn2);
        rbtn3=byView(R.id.live_rbtn3);
        rbtn4=byView(R.id.live_rbtn4);
        rbtn5=byView(R.id.live_rbtn5);
        rbtn6=byView(R.id.live_rbtn6);
        rbtn7=byView(R.id.live_rbtn7);
        rbtn8=byView(R.id.live_rbtn8);
        rbtn9=byView(R.id.live_rbtn9);
        rbtn10=byView(R.id.live_rbtn10);
        rbtn11=byView(R.id.live_rbtn11);
        rbtn12=byView(R.id.live_rbtn12);
        rbtn13=byView(R.id.live_rbtn13);
        rbtn14=byView(R.id.live_rbtn14);

        rbtn1.setOnClickListener(this);
        rbtn2.setOnClickListener(this);
        rbtn3.setOnClickListener(this);
        rbtn4.setOnClickListener(this);
        rbtn5.setOnClickListener(this);
        rbtn6.setOnClickListener(this);
        rbtn7.setOnClickListener(this);
        rbtn8.setOnClickListener(this);
        rbtn9.setOnClickListener(this);
        rbtn10.setOnClickListener(this);
        rbtn11.setOnClickListener(this);
        rbtn12.setOnClickListener(this);
        rbtn13.setOnClickListener(this);
        rbtn14.setOnClickListener(this);
    }

    @Override
    protected void initDatas() {
        rbtn1.setChecked(true);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.live_rbtn1:
                RG2.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn2:
                RG2.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn3:
                RG2.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn4:
                RG2.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn5:
                RG2.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn6:
                RG1.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn7:
                RG1.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn8:
                RG1.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn9:
                RG1.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn10:
                RG1.clearCheck();
                RG3.clearCheck();
                break;
            case R.id.live_rbtn11:
                RG1.clearCheck();
                RG2.clearCheck();
                break;
            case R.id.live_rbtn12:
                RG1.clearCheck();
                RG2.clearCheck();
                break;
            case R.id.live_rbtn13:
                RG1.clearCheck();
                RG2.clearCheck();
                break;
            case R.id.live_rbtn14:
                RG1.clearCheck();
                RG2.clearCheck();
                break;

        }
    }
}
