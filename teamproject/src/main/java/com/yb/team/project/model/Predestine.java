package com.yb.team.project.model;

import java.util.Date;

public class Predestine {
    private Integer meetingId;

    private String meetingTheme;

    private Date endTime;

    private Date startTime;

    private Integer meetingRoomid;

    private String booker;

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
        this.meetingTheme = meetingTheme == null ? null : meetingTheme.trim();
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
        this.booker = booker == null ? null : booker.trim();
    }
}