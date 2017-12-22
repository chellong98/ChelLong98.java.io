/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson5;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student {
    private String name;
    private String email;
    private int age;
    
    public Student() {
        System.out.println("init student");
    }
    public Student(String name) {
        System.out.println("Hello: " + name);
    }
    public Student (String email, String name) {
        System.out.println("name: " + name + ", email: " + email);
    }
    public void printInfo (){
        System.out.println("Student: {"+ name + ", " + "email: " + email + ", age: " + age + "}");
    }
    
    public String getName ()  {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
}
