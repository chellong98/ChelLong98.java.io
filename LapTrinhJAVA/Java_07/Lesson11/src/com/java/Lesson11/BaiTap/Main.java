/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Lesson11.BaiTap;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */

public class Main {
    public static int menu() {
        System.out.println("=====Menu=====");
        System.out.println("1. duyệt file");
        System.out.println("2. xóa file");
        System.out.println("3. tạo file");
        System.out.println("4. đổi tên file");
        System.out.println("5. thoát");
        System.out.print("choice: ");
        int choice = 0;
        try {
             choice = Integer.parseInt(new Scanner(System.in).nextLine());
        } catch (InputMismatchException e) {
            e.getMessage();
        }
       
        return choice;
    }
    
    public static void main(String[] args) {
        Fuction f = new Fuction();
        do {
            int choice = menu();
            switch(choice) {
                case 1: System.out.println("duyệt file"); f.duyetFile();break;
                case 2: System.out.println("xóa file");f.xoaFile();break;
                case 3: System.out.println("tạo file");f.taoFile();break;
                case 4: System.out.println("đổi teen file");f.doiTenFile();break;
                case 5: {
                    System.out.println("thoát");
                    System.exit(0);
                }break;
                default: System.out.println("mời bạn chọn lại lệnh!");
            }
        }while(true);
    }
}
