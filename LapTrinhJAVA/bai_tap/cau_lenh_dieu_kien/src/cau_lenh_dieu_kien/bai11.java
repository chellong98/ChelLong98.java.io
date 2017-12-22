/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * //Bài tập 11: Giải phương trình bậc hai Ax^2 + Bx + C = 0
 */
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, denta;
        System.out.println("input three factors: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == 0) {
            System.out.printf("equaltion becomes: %dx + %d = 0\n", b, c);
            if (b == 0) {
                if (c == 0) {
                    System.out.println("equaltion have countless solution");
                } else {
                    System.out.println("equaltion hava not solution");
                }
            } else {
                System.out.println("equaltion have one solution is: " + (double) -c / b);
            }
        } else {
            System.out.println("equation becames: ax^2 +bx +c =0");
            denta = b * b - 4 * a * c;
            if (denta > 0) {
                System.out.println("equation have both solution: ");
                System.out.println("x1 = " + (double) (-b + sqrt(denta)) / (2 * a));
                System.out.println("x2 = " + (double) (-b - sqrt(denta)) / (2 * a));
            } else if (denta < 0) {
                int _denta = -denta;
                System.out.println("phuong trinh co 2 nghiem phuc: ");
                System.out.println("x1 = " + (-b / (2 * a)) + "+" + (double) (sqrt(_denta)) / (2 * a) + "i");
                System.out.println("x2 = " + (-b / (2 * a)) + "-" + (double) (sqrt(_denta)) / (2 * a) + "i");
            } else {
                System.out.println("phuong trinh co nghiem duy nhat: ");
                System.out.println("x = " + (double) -b / (2 * a));
            }
        }
    }
}
