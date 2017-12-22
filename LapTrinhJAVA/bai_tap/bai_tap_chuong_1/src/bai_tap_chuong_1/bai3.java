/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_chuong_1;

/**
 *3. viết chương trình thực hiện các công việc sau:
 * a. nhâp vào từ bàn phím 2 sô thực a,b và 1 kí tự là một phép toán (pheptoan)
 * b. Kiểm tra phép toán nhâp vào có phải là 1 trong các phép toán +,-,*,/ hay không.
 * Nếu đúng thì tính giá trịn biểu thức a pheptoan b (ví dụ phép toán là + thì tính a+b) và
 * hiển thj kết quả ra màn hình ngược lại thông báo lỗi
 */
import java.util.Scanner;
public class bai3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        String c;
        char i = sc.next().charAt(0); //cách nhập 1 kí tự
        System.out.println("nhap a,b,c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        sc.nextLine();
        c =sc.nextLine();
        if (c.equals("+")) { //so sánh chuỗi
            System.out.println("a+b=" +(a+b));
        } else if (c.equals("-")) {
            System.out.println("a-b="+(a-b));
        } else if (c.equals("*")) {
            System.out.println("a*b="+(a*b));
        }else if (c.equals("/") && b!=0) {
            System.out.println("a/b="+(a/b));
        } else {
            System.out.println("khong thuc hien duoc phep tinh");
        }
    }
}
