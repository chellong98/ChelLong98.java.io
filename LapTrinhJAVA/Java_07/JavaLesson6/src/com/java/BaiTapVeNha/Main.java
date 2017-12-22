/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BaiTapVeNha;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static Scanner sc = new Scanner (System.in);
    public static int menu () {
        System.out.println("---Student Manager---");
        System.out.println("1. List");
        System.out.println("2. Search");
        System.out.println("3. Add");
        System.out.println("4. Exit");
        System.out.println("Choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        int choice;
        do {
            choice = menu();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Order(Y/N): ");
                    String answer = sc.next();
                    if (answer.equals("Y")) {
                        System.out.println("ASC/DESC(A/D): ");
                        answer = sc.next();
                        if (answer.equals("A")) {
                            sm.list(true);
                        } else if (answer.equals("N")) {
                            sm.list(false);
                        }
                    }
                    sm.list();
                }break;
                case 2: {
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    sm.search(name);
                }break;
                case 3: {
                    Student stud = new Student();
                    System.out.println("---New Student---");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.println("-----------------");
                    stud.setName(name);
                    stud.setEmail(email);
                    stud.setAge(age);
                    
                    sm.add(stud);
                }break;
                case 4: {
                    System.out.println("bye");
                }break;
                default: System.out.println("mời bạn chọn lại!");break;
            }
        }while (choice!=4);
    }
}
