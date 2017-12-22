/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerClass;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Computer {
    private double price;
    private int RAM;
    private String name;
    private int CPU;
    
    public Computer () {
        this (0.0, 0, "", 0);
    }
    
    public Computer (double price, int RAM, String name, int CPU) {
        this.price = price;
        this.RAM = RAM;
        this.name = name;
        this.CPU = CPU;
    }
    
    class laptop {
        int battery = 100;
        String name = "DELL";
        
        void print () {
            System.out.println(name + " | " + price + " | " + RAM + " | " + battery);
        }
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + RAM + " | " + CPU; //trả về 1 chuỗi đại diện cho đối tượng
    }

    @Override
    public boolean equals(Object obj) { //hiện tại đối tượng truyền vào chưa có kiểu
        Computer com = (Computer) obj; //ép kiểu đối tượng thành Computer
        
        return this.CPU == com.CPU && this.RAM == com.RAM;  //trả về true nếu đúng
    }
    
    
}
