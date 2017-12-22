/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javaLesson10;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

//        double div = 0;
//        try {
//            System.out.println("a = : ");
//            int a = Integer.parseInt(sc.nextLine());
//            System.out.println("b = : ");
//            int b = Integer.parseInt(sc.nextLine());
//            div = a/b;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("div = : " + div);
//        Caculator cal = new Caculator();
//        try {
//            System.out.println("nhập số a: ");
//            double a = sc.nextDouble();
//            System.out.println("nhập số b: ");
//            double b = sc.nextDouble();
//            double kq = cal.div(a, b);
//            System.out.println("kết quả: " + kq);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("chương trình kết thúc");
//
//        try {
//            System.out.println("nhập vào số a: ");
//            double a = sc.nextDouble();
//            double kq = cal.sqrt(a);
//            System.out.println(kq);
//        } catch (Exception e) {
////            System.out.println("không");
//            System.out.println(e.getMessage());
//        }

        File file = new File("f.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
        }

        int a = 0, b = 0;
        do {
            try {
                System.out.println("a = : ");
                a = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("nhập sai format, mời nhập lại!");
                continue;
            }
            break;
        } while (true);

        do {
            try {
                System.out.println("b = : ");
                b = Integer.parseInt(sc.nextLine());
                int div = a / b;
            } catch (NumberFormatException nfe) {
                System.out.println("nhập sai format, mời nhập lại!");
                continue;
            } catch (ArithmeticException ex) {
                System.out.println("không chia đc cho 0");
                continue;
            }
            break;
        } while (true);
        System.out.println("a/b: " + (double)a/b);
    }
}
