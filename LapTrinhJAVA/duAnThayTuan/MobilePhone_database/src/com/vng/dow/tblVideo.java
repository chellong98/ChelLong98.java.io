/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.dow;

/**
 *
 * @author Long Nguyen Nhat
 */
public class tblVideo {
    private int VideoId;
    private String VideoCategory;
    private String videoAvatarLink;
    private String videoLink;
    private int size;
    private int timeLine;
    private String date;
    private int AccCreate;
    private String status;

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int VideoId) {
        this.VideoId = VideoId;
    }

    public String getVideoCategory() {
        return VideoCategory;
    }

    public void setVideoCategory(String VideoCategory) {
        this.VideoCategory = VideoCategory;
    }

    public String getVideoAvatarLink() {
        return videoAvatarLink;
    }

    public void setVideoAvatarLink(String videoAvatarLink) {
        this.videoAvatarLink = videoAvatarLink;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(int timeLine) {
        this.timeLine = timeLine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAccCreate() {
        return AccCreate;
    }

    public void setAccCreate(int AccCreate) {
        this.AccCreate = AccCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
