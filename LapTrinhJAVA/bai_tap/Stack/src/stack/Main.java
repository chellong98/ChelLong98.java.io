/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        boolean flag = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                choice = stack.menu();
                switch (choice) {
                    case 1: {
                        Book book = stack.input();
                        stack.push(book);
                    }break;
                    case 2:
                        System.out.println("bạn đã lấy ra cuốn sách \n" + stack.pop() + " \nthành công!");
                        break;
                    case 3:
                        stack.display();
                        break;
                    case 4:
                        System.out.println("bạn đã thoát chương trình!");
                        flag = false;
                        break;
                    default:
                        System.out.println("mời bạn nhập lại lệnh");
                }
            } catch (Exception e) {
                System.out.println("có lỗi xảy ra, vui long thử lại! (ấn phím bất kì để tiếp tục)");
                flag = true;
                sc.nextLine();
            }
        } while (flag);
      
    }
}
