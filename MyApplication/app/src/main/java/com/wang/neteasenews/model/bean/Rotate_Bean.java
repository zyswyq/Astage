package com.wang.neteasenews.model.bean;

/**
 * Created by dllo on 16/9/26.
 */
public class Rotate_Bean {
    private String text;
    private String imgurl;
    private String url;

    public Rotate_Bean(String text, String imgurl, String url) {
        this.text = text;
        this.imgurl = imgurl;
        this.url = url;
    }

    public Rotate_Bean() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
