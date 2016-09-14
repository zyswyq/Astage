package com.wang.neteasenews.controler.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wang.neteasenews.R;
import com.wang.neteasenews.controler.fragment.Live_Fragment;
import com.wang.neteasenews.controler.fragment.News_Fragment;
import com.wang.neteasenews.controler.fragment.Person_Fragment;
import com.wang.neteasenews.controler.fragment.Talker_Fragment;


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

        FragmentManager fragmentManager1=getSupportFragmentManager();
        final FragmentTransaction transaction1=fragmentManager1.beginTransaction();

        news.setChecked(true);
        transaction1.replace(R.id.main_frame,new News_Fragment());
        transaction1.commit();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction transaction=fragmentManager.beginTransaction();
                switch (checkedId)
                {
                    case R.id.main_rbtn_news:
                        transaction.replace(R.id.main_frame, News_Fragment.newInstance());
                        transaction.commit();
                        break;
                    case R.id.main_rbtn_keep:
                        transaction.replace(R.id.main_frame, Live_Fragment.newInstance());
                        transaction.commit();
                        break;
                    case R.id.main_rbtn_talk:
                        transaction.replace(R.id.main_frame,Talker_Fragment.newInstance());
                        transaction.commit();
                        break;
                    case R.id.main_rbtn_person:
                        transaction.replace(R.id.main_frame,Person_Fragment.newInstance());
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
