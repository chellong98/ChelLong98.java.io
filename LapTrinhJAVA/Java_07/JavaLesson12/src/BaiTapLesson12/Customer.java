/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLesson12;

import java.io.Serializable;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Customer implements Serializable{
    private String name;
    private int id;
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(String name, int id, String address, int age) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + '}';
    }
    
    
}
