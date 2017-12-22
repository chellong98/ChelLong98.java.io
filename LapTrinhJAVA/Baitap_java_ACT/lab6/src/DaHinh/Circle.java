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
public class Circle extends Shape{

    private double Area;

    public Circle( int angle, int point, int color, double Area) {
        super(angle, point, color);
        this.Area = Area;
    }

    public Circle() {
    }
    
    @Override
    public void draw() {
        System.out.println("bạn đã vẽ 1 đường tròn ");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("bạn đã quay đường tròn 1 góc " + angle + " độ");
    }

    @Override
    public void moveLeft(int point) {
        System.out.println("bạn đã di chuyển " + point + " điểm");
    }

    @Override
    public void setColor(int color) {
        System.out.println("bạn đẫ đặt màu " + color + " cho đường tròn");
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }
 
    public String toString() {
        return "Circle {Area = " + this.Area + '}';
    }
}
