/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

/**
 *
 * @author chell
 */
import java.util.Scanner; //khai báo 1 lớp, lớp này giống như thư viện include <stdio.h> để nhập vào từ bàn phím 

public class SwitchDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input your age: ");
        int age = sc.nextInt();
        System.out.print("input your name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("input your point: ");
        double point = sc.nextDouble();
        System.out.println("thong tin: " + "\tname: " + name + "\ttuoi: " + age + "\tdiem: " + point);
        switch (age) {
            case 1:
                System.out.println("name");
                break;
            case 2:
                System.out.println("two");
                break;
            case 20:
                System.out.println("twenty");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }

    }
}
