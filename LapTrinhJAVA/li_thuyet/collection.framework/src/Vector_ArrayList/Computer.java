/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector_ArrayList;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Computer {
    String name;
    int cpu;

    public Computer(String name, int cpu) {
        this.name = name;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer {" + "name: " + name + ", cpu: " + cpu + '}';
    }


}
