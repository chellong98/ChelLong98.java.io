/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap_xuat_du_lieu;

/**
 *
 * @author chell
 */
import java.util.Scanner;

public class Nhap_xuat_du_lieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nhập dữ liệu trong java
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name: ");
        String name = sc.nextLine();
        System.out.print("input your age: ");
        int age = sc.nextInt();
        System.out.print("input your point: ");
        double point = sc.nextDouble();
        System.out.print("thong tin: " + name + "\t" + age + "\t" + point + "\n");
         */
 /*
        // xuất dữ liệu trong java
        System.out.print("Hello world\n");
        System.out.println("age: 18");
        System.out.printf("name: %s\t age: %d\t point: %.2f\n","nhat long", 18, 4.5);
        System.out.format("name: %s\t age: %d\t point: %.2f","canh duong", 18, 5.5);
         */
        //nhập thông tin của 1 người
        String name, address, facebook;
        int age;
        double point;
        boolean gender = false;
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name: ");
        name = sc.nextLine();
        System.out.print("input your age: ");
        age = sc.nextInt();
        System.out.print("input your address: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("input your facebook: ");
        facebook = sc.nextLine();
        System.out.print("input your point: ");
        point = sc.nextDouble();
        System.out.print("input your gender: ");
        gender = sc.nextBoolean();

        //xuất dữ liệu 
        System.out.format("name: %s\t age: %d\t address: %s\t facebook: %s\t point: %.2f\t gender: %s\n",
                 name, age, address, facebook, point, (gender ? "Male" : "Female"));
    }

}
