/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.JavaLesson8;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    @Override
    public void addNew() {
        super.addNew(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số sim: ");
        int sim = sc.nextInt();
        this.sim = sim;
        System.out.println("nhập vào kiểm tra camera: ");
        boolean hasCamera = Boolean.parseBoolean(sc.nextLine());
    }

    public SmartPhone() {
    }

    @Override
    public String toString() {
        return "SmartPhone: {" + this.getName() + " | " + this.getId() + " | " + this.getPrice() + " | " + this.getQuantity() + " | " + this.isHasCamera() + " | " + this.getSim() + "}";
    }
    
    
}
