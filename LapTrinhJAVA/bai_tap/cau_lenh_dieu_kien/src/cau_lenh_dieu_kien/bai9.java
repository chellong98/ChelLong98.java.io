/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_lenh_dieu_kien;

/**
 * Yêu cầu Bài tập C //Nhập tọa độ (x, y) của một điểm và thông báo điểm đó ở
 * góc phần tư nào trong Hệ tọa độ.
 */
import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("input coordinates x,y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.format("coordinates (%d,%d) is in 1st quarter corner", x, y);
        } else if (x < 0 && y > 0) {
            System.out.format("coordinates (%d,%d) is in 2st quarter corner", x, y);
        } else if (x < 0 && y < 0) {
            System.out.format("coordinates (%d,%d) is in 2st quarter corner", x, y);
        } else if (x > 0 && y < 0) {
            System.out.format("coordinates (%d,%d) is in 2st quarter corner", x, y);
        }
    }
}