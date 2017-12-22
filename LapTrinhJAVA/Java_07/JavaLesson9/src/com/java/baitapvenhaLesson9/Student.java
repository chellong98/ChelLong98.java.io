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
public class Student extends Person {

    @Override
    public void run(String name) {
        System.out.println("Student run: " + name);
    }

    @Override
    public void eat() {
        System.out.println("Student:  eat");
    }
    
}
