/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BaiTapVeNha;

/**
 *
 * @author Long Nguyen Nhat
 */
public class StudentManager {

    Student[] listStudents;
    public static final int MAX = 50;
    public int size = 0;

    public StudentManager() {
        listStudents = new Student[MAX];
    }

    public boolean add(Student stud) {
        if (size > MAX) {
            System.out.println("danh sách đã đầy!");
            return false;
        } else {
            listStudents[size++] = stud;
            System.out.println("Success!!!");
            return true;
        }
    }

    public void search(String name) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            
            if (listStudents[i].getName().equals(name)) {
                System.out.println("+=====+===============+=======+");
                System.out.println("|NAME | EMAIL         |AGE    +");
                System.out.println("|" + listStudents[i].getName() + " " + listStudents[i].getEmail() + " " + listStudents[i].getAge() + "|");
                System.out.println("+-----+-----------------------+");
                flag = true;
            }
        }
        if (!flag) { 
            System.out.println("không tìm thấy sinh viên!");
        }
    }

    public void list() {
        System.out.println("|NAME | EMAIL         |AGE    +");
        System.out.println("+=====+===============+=======+");
        for (int i = 0; i < size; i++) {
            System.out.println("|" + listStudents[i].getName() + " " + listStudents[i].getEmail() + " " + listStudents[i].getAge() + "|");
        }
        System.out.println("+-----+-----------------------+");

    }

    public void list(boolean order) {
        int max,min;
        if (order) {  //true
            for (int i = 0; i < size; i++) {
                max = i;
                for (int j = i+1; j < size; j++) {
                    if (listStudents[i].getName().compareTo(listStudents[j].getName()) > 0) {
                        max = j;
                    }
                }
                if (max != i) {
                    Student temp = listStudents[i];
                    listStudents[i] = listStudents[max];
                    listStudents[max] = temp;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                min = i;
                for (int j = i+1; j < size; j++) {
                    if (listStudents[i].getName().compareTo(listStudents[j].getName()) < 0) {
                        min = j;
                    }
                }
                if (min != i) {
                    Student temp = listStudents[i];
                    listStudents[i] = listStudents[min];
                    listStudents[min] = temp;
                }
            }
        }
    }
}
