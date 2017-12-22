/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.JavaLesson8;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Product {

   private int id;
   private String name;
   private double price;
   private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
   public void addNew(){
       Scanner sc = new Scanner(System.in);
       System.out.println("nhập vào Id: ");
       int id = Integer.parseInt(sc.nextLine());
       this.id = id;
       System.out.println("nhập vào tên: ");
       String name = sc.nextLine();
       this.name = name;
       System.out.println("nhập vào giá tiền: ");
       double price = Double.parseDouble(sc.nextLine());
       this.price = price;
       System.out.println("nhập vào số lượng: ");
       int quantity = Integer.parseInt(sc.nextLine());
       this.quantity = quantity;
   }

    @Override
    public String toString() {
        return "Product: {" + this.name + " | " + this.id + " | " + this.price + " | " + this.quantity + "}";
    }
   
}
