/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.*;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GenericsOnSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> it = set.iterator();//tạo generics cho Iterator, vì iterator trả về 1 kiểu Object
        //phải cùng kiểu với generics của set
        int sum = 0;
        while (it.hasNext()) {
            int element = it.next();
            sum += element;
        }
        System.out.println("tổng các phần tử trong set là: " + sum);

        Set<Laptop> set1 = new HashSet();
        Laptop lap1 = new Laptop("asus", 8);
        Laptop lap2 = new Laptop("dell", 4);
        Laptop lap3 = new Laptop("sony", 2);
        
       set1.add(lap1);
       set1.add(lap2);
       set1.add(lap3);
       
       Iterator<Laptop> iterator = set1.iterator();
       while(iterator.hasNext()) {
           System.out.println(iterator.next());
       }
    }
}
