package com.wang.neteasenews.model.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/28.
 */
public class we3 {


    /**
     * adtype : 0
     * boardid : comment_bbs
     * clkNum : 0
     * digest : 刚下班在路边看到一位跟我婆年纪差不多的老奶奶，一个人靠着店门口的空调排风口，我对她看了一眼，正在吃着馒头，觉得挺可怜的，就去超市买点面包和水给她
     * docid : C23F5E6490015E65
     * downTimes : 3
     * img : http://dmr.nosdn.127.net/pQ9nfrp9M9TnMCJW-STCrg==/6896093022546516045.jpg
     * imgType : 0
     * imgsrc : http://dmr.nosdn.127.net/pQ9nfrp9M9TnMCJW-STCrg==/6896093022546516045.jpg
     * picCount : 0
     * pixel : 500*666
     * program : HY
     * recType : 0
     * replyCount : 0
     * replyid : C23F5E6490015E65
     * source : 糗事百科
     * title : 刚下班在路边看到一位跟我婆年纪差不多的老奶奶
     * upTimes : 39
     */

    private int adtype;
    private String boardid;
    private int clkNum;
    private String digest;
    private String docid;
    private int downTimes;
    private String img;
    private int imgType;
    private String imgsrc;
    private int picCount;
    private String pixel;
    private String program;
    private int recType;
    private int replyCount;
    private String replyid;
    private String source;
    private String title;
    private int upTimes;

    public static we3 objectFromData(String str) {

        return new Gson().fromJson(str, we3.class);
    }

    public static we3 objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), we3.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<we3> arraywe3FromData(String str) {

        Type listType = new TypeToken<ArrayList<we3>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<we3> arraywe3FromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<we3>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getAdtype() {
        return adtype;
    }

    public void setAdtype(int adtype) {
        this.adtype = adtype;
    }

    public String getBoardid() {
        return boardid;
    }

    public void setBoardid(String boardid) {
        this.boardid = boardid;
    }

    public int getClkNum() {
        return clkNum;
    }

    public void setClkNum(int clkNum) {
        this.clkNum = clkNum;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public int getDownTimes() {
        return downTimes;
    }

    public void setDownTimes(int downTimes) {
        this.downTimes = downTimes;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getImgType() {
        return imgType;
    }

    public void setImgType(int imgType) {
        this.imgType = imgType;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public int getPicCount() {
        return picCount;
    }

    public void setPicCount(int picCount) {
        this.picCount = picCount;
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getRecType() {
        return recType;
    }

    public void setRecType(int recType) {
        this.recType = recType;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUpTimes() {
        return upTimes;
    }

    public void setUpTimes(int upTimes) {
        this.upTimes = upTimes;
    }
}
