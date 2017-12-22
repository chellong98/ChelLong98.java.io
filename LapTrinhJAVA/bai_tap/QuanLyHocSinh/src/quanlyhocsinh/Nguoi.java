/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

/**
 *
 * @author Long Nguyen Nhat
 * Họ và tên, ngày sinh, quê quán.
 */
public class Nguoi {
    
    private String HoTen;
    private int NamSinh;
    private String QueQuan;

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getHoTen() {
        return HoTen;
    }
    
    public void setNamSinh (int NamSinh) {
        this.NamSinh = NamSinh;
        
    }
    
    public int getNamSinh () {
        return NamSinh;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    @Override
    public String toString() {
        return HoTen + " | " + NamSinh + " | " + QueQuan;
    }
    
    
}
