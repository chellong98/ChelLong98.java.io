/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class DSSV {

    private int n;
    SinhVien sv[] = new SinhVien[1000];
    //int a[] =new int [100];
    Scanner scan = new Scanner(System.in);
    
    
    
 
    
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhapdssv() {
        System.out.print("Nhap so luong sinh vien:");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + " la:");
            sv[i] = new SinhVien();
            sv[i].nhap();
            System.out.println("\n");
        }
    }

    public void xuatdssv() {
        System.out.println("THONG BAO SINH VIEN:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh vien thu " + (i + 1) + " la:");
            sv[i].xuat();
            System.out.println("");
        }
    }
    public void timKiem(String ten){
        int ok =0; // Chua ai ten can tim trong danh sach 
        for (int i = 0; i < n; i++) {
            if (sv[i].getHoTen().equals(ten)) {
                ok=1;// co sinh vien trong danh sach 
            }
        }
        if (ok==1) {
            System.out.println("Sinh vien "+ten+" co trong danh sach");
        } else {
            System.out.println("Sinh vien "+ten+" khong co trong danh sach");
        }
    }

}
