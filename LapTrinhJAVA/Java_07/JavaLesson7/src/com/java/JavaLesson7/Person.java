/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.JavaLesson7;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Person {
    private String name;
    private int age;
    private String email;
    
    public Person() {
        
    }
    
    public Person (String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void printInfo () {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("email: " + this.email);
    }
}
