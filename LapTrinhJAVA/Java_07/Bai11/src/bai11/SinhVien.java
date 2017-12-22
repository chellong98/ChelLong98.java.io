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
public class SinhVien {

    Scanner scan = new Scanner(System.in);
    private String hoTen;
    private int tuoi;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int tuoi, float diemTB) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scan.nextLine();
        //setHoTen(scan.nextLine());
        System.out.print("Nhap tuoi:");
        tuoi = scan.nextInt();
        System.out.print("Nhap diem tb:");
        diemTB = scan.nextFloat();

    }

    public void xuat() {
        System.out.println("Ho ten" + getHoTen());
        System.out.println("Tuoi:" + getTuoi());
        System.out.println("Diem TB:" + getDiemTB());
    }

}
