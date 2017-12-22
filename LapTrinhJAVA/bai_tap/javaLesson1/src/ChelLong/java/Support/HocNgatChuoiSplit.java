/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.java.Support;

/**
 *
 * @author Long Nguyen Nhat
 */
public class HocNgatChuoiSplit {
    public static void main(String[] args) {
        String name = "  Nguyễn   Nhật      Long      ";
        System.out.println("độ dài chuỗi ban đầu laf: " + name.length());
        name = name.trim(); //trim
        System.out.println(name);
        System.out.println("độ dài chuỗi sau khi loại bỏ khoảng trắng 2 đầu là: " + name.length());
        
        String arr[] = name.split("[ ]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
