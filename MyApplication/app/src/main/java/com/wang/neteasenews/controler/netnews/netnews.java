package com.wang.neteasenews.controler.netnews;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/9/8.
 * 提供context
 *
 */
public class netnews extends Application{
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
