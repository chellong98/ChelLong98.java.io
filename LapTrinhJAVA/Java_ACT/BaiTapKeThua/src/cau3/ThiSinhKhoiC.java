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
public class ThiSinhKhoiC extends ThiSinh{
    private double Van, Su, Dia;

    public ThiSinhKhoiC(double Van, double Su, double Dia) {
        this.Van = Van;
        this.Su = Su;
        this.Dia = Dia;
    }

    public ThiSinhKhoiC() {
    }
    
    ThiSinhKhoiC khoiC = null;
    
    @Override
    public void setInfo () {
        double Van = 4.5;
        double Su = 6.8;
        double Dia = 8.9;
        khoiC = new ThiSinhKhoiC(Van, Su, Dia);
    }
    
    @Override
    public void getInfo () {
        System.out.println("thông tin thí sinh khối C: ");
        System.out.println("điểm văn: " + khoiC.Van);
        System.out.println("điểm sử: " + khoiC.Su);
        System.out.println("điểm địa: " + khoiC.Dia);
    }
    
    public static void main(String[] args) {
        ThiSinhKhoiC thisinhkhoic = new ThiSinhKhoiC();
        thisinhkhoic.setInfo();
        thisinhkhoic.getInfo();
    }
}
