package com.yb.team.project.model;

import java.util.Date;

public class Predestine {
    private Integer meetingId;

    private String meetingTheme;

    private Date endTime;

    private Date startTime;

    private Integer meetingRoomid;

    private String booker;

    private String status;

    private Date date;

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingTheme() {
        return meetingTheme;
    }

    public void setMeetingTheme(String meetingTheme) {
        this.meetingTheme = meetingTheme;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getMeetingRoomid() {
        return meetingRoomid;
    }

    public void setMeetingRoomid(Integer meetingRoomid) {
        this.meetingRoomid = meetingRoomid;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}