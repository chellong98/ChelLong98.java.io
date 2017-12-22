/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapChuoi;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("nhập vào 1 chuỗi: ");
        str = sc.nextLine();
        String tokens[] = str.split("[ ]");
        System.out.println("tổng số lượng token là: " + tokens.length);
    }
}
