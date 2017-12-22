/*+++++++++++++++++ik ,m
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8DaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public class USBconnect {
    public static void connect(Mouse mouse){
        mouse.connectToUsbPort();
        mouse.printInfo();
    }
    public static void main(String[] args) {
        USBconnect.connect(new SonyMouse("sony mouse", 1000, "1.0"));
        System.out.println("================================================");
        USBconnect.connect(new SamSunggMouse("samsung mouse", 2000, "1.1"));
    }
}
