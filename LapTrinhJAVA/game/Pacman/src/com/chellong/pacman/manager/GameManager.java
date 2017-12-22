/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chellong.pacman.manager;

import com.chellong.pacman.model.BaseItem;
import com.chellong.pacman.model.MapItem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GameManager {

    public ArrayList<MapItem> stones;
    public ArrayList<MapItem> beans;

    public GameManager() {
        stones = new ArrayList<>();
        beans = new ArrayList<>();
    }

    public void createmapItem() {
        try {
            String path = getClass().getResource("res\\assets.map.txt").getPath();
            File file = new File(path);
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line;
            int i = 0;
            while ((line = input.readLine()) != null) {
                for (int j = 0; j < line.length(); j++) {
                    int code = line.charAt(j) - 48; //lấy số từ char
                    switch (code) {
                        case MapItem.STONE:
                            MapItem item = new MapItem(
                                    j * BaseItem.SIZE, //x
                                    i * BaseItem.SIZE, // y
                                    code);
                            stones.add(item);
                            break;
                        case MapItem.SMALL_BEAN:
                            MapItem bean = new MapItem(
                                    j * BaseItem.SIZE, //x
                                    i * BaseItem.SIZE, // y
                                    code);
                            beans.add(bean);
                            break;
//                        case MapItem.BIG_BEAN:
//                            MapItem  = new MapItem(
//                                    j * BaseItem.SIZE, //x
//                                    i * BaseItem.SIZE, // y
//                                    code);
//                            break;
                        default: 
                            break;
                    }
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
