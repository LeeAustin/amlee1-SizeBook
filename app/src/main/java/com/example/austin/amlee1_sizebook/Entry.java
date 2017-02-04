package com.example.austin.amlee1_sizebook;

import java.util.Date;

/**
 * Created by Austin on 2017-02-04.
 */

public class Entry {
    private String name;
    private Date date;
    private Float neck;
    private Float bust;
    private Float chest;
    private Float waist;
    private Float hip;
    private Float inseam;
    private String comment;

    public Entry(String name, Date date, Float neck, Float bust, Float chest,
                 Float waist, Float hip, Float inseam, String comment) {
        this.setName(name);
        this.setDate(date);
        this.setNeck(neck);
        this.setBust(bust);
        this.setChest(chest);
        this.setWaist(waist);
        this.setHip(hip);
        this.setInseam(inseam);
        this.setComment(comment);
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Float getNeck() {
        return neck;
    }

    public Float getBust() {
        return bust;
    }

    public Float getChest() {
        return chest;
    }

    public Float getWaist() {
        return waist;
    }

    public Float getHip() {
        return hip;
    }

    public Float getInseam() {
        return inseam;
    }

    public String getComment() {
        return comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNeck(Float neck) {
        this.neck = neck;
    }

    public void setBust(Float bust) {
        this.bust = bust;
    }

    public void setChest(Float chest) {
        this.chest = chest;
    }

    public void setHip(Float hip) {
        this.hip = hip;
    }

    public void setInseam(Float inseam) {
        this.inseam = inseam;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setWaist(Float waist) {
        this.waist = waist;
    }
}
