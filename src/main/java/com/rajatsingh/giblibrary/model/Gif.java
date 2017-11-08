package com.rajatsingh.giblibrary.model;

import java.time.LocalDate;

/**
 * Created by Rajat on 11/8/2017.
 */
public class Gif {

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public LocalDate getDateuploded() {
        return dateuploded;
    }

    public void setDateuploded(LocalDate dateuploded) {
        this.dateuploded = dateuploded;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    private String name;
    private int categoryid;

    public Gif(String name,int categoryid, LocalDate dateuploded, boolean favourite) {
        this.name = name;
        this.categoryid=categoryid;
        this.dateuploded = dateuploded;
        this.favourite = favourite;
    }

    private LocalDate dateuploded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean favourite;
}
