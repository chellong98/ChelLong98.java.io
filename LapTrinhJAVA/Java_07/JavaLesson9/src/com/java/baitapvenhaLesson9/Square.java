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
public class Square implements IShape{
    private float edge;

    public float getEdge() {
        return edge;
    }

    public void setEdge(float edge) {
        this.edge = edge;
    }
    
    @Override
    public float caculateArea() {
        return edge*edge;
    }
    
}
