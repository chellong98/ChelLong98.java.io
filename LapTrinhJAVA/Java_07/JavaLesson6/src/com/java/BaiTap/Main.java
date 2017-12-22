/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BaiTap;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("====student manager===");
        System.out.println("1. list");
        System.out.println("2. Search");
        System.out.println("3. add");
        System.out.println("4. exit");
        System.out.println("mời bạn chọn lệnh: ");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        StudentManager stm = new StudentManager();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1: {
                    System.out.println("bạn có muốn sắp xếp theo tên không?");
                    String key = sc.next();
                    if (key.equals("yes") || key.equals("YES")) {
                        System.out.println("bạn muốn sắp xếp tăng dần hay giảm dần?");
                        boolean order = sc.nextBoolean();
                        stm.list(order);
                    } 
                        stm.list();
                    
                }
                    
                    break;
                case 2: {
                    System.out.println("nhập vào sinh viên tìm kiếm: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    stm.Search(name);
                } break;
                case 3: {
                    System.out.println("nhập vào thông tin sinh viên cần thêm: ");
                    Student std = new Student();
                    sc.nextLine();
                    System.out.println("nhập vào tên: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("nhập vào email: ");
                    String email = sc.nextLine();
                    System.out.println("nhập vào tuổi: ");
                    int age = sc.nextInt();

                    std.setName(name);
                    std.setEmail(email);
                    std.setAge(age);
                    
                    if (stm.add(std)) {
                        System.out.println("đã thêm 1 sinh viên");
                    }
                }break;
                case 4: {
                    System.exit(0);
                }
            }
            System.out.println("mời bạn chọn tiếp lệnh!");;
        } while (true);
    }
}
