/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * //Bài tập 7: Kiểm tra và phân loại chiều cao //Nhập chiều cao của một người,
 * kiểm tra và phân loại chiều cao của người đó: lùn, cao trung bình, cao, cao
 * bất thường
 */
import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("input height: ");
        height = sc.nextInt();
        if (height < 150) {
            System.out.println("specifier: short");
        } else if (height >= 150 && height < 170) {
            System.out.println("specifier: average");
        } else if (height >= 170 && height < 190) {
            System.out.println("specifier: high");
        } else {
            System.out.println("specifier: strange high");
        }
    }
}
