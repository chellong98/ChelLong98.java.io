/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Menu {
    static int menu () {
        System.out.println("========================");
        System.out.println("1. add");
        System.out.println("2. sub");
        System.out.println("3. mul");
        System.out.println("4. dev");
        System.out.println("5. exit");
        System.out.println("========================");
        System.out.println("mời bạn nhập lựa chọn: ");
        Scanner sc = new Scanner (System.in);
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        boolean key = true;
        do {            
            int choice = menu();
            switch (choice) {
                case 1: System.out.println("add");break;
                case 2: System.out.println("sub");break;
                case 3: System.out.println("mul");break;
                case 4: System.out.println("dev");break;
                case 5: {
                    key = false;
                    System.out.println("thoát");
                }break;
                default: System.out.println("mời bạn nhập lại"); 
            }
        } while (key);
    }
}
