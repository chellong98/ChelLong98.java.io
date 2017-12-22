/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
bài 5: viết chương trình thực hiện các công việc sau: 
* a. nhập vào từ bàn phím 2 số nguyên a và b
* b. tìm nghiệm của phương trình bậc nhất ax+b=0 và in kết quả ra màn hình
 */
import java.util.Scanner;
public class bai5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a: ");
        int a = sc.nextInt();
        System.out.println("nhập vào số b: ");
        int b = sc.nextInt();
        if (a==0) {
            if (b==0) {
                System.out.println("phương trình vô số nghiệm!");
            }
        }
        else {
            System.out.println("phương trình có nghiệm: "+ (float)-b/a);
        }
    }
}

