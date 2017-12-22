/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;

public class mang_co_ban {

    public static void main(String[] args) {
        //int a[] = {2, 1, 3, 7, 8};
        int a[] = new int[5]; //mảng nguyên
        a[0] = 2;
        a[1] = 1;
        a[2] = 4;
        a[3] = 7;
        a[4] = 8;

        System.out.println("tổng số phần tử trong mảng là: " + a.length); //phương thức a.length trả về kích thước mảng
        System.out.println(a[2]);
        System.out.println(a[4]);

        double b[] = {1.2, 2.4, 5.6, 7.8, 8.9, 3.6}; //mảng số thực
        System.out.println("tổng số phần tử trong mảng là: " + b.length); //phương thức a.length trả về kích thước mảng
        System.out.println(b[2]);
        System.out.println(b[4]);

        String names[] = {"long", "son", "quy", "duong", "hung"}; //mảng chuỗi
        System.out.println("tổng số phần tử trong mảng là: " + names.length); //phương thức a.length trả về kích thước mảng
        System.out.println(names[2]);
        System.out.println(names[4]);
        
        String name = "long"; //String cũng là 1 mảng các kí tự
        System.out.println(name.charAt(0)); //phương thức name.charAt(index) trả về kí tự ở vị trí index của chuỗi
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
    }
}
