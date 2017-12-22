/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
Bài tập 3: Kiểm tra âm dương
Yêu cầu bài tập C này là nhập một số, kiểm tra xem số đó là số âm hay số dương và in ra thông báo tương ứng
 */
import java.util.Scanner;
public class bai3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("input interger a: ");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println(a + " is positive number");
        }
        else {
            System.out.println(a + " is negative number");
        }
    }
}
