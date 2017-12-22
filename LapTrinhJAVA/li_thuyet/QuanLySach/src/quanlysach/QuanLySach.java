/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class QuanLySach {

    /**
     * @param args the command line arguments
     */
    public static int menu() {
        System.out.println("==========CHƯƠNG TRÌNH QUẢN LÝ SÁCH==========");
        System.out.println("1. thêm 1 cuốn sách");
        System.out.println("2. xóa 1 cuốn sách");
        System.out.println("3. update thông tin 1 cuốn sách");
        System.out.println("4. liệt kê sách");
        System.out.println("5. thoát chương trình");
        System.out.println("============================================");
        System.out.println("Nhập vào lựa chọn của bạn [1- 5]?");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bookInterface work = new BookListWithCollection();
        int choice;
        boolean flag = true;
        do {
            try { //cho cả khối lệnh vào try catch
                choice = menu();
                switch (choice) {
                    case 1:
                        work.add();
                        break;
                    case 2:
                        work.remove();
                        break;
                    case 3:
                        work.update();
                        break;
                    case 4:
                        work.print();
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("dữ liệu không hợp lệ!");
                }
            } catch (Exception e) {
                System.out.println("có lỗi: " + e.getMessage() + "!. Vui lòng thử lại!");
                flag = true;
                sc.nextLine();
            }
        } while (flag);

    }

}
