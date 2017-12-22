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
public class CanBo extends Person {

    int PhongBan;
    float HeSoLuong;
    int LuongCoBan;
    int thuong;
    int Phat;

    public CanBo() {

    }

    public double tinhLuong() {
        return this.LuongCoBan * this.HeSoLuong + this.thuong - this.Phat;
    }

    public void display() {
        super.display();
        System.out.print("phòng ban: ");
        switch (PhongBan) {
            case 1:
                System.out.println("Đào tạo");
                break;
            case 2: 
                System.out.println("tổ chức cán bộ");
                break;
            case 3: 
                System.out.println("Văn phòng khoa CNTT");
                break;
            default: System.out.println("không có khoa này");
        }
        System.out.println("lương cơ bản: " + this.LuongCoBan);
        System.out.println("hệ số lương: " + this.HeSoLuong);
        System.out.println("thưởng: " + this.thuong);
        System.out.println("phạt: " + this.Phat);
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(int PhongBan) {
        this.PhongBan = PhongBan;
    }

    public float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public int getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(int LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhat() {
        return Phat;
    }

    public void setPhat(int Phat) {
        this.Phat = Phat;
    }
}
