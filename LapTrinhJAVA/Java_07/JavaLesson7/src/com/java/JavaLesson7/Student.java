/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.JavaLesson7;

import java.util.Objects;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student extends Person {
    private String studentId;
    private String email;

    public Student(String name, int age, String email) {
        super(name, age, email);
    }
    
    public Student () {
        
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student: {" + getName() + "-" + getEmail() + "-" + getAge() +"-" + getStudentId() +"}";
    }
    
    public void printInfo () {
        super.printInfo();
        System.out.println("studentId: " + this.studentId);
    }

    
    @Override
    public boolean equals(Object obj) {
        Student stud = (Student) obj;
        return this.studentId.equals(stud.getStudentId());
    }
        
    public int compareTo (Object obj) {
        Student stud = (Student) obj;
        return this.getName().compareTo(stud.getName());
    }
}   
