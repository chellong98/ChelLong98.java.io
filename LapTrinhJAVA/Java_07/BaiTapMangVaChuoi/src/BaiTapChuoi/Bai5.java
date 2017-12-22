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
public class Bai5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập vào chuỗi : ");
        String str = sc.nextLine();
        System.out.println("nhập vào chuỗi con: ");
        String subStr = sc.nextLine();
        if (str.contains(subStr)) {
            System.out.println("chuỗi " + subStr +" nằm ở vị trí " + str.indexOf(subStr) + " của chuỗi " + str);
        }
    }
}
