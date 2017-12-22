/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * //Bài tập 10: Xét tuyển thi đại học //Yêu cầu bài tập C này là nhập điểm thi
 * ba môn Toán, Lý, Hóa của một thí sinh, kiểm tra theo tiêu chí đã cho, //sau
 * đó thông báo thí sinh có trúng tuyển hay không //Tiêu chí: //Điểm Toán >= 6.5
 * // Điểm Lý >= 5.5 //Điểm Hóa >= 5.0 // Tổng điểm ba môn >= 18.0 // hoặc Tổng
 * điểm Toán và Vật lý >= 14.0
 */
import java.util.Scanner;

public class bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double math, physics, chemistry;
        System.out.println("input three object: ");
        math = sc.nextDouble();
        physics = sc.nextDouble();
        chemistry = sc.nextDouble();
        if (math > 6.5 & physics > 5.5 & chemistry > 5) {
            if ((math + physics + chemistry > 18) | (math + physics > 14)) {
                System.out.println("you were suscessful!");
            } else {
                System.out.println("you were fail!");
            }
        } else {
            System.out.println("you were fail!");
        }
    }
}
