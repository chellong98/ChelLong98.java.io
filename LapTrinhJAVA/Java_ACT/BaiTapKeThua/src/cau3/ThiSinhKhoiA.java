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
public class ThiSinhKhoiA extends ThiSinh{
    private double Toan, Ly, Hoa;

    public ThiSinhKhoiA(double Toan, double Ly, double Hoa) {
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public ThiSinhKhoiA() {
    }
    
    ThiSinhKhoiA khoiA = null;
    
    @Override
    public void setInfo () {
        double Toan = 4.5;
        double Ly = 6.8;
        double Hoa = 8.9;
        khoiA = new ThiSinhKhoiA(Toan, Ly, Hoa);
    }
    
    @Override
    public void getInfo () {
        System.out.println("thông tin thí sinh khối A: ");
        System.out.println("điểm toán: " + khoiA.Toan);
        System.out.println("điểm ly: " + khoiA.Ly);
        System.out.println("điểm hóa: " + khoiA.Hoa);
    }
    
}
