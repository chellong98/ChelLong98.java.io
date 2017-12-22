/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
bài 6: viết chương trình thực hiện các công việc sau: 
* a. nhập từ bàn phím 3 số nguyên a,b,c
* b. tìm nghiệm của phương trình bậc 2: ax^2 +bx +c = 0 và in kết quả ra màn hình
* 
 */
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class bai6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 3 số a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("phương trình vô số nghiệm!");
                } else {
                    System.out.println("phương trình vô ngiệm!");
                }
            } else {
                System.out.println("phương trình có nghiệm; " + (float)-c/b);
            }
        } else {
            int denta = b*b - 4*a*c;
            if (denta > 0) {
                System.out.println("phương trình có 2 ngiệm: ");
                System.out.println("x1 = " +(float)(-b + sqrt(denta)) / (2*a));
                System.out.println("x2 = " +(float)(-b - sqrt(denta)) / (2*a));
            } else if (denta < 0) {
                int _denta = -denta;
                System.out.println("phương trình có 2 nghiệm phức; ");
                System.out.println("x1 = " + (float)-b/(2*a) + " + " + (float)sqrt(_denta) / (2*a) + "i");
                System.out.println("x1 = " + (float)-b/(2*a) + " - " + (float)sqrt(_denta) / (2*a) + "i");
            } else {
                System.out.println("phương trình có nghiêm duy nhất: " + (float)-b/(2*a));
            }
        }
    }
}
