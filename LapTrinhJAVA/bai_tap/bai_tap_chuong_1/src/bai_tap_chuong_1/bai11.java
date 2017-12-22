/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

import java.util.Scanner;

/**
bài 11: viết chương trình thực hiện các công việc sau: 
* a. nhập vào từ bàn phím một số nguyên n (0>n>100) và 1 magnr gồm n số nguyên
* b. hiển thị mảng ra màn hình
* c. tìm phần tử lớn nhất và in giá trị ra màn hình
* d. sắp xếp mảng theo thứ tự giảm dần và in mảng đã sắp xếp ra mh
 */

public class bai11 {
    public int MAX (int a[], int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i]>max) {
                max = a[i];
            }
        }
        return max;
    }
    
    public void arrange (int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if (a[j] > a[j-1]) {
                    int tam = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tam;
                }
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhập mảng: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("xuất mảng: ");
        for (int element: a) {
            System.out.print(element + " ");
        }
        
        // tìm max
        bai10 max = new bai10(); //tạo 1 đối tượng
        System.out.println();
        System.out.println("giá trị lớn nhất của mảng là: " + max.MAX(a, n));
        System.out.println("mảng sau khi sắp xếp là: ");
        max.arrange(a, n);
        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
