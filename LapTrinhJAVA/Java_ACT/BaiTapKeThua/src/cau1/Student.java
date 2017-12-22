/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student extends Person {
    private String Msv;
    private String Email;
    private double DiemTongKet;

    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv = Msv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getDiemTongKet() {
        return DiemTongKet;
    }

    public void setDiemTongKet(double DiemTongKet) {
        this.DiemTongKet = DiemTongKet;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + Msv + " | " + Email + " | " + DiemTongKet;
    }
    
    
}
