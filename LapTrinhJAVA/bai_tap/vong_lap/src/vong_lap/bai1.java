/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vong_lap;

/**
 * //Bài tập 1: Tính tổng dãy số //Viết chương trình C để tính tổng 10 số đầu
 * tiên được nhập từ bàn phím. Đây là chương trình C cơ bản và điển hình giúp
 * bạn làm quen với vòng lặp FOR trong C.
 */
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        int x;
        for (i = 0; i < 10; i++) {
            System.out.println("nhap so thu " + i);
            x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println("sum = " + sum);
    }
}
