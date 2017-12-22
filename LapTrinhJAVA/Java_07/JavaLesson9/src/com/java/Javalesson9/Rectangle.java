/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Javalesson9;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Rectangle implements IShape{
    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public float caculateArea() {
        return this.width*this.height;
    }

    @Override
    public float caculate() {
        return 0;
    }
    
}
