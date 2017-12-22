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
public class MangMotChieu {
    static Scanner sc = new Scanner (System.in);
    static void nhapMang (int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhập phần tử a[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }
    static void xuatMang (int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int maxOfArray (int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >  max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int minOfArray (int arr[], int n) {
        int min = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] <  min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("nhập vào kích thước mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("nhập mảng: ");
        nhapMang(arr, n);
        System.out.println("xuất mảng: ");
        xuatMang(arr, n);
        System.out.println("phần tủ lớn nhất trong mảng là: " + maxOfArray(arr, n));
        System.out.println("phần tử nhỏ nhất trong mảng là: " + minOfArray(arr, n));
    }
}
