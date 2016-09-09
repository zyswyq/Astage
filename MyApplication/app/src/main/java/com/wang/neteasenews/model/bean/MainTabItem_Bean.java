package com.wang.neteasenews.model.bean;

/**
 * Created by dllo on 16/9/9.
 */
public class MainTabItem_Bean {

    private String titile;
    private int imgID;

    public MainTabItem_Bean() {
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public MainTabItem_Bean(String titile, int imgID) {
        this.titile = titile;
        this.imgID = imgID;
    }
}
