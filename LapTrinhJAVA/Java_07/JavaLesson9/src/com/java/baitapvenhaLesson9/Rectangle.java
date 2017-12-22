/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.baitapvenhaLesson9;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Rectangle implements IShape{
    private float height, width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    @Override
    public float caculateArea() {
        return height*width;
    }
    
}
