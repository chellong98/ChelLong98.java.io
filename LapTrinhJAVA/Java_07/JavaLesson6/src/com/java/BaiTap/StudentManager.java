/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BaiTap;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class StudentManager {
    static Scanner sc = new Scanner(System.in);
    private int count = 0;
    public static final int MAXSIZE = 50;
    Student[] listStudents;
    
    public boolean add (Student stud) {
        if (count==MAXSIZE) {
            System.out.println("đã đầy danh sách!");
        } else {
            listStudents[count++] = stud;
        }
        return stud!=null;
    }

    public StudentManager() {
        listStudents = new Student[MAXSIZE];
    }
    
    public void Search (String name) {
        boolean flag= false;
        for (int i = 0; i < count; i++) {
            if (listStudents[i].getName().equals(name)) {
                System.out.println(i + ": " + listStudents[i]);
                flag = true;
                return;
            } 
        }
        if (!flag) {
            System.out.println("không có sinh viên tên: " + name);
        }
    }
    
    public void list () {
        if (count == 0) {
            System.out.println("không có quyển sachs nào cả!");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(listStudents[i]);
            }
        }
    }
    
    public void list (boolean order) {
        for (int i = 0; i < count-1; i++) {
            for (int j = i; j < count; j++) { 
                
                if (listStudents[i].getName().compareTo(listStudents[j].getName())>0 && order) {
                    Student temp = listStudents[i];
                    listStudents[i] = listStudents[j];
                    listStudents[j] = temp;
                }
                if (listStudents[i].getName().compareTo(listStudents[j].getName())<0 && !order){
                    Student temp = listStudents[i];
                    listStudents[i] = listStudents[j];
                    listStudents[j] = temp;
                }
            }
        }
//        for (int i = 0; i < count; i++) {
//                System.out.println(listStudents[i]);
//        }
    }
}
