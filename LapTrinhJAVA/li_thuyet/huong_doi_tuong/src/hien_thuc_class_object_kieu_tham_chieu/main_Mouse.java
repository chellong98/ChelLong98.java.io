/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hien_thuc_class_object_kieu_tham_chieu;

import computing.Mouse;
import computing.USBinterface;
import computing.WirelessUSBinterface;
import computing.appleMouse;
import computing.sonyMouse;

/**
 *
 * @author Long Nguyen Nhat
 */
public class main_Mouse {

    public static void main(String[] args) {
        Mouse mouse = new sonyMouse("sony mouse", 10.6); //khởi tạo đối tượng thông qua các lớp con
        mouse.leftButton();
        mouse.rightButton();
        mouse.scrollButton();
        mouse.getInfo();
        System.out.println("-----------------------------");
        mouse = new appleMouse("apple mouse", 15.2);
        mouse.leftButton();
        mouse.rightButton();
        mouse.scrollButton();
        mouse.getInfo();
        System.out.println("------------------------------");
        USBinterface usb = new sonyMouse ("Sony mouse", 8.9); //tham chiếu đến sonyMouse
        usb.connectUSBport(); //hành động kết nối của đối tượng mà interface tham chiếu tới
        usb = new appleMouse ("apple mouse", 9.9); //tham chiếu đến apple mouse
        usb.connectUSBport(); //hành động kết nối của đối tượng mà interface tham chiếu tới
        WirelessUSBinterface wirelessUSB = new appleMouse (); //tạo ra 1 hành động khác cho apple mouse
        
        if (wirelessUSB.checkBattery()) { //nếu còn pin
            wirelessUSB.connectWirelessUSBport(); 
            WirelessUSBinterface.supportDevice (); //phương thức static cần interface tham chiếu tới
        }
    }
}
