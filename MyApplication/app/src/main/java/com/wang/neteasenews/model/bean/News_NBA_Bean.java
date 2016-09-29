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
public class News_NBA_Bean {

    /**
     * postid : PHOT4H2600054TM1
     * hasCover : false
     * hasHead : 1
     * replyCount : 338
     * hasImg : 1
     * digest :
     * hasIcon : true
     * docid : 9IG74V5H00963VRO_C2240SB8bjwangfurongupdateDoc
     * title : 森林狼媒体日:唐斯+威金斯+拉文露獠牙
     * order : 1
     * priority : 252
     * lmodify : 2016-09-28 14:55:49
     * boardid : sports2_bbs
     * photosetID : 4TM10005|148550
     * template : normal1
     * votecount : 269
     * skipID : 4TM10005|148550
     * alias : NBA
     * skipType : photoset
     * cid : C1348649048655
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://cms-bucket.nosdn.127.net/04b155e8f6ff4544aa02fdf740f078ea20160928120735.jpeg"},{"imgsrc":"http://cms-bucket.nosdn.127.net/c39b8327109f4873bd191ee4b2fab8ec20160928120734.jpeg"}]
     * source : 网易原创
     * ename : NBA
     * imgsrc : http://cms-bucket.nosdn.127.net/528eeb8b9bc748e4bc95405a0995a3af20160928145450.jpeg
     * tname : NBA
     * ptime : 2016-09-28 12:07:56
     */

    private List<T1348649145984Bean> T1348649145984;

    public static News_NBA_Bean objectFromData(String str) {

        return new Gson().fromJson(str, News_NBA_Bean.class);
    }

    public static News_NBA_Bean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), News_NBA_Bean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<News_NBA_Bean> arrayNews_NBA_BeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<News_NBA_Bean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<News_NBA_Bean> arrayNews_NBA_BeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<News_NBA_Bean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<T1348649145984Bean> getT1348649145984() {
        return T1348649145984;
    }

    public void setT1348649145984(List<T1348649145984Bean> T1348649145984) {
        this.T1348649145984 = T1348649145984;
    }

    public static class T1348649145984Bean {
        private String postid;
        private boolean hasCover;
        private int hasHead;
        private int replyCount;
        private int hasImg;
        private String digest;
        private boolean hasIcon;
        private String docid;
        private String title;
        private int order;
        private int priority;
        private String lmodify;
        private String boardid;
        private String photosetID;
        private String template;
        private int votecount;
        private String skipID;
        private String alias;
        private String skipType;
        private String cid;
        private int hasAD;
        private String source;
        private String ename;
        private String imgsrc;
        private String tname;
        private String ptime;
        /**
         * imgsrc : http://cms-bucket.nosdn.127.net/04b155e8f6ff4544aa02fdf740f078ea20160928120735.jpeg
         */

        private List<ImgextraBean> imgextra;

        public static T1348649145984Bean objectFromData(String str) {

            return new Gson().fromJson(str, T1348649145984Bean.class);
        }

        public static T1348649145984Bean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), T1348649145984Bean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<T1348649145984Bean> arrayT1348649145984BeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<T1348649145984Bean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<T1348649145984Bean> arrayT1348649145984BeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<T1348649145984Bean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public List<ImgextraBean> getImgextra() {
            return imgextra;
        }

        public void setImgextra(List<ImgextraBean> imgextra) {
            this.imgextra = imgextra;
        }

        public static class ImgextraBean {
            private String imgsrc;

            public static ImgextraBean objectFromData(String str) {

                return new Gson().fromJson(str, ImgextraBean.class);
            }

            public static ImgextraBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ImgextraBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ImgextraBean> arrayImgextraBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ImgextraBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ImgextraBean> arrayImgextraBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ImgextraBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }
    }
}
