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

    //话题--话题页 (有部分关注的内容)
    public static String talk_talkmain="http://topic.comment.163.com/topic/list/subject/0-10.html";
    //话题--话题也(上方横向布局的内容)
    public static String talk_talkhead="http://c.3g.163.com/recommend/getChanRecomNews?channel=T1460094487214&size=5&passport=&devId=gDn9on2hlxLeU2KQPKO0Hg%3D%3D&lat=WFohXxen8gCvC1M3MWheog%3D%3D&lon=0vcjy5VjEu7Leev0BzKr4w%3D%3D&version=15.0&net=wifi&ts=1474444807&sign=nErd43f036fl4cRWPHkKz2RU2OaWq%2F5Fad2vej1JZtt48ErR02zJ6%2FKXOnxX046I&encryption=1&canal=wandoujia_news&mac=l3cTD%2BGkuOp%2FGgZPUFWlsMniKsPhqwUPmAMQf86XLBg%3D";


}
