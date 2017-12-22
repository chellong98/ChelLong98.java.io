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
public class regularExpression {
    public static void KiemTraSoNguyen () { //hàm kiểm tra chuỗi nhập vào có phải 1 số hay không
        boolean flag; //biến kiểm tra
        Scanner sc  = new Scanner (System.in);
        do {
            String pattern = "\\d"; //kiểm tra số nguyên, (có 2 dấu / vì netbean không nhận 1 dấu /)
            System.out.println("nhập vào số nguyên: ");
            String number = sc.next(); // tất cả các biểu thức đều phải là chuỗi
            flag = number.matches(pattern); //hàm matches nhận vào 1 mẫu, trả về true nếu khớp với mẫu
            if (!flag) { //nếu không khớp mẫu
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);//nếu không hợp lệ thì nhận lại
        System.out.println("dữ liệu hợp lệ!"); // nếu hợp lệ thì không phải nhập lại
    }
    
    public static void KiemTraSoLuongSo () {
        boolean flag; //biến kiểm tra
        Scanner sc  = new Scanner (System.in);
        do {
            String pattern = "\\d{4}"; //kiểm tra chuỗi nhập vào có đúng 4 số nguyên hay không, (có 2 dấu / vì netbean không nhận 1 dấu /)
            System.out.println("nhập vào năm: ");
            String number = sc.next(); // tất cả các biểu thức đều phải là chuỗi
            flag = number.matches(pattern); //hàm matches nhận vào 1 mẫu, trả về true nếu khớp với mẫu
            if (!flag) { //nếu không khớp mẫu
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);//nếu không hợp lệ thì nhận lại
        System.out.println("dữ liệu hợp lệ!"); // nếu hợp lệ thì không phải nhập lại
    }
    
    public static void KiemTraTuoi () {
        boolean flag; //biến kiểm tra
        Scanner sc  = new Scanner (System.in);
        do {
            String pattern = "\\d{1,}"; //kiểm tra tuổi nhập vào phải từ 1 số nguyên trở lên, (có 2 dấu / vì netbean không nhận 1 dấu /)
            System.out.println("nhập vào tuổi: ");
            String number = sc.next(); // tất cả các biểu thức đều phải là chuỗi
            flag = number.matches(pattern); //hàm matches nhận vào 1 mẫu, trả về true nếu khớp với mẫu
            if (!flag) { //nếu không khớp mẫu
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);//nếu không hợp lệ thì nhận lại
        System.out.println("dữ liệu hợp lệ!"); // nếu hợp lệ thì không phải nhập lại
    }
    
    public static void KiemTraChuoiKyTu () {
        boolean flag; //biến kiểm tra
        Scanner sc  = new Scanner (System.in);
        do {
            String pattern = "ID\\d{4,}"; //kiểm tra chuối kí tự phải bắt đầu bằng ID, và bắt buộc phải có 4 kí tự, (có 2 dấu / vì netbean không nhận 1 dấu /)
            System.out.println("nhập vào ID: ");
            String number = sc.next(); // tất cả các biểu thức đều phải là chuỗi
            flag = number.matches(pattern); //hàm matches nhận vào 1 mẫu, trả về true nếu khớp với mẫu
            if (!flag) { //nếu không khớp mẫu
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);//nếu không hợp lệ thì nhận lại
        System.out.println("dữ liệu hợp lệ!"); // nếu hợp lệ thì không phải nhập lại
    }
    
    public static void KiemTraKiTuDB () {
        boolean flag; //biến kiểm tra
        Scanner sc  = new Scanner (System.in);
        do {
            String pattern = "\\w+"; //kiểm tra chuối kí tự có chưa ktdb hay không, và bắt buộc phải có 8 kí tự, (có 2 dấu / vì netbean không nhận 1 dấu /)
            System.out.println("nhập vào mật khẩu: ");
            String number = sc.next(); // tất cả các biểu thức đều phải là chuỗi
            flag = number.matches(pattern); //hàm matches nhận vào 1 mẫu, trả về true nếu khớp với mẫu
            if (!flag) { //nếu không khớp mẫu
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);//nếu không hợp lệ thì nhận lại
        System.out.println("dữ liệu hợp lệ!"); // nếu hợp lệ thì không phải nhập lại
    }
    
    public static void KiemTraNgoaiNhungKyTu() {
        boolean flag; //biến kiểm tra
        Scanner sc  = new Scanner (System.in);
        do {
            String pattern = "\\w+[^a-d]"; //kiểm tra chuối kí tự có chưa ktdb hay không, và bắt buộc phải có 8 kí tự, (có 2 dấu / vì netbean không nhận 1 dấu /)
            System.out.println("nhập vào mật khẩu: ");
            String number = sc.next(); // tất cả các biểu thức đều phải là chuỗi
            flag = number.matches(pattern); //hàm matches nhận vào 1 mẫu, trả về true nếu khớp với mẫu
            if (!flag) { //nếu không khớp mẫu
                System.out.println("dữ liệu không hợp lệ!");
            }
        }while (!flag);//nếu không hợp lệ thì nhận lại
        System.out.println("dữ liệu hợp lệ!"); // nếu hợp lệ thì không phải nhập lại
    }
    public static void main (String[] args) {
        KiemTraSoNguyen();
        KiemTraSoLuongSo();
        KiemTraTuoi();
        KiemTraChuoiKyTu();
        KiemTraKiTuDB();
        KiemTraNgoaiNhungKyTu();
    }
}
