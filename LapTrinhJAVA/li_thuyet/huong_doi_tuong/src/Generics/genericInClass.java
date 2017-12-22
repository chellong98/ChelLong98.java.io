/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Long Nguyen Nhat
 */
public class genericInClass {
    public static void main(String[] args) {
        Computer<Integer, String> com = new Computer();//truyền vào 2 generic 2 kiểu dữ liệu tương ứng
        com.setCpu(4);
        com.setRam("4 gb");
        com.setName("samsung");
        System.out.println(com);
    }
}
