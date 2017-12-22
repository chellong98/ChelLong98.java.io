/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chellong.pacman.manager;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Long Nguyen Nhat
 */
public class ImageStore {
    public static final Image IMG_STONE = getImage("stone.png");//ảnh đá
    public static final Image IMG_SMALL_BEAN = getImage("small_bean.png"); //ảnh đậu nhỏ
    public static final Image IMG_BIG_BEAN = getImage("big_bean.png"); //ảnh đậu lớn
    
    public static Image getImage (String name) {
        String path = "res\\drawable\\" + name;
        return new ImageIcon(ImageStore.class.getResource(path)).getImage();
    }
    
}
