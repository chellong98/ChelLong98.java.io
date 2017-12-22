/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6KeThua;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("long", 5, 1234, 100.2);
        System.out.println(p);
        SinhVien sv = new SinhVien();
        sv.setMaSv("at130833");
        sv.setEmail("long@gmail.com");
        System.out.println(sv);
    }
}
