/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau3;

/**
 *
 * @author Long Nguyen Nhat
 */
public class ThiSinh {
    private String HoTen;
    private String NgaySinh;
    private String DiaChi;

    public ThiSinh(String HoTen, String NgaySinh, String DiaChi) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
    }

    ThiSinh thisinh = null;
    public ThiSinh() {
    }
    
    public void setInfo () {
        String HoTen = "NGuyễn nhật long";
        String NgaySinh = "17-7-1998";
        String DiaChi = "hà nội";
        thisinh = new ThiSinh(HoTen, NgaySinh, DiaChi);
    }
    
    public void getInfo () {
        System.out.println("thông tin thí sinh: ");
        System.out.println("Họ tên: " + thisinh.HoTen);
        System.out.println("ngày sinh: " + thisinh.NgaySinh);
        System.out.println("địa chỉ: " + thisinh.DiaChi);
    }
    
}
