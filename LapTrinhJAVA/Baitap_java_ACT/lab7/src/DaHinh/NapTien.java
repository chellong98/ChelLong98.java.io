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
public class NapTien {
    private long SoTienNap;
    private String month;
    public NapTien(long SoTienNap, String month) {
        this.SoTienNap = SoTienNap;
        this.month = month;
    }
    public void setSoTienNap(long SoTienNap) {
        this.SoTienNap = SoTienNap;
        
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public long getSoTienNap() {
        return SoTienNap;
    }

    @Override
    public String toString() {
        return "đã nạp: " + this.SoTienNap + " vào " + this.month;
    }
}
