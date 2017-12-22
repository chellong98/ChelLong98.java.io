/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class regularExpression2 {

    public static void checkNumberPhone1() {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        String pattern = "\\d{4}[ ]\\d{3}[ ]\\d{3}"; //mẫu số điện thoại có 4 số ở đầu, 3 số giữa và 3 sô sau

        do {
            System.out.println("nhập vào số điện thoại: ");
            String numberPhone = sc.nextLine();
            flag = numberPhone.matches(pattern); //so sánh xem có trùng với mẫu khoonng 
            if (!flag) { //không cần quan tâm đến cái này
                System.out.println("dữ liệu không hợp lệ!");
            }
        } while (!flag); //nếu không trùng với mẫu thì lặp lại
        System.out.println("dữ liệu hợp lệ!");
    }

    public static void checkNumberPhone2() {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        String pattern = "(\\d{2})?\\d{3,4}[ ]\\d{3}[ ]\\d{3}"; // mẫu có thể có 84 ở đầu hoặc không cần, tiếp đến là 3 hoặc 4 số mã vùng, ở giữa là 3 số, cuối cùng là 3 số
        do {
            System.out.println("nhập vào số điện thoại: ");
            String numberPhone = sc.nextLine();
            flag = numberPhone.matches(pattern);
            if (!flag) {
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);
        System.out.println("dữ liệu hợp lệ!@");

    }
    
    public static void checkEmail () {
        boolean flag;
        Scanner sc = new Scanner (System.in);
        String pattern = "[a-z0-9A-Z,.]{3,}@[a-z]{2,}[.][a-z]{2,}(.vn)?"; //nẫu email có dạng: kí tự bất kì từ a -z, trừ những kí tự đặc biệt, tiếp đến @, tên miền, domain
        do {
            System.out.println("nhập vào email: ");
            String email = sc.next();
            flag = email.matches(pattern);
            if (flag == false) {
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag); //flag = false thì nhập lại
        System.out.println("dữ liệu hợp lệ!@");
    }
    public static void main(String[] args) {
        checkNumberPhone1();
        checkNumberPhone2();
        checkEmail();
    }
}
