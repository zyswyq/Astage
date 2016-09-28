package com.wang.neteasenews.model.net;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wang.neteasenews.controler.netnews.Netnews;

/**
 * Created by dllo on 16/9/23.
 */
public class VolleyInstance {
    private static VolleyInstance instance;
    //定义请求队列
    private RequestQueue requestQueue;
    //1.私有构造方法
    private VolleyInstance()
    {
        requestQueue= Volley.newRequestQueue(Netnews.getContext());
    }

    //2-2
    public static VolleyInstance getInstance()
    {
        //如果该对象是空
        if(instance==null)
        {
            //全部线程同步扫描
            synchronized (VolleyInstance.class)
            {
                //如果该对象还是空
                if(instance==null)
                {
                    instance=new VolleyInstance();
                }
            }
        }

        return instance;
    }
    /*****************************************************************/
    //对外提供请求方法
    public void startRequest(String url, final VolleyResult result)
    {
        StringRequest sr=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //如果请求成功,将返回数据存储在接口里
                result.success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //请求失败,通过接口通知调用者请求失败
                result.failture();
            }
        });
        requestQueue.add(sr);
    }
}
