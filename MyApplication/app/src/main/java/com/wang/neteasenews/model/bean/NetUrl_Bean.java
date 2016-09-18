package com.wang.neteasenews.model.bean;

/**
 * Created by dllo on 16/9/15.
 * 存放所有网址的实体类
 */
public class NetUrl_Bean {

    //直播分类---中间是数字从3到16
    public static String live_class1="http://data.live.126.net/livechannel/classify/";
    public static String live_class2="/1.json";
    //直播热门
    public static String live_hot="http://data.live.126.net/livechannel/previewlist.json";

    //话题 -- 问吧
    public static String talk_askmain="http://c.m.163.com/newstopic/list/expert/5aSn6L%2Be/0-10.html";

    public static String talk_ask1="http://c.m.163.com/newstopic/list/expert/classification/";
    public static String talk_ask2="/0-10.html";

    public static String[] ask_talkMeddle={"law","health2","auto","finance","history","politic","sport","military","travel","house","science","education","entertainment","health","fashion"};

    //问吧 上方按钮
    public static String talk_askBtn="http://c.m.163.com/newstopic/list/classification.html";

}
