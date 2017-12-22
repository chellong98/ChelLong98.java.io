/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class KiemTraNguyenTo {
    public static boolean isPrime (int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số n: ");
        n = sc.nextInt();
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
            if (dem > 2) {
                break;
            }
        }
        if (dem == 2) {
            System.out.println(n + " là số nguyên tố!");
        } else {
            System.out.println(n + " không là số nguyên tố");
        }
        
        System.out.println("10 số nguyên số đầu tiên là: ");
        int count = 0;
        int num = 1;
        while (count <= 10) {
            if (isPrime(num)) {
                System.out.println("số thứ " + (count + 1) + " là : " + num);
                count++;
            }
            num++;
                    
        }
        
    }
}
