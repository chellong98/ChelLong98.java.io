/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * Bài tập 8: Tìm số lớn nhất //Yêu cầu bài tập C này là tìm số lớn nhất trong 3
 * số đã nhập từ bàn phím.
 */
import java.util.Scanner;

public class bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("input three interger a,b,c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("max interger in three interger a,b,c: " + max);
    }
}
