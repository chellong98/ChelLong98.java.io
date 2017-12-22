/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_corejava;

/**
 *
 * @author Long Nguyen Nhat
 */
public class DemoBien {
    public void setHoTen() {
        
    }
    public static void main(String[] args) {
        int songuyen; 
        long solong = 0;
        byte b;
        short s;
        float f;
        double d;
        boolean bo;
        char c;
        final int TOC_DO = 100;
        
        System.out.println("độ lớn của kiểu max int: " + Integer.MAX_VALUE);
        System.out.println("độ lớn của kiểu min int: " + Integer.MIN_VALUE);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ", " + arr[i]);
        }
        
        int a = (int)solong;
        System.out.println("a = " + a);
        long l = a;
    }
}
