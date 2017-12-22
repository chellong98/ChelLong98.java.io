/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Computer <T, T1>{//khai báo 2 generic giống như 2 kiểu dữ liệu
    String name;
    T cpu;
    T1 ram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getCpu() {
        return cpu;
    }

    public void setCpu(T cpu) {
        this.cpu = cpu;
    }

    public T1 getRam() {
        return ram;
    }

    public void setRam(T1 ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer: {" + name + " | " + cpu + " | " +  ram + '}';
    }
    
}
