/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_KTHP;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student extends Person{
    private String msv;
    private String email;
    private double diemtongket;

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemtongket() {
        return diemtongket;
    }

    public void setDiemtongket(double diemtongket) {
        this.diemtongket = diemtongket;
    }
    
    
}
