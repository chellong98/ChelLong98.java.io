/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Shape {
    private int angle, point, color;

    public Shape() {
        this (0, 0 , 0);
    }

    public Shape(int angle, int point, int color) {
        this.angle = angle;
        this.point = point;
        this.color = color;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setcolor (int color) {
        this.color = color;
    }
    public int getColor() {
        return color;
    }
    
    public abstract void draw ();
    public abstract void rotate(int angle);
    public abstract void moveLeft(int point);
    public abstract void setColor(int color);
}
