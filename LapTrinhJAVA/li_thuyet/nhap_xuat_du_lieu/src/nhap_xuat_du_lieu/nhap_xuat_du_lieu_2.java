/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chell
 */
import java.util.Scanner;

public class nhap_xuat_du_lieu_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String s = sc.next(); //đọc 1 từ từ bộ nhớ đệm

        System.out.print("interger: ");
        int i = sc.nextInt();

        System.out.print("double: ");
        double d = sc.nextDouble();

        System.out.println("======your Input: ");
        System.out.println("String: " + s);
        System.out.println("Interger: " + i);
        System.out.println("Double: " + d);
        
        System.out.println("\n\n data left: ");
        while (sc.hasNext()) { //kiểm tra xem còn gì chưa đọc trong bộ đệm hay không
            s = sc.next(); //đọc  từng từ 1
            System.out.println(s);
        }
    }
}
