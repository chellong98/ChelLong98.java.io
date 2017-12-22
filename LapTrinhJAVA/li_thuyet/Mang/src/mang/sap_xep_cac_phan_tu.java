/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;

public class sap_xep_cac_phan_tu {

    public static void main(String[] args) {
        int a[] = {8, 7, 5, -7, 9};
        int len = a.length;

        for (int i = 0; i < a.length - 1; i++) { //cho chạy đến phần tử gần cuối
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] > a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println("các phần tử sau khi sắp xếp là: ");
        for (int element : a) {
            System.out.println(element);
        }
    }
}
