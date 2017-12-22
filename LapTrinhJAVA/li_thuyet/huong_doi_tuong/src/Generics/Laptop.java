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
public class Laptop {
    String name;
    int ram;
    
    public Laptop (String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop {" + this.name + " | " + this.ram + '}';
    }
    
    
}
