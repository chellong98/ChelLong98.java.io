/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javalesson12;

import java.util.Comparator;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student implements Comparator<Object>{
    private int stt;
    private String ten;

    public Student(int stt, String ten) {
        this.stt = stt;
        this.ten = ten;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 
    }
    
    
}
