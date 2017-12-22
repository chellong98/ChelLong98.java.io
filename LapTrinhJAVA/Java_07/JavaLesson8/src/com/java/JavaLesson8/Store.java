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
public class Store extends Product {

    private Product[] products;
    public static final int MAX = 100;
    int size = 0;

    public Store() {
        products = new Product[MAX];
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("1. SmartPhone.");
            System.out.println("2. Camera.");
            System.out.print("bạn muốn chọn SmartPhone hay Camera: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    Product smp = new SmartPhone();
                    smp.addNew();

                    products[size++] = smp;
                }
                break;
                case 2: {
                    Product cam = new Camera();
                    cam.addNew();

                    products[size++] = cam;
                } break;
                default: System.out.println("mời bạn nhập lại!");
            } 
            System.out.println("ban có muốn nhập tiếp không? (yes/no) ");
            answer = sc.nextLine();
        } while (answer.equals("yes"));
    }

//     private int id;
//   private String name;
//   private double price;
//   private int quantity;
    public void listProduct() {
//        System.out.println("+===========+===========+===========+==========+");
//        System.out.printf("%-10s%-20s%-10s%-10s", "ID", "Name", "Price", "Qantity");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
    
     public void search(String name) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            
            if (products[i].getName().equals(name)) {
                System.out.println("+=====+===============+=======+==========+=========+");
                System.out.println(products[i]);
                System.out.println("+-----+-----------------------+--------------------+");
                flag = true;
            }
        }
        if (!flag) { 
            System.out.println("không tìm thấy sản phẩm!");
        }
    }
}
