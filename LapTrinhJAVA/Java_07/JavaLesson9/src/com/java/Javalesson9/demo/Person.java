/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Javalesson9.demo;

import java.util.Date;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Person {
    
    private String name;
    private Date BirthDay;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDay(Date date) {
        this.BirthDay = date;
    }
    
    public void getDetail () {
        System.out.println("Name: " + this.name + " | " + "birthday: " + this.BirthDay);
    }
}
