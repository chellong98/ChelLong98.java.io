/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/*
//Bài tập 1: Nhập hai số và kiểm tra hai số có bằng nhau không
 */
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("input both of interger: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.println("a like b");
        } else {
            System.out.println("a not like b");
        }
    }
}
