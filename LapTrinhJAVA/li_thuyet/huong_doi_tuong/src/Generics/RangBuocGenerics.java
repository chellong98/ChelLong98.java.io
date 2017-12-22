package Generics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Long Nguyen Nhat
 */
public class RangBuocGenerics {
    public static void main(String[] args) {
        operation(5 , 6);
        run(new Laptop("dell",3));
    }
    
    static<T extends Laptop> void run (T computer) {
//        computer.toString();
        System.out.println(computer);
    }
    
    static<T extends Integer, T1 extends Integer> void operation (T a, T1 b) {//lúc này a, b chỉ thuộc kiểu integer hoặc casc lớp con của INteger
        int result;
        if (a > b) {
            result = a- b;
        } else {
            result = b - a;
        }
        System.out.println("result = " + result);
    }
}
