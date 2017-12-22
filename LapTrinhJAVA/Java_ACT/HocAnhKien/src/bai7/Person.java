/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Person {
    String HoTen;
    String DiaChi;
    String GioiTinh;
    
    
    public Person () {
        this.HoTen = "";
        this.GioiTinh = "";
        this.GioiTinh ="";
    }
    
    public void display () {
        System.out.println("Họ Tên: " + this.HoTen);
        System.out.println("Địa chỉ: " + this.DiaChi);
        System.out.println("Giới tính: " + this.GioiTinh);
    }
 }
