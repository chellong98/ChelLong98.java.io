/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

import java.util.*;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Composite extends Shape{

    private int child;

    public int getChild(int id) {
        child = id;
        return child;
    }

    public Composite () {
    
    }
    
    public Composite(int angle, int point, int color, int child) {
        super(angle, point, color);
        this.child = child;
    }


    @Override
    public void draw() {
        System.out.println("bạn đã vẽ 3 đường thẳng và 1 đường tròn");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("bạn đã quay hình hỗn hợp 1 góc " + angle + " độ");
    }

    @Override
    public void moveLeft(int point) {
        System.out.println("bạn đã dich chuyển hình hỗn hợp " + point + " điểm");
    }

    @Override
    public void setColor(int color) {
        System.out.println("bạn đã đặt màu " + color + " cho hình hỗn hợp");
    }
    List<Shape> list = new ArrayList<Shape>();
    
    public void add (Shape shape) {
        
        list.add(shape); 
    }
    public void remove (Shape shape) {
        list.remove(shape);
    }
    
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }

    @Override
    public String toString() {
        return "Composite {Child = " + child + '}' ;
    }
   
}
