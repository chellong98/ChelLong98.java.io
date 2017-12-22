/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chellong.pacman.model;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class BaseItem {
    public static final int SIZE = 25;
    protected int x;
    protected int y;
    protected final int LEFT = 1;
    protected final int TOP = 2;
    protected final int RIGHT = 3;
    protected final int BOTTOM = 4;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   
    
}
