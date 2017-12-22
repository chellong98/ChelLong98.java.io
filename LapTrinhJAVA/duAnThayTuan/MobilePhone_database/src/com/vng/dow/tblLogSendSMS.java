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
public class tblLogSendSMS {
    private int id;
    private String idDevice;
    private String PhoneNumber;
    private String content;
    private int numberOfMb;
    private int campagnid;
    private String type;
    private String createdDatetime;
    private String sendDatetime;
    private int status;
    private String error;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumberOfMb() {
        return numberOfMb;
    }

    public void setNumberOfMb(int numberOfMb) {
        this.numberOfMb = numberOfMb;
    }

    public int getCampagnid() {
        return campagnid;
    }

    public void setCampagnid(int campagnid) {
        this.campagnid = campagnid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getSendDatetime() {
        return sendDatetime;
    }

    public void setSendDatetime(String sendDatetime) {
        this.sendDatetime = sendDatetime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
