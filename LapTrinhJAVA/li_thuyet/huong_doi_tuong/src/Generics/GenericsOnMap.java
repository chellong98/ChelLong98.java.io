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
public class GenericsOnMap {
    public static void main(String[] args) {
        Map<Integer, Laptop> map = new HashMap(); //chỉ định 2 kiểu dữ liệu cho key và value
        map.put(111, new Laptop("dell", 3));
        map.put(222, new Laptop("dell", 3));
        map.put(333, new Laptop("dell", 3));
        map.replace(111, new Laptop("dell", 3));
        map.remove(222);
        
        Iterator<Integer> it = map.keySet().iterator(); //key là số nguyên nên iterator phải là integer
        while (it.hasNext()) {
            int key = it.next();
            Laptop value = map.get(key);
            System.out.println(key + " | " + value);
   
        }
    }
}
