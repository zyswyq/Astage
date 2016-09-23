package com.wang.neteasenews.model.bean;

import java.util.List;

/**
 * Created by dllo on 16/9/22.
 */
public class d {

    /**
     * subjectId : SJ02215182364051345344
     * name : 你见过最奇葩的月饼
     * alias : 中秋节快要到了，又能吃月饼了，那你见过最奇葩的月饼（口味、形状)是什么样子的?
     * picurl : http://dingyue.nosdn.127.net/TU7fAjPLx8ArmUDS0x6biCxJdjVl0LPKJjGZ4S7wfMKYj1472007640613.PNG
     * feature : 月饼：0，中秋：0，嫦娥：0
     * classification : 生活
     * type : 1
     * state : 0
     * concernCount : 2706
     * talkCount : 264
     * createTime : 1472007662286
     * talkPicture : ["http://mobilepics.nosdn.127.net/netease_subject/033424ec20e2d6f8477f002526ad18df1474322840716246778","http://mobilepics.nosdn.127.net/netease_subject/d6f0d4e7963f0d54a0c367718e84348c1474389026562162244","http://mobilepics.nosdn.127.net/K85Pf9Rd875q0urwo8il6o0cDg5s35c8495996804"]
     */

    private String subjectId;
    private String name;
    private String alias;
    private String picurl;
    private String feature;
    private String classification;
    private int type;
    private int state;
    private int concernCount;
    private int talkCount;
    private long createTime;
    private List<String> talkPicture;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getConcernCount() {
        return concernCount;
    }

    public void setConcernCount(int concernCount) {
        this.concernCount = concernCount;
    }

    public int getTalkCount() {
        return talkCount;
    }

    public void setTalkCount(int talkCount) {
        this.talkCount = talkCount;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public List<String> getTalkPicture() {
        return talkPicture;
    }

    public void setTalkPicture(List<String> talkPicture) {
        this.talkPicture = talkPicture;
    }
}
