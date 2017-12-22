/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocvien;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Test implements HocVienInterface{

    private final int n = 100; //biến lưu trũ độ dài số lượng học viên trong danh sách
    private int k = 0; // biến lưu số lượng học viên hiện có
    HocVien dshv[] = null;
    public Test () {
        dshv  = new HocVien[n];
    }
    
    public int find (String HoTen) {
        for (int i = 0; i < k; i++) {
            if (HoTen.equals(dshv[i].getHoTen())) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void NhapHocVien() {
        if (k>=n) {
            System.out.println("số học viên đã đủ.");
            return;
        } else {
            double DiemThi = 0;
            Scanner sc = new Scanner (System.in);
            System.out.println("nhập vào tên học viên: ");
            String HoTen = sc.nextLine();
            int index = find(HoTen);
            if (index >= 0) {
                System.out.println("sinh viên " + HoTen + " Đã có trong danh sách");
                return;
            }
            
            System.out.println("nhập vào điểm thi: ");
            DiemThi = sc.nextDouble();
            sc.nextLine();
            System.out.println("nhập vào Mã học Viên: ");
            String Mahv = sc.nextLine();
            System.out.println("nhập vào quê quán: ");
            String QueQuan = sc.nextLine();
            HocVien hocvien = new HocVien();
            hocvien.setMahv(Mahv);
            hocvien.setHoTen(HoTen);
            hocvien.setQueQuan(QueQuan);
            hocvien.setDiemThi(DiemThi);
            dshv[k++] = hocvien;
        }
    }

    @Override
    public void HienThiHocVien() {
        if (k==0) {
            System.out.println("không có sinh viên nào!");
            return;
        }
        for (int i = 0; i < k; i++) {
            System.out.println(dshv[i]);
        }
    }

    @Override
    public void TimKiemHocvien() {
        Scanner sc = new Scanner(System.in);
        String HoTen;
        System.out.println("nhập vào họ tên: ");
        HoTen = sc.nextLine();
        int index = find(HoTen);
        if (index >= 0) {
            System.out.println("học viên " + HoTen + " ở vị trí thứ " + (index+1));
        } else {
            System.out.println("không tìm thấy học viên này!");
        }
    }
    
}
