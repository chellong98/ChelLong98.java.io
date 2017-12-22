/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javalesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add(2017);
        list.add(22.2);
        list.add(new Student());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(10);
        list2.add(100);
        list2.add(1000);
        for(Integer a : list2) {
            System.out.println(a);
        }
        
        boolean f = list.contains(100);
        System.out.println(f);
        
        boolean check = list.isEmpty();
        System.out.println(check);
        
        list.remove(new Integer(100));
        
        System.out.println("===Vector===");
        Vector<String> vec = new Vector<String>();
        vec.addElement("ABC");
        vec.add("long");
        for(String str : vec) {
            System.out.println(str);
        }
        
        Vector<Student>students = new Vector<>();
        
        System.out.println("===LINKEDLIST===");
        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.addFirst("hoang");
        linkedList.addFirst("Vu");
        linkedList.addLast("mai");
        linkedList.get(linkedList.indexOf("hoang"));
        
        for(String str : linkedList) {
            System.out.println(str);
        }
    }

}
