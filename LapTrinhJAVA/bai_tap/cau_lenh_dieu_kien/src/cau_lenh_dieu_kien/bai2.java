/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * Bài tập 2: Kiểm tra chẵn lẻ Yêu cầu bài tập C này là nhập một số bất kỳ từ
 * bàn phím và kiểm tra xem đó là số chẵn hay số lẻ và in ra thông báo tương
 * ứng.
 */
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("input interger a: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
    }
}
