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
public class News_history_Bean {

    /**
     * postid : PHOT3B1D00964GJ6
     * hasCover : false
     * hasHead : 1
     * replyCount : 1330
     * hasImg : 1
     * digest :
     * hasIcon : true
     * docid : 9IG74V5H00963VRO_C21S69B4bjhunanupdateDoc
     * title : 释放地狱之火:人类测试核武高清照
     * order : 1
     * priority : 121
     * lmodify : 2016-09-28 11:12:24
     * boardid : photoview_bbs
     * photosetID : 4GJ60096|109613
     * template : normal1
     * votecount : 1275
     * skipID : 4GJ60096|109613
     * alias : History
     * skipType : photoset
     * cid : C1348647991705
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://cms-bucket.nosdn.127.net/7ea6bda81afc4bf3acae9288c33a348e20160928095203.jpeg"},{"imgsrc":"http://cms-bucket.nosdn.127.net/4544d34d5d72486aa55bf9c49690647a20160928095221.jpeg"}]
     * source : 网易历史
     * ename : lishi
     * imgsrc : http://cms-bucket.nosdn.127.net/d4593fe9de724b82a1a23b92e09c8f2620160928111222.jpeg
     * tname : 历史
     * ptime : 2016-09-28 09:51:04
     */

    private List<T1368497029546Bean> T1368497029546;

    public static News_history_Bean objectFromData(String str) {

        return new Gson().fromJson(str, News_history_Bean.class);
    }

    public static News_history_Bean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), News_history_Bean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<News_history_Bean> arrayNews_history_BeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<News_history_Bean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<News_history_Bean> arrayNews_history_BeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<News_history_Bean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<T1368497029546Bean> getT1368497029546() {
        return T1368497029546;
    }

    public void setT1368497029546(List<T1368497029546Bean> T1368497029546) {
        this.T1368497029546 = T1368497029546;
    }

    public static class T1368497029546Bean {
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
         * imgsrc : http://cms-bucket.nosdn.127.net/7ea6bda81afc4bf3acae9288c33a348e20160928095203.jpeg
         */

        private List<ImgextraBean> imgextra;

        public static T1368497029546Bean objectFromData(String str) {

            return new Gson().fromJson(str, T1368497029546Bean.class);
        }

        public static T1368497029546Bean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), T1368497029546Bean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<T1368497029546Bean> arrayT1368497029546BeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<T1368497029546Bean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<T1368497029546Bean> arrayT1368497029546BeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<T1368497029546Bean>>() {
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
