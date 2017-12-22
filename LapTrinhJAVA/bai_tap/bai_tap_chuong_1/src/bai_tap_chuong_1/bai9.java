/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
 * bài 9: viêt chương trình thực hiện cac công việc sau": a. nhập vào từ bàn
 * phím một số nguyên dương b. tính tổng s = 1 +1/2 + 1/3 +...+ (-1)^n * 1/n và
 * in kq ra màn hình
 */
import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 1;
        System.out.println("nhập vào số n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            sum = sum + (float)(Math.pow(-1, i) * 1.0/i);
        }
        System.out.println("tổng s = 1 +1/2 + 1/3 +...+ (-1)^n * 1/n là: " + sum);
    }
}
