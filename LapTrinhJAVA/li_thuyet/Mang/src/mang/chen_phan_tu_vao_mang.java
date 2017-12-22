/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;

public class chen_phan_tu_vao_mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("nhập vào vị trí cần chèn vào giá trị cần chèn");
        int atIndex = sc.nextInt();
        int value = sc.nextInt();
        int n = 5;

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println("trước khi chèn: ");

        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = n; i > atIndex; i--) {
            a[i] = a[i - 1];
        }
        a[atIndex] = value;
        System.out.println("sau khi chèn: ");

        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
