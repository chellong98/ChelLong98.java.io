/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_framework;

import java.util.*;

/**
 *
 * @author Long Nguyen Nhat
 */
public class SapXepDoiTuong {
    public static void main(String[] args) {
        List list = new ArrayList ();
        
        Computer com1 = new Computer ("computer 1", 1);
        Computer com2 = new Computer ("computer 2", 9);
        Computer com3 = new Computer ("computer 3", 1);
        Computer com4 = new Computer ("computer 4", 2);
        Computer com5 = new Computer ("computer 5", 5);
        
        list.add(com5);
        list.add(com4);
        list.add(com3);
        list.add(com2);
        list.add(com1);
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
