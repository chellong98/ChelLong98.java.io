/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vong_lap;

/**
//Bài tập 3: Kiểm tra số nguyên tố
//Nhập một số và kiểm tra xem đó có phải là số nguyên tố không và hiển thị thông báo phù hợp.
// Đây là bài tập C cơ bản giúp bạn làm quen với cách sử dụng vòng lặp FOR cũng như cách sử dụng lệnh IF ELSE trong C.
 */
import java.util.Scanner;

public class bai3 {
    public static boolean check (int i) {
        int j;
        int dem=0;
        for (j=1; j<=i; j++) {
            if (i%j==0) {
                dem++;
            }
        }
        if (dem==2) {
            return true;
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("nhap vao 1 so: ");
        i =sc.nextInt();
        if (check(i)==true) {
            System.out.println(i+" la so nguyen to ");
        } else {
            System.out.println(i+ " khong la so nguyen to");
        }
        
    }
}
