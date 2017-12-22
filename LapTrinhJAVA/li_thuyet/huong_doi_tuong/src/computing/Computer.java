/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computing;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Computer {

    private double price;
    private int CPU;
    private int RAM;
    private String name;

    public Computer() {
        this(0.0, 0, 0, "");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("giá phải lớn hơn 0");
        } else {
            this.price = price;
        }
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(double price, int CPU, int RAM, String name) { //constructor tự tạo
        this.price = price;
        this.CPU = CPU;
        this.RAM = RAM;
        this.name = name;
    }

    public void run() { // vì khác pakage nên phải cần public
        System.out.println(price + " | " + CPU + " | " + RAM + " | " + name);
    }

}
