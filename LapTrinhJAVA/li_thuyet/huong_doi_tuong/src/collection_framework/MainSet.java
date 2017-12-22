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
public class MainSet {

    public static void main(String[] args) {
        Set set = new HashSet(); //hashset in ra các phần tử theo 1 trật tự khác
        set.add(1);
        set.add(3);
        set.add(1); //không in ra 1 nữa vì hashset không chấp nhận gia trị trùng
        set.add(3.3);
        set.add('a');
        Computer com = new Computer("asus", 4);
        set.add("String");
        set.add(com);
        set.add(5);
        System.out.println("các phần tử là: ");
        set.remove(3.3); //xóa 1 phần tử
        Iterator it = set.iterator();//dùng để truy cập các phần tử của bất kì loại collection nào
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        set = new LinkedHashSet();//in ra các phần tử theo thứ tự ban đầu
        set.add(1);
        set.add(3);
        set.add(1); //không in ra 1 nữa vì hashset không chấp nhận gia trị trùng
        set.add(3.3);
        set.add('a');
        com = new Computer("dell", 4);
        set.add("String");
        set.add(com);
        set.add(5);
        System.out.println("các phần tử là: ");
        it = set.iterator();//dùng để truy cập các phần tử của bất kì loại collection nào
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
        set = new TreeSet();//treeset chỉ thêm được các số vào collection
        set.add(1);
        set.add(3);
        set.add(1); //không in ra 1 nữa vì hashset không chấp nhận gia trị trùng
//        set.add(3.3);
//        set.add('a');
//        com = new Computer("hp", 4);
//        set.add(com);
        set.add(5);
        System.out.println("các phần tử là: ");
        it = set.iterator();//dùng để truy cập các phần tử của bất kì loại collection nào
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
