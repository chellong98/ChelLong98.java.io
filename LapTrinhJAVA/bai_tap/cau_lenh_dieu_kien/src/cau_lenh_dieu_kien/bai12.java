/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * //Bài tập 12: Nhập một nhiệt độ và in thông báo tương ứng //Hiển thị thông
 * báo theo các tiêu chí sau: //Nhiệt độ < 0 thì thông báo là thời tiết giá rét
 * //Nhiệt độ 0-10: thời tiết rất lạnh
 * // Nhiệt độ 10-20: thời tiết lạnh
 * // Nhiệt độ 20-30: thời tiết bình thường
 * // Nhiệt độ 30-40: thời tiết nóng
 * //Nhiệt độ >= 40: thời tiết rất nóng
 */
import java.util.Scanner;

public class bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tem;
        System.out.println("input tem: ");
        tem = sc.nextFloat();
        if (tem >= 0 && tem <= 10) {
            System.out.println("so cold");
        } else if (tem >= 10 && tem <= 20) {
            System.out.println("cold");
        } else if (tem >= 20 && tem <= 30) {
            System.out.println("normal");
        } else if (tem >= 30 && tem <= 40) {
            System.out.println("hot");
        } else {
            System.out.println("so hot");
        }
    }
}
