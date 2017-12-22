/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Person {
    private String name;
    private String birthday;
    private String address;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void display () {
        System.out.println("họ tên: " + this.name);
        System.out.println("ngày sinh: " + this.birthday);
        System.out.println("địa chỉ: " + this.address);
        System.out.println("giới tính: " + this.sex);
    }
}
