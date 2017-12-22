/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8DaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Mouse {
    private String name;
    private double price;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Mouse(String name, double price, String version) {
        this.name = name;
        this.price = price;
        this.version = version;
    }
    
    public abstract void connectToUsbPort();
    
    public abstract void printInfo();
}
