/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("nhập vào số lượng nhân viên: ");
        int SIZE = sc.nextInt();
        sc.nextLine(); //fflush
        Employee emps[] = new Employee[SIZE];
        
        System.out.println("Nhập thông tin nhân viên: ");
        for (int i = 0; i < emps.length; i++) {
      
            System.out.println("nhập vào tên đường: ");
            String tenDuong = sc.nextLine();
            
            System.out.println("nhập vào họ tên: ");
            String name = sc.nextLine();
            
            System.out.println("nhập vào số năm KN: ");
            int SoNamKN = sc.nextInt();
            sc.nextLine(); //fflush
            Address add = new Address (tenDuong);
            
            Employee emp = new Employee (name, SoNamKN);
            emp.setAddress(add);
            
            emps[i] = emp;
        }

        System.out.println("hiển thị thông tin nhân viên: ");
        for (Employee emp: emps) {
            System.out.println(emp.getName() + " | " + emp.getAddress().getTenDuong() + " | " + emp.luong());
        }
    }
    
}
