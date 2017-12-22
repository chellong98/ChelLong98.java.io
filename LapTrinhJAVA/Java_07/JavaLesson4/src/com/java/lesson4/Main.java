/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson4;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] studentScores = new int[5];
//        studentScores[0] = 56;
//        studentScores[1] = 5;
//        studentScores[2] = 12;
//        studentScores[3] = 43;
//        
//        System.out.println("0: " + studentScores[0]);

//        int[] studentScores = {4, 6, 7, 34, 6};
//        System.out.println("kích thước mảng: " + studentScores.length);
//        System.out.println("= : " + studentScores[0]);
//        float[] itemPrice = new float[4];
//        Scanner sc = new Scanner(System.in);
//        float total = 0f;
//        for (int i = 0; i < itemPrice.length; i++) {
//            System.out.print("Nhap ");
//            itemPrice[i] = sc.nextFloat();
//            total += itemPrice[i];
//        }
//        System.out.println("total = " + total);
//        int[][] matrix = { {1,2,3}, 
//                           {3,4,5},
//                           {3,7,8}};
//        matrix[0][0] = 1;
//        matrix[0][1] = 1;
//        matrix[0][2] = 1;
//        matrix[1][0] = 1;
//        matrix[0][0] = 1;
//        int[][] matrix = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("M[%d,%d] ", i, j);
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        //in ma trận 2 chiều
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("%d ", matrix[i][j]);
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner (System.in);
//        System.out.println("nhập: ");
//        String str = sc.nextLine();
//        System.out.println("str = " + str);
//        
//        //chiều dài của str
//        System.out.println("str length: " + str.length());
//        System.out.println("kí tự ở vị trí thứ 5: " + str.charAt(5));
//        System.out.println("concat: " + str.concat("abc")); //ghép chuỗi vào cuối
//        System.out.println("dung  " + str);//nối chuỗi
//        if (str.compareTo("A") != 0) {
//            System.out.println("khong phai A");
//        } else {
//            System.out.println("A");
//        }
//        Scanner sc = new Scanner (System.in);
//        System.out.println("nhập: ");
//        String str = sc.nextLine();
//        StringBuilder builder = new StringBuilder(str);
//        System.out.println("reverse str: " + builder.reverse()); //đảo ngược chuỗi
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập :");
        String str = sc.nextLine();
        StringTokenizer token = new StringTokenizer(str);
        while (token.hasMoreElements()) {
            System.out.println(token.nextToken());
        }
        
        
    }

}
