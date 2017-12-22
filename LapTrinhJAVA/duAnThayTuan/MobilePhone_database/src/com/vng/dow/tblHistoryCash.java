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
public class tblHistoryCash {
    private int id;
    private int UserID;
    private int AdvertiserID;
    private String DateTime;
    private int number;
    private String Ip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getAdvertiserID() {
        return AdvertiserID;
    }

    public void setAdvertiserID(int AdvertiserID) {
        this.AdvertiserID = AdvertiserID;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }
    
}
