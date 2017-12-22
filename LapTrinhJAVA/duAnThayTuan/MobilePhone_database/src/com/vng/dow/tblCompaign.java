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
public class tblCompaign {
    private int campaignld;
    private String campaignName;
    private byte status;
    private byte campaignType;
    private int buget;
    private int advertiserld;
    private int contactld;
    private int listPhoneld;
    private int mbTemp;
    private byte mblncent;
    private int CurrentViewSum;
    private int CurrentClickSum;
    private int CurrentInstalSum;

    public int getCampaignld() {
        return campaignld;
    }

    public void setCampaignld(int campaignld) {
        this.campaignld = campaignld;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(byte campaignType) {
        this.campaignType = campaignType;
    }

    public int getBuget() {
        return buget;
    }

    public void setBuget(int buget) {
        this.buget = buget;
    }

    public int getAdvertiserld() {
        return advertiserld;
    }

    public void setAdvertiserld(int advertiserld) {
        this.advertiserld = advertiserld;
    }

    public int getContactld() {
        return contactld;
    }

    public void setContactld(int contactld) {
        this.contactld = contactld;
    }

    public int getListPhoneld() {
        return listPhoneld;
    }

    public void setListPhoneld(int listPhoneld) {
        this.listPhoneld = listPhoneld;
    }

    public int getMbTemp() {
        return mbTemp;
    }

    public void setMbTemp(int mbTemp) {
        this.mbTemp = mbTemp;
    }

    public byte getMblncent() {
        return mblncent;
    }

    public void setMblncent(byte mblncent) {
        this.mblncent = mblncent;
    }

    public int getCurrentViewSum() {
        return CurrentViewSum;
    }

    public void setCurrentViewSum(int CurrentViewSum) {
        this.CurrentViewSum = CurrentViewSum;
    }

    public int getCurrentClickSum() {
        return CurrentClickSum;
    }

    public void setCurrentClickSum(int CurrentClickSum) {
        this.CurrentClickSum = CurrentClickSum;
    }

    public int getCurrentInstalSum() {
        return CurrentInstalSum;
    }

    public void setCurrentInstalSum(int CurrentInstalSum) {
        this.CurrentInstalSum = CurrentInstalSum;
    }
    
    
}
