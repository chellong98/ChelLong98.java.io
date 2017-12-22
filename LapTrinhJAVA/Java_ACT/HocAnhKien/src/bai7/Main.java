/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        CanBo canbo = new CanBo();
        System.out.println("nhập ho tên: ");
        String HoTen = sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        String DiaChi = sc.nextLine();
        System.out.println("nhập giới tính: ");
        String GioiTinh = sc.nextLine();
        System.out.println("nhập phòng ban: (1: 2: 3: )");
        int PhongBan = sc.nextInt();
//        switch (PhongBan) {
//            case 1: 
//                System.out.println("Đào tạo");
//                break;
//            case 2: 
//                System.out.println("Tổ chức cán bộ");
//                break;
//            case 3: 
//                System.out.println("văn phòng khoa CNTT");
//                break;
//            default : 
//                System.out.println("không có khoa này");
//        }
        System.out.println("lương cơ bản: ");
        int luongcoban = sc.nextInt();
        System.out.println("hệ số lương: ");
        float hesoluong = sc.nextFloat();
        System.out.println("thưởng: ");
        int thuong = sc.nextInt();
        System.out.println("phạt: ");
        int phat = sc.nextInt();
        canbo.setHoTen(HoTen);
        canbo.setDiaChi(DiaChi);
        canbo.setGioiTinh(GioiTinh);
        canbo.setLuongCoBan(luongcoban);
        canbo.setHeSoLuong(hesoluong);
        canbo.setPhongBan(PhongBan);
        canbo.setThuong(thuong);
        canbo.setPhat(phat);
        canbo.display();
        System.out.println("lương thực lĩnh: " + canbo.tinhLuong());
    }
    
}
