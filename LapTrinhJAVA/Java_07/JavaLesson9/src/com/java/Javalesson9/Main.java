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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dùng abtract class
        Student stud = new Student();
        stud.setName("Long");
        stud.printInfo();
        Person p = new Student();
        p.setName("nguyễn nhật Long");
        p.printInfo();
        //dùng inteface
        IShape square = new Square(5f);
        System.out.println("diện tích: "+ square.caculateArea());
        
        IShape rectangle = new Rectangle(4f, 5f);
        System.out.println("diện tích: " + rectangle.caculateArea());
        
        //truyền vào interface
        Caculate cal = new Caculate();
        System.out.println("diện tích hình vuông: " + cal.calArea(new Square(5f)));
        System.out.println("diện tích hình chữ nhật: " + cal.calArea(new Rectangle(3f, 4f)));
    }
    
}
