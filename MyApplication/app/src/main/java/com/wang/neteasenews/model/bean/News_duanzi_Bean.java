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
public class News_duanzi_Bean {

    /**
     * adtype : 0
     * boardid : comment_bbs
     * clkNum : 0
     * digest : 在亚洲自驾3个月，9个国家，路桥费不到2000。在欧洲四个月，22个国家，两万五千公里，所交路桥费不到两百欧。在美国加拿大6个月，四万五千公里，所交路桥费不到一百美元。从北京到东兴，3天，两车共六千五百公里，路桥费近两万。——就这样，2013年全国收费公路亏损661亿元！
     * docid : C1G0J8KH9001J8KI
     * downTimes : 1489
     * imgType : 0
     * picCount : 0
     * program : HY
     * prompt : 成功为您推荐20条新内容
     * recType : 0
     * replyCount : 1679
     * replyid : C1G0J8KH9001J8KI
     * source : 糗事百科
     * title : 在亚洲自驾3个月
     * upTimes : 11690
     */

    private List<段子Bean> 段子;

    public static News_duanzi_Bean objectFromData(String str) {

        return new Gson().fromJson(str, News_duanzi_Bean.class);
    }

    public static News_duanzi_Bean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), News_duanzi_Bean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<News_duanzi_Bean> arrayNews_duanzi_BeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<News_duanzi_Bean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<News_duanzi_Bean> arrayNews_duanzi_BeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<News_duanzi_Bean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<段子Bean> get段子() {
        return 段子;
    }

    public void set段子(List<段子Bean> 段子) {
        this.段子 = 段子;
    }

    public static class 段子Bean {
        private int adtype;
        private String boardid;
        private int clkNum;
        private String digest;
        private String docid;
        private int downTimes;
        private int imgType;
        private int picCount;
        private String program;
        private String prompt;
        private int recType;
        private int replyCount;
        private String replyid;
        private String source;
        private String title;
        private int upTimes;

        /*****************************/
        private String img;
        private String imgsrc;
        private String pixel;


        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }


        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }


        public String getPixel() {
            return pixel;
        }

        public void setPixel(String pixel) {
            this.pixel = pixel;
        }

        /***************************8*/
        public static 段子Bean objectFromData(String str) {

            return new Gson().fromJson(str, 段子Bean.class);
        }

        public static 段子Bean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), 段子Bean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<段子Bean> array段子BeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<段子Bean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<段子Bean> array段子BeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<段子Bean>>() {
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

        public int getImgType() {
            return imgType;
        }

        public void setImgType(int imgType) {
            this.imgType = imgType;
        }

        public int getPicCount() {
            return picCount;
        }

        public void setPicCount(int picCount) {
            this.picCount = picCount;
        }

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
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
}
