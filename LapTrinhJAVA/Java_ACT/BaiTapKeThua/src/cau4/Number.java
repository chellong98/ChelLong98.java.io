/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau4;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Number {
    private int value;
    private int min;
    private int max;
    
    public Number (int value) {
        this.value = value;
    }

    public Number(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public Number() {
    }
    
    Number num = null;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public boolean checkSoNguyenTo (int number) {
        int dem = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dem++;
            }
        }
        return dem == 2;
    }
    
    public static void main(String[] args) {
        Number num = new Number();
        num.setValue(13);
        System.out.println("kiểm tra nguyên tố của số " + num.getValue() + ": " + num.checkSoNguyenTo(num.getValue()));
    }
}
