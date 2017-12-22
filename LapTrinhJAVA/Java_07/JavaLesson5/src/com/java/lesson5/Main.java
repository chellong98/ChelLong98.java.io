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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student stu1 = new Student();
       stu1.printInfo();
       stu1.setName("long");
       String name = stu1.getName();
        System.out.println("name = " + name);
       Student stu2 = new Student("long");
       Student  stu3 = new Student("chellog98.act", "long");
        System.out.println();
    }
    
}
