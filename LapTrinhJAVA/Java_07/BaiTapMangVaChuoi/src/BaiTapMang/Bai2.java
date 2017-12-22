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
public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    
    static void nhapMang (int arr[], int n) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
    static void xuatMang (int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void quickSort (int arr[], int L, int R) {
        int i=L, j = R, x = arr[(L+R)/2];
        while (i<=j) {
            while (arr[i] < x) {
                i++;
            }while (arr[j] > x) {
                j--;
            }
            if (i<=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (L<j) {
            quickSort(arr, L, j);
        }
        if (i<R) {
            quickSort(arr, i, R);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("nhập vào kích thước mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        System.out.println("xuất mảng: ");
        xuatMang(arr, n);
        System.out.println("mảng sau khi sắp xếp là: ");
        quickSort(arr, 0, n-1);
        xuatMang(arr, n);
    }
}
