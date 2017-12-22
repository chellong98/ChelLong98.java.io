/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.motor;

import com.java.motor.yamaha.Jupiter;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Motor implements IMotor {

    private String code;//mã xe
    private String name;//tên loại xe
    private double capacity;//dung tichsxi lanh
    private int num; //kiểu truyền lực là mấy số
    
   
    public Motor() {
       
    }

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    @Override
    public void inputInfor() {
        System.out.println("nhập vào mã xe: ");
        this.code = new Scanner(System.in).nextLine();
        System.out.println("nhập vào tên loại xe: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("nhập vào dung tích xi lanh: ");
        this.capacity = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.println("nhập vào kiểu kiểu truyền lực: ");
        this.num = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    @Override
    public void displayInfo() {
        
        System.out.println("mã xe: " + this.getCode());
        System.out.println("tên xe: " + this.getName());
        System.out.println("dung tích xi lanh: " + this.getCapacity());
        System.out.println("kiểu truyền lực: " + this.getNum());
        
    }

    @Override
    public void chageInfo() {
        System.out.println("nhập vào thuộc tính cần sửa: (code, name, capacity, num)");
        String character = new Scanner(System.in).nextLine();
        if(character.equalsIgnoreCase("code")) {
            System.out.println("sửa mã xe: ");
            this.setCode(new Scanner(System.in).nextLine());
        }
        if(character.equalsIgnoreCase("name")) {
            System.out.println("sửa tên xe: ");
            this.setName(new Scanner(System.in).nextLine());
        }
        if(character.equalsIgnoreCase("capacity")) {
            System.out.println("sửa dung tích xi lanh xe: ");
            this.setCapacity(Double.parseDouble(new Scanner(System.in).nextLine()));
        }
        if(character.equalsIgnoreCase("num")) {
            System.out.println("sửa kiểu truyền lực xe: ");
            this.setNum(Integer.parseInt(new Scanner(System.in).nextLine()));
        }
    }

    @Override
    public String toString() {
        return "Motor{" + "code=" + code + ", name=" + name + ", capacity=" + capacity + ", num=" + num + '}';
    }

    
   
    
}
