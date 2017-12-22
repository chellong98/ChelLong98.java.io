/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * //Bài tập 4: Kiểm tra năm nhuận //Bài tập kiểm tra một năm xem có phải là năm
 * nhuận không là một bài tập hơi phức tạp một chút. // Trước hết, chúng ta tìm
 * hiểu điều kiện để một năm là năm nhuận: // Năm chia hết cho 4 nhưng không
 * chia hết cho 100. // Hoặc năm chia hết cho 400.
 */
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("input year: ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " not leap year");
        }
    }
