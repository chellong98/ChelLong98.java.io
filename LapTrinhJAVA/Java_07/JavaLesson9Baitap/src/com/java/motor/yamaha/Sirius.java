/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.motor.yamaha;

import com.java.motor.Motor;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Sirius extends Motor{
    private int warranty; //thời gian bảo hành

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void chageInfo() {
        super.chageInfo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("thời gian bảo hành: " + this.getWarranty());
    }

    @Override
    public void inputInfor() {
        super.inputInfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("nhập vào thời gian bảo hành: ");
        this.warranty = Integer.parseInt(new Scanner(System.in).nextLine());
       
    }
}
