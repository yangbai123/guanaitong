package com.yb.team.project.model;

import java.util.Date;

public class Management {
    private Integer meetingRoomid;

    private String meetingRoom;

    private Date createTime;

    private Integer numsMax;

    private Integer numsMin;

    private String projector;

    private Boolean visible;

    public Integer getMeetingRoomid() {
        return meetingRoomid;
    }

    public void setMeetingRoomid(Integer meetingRoomid) {
        this.meetingRoomid = meetingRoomid;
    }

    public String getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(String meetingRoom) {
        this.meetingRoom = meetingRoom == null ? null : meetingRoom.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNumsMax() {
        return numsMax;
    }

    public void setNumsMax(Integer numsMax) {
        this.numsMax = numsMax;
    }

    public Integer getNumsMin() {
        return numsMin;
    }

    public void setNumsMin(Integer numsMin) {
        this.numsMin = numsMin;
    }

    public String getProjector() {
        return projector;
    }

    public void setProjector(String projector) {
        this.projector = projector == null ? null : projector.trim();
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}