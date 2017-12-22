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
public class PhuongTrinhBac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào a: ");
        a = sc.nextInt();
        System.out.println("nhập vào b: ");
        b = sc.nextInt();
        System.out.println("nhập vào b: ");
        c = sc.nextInt();
        
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("phường trình vô số nghiệm!");
                }  else {
                    System.out.println("phường trình vô nghiệm!");
                }
            } else {
                System.out.println("phường trình có nghiệm: x = " + (float)-c/b);
            }
        } else {
            float denta = b*b - 4*a*c;
            
            if (denta < 0) {
                System.out.println("phường trình vô nghiệm");
            } else if (denta==0) {
                System.out.println("phường trình có nghiệm duy nhất: x= " + (float)-b/(2*a));
            } else {
                System.out.println("phương trihf có 2 nghiệm phân biện:");
                System.out.println("x1 = " + (float)(-b+sqrt(denta)) / (2*a));
                System.out.println("x1 = " + (float)(-b-sqrt(denta)) / (2*a));
            }
        }
    }
    
}
