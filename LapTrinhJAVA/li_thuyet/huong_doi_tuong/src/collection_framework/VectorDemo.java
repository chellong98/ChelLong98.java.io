/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_framework;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Long Nguyen Nhat
 */
public class VectorDemo {

    public static void main(String args[]) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3, 2); //khởi tạo 3 ô chứa, cứ full phần tử là tăng 2
        System.out.println("Initial size: " + v.size()); //size lúc này là 0 vì không có phần tử nào
        System.out.println("Initial capacity: " + v.capacity()); //độ chứa bạn đầu là 3

        v.addElement(new Integer(1)); //thêm 
        v.addElement(new Integer(2));//thêm
        v.addElement(new Integer(3));//thêm
        v.addElement(new Integer(4));//thêm
        System.out.println("Capacity after four additions: " + v.capacity());//thêm 4 phần tử vào tức là đã vượt quá độ chứa ban đầu là 3 nên capacity tăng 2, lúc này là 5

        v.addElement(new Double(5.45)); //thêm
        System.out.println("Current capacity: " + v.capacity()); //lúc này size đang có 5 phần tử, nên capacity chưa thay đổi

        v.addElement(new Double(6.08)); //thêm
        v.addElement(new Integer(7));//thêm
        System.out.println("Current capacity: " + v.capacity()); //capacity vượt quá 5 nên tăng 2 là 7

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity()); //capacity vượt quá 7 nên tăng 2 là 9

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " + (Integer) v.firstElement());//phần tử đầu tiên là 1
        System.out.println("Last element: " + (Integer) v.lastElement());//phần tử cuối là 12

        if (v.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }

        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();//liệt kê các phần tử
        System.out.println("\nElements in vector:");

        while (vEnum.hasMoreElements()) {//nếu con phần tử
            System.out.print(vEnum.nextElement() + " ");//in ra phần tử đó
        }
        System.out.println();
    }
}
