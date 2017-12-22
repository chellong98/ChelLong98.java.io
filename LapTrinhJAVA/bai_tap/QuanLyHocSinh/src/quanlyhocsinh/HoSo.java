/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

/**
 *
 * @author Long Nguyen Nhat
 * lớp, khoá học, kỳ học, và các thông tin cá nhân của mỗi học sinh.
 */
public class HoSo extends Nguoi{
    private String Lop;
    private int KhoaHoc;
    private int KiHoc;
    private Nguoi nguoi;
    
    
    public HoSo (Nguoi nguoi, String Lop, int KhoaHoc, int KiHoc) {
        this.nguoi = nguoi;
        this.Lop = Lop;
        this.KhoaHoc = KhoaHoc;
        this.KiHoc = KiHoc;
    }
    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getLop() {
        return Lop;
    }

    public void setKhoaHoc(int KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKiHoc(int KiHoc) {
        this.KiHoc = KiHoc;
    }

    public int getKiHoc() {
        return KiHoc;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    @Override
    public String toString() {
        return nguoi + " \n " + Lop + " | " + KhoaHoc + " | " + KiHoc + " | ";
    }
    
    
}
