/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.util.ArrayList;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> docFile = TextFileFactory.docFile("C:\\Users\\Long Nguyen Nhat\\Documents\\NetBeansProjects\\JavaLesson13\\src\\BaiTap\\input.txt");
        for(Student stud : docFile) {
            System.out.println(stud);
        }
        boolean check = TextFileFactory.ghiFile(docFile, "C:\\Users\\Long Nguyen Nhat\\Documents\\NetBeansProjects\\JavaLesson13\\src\\BaiTap\\Student.dat");
        if (check) {
            System.out.println("ghi file thành công");
        } else {
            System.out.println("ghi file thất bại");
        }
                
    }
}
