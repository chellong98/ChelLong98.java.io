/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.baitapvenhaLesson9;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void run(String name);
    public abstract void eat();
    public void study() {
        
    }
    
    //public static abstract int max;
    //public abstract final int MAX = 50;
}
