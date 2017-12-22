/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hien_thuc_class_object_kieu_tham_chieu;

import computing.Computer; // vì class computer nằm trong package computing
import computing.SmartPhone; //vì class SmartPhone nằm trong package computing

/**
 *
 * @author Long Nguyen Nhat
 */
public class main_computer {

    public static void main(String[] args) {
        Computer com = new Computer();       
        com.setPrice(100.7);
        com.setCPU(3);
        com.setRAM(4);
        com.setName("my computer");
        System.out.println(com.getPrice() + " | " + com.getCPU() + " | " + com.getRAM() + " | " + com.getName());
//        com.run();      

        SmartPhone sp = new SmartPhone();
        sp.setPrice(60.5);
        sp.setCPU(4);
        sp.setRAM(6);
        sp.setName("Smart phone");
        System.out.println(sp.getPrice());
        System.out.println(sp.getCPU());
        System.out.println(sp.getRAM());
        System.out.println(sp.getName());
        
//        sp.run(); //gọi lại phương thức run kế thừa từ lớp Computer
      
    }
}
