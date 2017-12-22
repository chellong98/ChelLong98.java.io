/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;
public class Nhap_mang_tu_nguoi_dung {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[];
        System.out.println("nhập số lượng phần tử của mảng: ");
        int len = sc.nextInt();
        a = new int[len];
        
        int i;
        for (i=0; i<len; i++) {
            System.out.println("nhập phần tử "+i+": ");
            a[i] = sc.nextInt();
        }
        System.out.println("các phần tử trong mảng là: ");
        for (int element: a) {
            System.out.println(element);
        }
    }
}
