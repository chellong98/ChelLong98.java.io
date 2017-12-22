/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6KeThua;

/**
 *
 * @author Long Nguyen Nhat
 */
public class SinhVien extends Person{
    private String MaSv;
    private String email;

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        super.toString();
        return "SinhVien{" + "MaSv=" + MaSv + ", email=" + email + '}';
    }
    
    
}
