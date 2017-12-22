/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GenericInMethod {
    public static void main(String[] args) {
        Integer intArr[] = {1,2,3,4,5}; //khai báo 1 mảng int
        Double doubleArr[] = {2.3 , 4.5 , 6.7, 8.9};//1 mảng double
        String stringArr[] = {"samsung", "apple", "window"};//1 mảng string
        printArray (intArr);//truyền mảng int vào <T>
        printArray(doubleArr);//truyền mảng doublr vào <T>
        printArray(stringArr);//truyền mảng string vào <T>
    }
    
    static public <T> void printArray (T[]arr) {//sửu dụng generic cho phương thức
        //<T> là kí hiệu của template, nó tượng trưng cho 1 kiểu dữ liệu
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
