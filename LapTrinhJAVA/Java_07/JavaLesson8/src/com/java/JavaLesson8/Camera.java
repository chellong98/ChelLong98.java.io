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
public class Camera extends Product {
    
    private boolean hasWifi;

    @Override
    public void addNew() {
        Scanner sc = new Scanner (System.in);
        super.addNew(); 
        System.out.println("nhập vào kiểm tra wifi: ");
        boolean hasWifi = Boolean.parseBoolean(sc.nextLine());
        this.hasWifi = hasWifi;
}

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Camera() {
    }
    
    @Override
    public String toString() {
        return "Camera: {" + this.getName() + " | " + this.getId() + " | " + this.getPrice() + " | " + this.getQuantity() + " | " + this.isHasWifi() + "}";
    }
}
