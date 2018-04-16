/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("nhap mang> ");
        for (int i = 0; i < 5; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 0; i < 5; i++) {
            if(max<a[i]) max = a[i];
            if(min>a[i]) min = a[i];
        }
        System.out.println("max = " + max + ", min = " + min);
        System.out.println("cac so chia het cho 3 trong mang> ");
        for (int i = 0; i < 5; i++) {
            if(a[i]%3==0) {
                System.out.println(a[i] + " ");
            }
        }
    }
}
