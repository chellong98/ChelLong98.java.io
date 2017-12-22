/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chellong.pacman.model;

import com.chellong.pacman.manager.ImageStore;
import java.awt.Graphics2D;

/**
 *
 * @author Long Nguyen Nhat
 */
public class MapItem extends BaseItem {

    public static final int STONE = 1;
    public static final int SMALL_BEAN = 2;
    public static final int BIG_BEAN = 3;

    private int type; //loại vật trên map
    
    public MapItem(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw (Graphics2D graphics2D) {
        switch (type) {
            case STONE:
                graphics2D.drawImage(ImageStore.IMG_STONE, x, y,SIZE,SIZE, null);
                break;
            case SMALL_BEAN:
                graphics2D.drawImage(ImageStore.IMG_SMALL_BEAN, x, y,SIZE,SIZE, null);
                break;
            case BIG_BEAN:
                graphics2D.drawImage(ImageStore.IMG_BIG_BEAN, x, y,SIZE,SIZE, null);
                break;
            default:
                break;
        }
    }
    

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}
