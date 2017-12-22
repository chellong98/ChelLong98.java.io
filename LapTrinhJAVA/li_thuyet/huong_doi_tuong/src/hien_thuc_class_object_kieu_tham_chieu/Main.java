/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hien_thuc_class_object_kieu_tham_chieu;

import computing.Mouse;
import computing.appleMouse;
import computing.samsungMouse;
import computing.sonyMouse;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    
    public static void main(String[] args) {
//      laptop ibm = new laptop();
//      ibm.name = "IBM computer";
//      ibm.CPU = 2;
//      ibm.RAM = 3;
//      ibm.price = 100;
        
        laptop ibm = new laptop();
        
        ibm.start();
        ibm.run();
        ibm.shutdown();
        ibm.restart();
        double discount = ibm.discount(3, true); //gọi phương thức giảm giá
        System.out.println("discount: " + discount);
        
        discount = ibm.discount(); //method overloading (có cùng tên nhg không cùng tham số)
        System.out.println("discount:" + discount);
        discount = ibm.discount(4);//method overloading (có cùng tên nhg không cùng tham số)
        System.out.println("discount:" + discount);

        //cách truyền variable length list 1
        ibm.supportedOS("Windows", "Linux", "MacOS", "Unix"); //cho phép nhập không giới hạn các phần tử
        //các truyền variable length list 2
        String[] os = {"Windows", "Kali", "MacOS", "Parrot"}; //khai báo 1 mảng String
        ibm.supportedOS(os); //truyền mảng đó vào phương thúc
        
        System.out.println("-------------------------------");
        Mouse apple = new appleMouse("Apple", 9.9);
        ibm.connectUSBMouse(apple); //truyền vào apple mouse
        Mouse sony = new sonyMouse("Sony",8.9);
        ibm.connectUSBMouse(sony); //truyền vào sony mouse
        Mouse samsung = new samsungMouse("Samsung", 7.9);
        ibm.connectUSBMouse(samsung); //truyền vào samsung mouse
        
    }
}
