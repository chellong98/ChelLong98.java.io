/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Lesson5HocThem;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    
    public static void main(String[] args) {
        Person p = new Person("long", 5f);
        Person.Size = 50;
        p.run();
        p.run(p.getName());
        p.run(p.getName(), p.getDiemTb());
    }
    
}
