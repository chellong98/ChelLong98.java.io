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
public class tblUser {
    private int IdUser;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String companyName;
    private String codeTax;
    private byte level;
    private byte sex;
    private byte type;
    private String password;
    private int iDCategoryValue;
    private byte status;
    private int parentld;
    private String userCode;

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCodeTax() {
        return codeTax;
    }

    public void setCodeTax(String codeTax) {
        this.codeTax = codeTax;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getiDCategoryValue() {
        return iDCategoryValue;
    }

    public void setiDCategoryValue(int iDCategoryValue) {
        this.iDCategoryValue = iDCategoryValue;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public int getParentld() {
        return parentld;
    }

    public void setParentld(int parentld) {
        this.parentld = parentld;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    
    
    
}
