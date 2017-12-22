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
public class Main {
    public static void main(String[] args) {
        Person p = new Person("long", 12, "hà nội");
        
        Student stud = new Student();
        stud.setName("long");
        stud.setEmail("long@gmail.com");
        stud.setAge(11);
        stud.setStudentId("123123123");
        
        System.out.println(stud);
    }
}
