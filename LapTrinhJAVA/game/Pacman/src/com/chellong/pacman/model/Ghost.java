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
public class Ghost extends BaseItem{
    public static final int BLINKY = 1;
    public static final int INKY = 2;
    public static final int PINKY = 3;
    public static final int CLYDE = 4;
    
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}
