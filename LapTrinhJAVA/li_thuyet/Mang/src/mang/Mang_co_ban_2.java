/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

/**
 *
 * @author chell
 */
public class Mang_co_ban_2 {
    public static void main (String[] args) {
        int a[] = new int[5];
        
        int i;
        for (i=0; i<a.length; i++) {
            a[i] = i+1;
        }
        
        for (i=0; i<a.length;i++) { //in mảng kiểu cũ
            System.out.println(a[i]);
        }
        
        for (int element : a) { //in mảng kiểu mới, gán từng phần tử trong mảng cho biến element
            System.out.println(element);
        }
    }
}
