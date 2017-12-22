/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson6;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student {
    private String name;
    private String email;
    private int age;

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public void printInfo () {
        System.out.println("------thông tin-----");
        System.out.println("tên: " + this.name);
        System.out.println("email: " + this.email);
        System.out.println("tuổi: " + this.age);
    }
    
    public void printInfo (String name) {
        System.out.println("tên: " + name);
    }
}
