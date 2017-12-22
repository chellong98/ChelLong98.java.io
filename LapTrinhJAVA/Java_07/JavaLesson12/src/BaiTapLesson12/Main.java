/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLesson12;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    static int menu() {
        System.out.println("=====MENU======");
        System.out.println("1. load data");
        System.out.println("2. add new ");
        System.out.println("3. search");
        System.out.println("4. save");
        System.out.println("5. exit");
        System.out.println("bạn chọn lênh nào? ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        return choice;
    }
    public static void main(String[] args) {
        CustomManage cm = new CustomManage();
        
        do {            
            int choice = menu();
            switch(choice) {
                case 1:{
                    System.out.println("nhập vào filepath: ");
                    String filePath = new Scanner(System.in).nextLine();
                    boolean check = cm.load(filePath);
                    if (check) {
                        System.out.println("load file thành công!");
                        for(Customer cus : cm.getDsKhachHang()) {
                            System.out.println(cus);
                        }
                    } else {
                        System.out.println("load file không thành công");
                    }
                }break;
                case 2: {
                    cm.add();
                }break;
                case 3: {
                    System.out.println("nhập vào id cần tìm: ");
                    int id = Integer.parseInt(new Scanner(System.in).nextLine());
                    Customer cus = cm.search(id);
                    if (cus!=null) {
                        System.out.println("khách hàng cần tìm: ");
                        System.out.println(cus);
                    } else {
                        System.out.println("không tìm thấy khách hàng");
                    }
                }break;
                case 4: {
                    if (cm.save()) {
                        System.out.println("lưu file thành công");
                    } else {
                        System.out.println("lưu file không thành công");
                    }
                }break;
                case 5: {
                   System.out.println("bye bye");
                   System.exit(0);
                };break;
            }
        } while (true);
    }
}
