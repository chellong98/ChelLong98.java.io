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
public class Person {
    protected String name;
    protected int tuoi;
    protected int chieuCao;
    protected double canNang;

    public Person() {
    }

    public Person(String name, int tuoi, int chieuCao, double canNang) {
        this.name = name;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
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
        return "Person{" + "name=" + name + ", tuoi=" + tuoi + ", chieuCao=" + chieuCao + ", canNang=" + canNang + '}';
    }
    
    
}
