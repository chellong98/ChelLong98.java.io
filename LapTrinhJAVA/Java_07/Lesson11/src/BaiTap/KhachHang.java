/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author Long Nguyen Nhat
 */
public class KhachHang {
    private String ma;
    private String ten;
    private String email;
    private NhomKhachHang nhom;
            
    public KhachHang(String ma, String ten, String email) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
    }

    public KhachHang() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NhomKhachHang getNhom() {
        return nhom;
    }

    public void setNhom(NhomKhachHang nhom) {
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "ma=" + ma + ", ten=" + ten + ", email=" + email + '}';
    }

   
    
    
}
