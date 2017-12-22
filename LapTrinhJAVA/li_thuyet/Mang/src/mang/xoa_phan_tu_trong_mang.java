/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;

public class xoa_phan_tu_trong_mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int a[] = new int[10];
        System.out.println("nhập vào vị trí cần xóa: ");
        int atIndex = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println("trước khi xóa: ");

        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = atIndex; i < a.length - 1; i++) { //chạy đến a[9] để ko vượt quá số phần tử của mảng
            a[i] = a[i + 1];
        }
        System.out.println("sau khi xóa: ");

        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
