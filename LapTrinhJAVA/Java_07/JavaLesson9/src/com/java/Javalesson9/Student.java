/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Javalesson9;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student extends Person{

    @Override
    public void printInfo() {
        System.out.println("Student: " + this.getName());
    }
    
    public void run() {
        System.out.println("run");
    }
}
