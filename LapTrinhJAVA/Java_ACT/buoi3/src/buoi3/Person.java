/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Person {
    private String hoten;
    private int tuoi;
    private String diachi;
    private double diem;
    
    public Person (String hoten, int tuoi, String diachi, double diem) {
        this.diachi = diachi;
        this.diem = diem;
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public Person (Person p) {
        this.hoten = hoten;
        this.diem = diem;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHoten() {
        return hoten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    
    public static void main (String[]args) {
        Person p1 = new Person("ádas", 18, "sdf", 5.5);
        Person p2 = new Person(null, 17, null, 6.7);
        System.out.println(p1);
        
    }
}
