/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Lesson5HocThem;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Person {
    private String name;
    private float diemTb;
    public static int Size;
    public static final int MAX = 50;
    public Person(String name, float diemTb) {
        this.name = name;
        this.diemTb = diemTb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }
    
    public void run() {
        System.out.println("run");
//        MAX = 50;
    }
    
    public void run (String name) {
        System.out.println("run " + name);
    }
    
    public void run (String name, float diemtb) {
        System.out.println("run : " + name + " | " + diemtb);
    }
    
}
