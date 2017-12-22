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
public class SonyMouse extends Mouse{

    public SonyMouse(String name, double price, String version) {
        super(name, price, version);
    }

    @Override
    public void connectToUsbPort() {
        System.out.println("sony mouse: connected to USBB port ");
    }

    @Override
    public void printInfo() {
        System.out.println("name" + this.getName() + " | " + "price" + this.getPrice()
                + " | " + "version" + getVersion());
    }
//    public static void main(String[] args) {
//        Mouse mouse = new Mouse();
//    }
}
