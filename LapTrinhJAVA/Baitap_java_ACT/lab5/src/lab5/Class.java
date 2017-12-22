/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Long Nguyen Nhat
 */
public class Class {

    private String name;
    private ArrayList<Student> studentList = new ArrayList<>(); //mảng đối tượng
    private int numOfStudent;
    private Teacher advisor;
    
    public Class() {
    }
    
    public Class(String name, int numOfStudent, Teacher advisor) {
        this.name = name;
        this.numOfStudent = numOfStudent;
        this.advisor = advisor;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumOfStudent() {
        return numOfStudent;
    }
    
    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }
    
    public Teacher getAdvisor() {
        return advisor;
    }
    
    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên lớp: ");
        this.setName(sc.nextLine());
        System.out.println("nhập số lượng sinh viên: ");
        this.setNumOfStudent(sc.nextInt());
        System.out.println("nhập giáo viên: ");
        Teacher teacher = new Teacher();
        teacher.input();
        this.setAdvisor(teacher);
        for (int i = 0; i < this.numOfStudent; i++) {
            System.out.println("nhập sinh viên " + (i+1));
            Person person = new Person();
            person.input();
            Student student = new Student(person.getName(), person.getAddress(), person.getDepartment(), this.getName());
            studentList.add(i, student); //thêm 1 student vào arraylist
        }
        
    }

    public void print() {
        System.out.println("danh sách lớp: " + this.getName());
        for (int i = 0; i < numOfStudent; i++) {
            Student student = studentList.get(i);//lấy ra student có vị trí i
            System.out.println("sv thứ " + (i + 1) + ": " + student);
        }
        System.out.println("giáo viên chủ nhiệm là: ");
        System.out.println(advisor);
    }
    
    public static void main(String[] args) {
        Class c = new Class ();
        c.input();
        c.print();
    }
}
