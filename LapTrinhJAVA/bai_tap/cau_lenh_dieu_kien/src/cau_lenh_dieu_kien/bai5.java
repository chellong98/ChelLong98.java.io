/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * //Bài tập 5: Kiểm tra một người có đủ tuổi bầu cử không //
 * Yêu cầu bài tập C
 * này là nhập tuổi của một người, kiểm tra xem người đó có đủ tuổi bầu cử
 * không, và sau đó in thông báo tương ứng. // (Độ tuổi bầu cử là >= 18)
 */
import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("input age: ");
        age = sc.nextInt();
        if (age < 18) {
            System.out.println("sorry! you are too young to vote, you will vote after " + (18 - age));
        } else {
            System.out.println("you can vote");
        }
    }
}
