/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapMang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Bai3 {
    static Scanner sc = new Scanner (System.in);
    static int[][] matrix1;
    static int[][] matrix2;
    
    static void nhapMang(int matrix[][],int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
    }
    static void xuatMang (int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void sumOfMatrix (int matrix1[][], int matrix2[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("nhập vào cấp ma trận: ");
        n = sc.nextInt();
        matrix1 = new int[n][n];
        matrix2 = new int[n][n];
        nhapMang(matrix1, n);
        nhapMang(matrix2, n);
        System.out.println("mảng 1: ");
        xuatMang(matrix1, n);
        System.out.println("mảng 2: ");
        xuatMang(matrix2, n);
        System.out.println("tổng 2 ma trận: ");
        sumOfMatrix(matrix1, matrix2, n);
    }
}
