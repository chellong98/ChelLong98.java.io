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
public class Person {
    private String name;
    private String address;
    private String department;

    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập họ tên: ");
        this.setName(sc.nextLine()); //trả về 1 String cho setname
        System.out.println("nhập địa chỉ: ");
        this.setAddress(sc.nextLine());
        System.out.println("nhập phòng ban: ");
        this.setDepartment(sc.nextLine());
    }
    
    @Override
    public String toString() {
        return "name=" + name + ", address=" + address + ", department=" + department + '}';
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.input();
        System.out.println(p);
    }
    
}
