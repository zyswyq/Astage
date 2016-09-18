package com.wang.neteasenews.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by dllo on 16/9/18.
 */
public class ScreenSizeUtil {
    //context建议使用app的
    public static int getScreenWidtn(Context context){
        //获取窗口管理者
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //创建显示尺寸类
        DisplayMetrics metrics=new DisplayMetrics();
        //将窗口(屏幕)的尺寸设置给 显示尺寸类
        manager.getDefaultDisplay().getMetrics(metrics);
        //返回屏幕宽度
        return metrics.widthPixels;
    }

    public static int getScreenheight(Context context){
        //获取窗口管理者
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //创建显示尺寸类
        DisplayMetrics metrics=new DisplayMetrics();
        //将窗口(屏幕)的尺寸设置给 显示尺寸类
        manager.getDefaultDisplay().getMetrics(metrics);
        //返回屏幕gao度
        return metrics.heightPixels;
    }
    //简单整合一下

    /**
     *
     * @param context
     * @param state 状态
     * @return   传1返回宽
     *           传2返回高,
     *           默认返回高
     */
    public static int getScreensize(Context context,int state){
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics=new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(metrics);
        switch (state)
        {
            case 1:
                return metrics.widthPixels;
            case 2:
                return metrics.heightPixels;
            default:
                return metrics.heightPixels;
        }
    }

    //再次整合
    //枚举:整型常量
    //一般用枚举来规定一些特殊状态
    //如:横竖屏 全屏,窗口化
    //如:播放 ,暂停,停止
    //如:宽,高
    //关键字 enum ,也是一种数据类型,就是一个类

    public enum ScreenState{
        Width,Height
    }
    public static int getScreensize(Context context,ScreenState state){
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics=new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(metrics);
        switch (state)
        {
            case Width:
                return metrics.widthPixels;
            case Height:
                return metrics.heightPixels;
            default:
                return metrics.heightPixels;
        }
    }

}
