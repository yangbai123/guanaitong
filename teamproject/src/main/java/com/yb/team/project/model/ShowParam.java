package com.yb.team.project.model;

import java.util.Date;

/**
 * 用户信息的返回界面
 * Created by Administrator on 2017/2/16.
 */
public class ShowParam {
    String id;
    String address;
    String date;
    String startTime;
    String endTime;
    String mettingTheme;
    String bookPeople;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMettingTheme() {
        return mettingTheme;
    }

    public void setMettingTheme(String mettingTheme) {
        this.mettingTheme = mettingTheme;
    }

    public String getBookPeople() {
        return bookPeople;
    }

    public void setBookPeople(String bookPeople) {
        this.bookPeople = bookPeople;
    }
}
