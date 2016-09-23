package com.wang.neteasenews.model.bean;

import java.util.List;

/**
 * Created by dllo on 16/9/21.
 */
public class Talk_talk_head_Bean {

    /**
     * focusNum : 554
     * picUrl : http://dingyue.nosdn.127.net/3OID4XFgFyq9NP7HuASEORbrNlRvz7nYXEBC7Boux6=E31460724185887.jpg
     * topicId : SJ1334108256453801014
     * topicName : 江苏
     */

    private List<话题Bean> 话题;

    public List<话题Bean> get话题() {
        return 话题;
    }

    public void set话题(List<话题Bean> 话题) {
        this.话题 = 话题;
    }

    public static class 话题Bean {
        private int focusNum;
        private String picUrl;
        private String topicId;
        private String topicName;

        public int getFocusNum() {
            return focusNum;
        }

        public void setFocusNum(int focusNum) {
            this.focusNum = focusNum;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getTopicId() {
            return topicId;
        }

        public void setTopicId(String topicId) {
            this.topicId = topicId;
        }

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }
    }
}
