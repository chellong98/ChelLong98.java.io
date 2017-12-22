/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;
public class tim_phan_tu_lon_nhat_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("phần tử thứ "+i+": ");
            a[i] = sc.nextInt();
        }
        
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max = a[i];
            }
            if (a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("giá trị lớn nhất là: "+max);
        System.out.println("giá trị nhỏ nhất là: "+min);
    }
}
