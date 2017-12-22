/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.baitapvenhaLesson9;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main(String[] args) {
//        Person p = new Person();
        Square sqr = new Square();
        
        sqr.setEdge(Float.parseFloat(new Scanner(System.in).nextLine()));
        System.out.println(sqr.caculateArea());
        
        IShape shape = new Rectangle(3f,4f);
        System.out.println("diện tích hình chữ nhật: " + shape.caculateArea());
        
        Caculate cal = new Caculate();
        cal.calArea(new Rectangle(4f, 5f));
    }
}
