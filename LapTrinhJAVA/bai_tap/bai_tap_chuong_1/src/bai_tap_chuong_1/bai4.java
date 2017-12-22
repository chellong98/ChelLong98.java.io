/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
 4/ viết chương trình thực hiện các công việc sau: 
 * a. nhập vào từ bàn phím 2 số nguyên là tử số và mẫu số của 1 phân số
 * b. thực hiện phép toán để tìm phân số tối giản của phân số đã nhập và in kết quả ra màn hình
 * 
 */
import java.util.Scanner;
public class bai4 {
    public static int UCLN (int a, int b) {
        int du;
        while (b!=0) {
            du = a%b;
            a = b;
            b = du;
        }
        return a;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tử số: ");
        int tuso = sc.nextInt();
        System.out.println("nhập vào mẫu số: ");
        int mauso = sc.nextInt();
        System.out.println(tuso + "/" + mauso + " = " + tuso/UCLN(tuso, mauso) + "/" + mauso/UCLN(tuso, mauso));
    }
}
