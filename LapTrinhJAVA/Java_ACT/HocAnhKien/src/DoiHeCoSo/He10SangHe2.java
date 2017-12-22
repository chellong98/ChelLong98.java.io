/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiHeCoSo;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Long Nguyen Nhat
 */
public class He10SangHe2 {

    int number; //nhập số thập phân
    int CoSo;// chuyển sang hệ nào

    public void getNumber() {
        Boolean flag = false;
        while (!flag) {
            try { //phòng trường hợp nhập không phải là số
                Scanner sc = new Scanner(System.in);
                System.out.println("nhập vào 1 số thập phân: ");
                number = sc.nextInt();
                System.out.println("nhập vào cơ số: ");
                CoSo = sc.nextInt();
                flag = true;
            } catch (Exception e) {
                System.out.println("bạn nhập sai, vui lòng nhập lại!");
            }

        }
    }

    public void convert() {
        Stack<Object> stack = new Stack<Object>(); //1 stack là collection list có các thành phần là object
        int du;
        System.out.println(number + "đổi sang hệ " + CoSo);
        while (number > 0) {
            du = number % CoSo;
            String s = Integer.toString(du);

            if (du >= 10 && du <= 15) { //đổi sang hệ 16
                switch (du) {
                    case 10:
                        s = "A";
                        break;
                    case 11:
                        s = "B";
                        break;
                    case 12:
                        s = "C";
                        break;
                    case 13:
                        s = "D";
                        break;
                    case 14:
                        s = "E";
                        break;
                    case 15:
                        s = "F";
                        break;
                }
            }

            stack.push(s);//phương thức push của stack
            number = number / CoSo;
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()); //FIFO
        }
        System.out.println();
    }

    public static void main(String[] args) {
        He10SangHe2 convert = new He10SangHe2();
        convert.getNumber();
        convert.convert();
    }
}
