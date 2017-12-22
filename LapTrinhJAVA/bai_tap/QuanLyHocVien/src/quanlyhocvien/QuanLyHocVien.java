/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocvien;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class QuanLyHocVien {

    /**
     * @param args the command line arguments
     */
    public static String menu () {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========QUẢN LÝ HỌC VIÊN============");
        System.out.println("1. nhập 1 học viên");
        System.out.println("2. in danh sách học viên hiện có");
        System.out.println("3. tìm kiếm học viên theo tên");
        System.out.println("ấn phím \"n\" để kết thúc chương trình! ");
        System.out.println("======================================");
        System.out.println("mời bạn chọn? [1-3]");
        String choice = sc.next();
        return choice;
    }
    public static void main(String[] args) {
        String choice;
        boolean flag = true;
        HocVienInterface work = new Test();
        do {
            choice = menu();
            switch (choice) {
                case "1":
                    work.NhapHocVien();
                    break;
                case "2":
                    work.HienThiHocVien();
                    break;
                case "3": 
                    work.TimKiemHocvien();
                    break;
                case "n":
                    flag = false;
                    break;
                default: 
                    System.out.println("mời bạn chọn lại lệnh!");
            }
        }while (flag);
        
    }
    
}
