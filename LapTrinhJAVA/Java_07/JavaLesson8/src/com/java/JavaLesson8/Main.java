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
public class Main {
    public static Scanner sc = new Scanner (System.in);
    public static int menu () {
        System.out.println("---Student Manager---");
        System.out.println("1. addProduct");
        System.out.println("2. listProduct");
        System.out.println("3. Search");
        System.out.println("4. Exit");
        System.out.println("Choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Store st = new Store();
        int choice;
        do {
            choice = menu();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    st.addProduct();
                }break;
                case 2: {
                    st.listProduct();
                }break;
                case 3: {
                    System.out.println("nhập vào tên sản phẩm: ");
                    String name = sc.nextLine();
                    st.search(name);
                }break;
                case 4: {
                    System.out.println("bye");
                }break;
                default: System.out.println("mời bạn chọn lại!");break;
            }
        }while (choice!=4);
    }
}


