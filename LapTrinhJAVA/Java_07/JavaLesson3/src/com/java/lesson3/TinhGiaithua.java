/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson3;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class TinhGiaithua {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập vào số n: ");
        n = sc.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s*=i;
        }
        System.out.println("giai thừa của n là: " + s);
    }
   
}
