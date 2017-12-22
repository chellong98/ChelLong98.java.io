/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_framework;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Computer implements Comparable{// hiện thực phương thức so sánh
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

    @Override
    public int compareTo(Object o) { //hiện thực lại phương thức compareTo, mỗi đối tượng đều có phương thức này để so sánh với các đối tượng khác
        Computer com = (Computer)o;
        if (this.cpu > com.cpu) {
            return -1;
        } else if (this.cpu < com.cpu) {
            return 1;
        }
        return 0;
    }


}
