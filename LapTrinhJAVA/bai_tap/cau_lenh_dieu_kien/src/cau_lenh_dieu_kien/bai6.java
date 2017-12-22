/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * Bài Tập 6: Yêu cầu Bài tập C //Nhập một số m, kiểm tra xem số đó là lớn hơn,
 * nhỏ hơn hoặc bằng 0 và in ra giá trị tương ứng của một số n là 1, -1 hoặc 0
 */
import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("input interger m: ");
        m = sc.nextInt();
        if (m > 0) {
            System.out.println("n=1");
        } else if (m < 0) {
            System.out.println("n=-1");
        } else {
            System.out.println("n=0");
        }
    }
}
