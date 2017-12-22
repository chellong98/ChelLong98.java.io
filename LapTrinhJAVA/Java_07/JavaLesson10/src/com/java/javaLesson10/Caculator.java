/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javaLesson10;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Caculator {
    public double div (double no1, double no2) throws ArithmeticException {
        if (no2==0) {
            throw new ArithmeticException("lỗi chia cho 0");
        }
        return no1/no2;
    }
    
    public double sqrt(double num) throws MyException {
        if (num<0) {
            throw new MyException("không tính được căn số âm");
        }
        return Math.sqrt(num);
    }
}
