/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
 * 2. viết chương trinh thực hiên các công việc sau a. nhập vào 1 số nguyên n b.
 * kiểm tra xem có phải n>0 không?, nếu đúng thì tính n! và in kết quả ra màn
 * hình, ngược lại thì thông báo ra màn hình n>0
 */
import java.util.Scanner;

public class bai2 {

    public static boolean check(int n) {
        return n > 0;
    }

    public static int giai_thua(int n) {
        int i, g = 1;
        for (i = 1; i <= n; i++) {
            g = g * i;
        }
        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap 1 so: ");
        n = sc.nextInt();
        if (check(n) == true) {
            System.out.println("giai thua cua" + n + "la: " + giai_thua(n));
        } else {
            System.out.println("n<0");
        }
    }
}
