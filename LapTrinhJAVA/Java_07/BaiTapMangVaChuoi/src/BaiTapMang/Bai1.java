/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapMang;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
//1. Viết hàm nhập một ma trận
//3. Viết hàm tìm giá trị lớn nhất trong ma trận
public class Bai1 {
    static Scanner sc = new Scanner (System.in);
    static int[][] matrix;
    static void nhapMang (int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("nhập phần tử m[%d][%d]: ", i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    static void xuatMang (int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int maxOfMatrix (int r, int c) {
        int max = matrix[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    
    static int minOfMatrix (int r, int c) {
        int min = matrix[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int r,c;
        System.out.println("nhập vào số hàng: ");
        r = sc.nextInt();
        System.out.println("nhập vào số cột: ");
        c = sc.nextInt();
        matrix = new int[r][c];
        System.out.println("nhập ma trận: ");
        nhapMang(r, c);
        System.out.println("xuất ma trận: ");
        xuatMang(r, c);
        System.out.println("phần tử lớn nhất trong mảng là: " + maxOfMatrix(r, c));
        System.out.println("phần tử nhỏ nhất trong mảng là: " + minOfMatrix(r, c));
    }
}
