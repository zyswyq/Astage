package com.wang.neteasenews.controler.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.fragment.News_Fragment;
import com.wang.neteasenews.controler.fragment.Person_Fragment;


public class MainActivity extends AbsActivity{

    private RadioButton news;
    private RadioGroup radioGroup;





    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        news=byview(R.id.main_rbtn_news);
        radioGroup=byview(R.id.main_rgroup);



//        news.setChecked(true);
//        transaction.replace(R.id.main_frame,new News_Fragment());
//        transaction.commit();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction transaction=fragmentManager.beginTransaction();
                switch (checkedId)
                {
                    case R.id.main_rbtn_news:
                        transaction.replace(R.id.main_frame,new News_Fragment());
                        transaction.commit();
                        break;
                    case R.id.main_rbtn_keep:
                        transaction.replace(R.id.main_frame,new News_Fragment());
                        transaction.commit();
                        break;
                    case R.id.main_rbtn_talk:
                        transaction.replace(R.id.main_frame,new News_Fragment());
                        transaction.commit();
                        break;
                    case R.id.main_rbtn_person:
                        transaction.replace(R.id.main_frame,new Person_Fragment());
                        transaction.commit();
                        break;
                }
            }
        });



    }

    @Override
    protected void initdatas() {

    }


}
