/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocvien;

/**
 *
 * @author Long Nguyen Nhat
 */
public class HocVien {
    private String Mahv;
    private String HoTen;
    private String QueQuan;
    private double DiemThi;

    public HocVien () {
        this ("","", "", 0.0);
    }
    
    public HocVien (String Mahv, String HoTen, String QueQuan, double DiemThi) {
        this.Mahv = Mahv;
        this.HoTen = HoTen;
        this.QueQuan = QueQuan;
        this.DiemThi = DiemThi;
    }
    
    public String getMahv() {
        return Mahv;
    }

    public void setMahv(String Mahv) {
        this.Mahv = Mahv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public double getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(double DiemThi) {
        this.DiemThi = DiemThi;
    }

    @Override
    public String toString() {
        return Mahv + " | " + HoTen + " | " + QueQuan + " | " + DiemThi;
    }
    
    
}
