/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public class RutTien {
    private long SoTienRut;
    private String month;
    public RutTien(long SoTienRut, String month) {
        this.SoTienRut = SoTienRut;
        this.month = month;
    }
    public void setSoTienRut(long SoTienRut) {
        this.SoTienRut = SoTienRut;
        
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public long getSoTienRut() {
        return SoTienRut;
    }

    @Override
    public String toString() {
        return "đã rút: " + this.SoTienRut + " vào " + this.month;
    }
    
    
}
