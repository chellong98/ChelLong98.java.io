/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Employee extends Person{ //lớp nhân viên thừa kế từ lớp người
    private int SoNamKN;
    
    public Employee () {
        
    }

    public Employee (String name, int SoNamKN) {
        super (name);
        this.SoNamKN = SoNamKN;
    }
    public void setSoNamKN(int SoNamKN) {
        this.SoNamKN = SoNamKN;
    }

    public int getSoNamKN() {
        return SoNamKN;
    }

    @Override
    public double luong() {
        if (this.SoNamKN < 1) {
            return super.luong() * 1.5;
        } else if (this.SoNamKN > 1 && this.SoNamKN < 3) {
            return super.luong() * 2;
        } else {
            return super.luong() * 3;
        }
    }
    
    
    
    
}
