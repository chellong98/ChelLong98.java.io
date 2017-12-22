/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
bài 8: Viết chương trình thực hiện các công việc sau:
* a. nhập từ bàn phím một số nguyê dương n.
* b. tính tổng s = 1 + 1/3 + ... +1/(2*n+1) và in kết quả s ra màn hình
 */
import java.util.Scanner;
public class bai8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 số n: ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (float)1/(2*i+1);
        }
        System.out.println("tổng s = 1 + 1/3 + ... +1/(2*n+1) = " + sum);
    }
}
