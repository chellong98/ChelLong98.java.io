/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.java.Support;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class HocVeString {
    static Scanner sc = new Scanner (System.in);
    
    
    public static void main(String[] args) {
        String str1 = "long nguyen nhat";
//        int index;
//        System.out.println("nhập vào vị trí trong chuỗi: ");
//        index = sc.nextInt();
//        System.out.println("vị trí" + index + " là kí tự " + str1.charAt(index)); //hàm charAt
        
        String str2 = "";
//        System.out.println("nhập vào 1 chuỗi: ");
//        str2 = sc.nextLine();
//        if (str1.equals(str2)) { //hàm equals
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        
        String str3 = "";
//        System.out.println("nhập vào 1 chuỗi: ");
//        str3 = sc.nextLine();
//        if (str1.compareTo(str3) == 0) { //hàm compareto
//            System.out.println("str1 = str3");
//        } else if (str1.compareTo(str3) > 0) {
//            System.out.println("str1 > str3");
//        } else {
//            System.out.println("str1 < str3");
//        }
        
        String str4 = "";
//        System.out.println("nhập vào 1 chuỗi: ");
//        str4 = sc.nextLine();
//        if (str1.contains(str4)) { //hàm contains
//            System.out.println("chuỗi " + str4 + " nằm ở vị trí " + str1.indexOf(str4) + " trong chuỗi " + str1); //hàm indexof
//            System.out.println("vị trí cuối cùng của chuỗi " + str4 + " trong chuỗi " + str1 + " là: " + str1.lastIndexOf(str4));
//        }
        
//        int index;
//        System.out.println("nhập vào vị trí chuỗi con: " );
//        index = sc.nextInt();
//        System.out.println("chuỗi con bắt đầu từ " + index + " là: " + str1.substring(index));
//        System.out.println("nhập vào vị trí kết thúc: ");
//        int last = sc.nextInt();
//        System.out.println("chuỗi con bắt đầu từ" + index + " đến " + last + " là: " + str1.substring(index, last));
//        
          Student std = new Student();
          System.out.println("nhập vào tên sv: ");
          String name = sc.nextLine();
          System.out.println("nhập vào email sv: ");
          String email = sc.nextLine();
          System.out.println("nhập vào tuổi sv: ");
          int age = sc.nextInt();
          
          std.setName(name);
          std.setEmail(email);
          std.setAge(age);
          
          System.out.println(std);
    }
}
