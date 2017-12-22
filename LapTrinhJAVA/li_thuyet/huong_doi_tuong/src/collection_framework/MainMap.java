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
public class MainMap {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("hello", "World");
        map.put("hi", "World");
        map.put("chao", "World");
        map.put("Bonjour", "World");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + " | " + value);
        }
        Map map1 = new HashMap(); //interface Map hiện thực HashMap;
        Computer com = new Computer("dell", 4); //tạo 1 đối tượng máy tính
        map1.put("java", "Jav Version 1");//phương thức put đẩy đối tượng vào map, gồm có (khóa, giá trị)
        map1.put("c_c_plusplus", "covering C/C++");
        map1.put("python", "convering Python skill");
        map1.put("csharp", "convering.NET platform");
        map1.put("nguyễn nhật long", com);
//        System.out.println(map1);//inv theo toString
        
        Iterator iterator = map1.keySet().iterator(); //tạo ra đối tượng Iterator để duyệt map
        
        while (iterator.hasNext()) {//in theo từng cặp khóa- giá  trị trê từng dòng
            Object key = iterator.next(); //lấy ra key kiểu object
            Object value = map1.get(key);//lấy ra giá trị dựa vào key nhờ phương thức map.get(key)
            System.out.println(key + " : " + value);
        }
    }
}
