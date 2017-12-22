/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
 * bài 7: viết chương trình thực hiện các công việc sau: a. Nhập vào từ bàn phím
 * một số nguyên dương n. b. tính tổng s = 1/2 + 1/4 + ... + 1/2*n và in kết quả
 * s ra màn hình
 */
import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào n: ");
        int n = sc.nextInt();
        int i;
        float sum = 0;
        for (i = 1; i <= n; i++) {
            sum = (float) (sum + (1.0 / (2 * i)));
        }
        System.out.println("tổng s = 1/2 + 1/4 + ... + 1/2*n = " + sum);
    }
}
