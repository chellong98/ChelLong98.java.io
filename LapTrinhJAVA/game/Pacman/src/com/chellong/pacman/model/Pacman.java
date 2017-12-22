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
public class Pacman extends BaseItem{
    private int orientation;

    public void move () {
        switch (orientation) {
            case LEFT:
                x--;
                break;
            case TOP:
                y--;
                break;
            case RIGHT:
                x++;
                break;
            case BOTTOM:
                y++;
                break;
                
            default:
                break;
                
        }
    }
    
    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }
    
}
