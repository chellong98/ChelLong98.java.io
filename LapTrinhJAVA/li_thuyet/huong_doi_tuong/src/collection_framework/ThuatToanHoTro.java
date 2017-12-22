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
public class ThuatToanHoTro {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(4);

        Collections.sort(list);//phương thức sắp xếp
        Collections.reverse(list);//đảo ngươc thứ tự các phần tử
        

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int num = 6;
        Collections.sort(list);
        System.out.println("sắp xếp lại: ");
        for (Object element : list) {
            System.out.print(element + " | ");
        }
        int pos = Collections.binarySearch(list, num); //để tìm kiếm thì cần sắp xếp lại
        System.out.println("vị trí của phần tử " + num + " là: " + pos);
        System.out.println("phần tử lớn nhất: " + Collections.max(list));
        System.out.println("phần tử nhỏ nhất : " + Collections.min(list));
    }
}
