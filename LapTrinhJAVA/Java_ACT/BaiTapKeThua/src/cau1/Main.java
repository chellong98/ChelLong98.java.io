/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setHoTen("nguyễn nhật long");
        student.setGioiTinh("nam");
        student.setDiaChi("hà nội");
        student.setNgaySinh("17-7-1998");
        student.setMsv("at130833");
        student.setEmail("chellong98.act@gmail.com");
        student.setDiemTongKet(9.9);
        System.out.println("thông tin sinh viên: ");
        System.out.println(student);
    }
}
