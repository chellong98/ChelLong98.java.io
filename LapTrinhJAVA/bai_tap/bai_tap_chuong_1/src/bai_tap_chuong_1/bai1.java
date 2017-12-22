/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
 * 1. viết chường trình thực hiện các công việc sau: 
 * a. nhập vào 3 số nguyên a,b,c 
 * b. kiểm tra nếu a,b,c là 3 cạnh của 1 tam giác thì tinh diện tích, chu vi
 * tam giác tạo thành bởi 3 cạnh đó. Ngược lại thông báo không phải 3 cạnh tam
 * giác
 */
import static java.lang.Math.sqrt;
import java.util.Scanner; 
public class bai1 {
    public static boolean check (int a, int b, int c) {
        return a+b>c && b+c>a && c+a>b;
    }
    public static float Spread (int a, int b, int c) {
        float p = (float)(a+b+c)/2;
        return (float)sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 3 canh tam giac ABC: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (check(a,b,c)==true) {
            System.out.println("dien tich tam giac la: "+Spread(a,b,c));
        } else {
            System.out.println("khong phaai tam giac!");
        }
    }
}
