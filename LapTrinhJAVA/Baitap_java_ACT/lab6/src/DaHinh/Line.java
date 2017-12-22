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
public class Line  extends Shape{
    
    private double length;

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength () {
        return length;
    }

    public Line() {
    }
    
    public Line(int angle, int point, int color, double length) {
        super(angle, point, color);
        this.length = length;
    }

    
    @Override
    public void draw() {
        System.out.println("bạn đã vẽ 1 đường thẳng ");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("bạn đã quay đường thẳng 1 góc " + angle + " độ");
    }

    @Override
    public void moveLeft(int point) {
        System.out.println("bạn đã dịch " + point + " điểm");
    }

    @Override
    public void setColor(int color) {
        System.out.println("bạn đã đặt màu " + color + " cho LINE");
    }

    @Override
    public String toString() {
        return "Line {length = " + this.length + '}';
    }
    
  
}
