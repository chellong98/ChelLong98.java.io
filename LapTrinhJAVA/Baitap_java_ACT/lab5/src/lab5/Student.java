/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student extends Person{
    private String Class;

    public Student(String name, String address, String department, String Class) {
        super(name, address, department);
        this.Class = Class;
    }

    public Student() {
    }

   
    public void setclass(String Class) {
        this.Class = Class;
    }

    public String getclass() {
        return Class;
    }

    @Override
    public String toString() {
        return "Student{" + "class=" + Class + ", " + super.toString();
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập tên lớp: ");
        this.setclass(sc.nextLine());
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        System.out.println(student);
    }
}