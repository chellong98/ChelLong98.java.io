/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        HashSet<String>set = new HashSet<String>();
//        set.add("Hello");
//        set.add("Java");
//        set.add("Java");
//        set.add("Java");
//        System.out.println(set.size());
//        
//        Iterator<String>it = set.iterator();
//        
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
//        
//        boolean act = set.contains("Java");
//        
//        System.out.println(act);

        HashMap<String, String> dic = new HashMap<>();
        dic.put("hello", "xin chào");
        dic.put("bye", "tạm biệt");
        dic.put("book", "sách");
        dic.replace("book", "quyển sách");
        
        System.out.println(dic.size());
        System.out.println(dic.get("book"));
        
        Set<String> keySet = dic.keySet();
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()) {
            String key = it.next();
            String value = dic.get(key);
            System.out.println(key+" | " + value);
        }
        
        
     }
    
}
